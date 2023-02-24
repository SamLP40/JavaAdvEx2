/**
 * Programme utilisant un processus permettant de faire fonctionner une horloge
 * en temps réel.
 * 
 * @author Le-porcherS - 2023-2-23
 * 
 */
package fr.ldnr.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.IllegalFormatConversionException;

public class ThreadTime {

	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("hh:mm:ss");
		Thread thread = new Thread(new MonRunnable(1000));
		System.out.println(df.format(new Date()));
		System.out.print("\033[2K");

		thread.start(); // Déclenche l'horloge à partir de la date actuelle (en sec)
	}

	private static class MonRunnable implements Runnable {

		private long delai;

		public MonRunnable(long delai) {
			this.delai = delai;
		}


		@Override
		public synchronized void run() { 
			// Synchronisation de l'horloge (bon, c'est pas encore top mais ça fonctionne)
			while(true) {

				try {
					DateFormat time = new SimpleDateFormat("hh:mm:ss"); 
					// Crée une nouvelle date toutes les 1000ms, simulant une horloge. 
					// Des décalages sont cependant notables... comme des secondes qui ne s'affichent pas !
					Thread.sleep(delai);
						System.out.println(time.format(new Date()));
					//	System.out.println(String.format("\033[2K",time.format(new Date())));
					// "\033[2K"= Supprime le contenu d'un print.
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (IllegalFormatConversionException d) {
					d.printStackTrace();
				}
			}
		}

	};

}

/* Ex 2.3 : exécution du programme via un terminal -> 
 * cd <nom du dossier où se trouve le programme>
 * javac "nomduprogramme.java"
 * puis java "nomduprogramme.java"
 */

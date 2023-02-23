/**
 * Programme qui utilise un processus exécutable générant une pyramide avec des
 * étoiles et des symboles unicode.
 * 
 * @author Le-porcherS - 2023-2-23
 */
package fr.ldnr.thread;

public class TestRunnable implements Runnable {

	@Override
	public void run() {

		char unicode = '\u0021'; // génère le premier caractère unicode de la liste
		String str = ""; // Génère une étoile

		for (int j =0; j < 9; j++) {
			unicode += 1;
			str += "*"; // Ajoute une étoile par passage

			System.out.print(unicode);
			System.out.print(str);
			System.out.println(unicode);
		}

		System.out.println(); // Affiche les étoiles précédentes +1
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new TestRunnable());
		thread.start(); // Processus permettant de générer des étoiles via la méthode run

	}

	//	public String UnicodeSymbols() {
	//		String[] s = {"!", "\"", "#", "$", "%", "&", "'", "(", ")", "*"};
	//		for (int i=0;i==s.length;i++) {
	//			
	//		}
	//		return s;
	//	}
}


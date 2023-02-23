/**
 * Programme permettant de répéter un processus (5 fois chacun).
 * 
 * @author Le-porcherS - 2023-2-23
 */
package fr.ldnr.thread;

public class TestThread extends Thread {

public TestThread(String name) {
	super(name);
}

@Override
public void run() {
	for (int i =0; i<=4;i++) {

		System.out.print(this.getName()); // Récupère le nom du processus dans la classe mère Thread
		}
	
	System.out.println();
	} 

public static void main (String[] args) {
	TestThread t = (new TestThread("1-")); // Processus
	TestThread t2 = new TestThread("2--");
	TestThread t3 = new TestThread("3---");
	TestThread t4 = new TestThread("4----");
	TestThread t5 = new TestThread("5-----");
	t.start(); // Démarrage des processus (en même temps). Pour les lancer séparément, utiliser run()
	t2.start();
	t3.start();
	t4.start();
	t5.start();
}
}

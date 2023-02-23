package fr.ldnr.thread;

public class TestThread extends Thread {

public TestThread(String name) {
	super(name);
}

public void run() {
	for (int i =0; i<=4;i++) {

		
		System.out.print(this.getName());
		
		System.out.println(this.getName());

	} //Lance les processus de façon désynchronisée
}

public synchronized void displayThread(String name) {
 // Méthode pour synchroniser l'affichage des processus.
}
public static void main (String[] args) {
	TestThread t = (new TestThread("1-"));
	TestThread t2 = new TestThread("2--");
	TestThread t3 = new TestThread("3---");
	TestThread t4 = new TestThread("4----");
	TestThread t5 = new TestThread("5-----");
	t.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
}
}

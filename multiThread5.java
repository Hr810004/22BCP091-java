class A extends Thread {
	public void run() {
		for(int k=0; k<=5; k++) {
			System.out.println("\tFrom thread C: k= "+k);
			if(k == 1)
			try {
				sleep(3000);
				System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());
			}
			catch(Exception e) {
				System.out.println("Some exception occured.");
			}
		}
		System.out.println("Exit from B.");
	}
}
class multiThread5 {
	public static void main(String s[]) {
		A threadA = new A();
		System.out.println("Before starting thread isAlive: "+threadA.isAlive());
		threadA.start();
		System.out.println("After starting thread isAlive: "+threadA.isAlive());
	}
}

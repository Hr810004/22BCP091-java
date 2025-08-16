class A extends Thread {
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("From thread A: i= "+i);
		}
		System.out.println("Exit from A.");
	}
}
class B extends Thread {
	public void run() {
		for(int j=0; j<=5; j++) {
			System.out.println("From thread B: j= "+j);
		}
		System.out.println("Exit from B.");
	}
}
class C extends Thread {
	public void run() {
		for(int k=0; k<=5; k++) {
			System.out.println("From thread C: k= "+k);
		}
		System.out.println("Exit from C.");
	}
}
class multiThread2 {
	public static void main(String s[]) {
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();
		threadA.setPriority(10);
		threadB.setPriority(1);
		threadC.setPriority(5);
		threadA.start();
		threadB.start();
		threadC.start();
	}
}

class A extends Thread {
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("\tFrom thread A: i= "+i);
			if(i == 3)
			break;
		}
		System.out.println("Exit from A.");
	}
}
class B extends Thread {
	public void run() {
		for(int j=0; j<=5; j++) {
			if(j == 1) Thread.yield();
			System.out.println("\tFrom thread B: j= "+j);
		}
		System.out.println("Exit from B.");
	}
}
class C extends Thread {
	public void run() {
		for(int k=0; k<=5; k++) {
			System.out.println("\tFrom thread C: k= "+k);
			if(k == 1)
			try {
				sleep(1000); }
			catch(Exception e) {}
		}
		System.out.println("Exit from C.");
	}
}
class D extends Thread {
	public void run() {
		for(int l=0; l<=5; l++) {
			System.out.println("\tFrom thread D: l= "+l);
			if(l == 1)
			try {
				wait(); }
			catch(Exception e) {}
		}
		System.out.println("Exit from D.");
	}
}

class multiThread3 {
	public static void main(String s[]) {
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();
		D threadD = new D();   
		threadA.start();
		threadB.start();
		threadC.start();
		threadD.start();
	}
}	

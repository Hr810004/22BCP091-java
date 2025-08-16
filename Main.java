class Test{
    int a,b;
    Test(int i, int j){
        this.a = i;
        this.b = j;
    }

    boolean equals(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
public class Main{
    public static void main(String[] args) {
        Test t1 = new Test(111, 222);
        Test t2 = new Test(111, 222);
        Test t3 = new Test(-1, -2);

        System.out.println(t1.equals(t2));
	System.out.println(t1.equals(t3));
    }
}


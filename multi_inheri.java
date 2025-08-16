class operation_1 {
    void sum(int a, int b){
        int result = a + b;
        System.out.println("Addition of two numbers is:" + result);
    }
}

interface operation_2{
    // final static int a=5;
    // final static int b=6;
    void diff(int a, int b);
}

class main extends operation_1 implements operation_2{
    void mul(int a, int b){
        int result = a * b;
        System.out.println("Multiplication of two numbers is:" + result);
    }
    public void diff(int a, int b){
        int result = a-b;
        System.out.println("Difference of two numbers is:" + result);
    }
}

class multi_inheri{
    public static void main(String[] args) {
        main m1 = new main();
        m1.sum(6,4);
        m1.diff(6,4);
        m1.mul(6,4);
    }
}

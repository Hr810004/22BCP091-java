abstract class abstract_2{
    abstract void sum(int a,int b);
}

class abstract_1 extends abstract_2{
     
    void sum(int a, int b){
        int result = a + b;
        System.out.println("Sum of two numbers is:" + result);
    }
    public static void main(String[] args) {
        abstract_1 a1 = new abstract_1();
        a1.sum(4,5);
    }
}

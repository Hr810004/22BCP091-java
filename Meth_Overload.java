class Meth_Overload{
    void sum(int a){
        int c=a+a;
         System.out.format("Sum of twice of %d is: %d\n",a,c);
    }
    void sum(int a,int b){
        int c=a+b;
        System.out.format("Sum of %d and %d is: %d\n",a,b,c);
    }
    void sum(int a,int b,int c){
        int d=a+b+c;
        System.out.format("Sum of %d,%d and %d is: %d\n",a,b,c,d);
    }
    public static void main(String args[]){
        Meth_Overload S1 = new Meth_Overload();
        S1.sum(4);
        S1.sum(3,5);
        S1.sum(2,3,4);
    }
}

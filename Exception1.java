public class Exception1{
    public static void main(String[] args){
        int a;
        int b;
        int result1;
        try {
            a=5;
            b=0;
            result1= a/b;
            System.out.println("This will not be printed");
            System.out.println("Quotient of 1st is: " + result1);  
        } catch (ArithmeticException e){
            System.out.println("Divison by zero not possible");
        }
        System.out.println("After catch statement");
    }
}

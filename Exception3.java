public class Exception3 {
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("A is: " + a);
            int b= 5/5;
            System.out.println("Quotient is: " + b);
            try{
                int arr[]={1};
                arr[2]=3;
                System.out.println("Array is: " + arr[2]);
            }
            catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Array index is out reachable range");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero is not possible");
        }
    }
}

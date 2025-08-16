public class Exception2 {
    public static void main(String[] args) {
        int a;
        int b;
        int result1,arr[]={1};
        try {
            a=5;
            b=1;
            result1= a/b;
            System.out.println("Division: " + result1); 
            arr[2]=23;
            System.out.println("This will not be printed");
        }
        catch (ArithmeticException e){    
            System.out.println("Divison by zero not possible: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index is out of range: " + e);
        }
        System.out.println("After try catch block 2");  
    }
}
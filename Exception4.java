public class Exception4 {
    static void demoexception(){
        try {
            throw new NullPointerException("User defined exception");
        } catch (Exception e) {
            System.out.println("Caught a user defined exception");
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            demoexception();
        } catch (Exception e) {
            System.out.println("Caught");
        }
    }
}

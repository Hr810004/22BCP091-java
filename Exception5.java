public class Exception5 {
        public static void main(String[] args) {
            try {
                // Perform some operations that may throw an exception
                int result = 10 / 0; // This will throw an ArithmeticException
            } catch (ArithmeticException e) {
                System.err.println("An ArithmeticException occurred: " + e.getMessage());
            } finally {
                // This block will always be executed
                System.out.println("Finally block executed.");
            }
        }
}

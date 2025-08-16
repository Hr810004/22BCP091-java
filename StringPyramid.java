class StringPyramid {

    public static void printStringPyramid(String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j) + " ");
            }

            System.out.println();
        }
    }
     public static void main(String[] args) {
        String input ="Stream";
        printStringPyramid(input);
    }
}

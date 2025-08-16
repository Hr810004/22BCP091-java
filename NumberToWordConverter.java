class NumberToWordConverter {
    public static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    public static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convertToWord(int number) {
        if (number < 0 || number > 999) {
            return "Number out of range";
        }

        if (number == 0) {
            return "Zero";
        }

        if (number < 20) {
            return units[number];
        }

        if (number < 100) {
            return tens[number / 10] + (number % 10 == 0 ? "" : " " + units[number % 10]);
        }

        return units[number / 100] + " Hundred" + (number % 100 == 0 ? "" : " and " + convertToWord(number % 100));
    }

    public static void main(String[] args) {
        int number = 356;
        String wordRepresentation = convertToWord(number);
        System.out.println("Number: " + number);
        System.out.println("Word Representation: " + wordRepresentation);
    }
}

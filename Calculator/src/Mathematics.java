class Mathematics implements Calculation {

    // Implementing subtract method
    @Override
    public int subtract(int num) {

        String numString = Integer.toString(num);
        int result = Character.getNumericValue(numString.charAt(0));

        for(int i = 1; i <numString.length(); i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            result -= digit;
        }
        return result;
    }

    // Implementing multiply method
    @Override
    public int multiply(int num) {
        int result = 1;
        boolean hasNonZeroDigit = false;

        // Handle negative numbers by converting to positive for processing

        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            if (digit != 0) {
                result *= digit;  // Multiply only non-zero digits
                hasNonZeroDigit = true;
            }
            num /= 10;  // Remove the last digit
        }
        // If no non-zero digit was encountered, the result should be 0.
        return hasNonZeroDigit ? result : 0;
    }
}



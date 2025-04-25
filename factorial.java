public class factorial {
    
    // Method to calculate factorial
    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Taking input from the command line argument
        if (args.length != 1) {
            System.out.println("Please provide exactly one number.");
            return;
        }
        
        try {
            int number = Integer.parseInt(args[0]);
            int result = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        }
    }
}

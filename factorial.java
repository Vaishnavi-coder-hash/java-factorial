import java.util.Scanner;

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
        try {
            Scanner in=new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = Integer.parseInt(in.next());
            int result = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
            in.close();
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        }
    }
}

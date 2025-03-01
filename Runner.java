import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        // Instantiate a Calc object
        Calc myCalculator = new Calc();

        // Get user input for two numbers
        Scanner scan = new Scanner(System.in);

        // Get the first valid number
        double n1 = getValidNumber(scan, "Please enter the first number: ");

        // Get the second valid number
        double n2 = getValidNumber(scan, "Please enter the second number: ");

        // Pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // Output from Calc instance
        System.out.println(myCalculator);

        // Examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        // Calling Calc methods directly
        System.out.println("The sum is: " + myCalculator.add());
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }

    // Method to get a valid number input
    public static double getValidNumber(Scanner scanner, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        return number;
    }
}

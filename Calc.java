public class Calc {
    // Private instance variables
    private double num1;
    private double num2;

    // Default constructor
    public Calc() {
        this.num1 = 0;
        this.num2 = 0;
    }

    // Setter methods
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Getter methods
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Arithmetic methods
    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }

    // toString method to display private data fields
    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n" +
               "Num1: " + num1 + "\n" +
               "Num2: " + num2;
    }
}

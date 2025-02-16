package project;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Tests {
    // Private fields
    private int scoreCount;
    private double average;

    // Constructor
    public Tests() {
        scoreCount = 0;
        average = 0.0;
    }

    // Method to get average scores from user
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        double score;

        System.out.println("Enter test scores. Type -1 to stop.");
        
        while (true) {
            System.out.print("Enter a test score: ");
            score = scanner.nextDouble();

            if (score == -1) {
                break;
            }

            sum += score;
            count++;
        }

        scanner.close();

        if (count > 0) {
            average = sum / count;
        } else {
            average = Double.NaN;
        }

        scoreCount = count;
    }

    // toString method to display the result
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "The average of the " + scoreCount + " scores entered is " + df.format(average) + ".";
    }
}

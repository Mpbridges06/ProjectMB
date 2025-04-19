package fianl;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Towers towers = new Towers();

        System.out.print("Enter the number of disks: ");
        int numDisks = scanner.nextInt();

        towers.solveTowers(numDisks, 'A', 'C', 'B'); // A = from, C = to, B = temp
    }
}

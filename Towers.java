package fianl;

public class Towers {
    public void solveTowers(int numDisks, char from, char to, char temp) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
        } else {
            solveTowers(numDisks - 1, from, temp, to);
            System.out.println("Move disk " + numDisks + " from " + from + " to " + to);
            solveTowers(numDisks - 1, temp, to, from);
        }
    }
}

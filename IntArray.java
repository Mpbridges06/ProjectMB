package module5;

import java.util.Arrays;
import java.util.Random;

public class IntArray {
    private int length;
    private int[] myArray;

    // Constructor that initializes the array with the given length
    public IntArray(int l) {
        this.length = l;
        myArray = new int[l];
    }

    // Fills the array with random numbers between 1 and 6
    public void fillRand() {
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            myArray[i] = random.nextInt(6) + 1; // Generates numbers from 1 to 6
        }
    }

    // Returns the value at the specified index
    public int get(int element) {
        if (element >= 0 && element < length) {
            return myArray[element];
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    // Sets the value at the specified index
    public void set(int element, int newValue) {
        if (element >= 0 && element < length) {
            myArray[element] = newValue;
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    // Returns the number of elements in the array
    public int size() {
        return length;
    }

    // Checks if the array is empty (i.e., all elements are zero)
    public boolean isEmpty() {
        for (int num : myArray) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    // Clears the array by setting all elements to zero
    public void clear() {
        Arrays.fill(myArray, 0);
    }

    // Sorts the array in ascending order
    public void sort() {
        Arrays.sort(myArray);
    }

    // Returns a string representation of the array
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}

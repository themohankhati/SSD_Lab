package lab_3;

// Stats.java file
import java.util.Arrays;

/**
 * This is a class
 * @author Mr. Mohan&Manoj
 */
public class Stats {
    int[] numbers;
    int count;

    /**
     * Adds an integer value to the array
     *
     * @param value integer input given to the addValue method
     *
     */
    public void addValue(int value) {
        numbers[count] = value;
        count++;}

    /**
     * Gets the count of the elements of the array
     *
     * @return returns the length of numbers array
     */
    public int getCount() {
        return numbers.length;
    }

    /**
     * Gets the maximum value from the array.
     *
     * @return returns the maximum value from numbers array
     */
    public int getA() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i]; }
        return max;
    }

    /**
     * Gets the minimum value from the array.
     *
     * @return returns the minimum value from numbers array.
     */
    public int getB() {int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }

    /**
     * Gets the total sum of the values in the array.
     *
     * @return returns the total value of array numbers
     */
    public int getTotal() {
        int total = 0;
// total all values within the array
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        } return total;
    }

    /**
     * Gets the average value of the elements in the array.
     * 
     * @return returns the average of numbers array
     */
    public double getAverage() {
        int x = 0;
        for (int i = 0; i < numbers.length; i++) {
            //returns total number
            x += numbers[i];
//            System.out.println(x);
        }
        double y = x/(double)numbers.length;
        //returns the average of array numbers
        return y;
    }
    /**
     * Returns the string representation of the number array.
     * 
     * @return A string representation of the number array.
     */
    @Override
    public String toString() {return Arrays.toString(numbers);
    }
    
    
    /**
     * Constructor for the Stats class.
     * 
     * @param capacity The initial capacity of the numbers only.
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
    }}

package lab_3;

// Stats.java file
import java.util.Arrays;

/**
 * This is a class
 * @author Mr. Mohan
 */
public class Stats {
    int[] numbers;
    int count;

    /**
     *
     * @param value integer input given to the addValue method
     *
     */
    public void addValue(int value) {
        numbers[count] = value;
        count++;}

    /**
     *
     * @return returns the length of numbers array
     */
    public int getCount() {
        return numbers.length;
    }

    /**
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
     *
     * @return returns the minimum value from numbers array
     */
    public int getB() {int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }

    /**
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
    @Override
    public String toString() {return Arrays.toString(numbers);
    }
    public Stats(int capacity) {
        numbers = new int[capacity];
    }}

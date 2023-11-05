package lab_3;

/**
 * package name: lab_3
 * package is a mechanism for organizing related classes and interfaces into a single unit.
 */
// Driver.java file
import java.util.Random;

/**
 * Driver class with main method.
 * @author Mr. Mohan&Manoj 
 */
public class Driver {
	
	/**
	 * When run a java program,the Java Virtual Machine(JVM) looks for the main method in the specified class and starts the execution from there.
	 * (String args[] parameter list that allows you to pass command-line arguments to your java program.
	 * @param args parameter is an array of strings, where each element represents a command-line argument passed to the program when it is executed 
	 * Note for Command-line arguments: for example, java HelloWorld  arg1, arg2 would be an array containing ["args1, args2]
	 */
    public static void main(String[] args) {final int VALUES = 10;
        Stats stats = new Stats(VALUES);
        Random random = new Random();
        for (int i = 0; i < VALUES; i++) {
            stats.addValue(random.nextInt(100));
        }
        System.out.println("Numbers stored : ");
        System.out.println(stats);
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Count = " + stats.getCount());
        System.out.println("Total = " + stats.getTotal());
        System.out.println("Minimum value = " + stats.getB());
        System.out.println("Maximum value = " + stats.getA());
    }}
package lab_2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args)
    {
        Scanner sentence=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String Sentence=sentence.nextLine();

        Counter counter= new WordProcessor();
        counter.countWords(Sentence);
        counter.getLength(Sentence);
        counter.countLetters(Sentence);
    }
}

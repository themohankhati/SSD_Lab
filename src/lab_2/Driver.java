package lab_2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args)
    {
        Scanner sentence=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String Sentence=sentence.nextLine();

        Scanner text=new Scanner(System.in);
        System.out.println("Enter the text: ");
        String txt=sentence.nextLine();

        WordProcessor wordProcessor=new WordProcessor();
        wordProcessor.setText(txt);

        //if the sentence is passed null
        if (Sentence==null ||Sentence.trim().isEmpty())
        {
            wordProcessor.countWords(txt);
            wordProcessor.getLength(txt);
            wordProcessor.countLetters(txt);

        }
        else {
            Counter counter = new WordProcessor();
            counter.countWords(Sentence);
            counter.getLength(Sentence);
            counter.countLetters(Sentence);
        }
    }
}

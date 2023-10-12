package lab_2;

public class Driver {
    public static void main(String[] args)
    {
        Counter counter= new WordProcessor();
        counter.countWords("mohan khati");
        counter.countLetters("this is mohan");
        counter.getLength("mohan khati");


    }
}

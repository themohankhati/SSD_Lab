package lab_2;

public class WordProcessor implements Counter {

    @Override
    public int countWords(String sentence) {
        String[] array = sentence.split(" ");
        int words = array.length;
        System.out.println("The number of words in the given sentence is:" + words);
        return words;
    }

    @Override
    public int countLetters(String sentence) {
        String withoutSpaces = sentence.replaceAll("\\s", "");
        int letterCount=withoutSpaces.length();

        int letters = 0;
        boolean allLetters = true;
        for (int i = 0; i < letterCount; i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            }
            else {
                allLetters = false;
                break;
            }

        }
        if (allLetters) {
            System.out.println("All character in the sentence are letters");
        } else {
            System.out.println("Character in the sentence are non-letters");

        }
        System.out.println("The number of the letter in the sentence is: " + letters);
        return letters;
    }


    @Override
    public int getLength(String sentence) {
//        String withoutSpaces=sentence.replaceAll("\\S","");
//        int lettercount=withoutSpaces.length();
        System.out.println("The length of the sentence including space is: " + sentence.length());

        return 0 ;
    }
}
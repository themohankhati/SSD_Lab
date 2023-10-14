package lab_2;

public class WordProcessor implements Counter {
    private String text;

    @Override
    public int countWords(String sentence) {
        if (sentence==null)
        {
            String[] array = text.split(" ");
            int words = array.length;
            System.out.println("The number of words in the given sentence is:" + words);
            return words;

        }
        else {
            String[] array = sentence.split(" ");
            int words = array.length;
            System.out.println("The number of words in the given sentence is:" + words);
            return words;
        }
    }

    @Override
    public int countLetters(String sentence) {
        if (sentence == null) {
            //removing spaces
            String withoutSpaces = text.replaceAll("\\s", "");
            int letterCount = withoutSpaces.length();

            int letters = 0;
            boolean allLetters = true;
            for (int i = 0; i < letterCount; i++) {
                //checking whether character is letter or not
                if (Character.isLetter(withoutSpaces.charAt(i))) {
                    letters++;
                } else {
                    //of not letter set allletters to false
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

        } else {


            //removing spaces
            String withoutSpaces = sentence.replaceAll("\\s", "");
            int letterCount = withoutSpaces.length();

            int letters = 0;
            boolean allLetters = true;
            for (int i = 0; i < letterCount; i++) {
                //checking whether character is letter or not
                if (Character.isLetter(withoutSpaces.charAt(i))) {
                    letters++;
                } else {
                    //of not letter set allletters to false
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

    }
    @Override
    public int getLength(String sentence) {
        if (sentence == null) {
            System.out.println("The length of the sentence including space is: " + text.length());

        }
        else {
                System.out.println("The length of the sentence including space is: " + sentence.length());

        }
        return 0;


    }


    //setter
    public void setText(String txt)
    {
        this.text=txt;
    }

    //getter
    public String getText()
    {
        return text;
    }
}
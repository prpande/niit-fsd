package jap.string;

public class OccurrenceOfCharacter
{
    //This method will return the count of particular character in the given input String
    public int getCountOfCharacter(String input,char character) 
    {
        if(input == null || input.length() < 1)
        {
            return 0;
        }

        int count = 0;
        char[] characterArray = input.toCharArray();
        for(char ch : characterArray)
        {
            if(ch == character)
            {
                count++;
            }
        }

        return count;
    }

    //This method will return the reverse of the given input String
    public String reverseString(String input)
    {
        if(input == null)
        {
            return null;
        }

        String reverseString = "";

        for(int i = input.length() - 1; i >= 0; i--)
        {
            reverseString += input.charAt(i);
        }

        return reverseString;
    }

    //This method will return the largest String from the given input String
    public String getLargestString(String input)
    {
        if(input == null)
        {
            return null;
        }
        
        String[] words = input.split(" ");
        
        String largestWord = "";
        for(String w : words)
        {
            if(w.length() > largestWord.length())
            {
                largestWord = w;
            }
        }

        return largestWord;
    }

    // This method will return a char array of all the vowels in the given string
    public char[] getAllVowelsInTheString(String str)
    {
        int length = str.length();
        String vowelString = "";
        for(int i = 0; i < length; i++)
        {
            char ch = str.charAt(i);
            switch(ch)
            {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    vowelString += ch;
                    break;
            }
        }

        return vowelString.toCharArray();
    }

    public static void main( String[] args )
    {
        OccurrenceOfCharacter occurrenceOfCharacter = new OccurrenceOfCharacter();
        String input = "java is a prOgramming lAnguage";
        char character = 'v';
        System.out.println(occurrenceOfCharacter.getCountOfCharacter(input,character));
        System.out.println(occurrenceOfCharacter.reverseString(input));
        System.out.println(occurrenceOfCharacter.getLargestString(input));
        System.out.println(occurrenceOfCharacter.getAllVowelsInTheString(input));
    }
}

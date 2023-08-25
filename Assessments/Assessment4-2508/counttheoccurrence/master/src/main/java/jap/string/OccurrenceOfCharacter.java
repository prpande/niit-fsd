package jap.string;

public class OccurrenceOfCharacter
{
    //This method will return the count of particular character in the given input String
    public int getCountOfCharacter(String input,char character) {



        return 0;

    }

    //This method will return the reverse of the given input String
    public String reverseString(String input){


        return " ";
    }

    //This method will return the largest String from the given input String
    public String getLargestString(String input){


        return " ";
    }

    // This method will return a char array of all the vowels in the given string
    public char[] getAllVowelsInTheString(String str){

      return new char[1];
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

package com.jap;
public class ShortestWord 
{
    public static void main(String[] args) 
    {
        //Declare and initialize a String array.
        String[] array = {"Hello", "world", "is", "easy"};

        // Create an object of the class ShortestWord
        ShortestWord obj = new ShortestWord();

        //Call the method findShortestWord() and pass the array.
        String shortestWord = obj.findShortestWord(array);
        System.out.println("Shortest word: " + shortestWord);
    }

    //Write the logic to find the shortest word from the String array inside
    // the below method and return the shortest word.
    public String findShortestWord(String[] words) 
    {
        if(words == null || words.length < 1)
        {
            return "Cannot find shortest word as array is empty";
        }

        String shortestString = words[0];
        for(String str : words)
        {
            if(str.length() < shortestString.length())
            {
                shortestString = str;
            }
        }

        return shortestString;
    }
}

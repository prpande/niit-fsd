package session;
public class ExtractVowels 
{
    public char[] extract(String inpString)
    {
        char[] characters= inpString.toCharArray();
        int length = characters.length;
        char[] vowelsTemp = new char[length];
        int index = 0;
        for (int i = 0; i < length; i++) 
        {
            switch(characters[i])
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
                    vowelsTemp[index] = characters[i];
                    index++;
                    break;
            }
        }

        // return vowelsTemp;

        // Extra trimming - not necessary
        char[] vowels = new char[index];
        for(int i = 0; i < index; i++)
        {
            vowels[i] = vowelsTemp[i];
        }

        return vowels;
    }

    public static void main(String[] args)
    {
        ExtractVowels obj = new ExtractVowels();
        String str = "Power corrupts, absolute power corrupts absolutely!";

        char[]  vowels = obj.extract(str);
        System.out.print("Vowels in string: ");
        for(char ch: vowels)
        {
            System.out.print(ch + ", ");
        }
    }
}

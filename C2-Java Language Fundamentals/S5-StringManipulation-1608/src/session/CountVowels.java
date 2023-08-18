package session;
public class CountVowels
{
    public void countAllVowels(String[] string)
    {
        for (int i = 0; i < string.length; i++) 
        {
            char ch[]= string[i].toCharArray();
            int count = 0;
            for (int j = 0; j < ch.length; j++) 
            {
                switch(ch[j])
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
                        count++;
                        break;
                }
            }

            System.out.println(string[i] + " Vowels : " + count);
        }
    }

    public static void main(String[] args)
    {
        CountVowels obj = new CountVowels();
        String[] array = {"Tommy","JOHN","JeNNy","Robert"};
        obj.countAllVowels(array);
    }
}
package session;
public class CountSpaces 
{
    public int count(String inputString)
    {
        int spcCount = 0;
        for(int i = 0; i < inputString.length(); i++)
        {
            if(inputString.charAt(i) == ' ')
            {
                spcCount++;
            }
        }

        return spcCount;
    }

    public static void main(String[] args)
    {
        CountSpaces obj = new CountSpaces();
        String str = "Java is a programming language";

        int spcCount = obj.count(str);
        System.out.println(str + ". :# of spaces: " + spcCount);
    }
}

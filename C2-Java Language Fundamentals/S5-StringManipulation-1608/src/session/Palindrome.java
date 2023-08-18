package session;
public class Palindrome 
{
    public boolean check(String inputString)
    {
        String reverse = "";
        for(int i = inputString.length() - 1; i >= 0 ; i--)
        {
            reverse = reverse + inputString.charAt(i);
        }

        if(reverse.equals(inputString))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Palindrome obj = new Palindrome();
        String str = "radar";
        boolean check = obj.check(str);
        System.out.println(str + " isPalindrome : " + check);
    }
}

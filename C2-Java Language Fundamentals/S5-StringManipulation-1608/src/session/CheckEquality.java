package session;
/*
 * Check Equality of String
 * Write a program to check the equality of two String using (==)
 * operator and equals() method.
 * Check equality by creating String with new keyword and String as literal.
 */
public class CheckEquality
{
    public boolean checkEqualityOfStringWithNewKeyword(String str1,String str2)
    {
        if(str1.equals(str2))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public boolean checkEqualityOfStringWithoutNewKeyword(String str3,String str4)
    {
        if(str3.equals(str4))
        {
            return true;
        }
        else 
        {
           return false;
        }

    }

    public boolean checkEqualityWithoutNewKeyword(String str3,String str4)
    {
        if(str3 == str4)
        {
            return true;
        }
        else 
        {
           return false;
        }
    }

    public boolean checkEqualityWithNewKeyword(String str1,String str2)
    {
        if(str1 == str2)
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
        CheckEquality checkEquality = new CheckEquality();
        String str1 = new String("John");
        String str2 = new String("John");
        String str3 = "Johny";
        String str4 = "Johny";

        // equals()
        System.out.println("checkEqualityWithEqualsOfStringWithNewKeyword : " + checkEquality.checkEqualityOfStringWithNewKeyword(str1,str2));        
        System.out.println("checkEqualityWithEqualsOfStringWithoutNewKeyword : " + checkEquality.checkEqualityOfStringWithoutNewKeyword(str3,str4));

        // ==
        System.out.println("checkEqualityWithOperatorWithNewKeyword : " + checkEquality.checkEqualityWithNewKeyword(str1,str2));
        System.out.println("checkEqualityWithOperatorWithoutNewKeyword: " + checkEquality.checkEqualityWithoutNewKeyword(str3,str4));
    }
}

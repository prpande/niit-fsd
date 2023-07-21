package session.sp2demos;

// Program to demo the System.Out.Format functionality
public class SystemOutFormat 
{
    public static void main(String[] args)
    {
        String str = "TestString";
        int intNum = 5;
        char charC = 'A';
        long longNum = 123456789l;
        float floatNum = 3.14f;
        double doubleNum = 3.141593;

        System.out.format("This is formatted string containing String:%s Integer:%d Character:%c Long:%d Float:%f Double:%f", str, intNum, charC, longNum, floatNum, doubleNum);
    }
}

package jap.array;

public class CountDigitDemo 
{
    public static void main(String[] args) 
    {
        int[] numberArray = {234, 345, 654, 321, 6789, 564, 6788, 45345, 678};
        CountDigitDemo countDigitDemo = new CountDigitDemo();
        int numberDemo = countDigitDemo.countDigit(numberArray);
        System.out.println(numberDemo);
    }

    //Write the logic to count the three digits number from the array and return their count
    public int countDigit(int[] numberArray) 
    {
        int threeDigitCount = 0;

        for(int num : numberArray)
        {
            if(num > 99 && num < 1000)
            {
                threeDigitCount++;
            }
        }

        return threeDigitCount;
    }
}

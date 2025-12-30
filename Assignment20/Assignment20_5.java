import java.util.*;

class Logic
{
    public int num;

    public void FindSmallestDigit()
    {
        if (num < 0)
        {
            num = -num;
        }

        int iDigit = 0;
        int iMin = num; // initialize with the last digit

        while (num != 0)
        {
            iDigit = num % 10;    
            if (iDigit < iMin)     
            {
                iMin = iDigit;
            }
            num = num / 10;       
        }

        System.out.println("The smallest digit is: " + iMin);
    }
} // end of Logic class


class Assignment20_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int iValue = sobj.nextInt();       

        Logic lobj = new Logic();
        lobj.num = iValue;
        lobj.FindSmallestDigit();
    }
}

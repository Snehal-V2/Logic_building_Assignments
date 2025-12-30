import java.util.*;

class Logic
{
    public int num;

    public void FindLargestDigit()
    {
        if (num < 0)
        {
            num = -num;
        }

        int iDigit = 0, iMax = 0;

        while (num != 0)
        {
            iDigit = num % 10;    
            if (iDigit > iMax)     
            {
                iMax = iDigit;
            }
            num = num / 10;       
        }

        System.out.println("The largest digit is: " + iMax);
    }
} // end of Logic class


class Assignment20_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int iValue = sobj.nextInt();       

        Logic lobj = new Logic();
        lobj.num = iValue;
        lobj.FindLargestDigit();
    }
}

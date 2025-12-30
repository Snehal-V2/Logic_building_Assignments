
import java.util.*;

class Logic
{
    public int n;

    public void PrintDivisibleBy2and3()
    {
        if (n < 0)
        {
            n = -n;
        }

        int iCount, count = 0, sum = 0;

        for (iCount = 1; iCount <= n; iCount++)
        {
            if (iCount % 2 == 0 && iCount % 3 == 0)
            {
                System.out.print(iCount + " ");
                sum = sum + iCount;
                count++;
            }
        }

        System.out.println("Total numbers divisible by both 2 and 3: " + count);
        System.out.println("Sum of those numbers: " + sum);
    }
} // end of Logic class

class Assignment21_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.n = iValue;
        lobj.PrintDivisibleBy2and3();

        lobj= null;
        sobj=null;
        System.gc();
    }
}
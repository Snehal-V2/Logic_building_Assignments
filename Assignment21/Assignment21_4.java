import java.util.*;

class Logic
{
    public int n;

    public void TotalFactors()
    {
        if (n < 0)
        {
            n = -n;
        }

        int iCount = 0 , iTotal = 0;  

        for (iCount = 1; iCount <= n; iCount++)
        {
            if (n % iCount == 0)
            {
                iTotal++;  
            }
        }

        System.out.println("Total number of factors: " + iTotal);
    }
} // end of Logic class

class Assignment21_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.n = iValue;
        lobj.TotalFactors();

        lobj= null;
        sobj=null;
        System.gc();

    }
}

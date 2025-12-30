import java.util.*;

class Logic
{
    public int n;

   
   public  void CountEvenOddRange()
    {
        if(n<0)
        {
            n = -n;
        }
        int iEven = 0,iCount = 0,iOdd =0;

        for(iCount = 1; iCount <= n; iCount++)
        {
            if (iCount % 2 == 0)
            {      
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }

        System.out.println("Even numbers count: " + iEven + " and Odd numbers count: " + iOdd);
    }
}//end of the Logic class

class Assignment21_2
{
    public static void main(String A[])
    {
        int iValue =0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        iValue = sobj.nextInt();       

        Logic lobj = new Logic();
        lobj.n = iValue;
        lobj.CountEvenOddRange();

        lobj= null;
        sobj=null;
        System.gc();
      

    }
}
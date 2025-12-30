import java.util.*;

class Logic
{
    public int n;

   
   public  void DisplayFactors()
    {
        if(n<0)
        {
            n = -n;
        }
        int iFact = 1,iCount = 0;

        for(iCount = 1; iCount <= n; iCount++)
        {
            if(n%iCount == 0)
            {
                 System.out.print(iCount + " ");
            }
        }

     
    }
}//end of the Logic class

class Assignment21_3
{
    public static void main(String A[])
    {
        int iValue =0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        iValue = sobj.nextInt();       

        Logic lobj = new Logic();
        lobj.n = iValue;
        lobj.DisplayFactors();

        lobj= null;
        sobj=null;
        System.gc();

    }
}
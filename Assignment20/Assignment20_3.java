import java.util.*;

class Logic
{
    public int n;
   public  boolean CheckPerfect()
    {
        if(n<0)
        {
            n = -n;
        }
        int iCount = 0,iSum = 0;
        for(iCount =1; iCount<= n/2; iCount++)
        {
            if ( n%iCount == 0)
            {
                iSum = iSum+iCount;
               
            } 
        }
        return (iSum == n);
    }
} //end of the Logic class

class Assignment20_3
{
    public static void main(String A[])
    {
        int iValue =0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        iValue = sobj.nextInt();       

        Logic lobj = new Logic();
        lobj.n = iValue;
        bRet = lobj.CheckPerfect ();
        if(bRet == true)
        {
            System.out.println("The number is perfect");
        }
        else
        {
            System.out.println("The number is not perfect");
        }

        
    }
}

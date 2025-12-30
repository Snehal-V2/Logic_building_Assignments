import java.util.*;

class Logic
{
    public int n;

   
   public  void CalculateSum()
    {
        int iSum = 0,iCount = 0;
        for (iCount=1; iCount<=n; iCount++)
        {
            iSum = iSum +iCount;
            
        }
        System.out.println("The Sum of first natural Numbers is: "+iSum);
    }
}//end of the Logic class

class Assignment16_1
{
    public static void main(String A[])
    {
        int iValue =0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        iValue = sobj.nextInt();       

        Logic lobj = new Logic();
        lobj.n = iValue;
        lobj.CalculateSum();

      

    }
}
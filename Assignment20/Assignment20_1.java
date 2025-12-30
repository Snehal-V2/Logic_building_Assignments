import java.util.*;

class Logic
{
    public int n;

   
   public  void SumEvenNumber()
    {
        if(n<0)
        {
            n = -n;
        }
        int iSum = 0,iCount = 0;
        for (iCount=1; iCount<= n; iCount++)
        {
            if(iCount%2 == 0)
            {
            iSum = iSum +iCount;
            }
            
        }
        System.out.println("The Sum of Even Numbers is: "+iSum);
    }
}//end of the Logic class

class Assignment20_1
{
    public static void main(String A[])
    {
        int iValue =0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        iValue = sobj.nextInt();       

        Logic lobj = new Logic();
        lobj.n = iValue;
        lobj.SumEvenNumber();

      

    }
}
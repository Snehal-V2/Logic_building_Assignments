import java.util.*;

class Logic
{
    public int iNo;
    public long CalculateFactorial ()
    { 
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int i = 0;
        long lFact = 1;
        for(i =1; i <= iNo; i++)
        {
            lFact = lFact * i;
        }
    return lFact;
       
    }       

} // End of Number Class

class Assignment16_3
{
    
    public static void main(String A[])
    {
        int iValue = 0;
        long iRet=0;
       
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();
        System.out.print("Enter Number: ");
        lobj.iNo = sobj.nextInt();  
        
        iRet = lobj.CalculateFactorial();
        

        System.out.println("The Factorial is "+iRet);
       
        // important to write,below syntax to call garbage collector for resource deallocation.
        sobj = null;
        lobj = null;

        System.gc();

             
    }
}
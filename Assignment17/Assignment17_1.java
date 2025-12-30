import java.util.*;

class Logic
{
    public int iNo;

    public int SumDigits()
    { 
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iDigit = 0, iSum = 0;
        
        while (iNo != 0)
        {
            iDigit = iNo % 10;      
            iSum = iSum + iDigit;   
            iNo = iNo / 10;         
        }

        return iSum;
    }

} // End of Logic Class

class Assignment17_1
{
    
    public static void main(String A[])
    {
         
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();
        System.out.print("Enter the number: ");
        lobj.iNo = sobj.nextInt();       
        int iRev=0;
     
        iRev =lobj.SumDigits();

        System.out.println("The sum of digits in given number is: "+iRev);
       
        // important to write,below syntax to call garbage collector for resource deallocation.
       
        lobj = null;

        System.gc();

             
    }
}
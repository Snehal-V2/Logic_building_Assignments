import java.util.*;

class Logic
{
    public int iNo;

    public int CountDigits()
    { 
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int i = 0,iCount=0;
        while(iNo !=0)
        {
        iNo = iNo/10;
        iCount++;
     
        }
        return iCount;
    }
   
       
       

} // End of Number Class

class Assignment16_5
{
    
    public static void main(String A[])
    {
         
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();
        System.out.print("Enter the number: ");
        lobj.iNo = sobj.nextInt();       
        int iRev=0;
     
        iRev =lobj.CountDigits();

        System.out.println("The count of digits in given number is: "+iRev);
       
        // important to write,below syntax to call garbage collector for resource deallocation.
       
        lobj = null;

        System.gc();

             
    }
}
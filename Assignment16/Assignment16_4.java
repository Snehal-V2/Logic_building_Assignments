import java.util.*;

class Logic
{
    public int iNo;

    public void ReverseNumber ()
    { 
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int i = 0,iRev=0;
        while (i != iNo)
        {
           iRev = iNo % 10;
           System.out.println("The digits are: "+iRev);
           iNo = iNo/10;
        }
   
       
    }       

} // End of Number Class

class Assignment16_4
{
    
    public static void main(String A[])
    {
         
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();
        System.out.print("Enter the number: ");
        lobj.iNo = sobj.nextInt();       
    
     
        lobj.ReverseNumber();
    
       
        // important to write,below syntax to call garbage collector for resource deallocation.
       
        lobj = null;

        System.gc();

             
    }
}
import java.util.*;

class Logic
{
    public int n;

   
   public  void ProductDigit()
    {
        if(n<0)
        {
            n = -n;
        }
        int iMult = 1,iCount = 0;
       while (n != 0)
        {
            iCount = n % 10;      
            iMult = iMult * iCount; 
            n = n / 10;          
        }

        System.out.println("The product of the digits is: " + iMult);
    
    }
}//end of the Logic class

class Assignment21_1
{
    public static void main(String A[])
    {
        int iValue =0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        iValue = sobj.nextInt();       

        Logic lobj = new Logic();
        lobj.n = iValue;
        lobj.ProductDigit();

        lobj= null;
        sobj=null;
        System.gc();

    }
}
//check palindrome

import java.util.*;

class Logic
{
    public int iNo;

    public boolean CheckPalindrom()
    { 
       
       int iNum = iNo;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iDigit = 0, iRev=0;
        while(iNo!=0)
        {
            iDigit = iNo%10;
            iRev = (iRev * 10) + iDigit;
            iNo= iNo/10;
                         
        }
            return (iNum ==iRev);
            
    }

} // End of Logic Class

class Assignment17_2
{
    
    public static void main(String A[])
    {
         
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();
        System.out.print("Enter the number: ");
        lobj.iNo = sobj.nextInt();       
     
        boolean bRet = false;
        bRet = lobj.CheckPalindrom();
        if(bRet==true)
        {
            System.out.println("The given Number is Palidrom");
        }
        else
        {
            System.out.println("The given Number is not Palidrom");
        }

        // important to write,below syntax to call garbage collector for resource deallocation.
       
        lobj = null;

        System.gc();

             
    }
}
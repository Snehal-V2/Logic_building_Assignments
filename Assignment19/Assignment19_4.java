import java.util.*;

class Logic
{
    int iDigit=0;

    
    public void Print_Digits()
    {   
    
        if(iDigit<0)
        {
            iDigit = -iDigit;
        }
        int iValue = 0;
        while(iDigit !=0)
        {
            iValue = iDigit%10;
            System.out.println("The digits of given number is: "+iValue);
            iDigit = iDigit/10;
        }

    
    }
}//End of class Logic

class Assignment19_4
{
        public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter the Number: ");
        lobj.iDigit = sobj.nextInt(); 
       

        lobj.Print_Digits();
        

        lobj = null;
        System.gc();

    }
}
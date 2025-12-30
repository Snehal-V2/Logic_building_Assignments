

import java.util.*;

class Logic
{
    int iNum=0;

    
    public void CheckDivisible()
    {   
    
        if(iNum<0)
        {
            iNum = -iNum;
        }
  
        if (iNum%5==0 && iNum%11 ==0)
        {
            System.out.println("The number is divisible by 5 and 11: "+iNum);
        }
        else
        {
            System.out.println("This number is not divisible");
        }
    
    }
}//End of class Logic

class Assignment19_3
{
        public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter the Year: ");
        lobj.iNum = sobj.nextInt(); 
       

        lobj.CheckDivisible();
        

        lobj = null;
        System.gc();

    }
}
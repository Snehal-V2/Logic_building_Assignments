//check palindrome

import java.util.*;

class Logic
{
    public int iNo1,iNo2,iNo3;

    public void FindMax()
    { 
        if(iNo1 > iNo2 && iNo1 > iNo3)
        {
            System.out.println("The Maximum number is: "+iNo1);
        }
        else if(iNo2 > iNo1 && iNo2 > iNo3) 
        {
            System.out.println("The Maximum number is: "+iNo2);
        }
        else if(iNo3 > iNo1 && iNo3 > iNo2) 
        {
            System.out.println("The Maximum number is: "+iNo3);
        }
        else
        {
            System.out.println("The numbers are equal");
        }
    }
}// End of Logic Class

class Assignment17_4
{
    
    public static void main(String A[])
    {
         
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter first number: ");
        lobj.iNo1 = sobj.nextInt(); 

        System.out.print("Enter second number: ");
        lobj.iNo2 = sobj.nextInt();    

        System.out.print("Enter Third number: ");
        lobj.iNo3 = sobj.nextInt();    

        lobj.FindMax();
       
       

        // important to write,below syntax to call garbage collector for resource deallocation.
       
        lobj = null;
       

        System.gc();

             
    }
}
//check palindrome

import java.util.*;

class Logic
{
    int iNo=0;

    public void PrintTable()
    {
        int i=0 , iTable=1;
        for(i=1; i<=10; i++)
        {
            iTable = iNo * i;
            System.out.println("The values are: "+iTable);
        }
       
    }

}
// End of Logic Class

class Assignment17_5
{
    
    public static void main(String A[])
    {
         
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter first number: ");
        lobj.iNo = sobj.nextInt(); 

        
        lobj.PrintTable();
       
       

        // important to write,below syntax to call garbage collector for resource deallocation.
       
        lobj = null;
       

        System.gc();

             
    }
}
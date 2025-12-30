
import java.util.*;

class Logic
{
    int iNo=0;
  
    public void PrintTable()
    {   
        int i = 0, iNum = 1;
        if (iNo < 0)
        {
            iNo= -iNo;
        }
        for (i = 1; i <= 10; i++)
        {
            iNum = i* iNo;
            System.out.println("The multiplication table is: "+iNum);
        }
    
    }
}//End of class Logic

class Assignment18_5
{
        public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter the number: ");
        lobj.iNo = sobj.nextInt(); 
        int iRet = 0;

        lobj.PrintTable();
        

        lobj = null;
        System.gc();

    }
}
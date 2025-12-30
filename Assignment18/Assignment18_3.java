
import java.util.*;

class Logic
{
    int iNo = 0;
  
    public void PrintEvenOdd()
    {   
        int i = 0;
        if (iNo < 0)
        {
            iNo = -iNo;
        }

        System.out.print("The even numbers are: ");
        for (i = 1; i <= iNo; i++)
        {
            if (i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // new line

        System.out.print("The odd numbers are: ");
        for (i = 1; i <= iNo; i++)
        {
            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // new line
    }
}//End of class Logic

class Assignment18_3
{
        public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter the number: ");
        lobj.iNo = sobj.nextInt(); 
        int iRet = 0;

        lobj.PrintEvenOdd();
        

        lobj = null;
        System.gc();

    }
}
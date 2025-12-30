
import java.util.*;

class Logic
{
    int iNo=0;
  
    public void PrintEven()
    {   
        int i = 0, iEven = 0;
        if (iNo < 0)
        {
            iNo= -iNo;
        }
        for (i = 1; i <= iNo; i++)
        {
            if (i % 2 == 0)
            {
                iEven = i;
                System.out.println("The even numbers are: "+iEven);
            }
        }
        
    }
}

class Assignment18_2
{
        public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter the number: ");
        lobj.iNo = sobj.nextInt(); 

        lobj.PrintEven();
 // important to write,below syntax to call garbage collector for resource deallocation.
       
        lobj = null;
        System.gc();

    }
}
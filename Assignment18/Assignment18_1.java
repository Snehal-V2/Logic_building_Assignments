
import java.util.*;

class Logic
{
    int iNo=0;
  
    public boolean CheckPrime()
    {   
        int i = 0;

        if (iNo <= 1)
        {
            return false;
        }

        for (i = 2; i <= iNo / 2; i++)
        {
            if (iNo % i == 0)
            {
                return false; 
            }
        }

        return true; 
    }
}


class Assignment18_1
{
        public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter the number: ");
        lobj.iNo = sobj.nextInt(); 

        boolean bRet=false;

        bRet = lobj.CheckPrime();
       if(bRet==true)
       {
        System.out.println("The given Number is prime number");
       }
       else
        {
        System.out.println("The given Number is not a prime number");
       }
       
       

        // important to write,below syntax to call garbage collector for resource deallocation.
       
        lobj = null;
       

        System.gc();

    }
}
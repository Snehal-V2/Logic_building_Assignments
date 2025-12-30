
import java.util.*;

class Logic
{
    int iNo=0;
  
    public int AddEvenOdd()
    {   
        int i = 0, iOdd = 0,iEven=0, iSum = 0;
        if (iNo < 0)
        {
            iNo= -iNo;
        }
        for (i = 1; i <= iNo; i++)
        {
            if (i % 2 != 0)
            {
                iOdd = iOdd+ i;

            }
            else 
            {
                iEven = iEven+i;

            }
           
        }
     return iSum=iEven+iOdd;
    }
}//End of class Logic

class Assignment18_4
{
        public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter the number: ");
        lobj.iNo = sobj.nextInt(); 
        int iRet = 0;

        iRet = lobj.AddEvenOdd();
        System.out.println("The sum of the odd and even digits are: "+iRet);

        lobj = null;
        System.gc();

    }
}
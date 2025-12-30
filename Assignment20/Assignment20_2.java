import java.util.*;

class Logic
{
    public int n;

   
   public  void  PrintReverse()
    {
        if(n<0)
        {
            n = -n;
        }
        int iCount = 0;
        while(n != 0)
        {
         iCount = n%10;
         System.out.print(iCount);
         n = n/10;

        }
        
    }
}//end of the Logic class

class Assignment20_2
{
    public static void main(String A[])
    {
        int iValue =0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        iValue = sobj.nextInt();       

        Logic lobj = new Logic();
        lobj.n = iValue;
        lobj.PrintReverse();

      

    }
}
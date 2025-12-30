
import java.util.*;

class Logic
{
    int iYear=0;
  
    public void CheckLeapYear()
    {   
    
        if (iYear%4 == 0 || iYear%400 == 0)
        {
            System.out.println("The year is leap year");
        }
        else
        {
            System.out.println("This year is not leap year");
        }
    
    }
}//End of class Logic

class Assignment19_1
{
        public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter the Year: ");
        lobj.iYear = sobj.nextInt(); 
       

        lobj.CheckLeapYear();
        

        lobj = null;
        System.gc();

    }
}
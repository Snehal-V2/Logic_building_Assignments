
import java.util.*;

class Logic
{
    int iMarks=0;
  
    public void DisplayGrade()
    {   
    
        if(iMarks<0)
        {
            iMarks = -iMarks;
        }
        if (iMarks >=80 && iMarks<=100)
        {
            System.out.println("Distinction");
        }
        else if (iMarks >=60 && iMarks<=79)
        {
            System.out.println("First Grade");
        }
        else if (iMarks >=50 && iMarks<=59)
        {
            System.out.println("Second Grade");
        }
        else if (iMarks >=35 && iMarks<=49)
        {
            System.out.println("Third Grade");
        }
        else
        {
            System.out.println("Fail");
        }
    
    }
}//End of class Logic

class Assignment19_2
{
        public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter the Marks: ");
        lobj.iMarks = sobj.nextInt(); 
        

        lobj.DisplayGrade();
        

        lobj = null;
        System.gc();

    }
}
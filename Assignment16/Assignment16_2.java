
import java.util.*;

class Logic
{
    public int n;

    void CheckEvenOdd()
    {
       
        if( n%2 == 0)   
        {
          System.out.println("The given number is Even.");
        }
        else 
        {
           System.out.println("The given number is odd.");
        }
    }
            
        
        
}//end of the Logic class

class Assignment16_2
{
    public static void main(String A[])
    {
        
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();
        System.out.print("Enter the number: ");
        lobj.n = sobj.nextInt();       

        lobj.CheckEvenOdd();
    }

}
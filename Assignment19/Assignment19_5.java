import java.util.*;

class Logic
{
    int ibase = 0,  iExp = 0;
    double dValue=0;

    public void CalculatePower()
    {   
        dValue = Math.pow(ibase ,iExp);

        System.out.println("The output is: "+dValue);

    }

} //End of class Logic

class Assignment19_5
{
        public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        System.out.print("Enter the number: ");
        lobj.ibase = sobj.nextInt(); 

        System.out.print("Enter the power: ");
        lobj.iExp = sobj.nextInt(); 
       

        lobj.CalculatePower();
        

        lobj = null;
        System.gc();

    }
}
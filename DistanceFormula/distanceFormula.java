import java.util.Scanner;
import java.lang.Math; // importing java.lang package 

class CalDistance
{
    public static void main(String args[])
    {

        Scanner enterDistaceValues = new Scanner (System.in); 

        // the distance Formula is Square Root (X2-X1)^2 + (Y2-Y1)^2 

        // storing the values 
        System.out.println("Enter X2 " );
        int x2 = enterDistaceValues.nextInt();

        System.out.println("Enter X1 " );
        int x1 = enterDistaceValues.nextInt();

        System.out.println("Enter Y2 " );
        int y2 = enterDistaceValues.nextInt();

        System.out.println("Enter Y1 " );
        int y1 = enterDistaceValues.nextInt();

        // Finding the distances 
        int xSub = x2  - x1; // (X2-X1)
        int ySub = y2 - y1; //(Y2-Y1) 

      	double resultX = Math.pow(xSub, 2); // (X2-X1)^2 
      	double resultY = Math.pow(ySub, 2);//(Y2-Y1) ^2

        double resultDistance = resultX + resultY; // (X2-X1)^2 + (Y2-Y1)^2 

        // finding the Square Root of it 
         double finalResultDistance = Math.sqrt(resultDistance); 

        System.out.println ("The number is " + finalResultDistance); 


    }
}
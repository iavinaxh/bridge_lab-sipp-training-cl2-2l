import java.util.*;
public class TriangularPark {
     static double noOfRound(double s1, double s2,double s3){
        double noOfRound = 5000/(s1+s2+s3);
        return(noOfRound);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter triangle side");
        double side1=scanner.nextDouble();
         System.err.println("enter triangle side");
        double side2=scanner.nextDouble();
         System.err.println("enter triangle side");
        double side3=scanner.nextDouble();
        // TriangularPark obj = new TriangularPark();
        double noOfRound=noOfRound(side1, side2, side3);
        System.err.println("the no of round is"+noOfRound);

    }
}
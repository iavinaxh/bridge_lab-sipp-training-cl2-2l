import java.util.*;

public class Bmi {
    public static void bmi(double[][] data){
        for(int i=0;i<=10-1;i++){
            double weight=data[i][0];
            double height=data[i][1]/100;
            data[i][2]=weight/height*height;

        }
       
    }
public static void bmii(double[][]data){
    for(int i=0;i<=10-1;i++){
        if(data[i][2]<=18.4){
            System.out.println("Underweight");
        }
        else if(data[i][2]>=18.5 && data[i][2]<=24.9){
            System.err.println("Normal");
        }
        else if(data[i][2]>=25 && data[i][2]<=39.9){
            System.err.println("Overweight");

        }
        else if(data[i][2]>=40){
            System.err.println("obese");
        }

    }
}

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter height and weight");
        double [][] data=new double[10][3];
        for(int i=0;i<=10-1;i++){
            System.err.println("weight of person"+(i+1)+":");
            data [i][0]=scanner.nextDouble();
            System.err.println("height in cm of person"+(i+1)+":");
            data [i][1]=scanner.nextDouble();
        }
        bmi(data);
        bmii(data);


        
    }
}
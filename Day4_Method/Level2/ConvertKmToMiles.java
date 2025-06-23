import java.util.*;


public class ConvertKmToMiles {
    public static double kmtomile(double distance){
        return  (0.621371*distance);
    }
    public static double milestokm(double distance){
        return 1.60934*distance;
    }
    public static double metertofeet(double distance){
        return 3.28084*distance;
    }
    public static double feettometer(double d){
        return  0.3048*d;
    }
   public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     System.err.println("enter the Km");
     double km=scanner.nextDouble();
     System.err.println("km to miles"+ConvertKmToMiles.kmtomile(km));
     System.err.println("enter miles");
     double mile=scanner.nextDouble();
     System.err.println("conver miles to km: "+ConvertKmToMiles.milestokm(mile));
     System.err.println("enter meter");
     double meter=scanner.nextDouble();
     System.err.println("meter to feet"+ConvertKmToMiles.metertofeet(meter));
     System.err.println("enter feet");
     double feet =scanner.nextDouble();
     System.err.println("feet to meter:"+ConvertKmToMiles.feettometer(feet));


   }
    


    
}
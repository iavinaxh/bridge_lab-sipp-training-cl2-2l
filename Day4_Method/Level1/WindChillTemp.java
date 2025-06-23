import java.util.*;
public class WindChillTemp {
    public double calculateWindChill(double temperature, double windSpeed){
        double windchill = 35.75+0.62215*temperature+(0.4275*temperature-35.7)*Math.pow(windSpeed,0.16);
        return windchill;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter temp");
        double temp = scanner.nextDouble();
        System.err.println("enter wind speed");
        double windspeed = scanner.nextDouble();
        WindChillTemp obj=new WindChillTemp();
        double windchilll=obj.calculateWindChill(temp, windspeed);
        System.err.println("windchill is:"+windchilll);
    }
}
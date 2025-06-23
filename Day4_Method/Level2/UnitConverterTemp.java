
import java.util.*;


public class UnitConverterTemp {
    public static double ftoc(double temp){
        double f2c = (temp - 32) * 5 / 9;
        return f2c;
    }
    public static double ctof(double temp){
        double c2f =(temp * 9 / 5) + 32;
        return c2f;
    }
    public static double ktop (double weight){
        double k2p=0.453592*weight;
        return k2p;

    }
    public static double ptok (double weight){
        return weight*2.20462;
    }

public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.err.println("enter temp in F");
    double F=scanner.nextDouble();
    System.out.println("F to C"+ftoc(F));
    System.err.println("enter temp in C");
    double C=scanner.nextDouble();
    System.err.println("C to F is:"+ctof(C));
    System.err.println("enter weight in kg");
    double kg=scanner.nextDouble();
    System.err.println("weight in pounds"+ktop(kg));
    System.err.println("enter weight in pounds");
    double pounds=scanner.nextDouble();
    System.err.println("weight in kg "+ptok(pounds));

    
}

    
    
    
}
import java.util.*;
public class SimpleInterest {
    double SimpleInterestCalculation(double principle,int rate,int time){
        double Interest=(principle*rate*time)/100;
        return (Interest);
    }
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.err.println("enter principle");
    double principle=scanner.nextDouble();
    System.err.println("enter rate");
    int rate =scanner.nextInt();
    System.err.println("enter time");
    int time =scanner.nextInt();
    SimpleInterest obj =new SimpleInterest();
    double Interest =obj.SimpleInterestCalculation(principle,rate,time);
    System.err.println("The Simple Interest is "+Interest+"for Principal"+principle+"Rate of Interest"+rate+"and Time"+time);

}
    
}
import java.util.*;
public class Distance {
    public static double Distance(int x1,int y1,int x2,int y2){
         double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }
    public static void equation(int x1,int y1,int x2,int y2){
        double slop=(y2-y1)/(x2-x1);
        double intercept = y1-slop*x1;
        System.out.printf("Equation is : Y="+slop+"X + "+intercept);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter point A");
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        System.err.println("enter point B");
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();
        System.err.println("ecudelien distance is:"+Distance(x1, y1, x2, y2));
        equation(x1, y1, x2, y2);

    }
}
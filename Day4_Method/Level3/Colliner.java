import java.util.*;
public class Colliner {
    public static boolean coolinear(int x1,int y1,int x2,int y2,int x3,int y3){
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }
    public static boolean trianglecoolinnear(int x1,int y1,int x2,int y2,int x3,int y3){
        int area= x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area==0;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter point a");
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        System.err.println("enter point B");
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();
        System.err.println("enter point C");
        int x3=scanner.nextInt();
        int y3=scanner.nextInt();
        System.err.println("A B C are coolinerar:"+coolinear(x1, y1, x2, y2, x3, y3));
        System.err.println("using area of triangle method A B C IS:"+trianglecoolinnear(x1, y1, x2, y2, x3, y3));
    }
}
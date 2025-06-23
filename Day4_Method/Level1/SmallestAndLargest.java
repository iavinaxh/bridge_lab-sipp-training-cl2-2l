import java.util.*;
public class SmallestAndLargest {
    int large(int a,int b,int c){
        if(a>b && a>c)
        return a;
        else if(b>a && b>c)
        return b;
        else
        return c;
    }
     int small(int a,int b,int c){
        if(a<b && a<c)
        return a;
        else if(b<a && b<c)
        return b;
        else
        return c;
    }
    

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter num");
        int num1=scanner.nextInt();
         System.err.println("enter num");
        int num2=scanner.nextInt();
         System.err.println("enter num");
        int num3=scanner.nextInt();
        SmallestAndLargest obj=new SmallestAndLargest();
        System.out.println("Largest num "+obj.large(num1, num2, num3));
        System.err.println("Smallest num"+obj.small(num1, num2, num3));

    }
}
import java.util.*;



public class QuadraticRoots {
    public static double [] roots(int num1,int num2,int num3){
    double delta=Math.pow(num2, 2)+4*num1*num3;
    if(delta>0){
       double root1  = (-num2 + Math.sqrt(delta))/(2*num1) ;
       double root2=(-num2 - Math.sqrt(delta))/(2*num1);
       return new double[]{root1,root2};

    }
    else
    return new double[]{};
}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter a b and c");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        double [] roots =roots(a, b, c);
        double roots1=roots[0];
        double root2=roots[1];
        System.err.println("root 1 :"+roots1);
        System.err.println("root 2 :"+root2);


    }

    
}
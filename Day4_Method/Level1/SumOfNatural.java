import java.util.*;
public class SumOfNatural {
    public static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;

        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter num:");
        int num=scanner.nextInt();
        int sum=SumOfNatural.sum(num);
        System.err.println("sum of num:"+sum);
    }
}
import java.util.*;

public class SumOfNaturalRecursive {
    public static int sum(int n){
        if(n==1)
        return 1;
        else
        return (n) +sum(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter num");
        int num=scanner.nextInt();
        if(num>0){
            int sum =SumOfNaturalRecursive.sum(num);
            System.err.println("the sum using recursion:"+sum);

        }
        else
        System.err.println("not a natural num");


    }

    
}
import java.util.*;
public class QuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number%divisor;
        int quotient = number/divisor;
        return new int[]{remainder,quotient};
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter num");
        int num=scanner.nextInt();
        System.err.println("enter divisor");
        int div=scanner.nextInt();
        int result []=QuotientAndRemainder.findRemainderAndQuotient(num, div);
        System.err.println("remainder:"+result[0]);
        System.err.println("quotient:"+result[1]);
    }
}
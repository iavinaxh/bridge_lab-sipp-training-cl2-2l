import java.util.*;
public class DivideChoclate {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int noOfchoclateget =number/divisor;
        int choclaeteleft =number%divisor;
        return new int[]{noOfchoclateget,choclaeteleft};
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter choclaete");
        int choclaete = scanner.nextInt();
        System.err.println("enter num of child");
        int child =scanner.nextInt();
        int []result=DivideChoclate.findRemainderAndQuotient(choclaete, child);
        System.out.println("choclate divide per child:"+result[0]);
        System.err.println("remaining choclate"+result[1]);
        

    }
}
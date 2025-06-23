import java.util.*;
public class MaxNumOfHandShake {
    public static int maxnumofshake(int n){
        int maxnumofshak=n*(n-1)/2;
        return(maxnumofshak);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter no of student");
        int noOfstudent=scanner.nextInt();
        int handshake = MaxNumOfHandShake.maxnumofshake(noOfstudent);
        System.out.println("the maximum no of hand shakes"+handshake);
        
    }

    
    
}
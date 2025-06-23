import java.util.*;
public class Otp {
    public static int otp(){
        int otp=(int)(Math.random()*900000)+100000;
        return otp;

    }
    public static boolean otpunique(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;i++){
                if(arr[i]==arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int []otp =new int[10];
        for(int i=0;i<=otp.length-1;i++){
            otp[i]=otp();

        }
        System.out.println("have 0 duplicate"+otpunique(otp));
        
    }
}
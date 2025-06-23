import java.util.*;
public class Football {
    public static void arrprint (int arr[]){
        System.err.println("the array is");
        for(int i=0;i<=arr.length-1;i++){
            System.err.println(arr[i]);

        }
    }
    public static int[] threedigitrandom(){
       
        int []arry=new int[11];
        for(int i=0;i<=arry.length-1;i++){
             int random =(int)(Math.random()*101)+150;
            arry[i]=random;
        }
        return arry;
    
    }
    public static int sum(int []arr){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        
        }
        return sum;

    }
    public static double mean(int sum){
        double mean=sum/11.0;
        return mean;
    }
    public static int tallest(int []arr){
         
        
        
        int maxvalue =arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>maxvalue)
            maxvalue=arr[i];
        }
        return maxvalue;
    }
    public static double shortest(int []arr){
        int minvalue =arr[0];
        
        
        for(int i=0;i<=arr.length-1;i++){
           
            if(arr[i]<minvalue)
            minvalue = arr[i];
           
        }
        return minvalue;
    }

    public static void main(String[] args) {
        int []arr=threedigitrandom();
        arrprint(arr);
        
        int sum=sum(arr);
        System.err.println(sum);
        double mean=mean(sum);
        System.err.println(mean);
        double tallest=tallest(arr);
        System.err.println("tallest:"+tallest);
        double shart =shortest(arr);
        System.err.println("short:"+shart);



    }
}
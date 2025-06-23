import java.util.*;
public class PositiveNegativr {
   
public static void positivenegative(int num){
    if(num>0)
    System.err.println("positive");
    
    else if(num==0)
    System.err.println("0");
    
    else
    System.err.println("negative");


}
public static boolean even(int num){
    
        return num%2==0;
    
}
public static void compare(int a,int b){
    if(a>b){
        System.err.println("arr[0] is greater");
    }
    else if(a==b){
        System.err.println("arr[0]==arr[4]");
    }
    else 
    System.err.println("a[0]<a[4]");

}
   
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.err.println("enter 5 arr value");
         int[] arr=new int[5];
         for(int i=0;i<=5-1;i++){
            arr[i]=scanner.nextInt();
            positivenegative(arr[i]);
            if(even(arr[i])){
                System.out.println("is even");
            }
            else
            System.err.println("is odd");

         }
         PositiveNegativr.compare(arr[0], arr[4]);
        
        
    }

    
}
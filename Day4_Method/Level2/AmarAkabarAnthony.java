import java.util.*;

public class AmarAkabarAnthony {
    public static int youngest(int []arr){
        int minage=arr[0];
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<minage){
                minage=arr[i];
                index = i;
            }
            
        }
        return index;
    }
    public static int tallest(int []arr){
        int tallest=arr[0];
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>tallest){
                tallest=arr[i];
                index=i;
            }
        }
        return index;
    }
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        System.err.println("enter age of 3 friend");
        int []age=new int[3];
        System.err.println("enter height of 3 friend");
        int [] height=new int[3];
        System.err.println();
        for(int i=0;i<=2;i++){
            System.err.println("enter age of friend"+(i+1));
            age[i]=scanner.nextInt();
            System.err.println("enter height of friend"+(i+1));
            height[i]=scanner.nextInt();

        }
         int youngest =youngest(age);
            int tallest =tallest(height);
            System.err.println("the youngest friend is"+age[youngest]+friends[youngest]);
            System.err.println("tallest freind is"+friends[tallest]+height[tallest]);

     }

    
}
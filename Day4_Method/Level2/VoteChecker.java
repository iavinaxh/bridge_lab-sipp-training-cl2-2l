import java.util.*;

public class VoteChecker {
     public boolean canStudentVote(int age) {
         if (age < 0) {
            
            return false;
        } else if (age >= 18) {
            
            return true;
        } else {
           
            return false;
        }
        
        
     }
     
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []totalpeople=new int[10];
        System.err.println("enter people age");
        VoteChecker obj=new VoteChecker();
        for(int i=0;i<=totalpeople.length-1;i++){
            totalpeople[i]=scanner.nextInt();
            boolean canvote=obj.canStudentVote(totalpeople[i]);
            if (canvote){
                 System.out.println((i + 1) + " can vote.");
                
            }
             else{
                 System.err.println(i+"cannot vote");
                }

        }
    
     }


    
}
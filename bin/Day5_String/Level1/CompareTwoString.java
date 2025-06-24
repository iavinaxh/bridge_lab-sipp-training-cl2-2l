import java.util.*;

public class CompareTwoString {
    public static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()){
        return false;
    }
         for(int i=0;i<=s1.length()-1;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
            return false;
            
        }   
    }
    return true;
    }
   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter string 1");
        String s1=scanner.nextLine();
        System.err.println("enter string2 ");
        String s2=scanner.nextLine();
        boolean iseq=compare(s1, s2);
        System.err.println("the string 1 and string 2 is equal"+iseq);
        boolean builtin=s1.equals(s2);
        System.err.println("the string is eq "+builtin);

    }

    
}
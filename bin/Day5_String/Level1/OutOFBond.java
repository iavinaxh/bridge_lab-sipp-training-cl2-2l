import java.util.*;
public class OutOFBond {
   public static void exception(String s) {
        char ch = s.charAt(s.length()); 
        System.err.println("Character: " + ch);
    }

    public static void ExceptionHandel(String s){
        try{
            char ch=s.charAt(s.length());
            System.err.println(ch);
        }
        catch(StringIndexOutOfBoundsException e){
            System.err.println("exception of out of bond");
            System.err.println("error:"+e.getMessage());

        }


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter the string");
        String s1=scanner.nextLine();
        //exception(s1);
        ExceptionHandel(s1);

    }

    
}
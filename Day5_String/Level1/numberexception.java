import java.util.*;


public class numberexception {
    public static void exp(String s){
        int n=Integer.parseInt(s);
        System.err.println("number"+n);
    }
    public static void handling(String s){
        try{
              int n=Integer.parseInt(s);
        System.err.println("number"+n);
        }
        catch(NumberFormatException e){
            System.err.println("error"+e.getMessage());

        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter string");
        String s=scanner.nextLine();
        //exp()
        handling(s);

    }

    
}
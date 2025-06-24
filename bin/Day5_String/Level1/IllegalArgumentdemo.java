import java.util.Scanner;


public class IllegalArgumentdemo {
    public static void excep(String s){
    String s2=s.substring(5, 2);
    System.out.println("substirng sis:"+s2);
}
public static void handling(String s){
    try{
       String s2=s.substring(5, 2);
        System.err.println(s2);
    }
    catch(IllegalArgumentException e){
        System.err.println("exception of illegal Argument");
        System.err.println("error"+e.getMessage());
    }

}

    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.err.println("enter the string");
        String s1=scanner.nextLine();
        //excep(s1);
        handling(s1);
    }

    
}
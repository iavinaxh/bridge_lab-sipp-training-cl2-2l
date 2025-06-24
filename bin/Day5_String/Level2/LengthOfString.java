import java.util.*;
public class LengthOfString {
    public static int length(String s){
        int count=0;
            try {
                while(true){
                    s.charAt(count);
                    count++;
                }
                
            } catch (StringIndexOutOfBoundsException e) {

            }
            return count;

        }
    

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter string:");
        String s1=scanner.nextLine();
        int length=length(s1);
        System.err.println("lenght of string:"+length);
        int lenght1=s1.length();
        System.err.println("length with inbuild fun:"+lenght1);

    }
}
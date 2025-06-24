import java.util.*;


public class SubString {
    public static String SubString(String text,int start,int end){
        String result="";
        for(int i=start;i<=end-1;i++){
            result=result+text.charAt(i);
        }
        return result;
    }
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.err.println("enter string");
    String text=scanner.nextLine();
    System.err.println("enter start index");
    int start=scanner.nextInt();
    System.err.println("enter last index");
    int end=scanner.nextInt();
    String manualstring=SubString(text, start, end);
    System.err.println(manualstring);
    String buildin=text.substring(start,end);
    System.err.println(buildin);
}
    
}
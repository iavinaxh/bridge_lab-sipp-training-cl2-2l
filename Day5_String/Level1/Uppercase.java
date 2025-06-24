import java.lang.reflect.Array;
import java.util.*;
public class Uppercase {
    public static String convert(String s){
        char []arr=s.toCharArray();
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>=97 && arr[i]<=122)
            arr[i]=(char)(arr[i]-32);
            
        }
        
        return new String(arr);
        

    }
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
        System.err.println("enter string");
        String s1=scanner.nextLine();
        System.out.println(convert(s1));
        String s2=s1.toUpperCase();
        String s3=convert(s1);
        boolean compare=compare(s3, s2);
        System.err.println("this string is equal"+compare);

    }

    
}
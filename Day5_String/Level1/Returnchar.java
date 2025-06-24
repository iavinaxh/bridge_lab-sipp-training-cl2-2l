import java.util.*;

public class Returnchar {
    public static char[] stringtochar(String text){
        char[]arr=new char[text.length()];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=text.charAt(i);
        }
        return arr;
    }
    public static boolean compare(char [] a,char[] b){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<=a.length-1;i++){
            if (a[i]!=b[i]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter String");
        String s1=scanner.nextLine();
        char []arr=stringtochar(s1);
        char[] buildin=s1.toCharArray();
        boolean compare=compare(arr, buildin);
        System.out.println("Characters using custom method:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Characters using built-in method:");
        System.out.println(Arrays.toString(buildin));

        System.out.println("Are both char arrays equal? " + compare);

        

    }

    
}
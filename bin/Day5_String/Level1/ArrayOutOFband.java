import java.util.*;
public class ArrayOutOFband {
    public static void exp(String []name){
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<=name.length;i++){
            name[i]=scanner.nextLine();
        }
    }
   public static void handling(String[]name){
    try{
        for(int i=0;i<=name.length;i++){
            Scanner scanner=new Scanner(System.in);
            name[i]=scanner.nextLine();
    }
}
    catch(ArrayIndexOutOfBoundsException e){
        System.err.println("error"+e.getMessage());
    }
   
}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter size of array");
        int size=scanner.nextInt();
        String []name=new String[size];
        
        //exp();
        handling(name);
        
        
    }

    
}
import java.util.*;

public class NullPointerExceptio {
    public static void Exception(){
        String text=null;
        System.err.println("lenght"+text.length());

    }
    public static void handleexception(){
        String text=null;
        try{
            System.err.println("text lenght"+text.length());
        }
        catch(NullPointerException e){
             System.err.println("NullPointerException");
            System.err.println("Exception:" + e.getMessage());
        }
    }
    public static void main(String[] args) {
       // Exception();
        handleexception();
        

        

        
    }


    
}
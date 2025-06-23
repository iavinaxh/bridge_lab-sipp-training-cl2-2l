public class Static {
    static int b = 20;
    int a = 10;
    public static void main(String[] args) {
         Static obj = new Static();
         a = obj.a; 
       System.out.println(a);
       System.out.println(b); 
        
        
    }
    
}
import java.util.*;


public class LeapYear {
    public static boolean year(int year){
        if(year>1582){
            if((year%4==0 && year%100 !=0)||year %400==0 )
            return true;
            else
            return false;
        }
        else
        return false;
           
        
     }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter year");
        int year = scanner.nextInt();
        boolean leapyaer=LeapYear.year(year);
        System.err.println(year+"is leap year"+leapyaer);
    }

    
}
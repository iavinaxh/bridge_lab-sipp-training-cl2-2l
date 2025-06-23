import java.util.*;
public class Spring {
    public boolean springmonth(int day,int month){
        if(month ==3 && day>20 )
        return (true);
        else if(month>3 && month<6)
        return(true);
        else if(month == 6 && day <=20)
        return(true);
        else
        return(false);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int day=scanner.nextInt();
        int month =scanner.nextInt();
        Spring obj=new Spring();
        
        System.err.println("is spring season:"+obj.springmonth(day, month));
    }
}
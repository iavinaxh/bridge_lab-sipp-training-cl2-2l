import java.util.*;

public class FourRandomValue {
    public static int fourdigitrandomno(){
        int random=(int)(Math.random()*9000)+1000;
        return random;

    }
    public static int[] generate4DigitRandomArray(int size){
        int arr[]=new int[size];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=fourdigitrandomno();
        }
        return arr;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        int sum=0;
        int minvalue =numbers[0];
        
        int maxvalue =numbers[0];
        for(int i=0;i<=numbers.length-1;i++){
            sum=numbers[i]+sum;
            if(numbers[i]<minvalue)
            minvalue = numbers[i];
            if(numbers[i]>maxvalue)
            maxvalue=numbers[i];
        }
     double avg=sum/numbers.length;
     


        return new double[]{avg,minvalue,maxvalue};
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter array size");
        int size=scanner.nextInt();
        int []arr=generate4DigitRandomArray(size);
        for(int i=0;i<=arr.length-1;i++){
            System.err.println(arr[i]);


        }
        double []avgminmax=findAverageMinMax(arr);
        System.out.println("Average is"+avgminmax[0]);
        System.err.println("min is"+avgminmax[1]);
        System.err.println("max is"+avgminmax[2]);

        

    }

    
}
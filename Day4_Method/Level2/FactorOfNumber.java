import java.util.*;
public class FactorOfNumber {
public static int[]factor(int num){
    int count=0;

    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
     int[] factors = new int[count];
     int index =0;
     for(int i=1;i<=num;i++){
         if (num % i == 0) {
                factors[index] = i;
                index++;
            }
     }
     return factors;

}
public static double sumOfArray(int[]arr){
    int sum=0;
    for(int i=0;i<=arr.length-1;i++){
        sum=sum+arr[i];
    }
    return sum;
}
public static double product(int []arr){
    double product=1;
    for(int i=0;i<=arr.length-1;i++){
        product =product*arr[i];
    }
    return product;
}
public static double sumOfsq(int []arr){
    double sumqt=0;
    for(int i=0;i<=arr.length-1;i++){
        sumqt= sumqt+Math.pow(arr[i], 2);
    }
    return sumqt;
}


public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.err.println("enter the num");
    int number =scanner.nextInt();
    int[]factor=FactorOfNumber.factor(number);
    System.err.println("factor of"+number+"are:");
    for(int i=0;i<=factor.length-1;i++){
        System.err.println("factor"+factor[i]);
    }
    double sum=FactorOfNumber.sumOfArray(factor);
    System.err.println("sum Of factor"+sum);
    double product =FactorOfNumber.product(factor);
    System.err.println("product of factor"+product);
    double sumofsqrt=FactorOfNumber.sumOfsq(factor);
    System.err.println("sum of square:"+sumofsqrt);

    


}
    
}
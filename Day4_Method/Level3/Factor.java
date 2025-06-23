import java.util.*;
public class Factor {
    public static int[] factorial(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count=count+1;
            }
        }
        int index=0;
        int []factors=new int[count];
        for(int i=1;i<=num-1;i++){
            if(num%i==0){
                factors[index]=i;
                index=index+1;
            }
        }
        return factors;

    }
    public static int greatestfactor(int arr[]){
        int greaatest=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>greaatest){
                greaatest=arr[i];
            }
        }
        return greaatest;
    }
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int product(int arr[]){
        int product=1;
         for(int i=0;i<=arr.length-2;i++){
            product=product*arr[i];
        }
        return product;

    }
    public static double productofcube(int arr[]){
        double productcube=1;
        for(int i=0;i<=arr.length-2;i++){
            productcube= productcube*Math.pow(arr[i], 3);
        }
        return productcube;
    }
    public static void printarr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.err.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.err.println("enter num");
        int num=scanner.nextInt();
        int []factors=factorial(num);
        printarr(factors);
        System.err.println("greatest fector"+greatestfactor(factors));
        System.err.println("sum of factor"+sum(factors));
        System.err.println("product"+product(factors));
        System.err.println("productcube Factor"+productofcube(factors));



    }
}
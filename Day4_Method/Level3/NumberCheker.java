import java.util.*;

public class NumberCheker {

    public static int count(int num) {
        int numm = num;
        int count = 0;
        while (numm != 0) {
            numm = numm / 10;
            count = count + 1;
        }
        return count;
    }

    public static int[] arr(int num, int[] arr) {
        int numm = num;
        int count = 0;
        while (numm != 0) {
            int digit = numm % 10;
            arr[count] = digit;
            numm = numm / 10;
            count++;
        }
        return arr;
    }

    public static boolean DuckNumber(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean Armstrong(int[] arr, int num) {
        int sum = 0;
        int power = arr.length;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += Math.pow(arr[i], power);
        }
        return sum == num;
    }

    public static void TwoLargest(int[] arr) {
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }

    public static void TwoSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second smallest digit: " + secondSmallest);
    }

    public static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        System.err.println(sum);
        return sum;
    }

    public static int sumsq(int arr[]) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += Math.pow(arr[i], 2);
        }
        return sum;
    }

    public static void harshad(int num, int arr[]) {
        if (num == sum(arr))
            System.err.println("it is harshad num");
        else
            System.out.println("not harshad number");
    }

    public static int[] arrreverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; // ✅ Fix: use temp here
            start++;
            end--;
        }
        return arr;
    }

    public static boolean compare(int a[], int b[]) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true; 
    }
    public static boolean Palindrome(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
        if (arr[start] != arr[end]) {
            return false;
        }
        start++;
        end--;
    }

    return true;
}
public static boolean Prime(int num) {
    if (num <= 1) {
        return false;
    }

    for (int i = 2; i <= num-1; i++) {
        if (num % i == 0) {
            return false;
        }
    }

    return true;
}
public static boolean neon(int num){
    int original=num;
    int sum=0;
    while(original!=0){
        int digit=original%10;
        sum=sum+ (digit*digit);
        original=original/10;


    }
    return sum==num;

}
public static boolean spynum(int num){
    int original=num;
    int sum=0;
    int product=1;
    while(original!=0){
        int digit=original%10;
        sum=sum+digit;
        product=product*digit;
        original=original/10;
    }
    return sum==product;
    
}
public static boolean automorphic(int num){
    int square=num*num;
    int digit=0;
    int original=num;
    while(original!=0){
        original=original/10;
        digit=digit+1;
    }
    int div=(int)Math.pow(10,digit);
    return(square%div==num);

}
public static boolean buzz(int num){
      return (num % 7 == 0 || num % 10 == 7);

}
public static boolean perfect(int num){
    int sum=0;
    for(int i=1;i<=num/2;i++){
        if(num%i==0){
            sum=sum+i;
        }
    }
    return num==sum;

    
}
public static boolean aubandon(int num){
    int sum=0;
    for(int i=1;i<=num/2;i++){
        if(num%i==0){
            sum=sum+i;
        }
    }
    return sum>num;
}
public static boolean deficiet(int num){
     int sum=0;
    for(int i=1;i<=num/2;i++){
        if(num%i==0){
            sum=sum+i;
        }
    }
    return sum<num;

}
public static int factorial(int num){
    int fac=1;
    for(int i=1;i<=num;i++){
        fac=fac*i;
    }
    return fac;
}
public static boolean strong(int num){
    int sum=0;
    int original=num;
    while (original!=0) {
        int digit=original%10;
        sum=sum+factorial(digit);
        original=original/10;
        
    }
    return sum == num;
}



    public static void arrprint(int arr[]) {
        System.err.println("the array is");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.err.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("enter the num");
        int num = scanner.nextInt();
        int count = count(num);
        System.err.println("count of num is" + count);

        int[] array = new int[count];
        int[] digit = arr(num, array);
        arrprint(digit);

        boolean ducknumber = DuckNumber(digit);
        System.err.println("is duck " + ducknumber);

        boolean Armstrong = Armstrong(digit, num);
        System.err.println("Is armstrong: " + Armstrong);

        TwoLargest(digit);
        TwoSmallest(digit);
        sum(digit);

        int sqsum = sumsq(digit);
        System.err.println(sqsum);

        harshad(num, digit);

        System.err.println("arr reverse:");
        int[] arrreverse = arrreverse(digit);
        arrprint(arrreverse);
        boolean Palindrome=Palindrome(arrreverse);
        System.err.println("is palindrome"+Palindrome);
        boolean prime=Prime(num);
        System.out.println("is prime"+prime);
        boolean neon=neon(num);
        System.err.println("is neom"+neon);
        System.err.println("is spy"+spynum(num));
        System.out.println("is automorphic"+automorphic(num));
        System.err.println("is buzz"+buzz(num));
        System.err.println("perfect no:"+perfect(num));
        System.err.println("aubudant no:"+aubandon(num));
        System.err.println("deficiet no:"+deficiet(num));
        System.err.println("strong no:"+strong(num));

    }
}

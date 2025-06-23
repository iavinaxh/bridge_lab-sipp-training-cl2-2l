import java.util.*;
public class Trigometricfunction {
    public double[] calculateTrigonometricFunctions(double angle){
        double radian = Math.toRadians(angle);
        double sin=Math.sin(radian);
        double cos=Math.cos(radian);
        double tan=Math.tan(radian);
        return new double[]{sin,cos,tan};

    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("write angle in degree");
        double degree=scanner.nextDouble();
        Trigometricfunction obj=new Trigometricfunction();
        double []arr=obj.calculateTrigonometricFunctions(degree);
        System.err.println("print angle"+degree);
        System.err.println("sin"+arr[0]);
        System.err.println("cos"+arr[1]);
        System.err.println("tan"+arr[2]);
    }

}
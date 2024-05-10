package Method_Overloading_Static;

public class Calculator {
    public static void sum(int a, int b){
        System.out.println("The sum is : "+(a+b));
    }
    public static void sum(int a, double b){
        System.out.println("The sum is : "+(a+b));
    }
    public static void sum(double a, int b){
        System.out.println("The sum is : "+(a+b));
    }
    public static void sum(double a, double b){
        System.out.println("The sum is : "+(a+b));
    }
    public static void sum(int a, int b, int c){
        System.out.println("The sum is : "+(a+b+c));
    }
}

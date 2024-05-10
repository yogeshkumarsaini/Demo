package Method_Overloading_Nonstatic;

public class Area {
    public void area(int length, int width){
        System.out.println("The area of rectangle is : "+(length*width));
    }
    public void area(int side){
        System.out.println("The area of Square is : "+(side*side));
    }
    public void area(double base, double heigth){
        System.out.println("The area of triangle is : "+(0.5*base*heigth));
    }
    public void area(double radius){
        System.out.printf("The area of circle is : "+"%.2f",(radius*radius*Math.PI));
        System.out.println();
    }
    
}

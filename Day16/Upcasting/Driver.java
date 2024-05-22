package Day16.Upcasting;

public class Driver {
    public static void main(String[] args) {
        Object o=new ElectricCar();
		Vehicle v1=new ElectricCar();
		System.out.println(v1.a);
		System.out.println(v1.b);
		System.out.println("===================");
		Car c1=new ElectricCar();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println("=================");
		ElectricCar e1=new ElectricCar();
        System.out.println(e1.a);
        System.out.println(e1.e);
    }
}

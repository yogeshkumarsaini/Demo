package Day16.Downcasting;

public class Driver {
    public static void main(String[] args) {
        Object o1=new ElectricCar();
		Car c1=(Car)o1;
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println("====================");
		ElectricCar e1=(ElectricCar)o1;
        System.out.println(e1.c);
        System.out.println(e1.f);
    }
}

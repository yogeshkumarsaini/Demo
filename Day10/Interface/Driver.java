public class Driver {
    public static void main(String[] args) {
        Student st1=new Student(12,"Yogesh");
        Student st2=new Student(11,"Lucky");
        st1.display();
        System.out.println(st1.showRollNo());
        st2.display();
        System.out.println(st2.showRollNo());
        System.out.println(st1.compareTo(st2));
    }
}

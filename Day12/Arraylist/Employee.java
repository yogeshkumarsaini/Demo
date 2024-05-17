package Arraylist;

public class Employee {
    private int Id;
    private String Name;
    private String Position;

    public Employee() {

    }

    public Employee(int id, String name, String position) {
        Id = id;
        Name = name;
        Position = position;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Position='" + Position + '\'' +
                '}';
    }
}

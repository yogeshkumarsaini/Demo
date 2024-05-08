package Day6.Object_Collaboration;

public class Student {

	private String name;
	private int age;
	private School school;
	private Subject subject;
	
	public Student() {
		
	}
	
	public Student(String name, int age, School school, Subject subject) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + ", subject=" + subject + "]";
	}
	
}
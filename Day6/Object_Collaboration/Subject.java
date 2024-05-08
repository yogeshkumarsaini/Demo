package Day6.Object_Collaboration;

public class Subject {
    
    private String name;

	public Subject() {
		
	}
	public Subject(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + "]";
	}
	
}

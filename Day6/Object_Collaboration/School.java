package Day6.Object_Collaboration;

public class School {
    private String  name;
	private String address;
	
	public School() {
		
	}
	
	public School(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + "]";
	}
	
	
}

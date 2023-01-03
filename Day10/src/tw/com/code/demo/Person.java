package tw.com.code.demo;

public class Person {
	private int id;
	private String name;
	private String Address;
	private String email;
	
	
	//空參數建構值
	public Person() {
		
	}
	
	

	//送值(建構子)
	public Person(int id,String name,String address,String email)
	{
		
		this.id = id;
		this.name = name;
		this.Address = address;
		this.email = email;
	}
	
	//取值
	public int getId() {
		return id;
	}
	//送值方法
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

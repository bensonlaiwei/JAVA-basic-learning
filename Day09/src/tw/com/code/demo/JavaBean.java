
package tw.com.code.demo;

public class JavaBean {
	private int id;
	private String name;
	private String password;
	private String Address;
	private String email;
	//set and get 方法
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	@Override
	public String toString() {
		return "JavaBean [id=" + id + ", name=" + name + ", password=" + password + ", Address=" + Address + ", email="
				+ email + "]";
	}
	
	
	

	

}

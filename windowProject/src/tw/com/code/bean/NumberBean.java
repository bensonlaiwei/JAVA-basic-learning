package tw.com.code.bean;

public class NumberBean {

	private int pId;
	private String pName;
	private String pPassword;
	private String pAge;
	private String pEmail;
	private String pAddress;
	
	
	//預設建構子
	public NumberBean() {
		System.out.println("NumberBean=====================");
	}
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpPassword() {
		return pPassword;
	}
	public void setpPassword(String pPassword) {
		this.pPassword = pPassword;
	}
	public String getpAge() {
		return pAge;
	}
	public void setpAge(String pAge) {
		this.pAge = pAge;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	@Override
	public String toString() {
		return "Number [pId=" + pId + ", pName=" + pName + ", pPassword=" + pPassword + ", pAge=" + pAge + ", pEmail="
				+ pEmail + ", pAddress=" + pAddress + "]";
	}
	

	
}

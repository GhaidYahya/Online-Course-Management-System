package application;

public class Student {
	private int sid ;
	private String sname ;
	private String email;
	private String sphone;
	
	
	public Student(int sid, String sname, String email, String sphone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.email = email;
		this.sphone = sphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}


	
	
	

}

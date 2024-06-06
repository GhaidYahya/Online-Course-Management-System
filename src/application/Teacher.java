package application;

public class Teacher {
	private int tid;
	private String tname;
	private int tage;
	private String tphone;
	private String temail;
	private String major;
	private int exp;
	private double salary;
	public Teacher(int tid,  int tage,String tname, String temail, String tphone,double salary, int exp ,String major) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tage = tage;
		this.tphone = tphone;
		this.temail = temail;
		this.major = major;
		this.exp = exp;
		this.salary = salary;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}
	public String getTphone() {
		return tphone;
	}
	public void setTphone(String tphone) {
		this.tphone = tphone;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}

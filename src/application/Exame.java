package application;

import java.sql.Time;
import java.util.Date;

public class Exame {
	private int eid;
	private String ename;
	private String etime;
	private String edate;
	public Exame(int eid, String ename, String etime, String edate) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.etime = etime;
		this.edate = edate;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEtime() {
		return etime;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	
	
	

}

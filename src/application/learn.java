package application;

public class learn {
	private int sid ;
	private int cid ;
	private boolean pay ;
	public learn(int sid, int cid, boolean pay) {
		super();
		this.sid = sid;
		this.cid = cid;
		this.pay = pay;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public boolean isPay() {
		return pay;
	}
	public void setPay(boolean pay) {
		this.pay = pay;
	}
	
	

}

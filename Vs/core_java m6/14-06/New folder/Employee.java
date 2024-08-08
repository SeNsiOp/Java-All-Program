class Employee {
	int eId;
	String ename;
	long phno;
	String job;
	int dno;
	public Employee(int eId, String ename, long phno, String job, int dno) {
		this.eId = eId;
		this.ename = ename;
		this.phno = phno;
		this.job = job;
		this.dno = dno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public int geteId() {
		return eId;
	}
	public String getJob() {
		return job;
	}
	public int getDno() {
		return dno;
	}
	

}

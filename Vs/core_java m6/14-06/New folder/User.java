class User {
	int uid;
	String uname;
	long phno;
	int password;
	public User(int uid, String uname, long phno, int password) {
		this.uid = uid;
		this.uname = uname;
		this.phno = phno;
		this.password = password;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getUid() {
		return uid;
	}
	public String getUname() {
		return uname;
	}
	
}

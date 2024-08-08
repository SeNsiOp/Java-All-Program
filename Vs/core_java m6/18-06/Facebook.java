class Facebook{
	private String firstName;
	private String surName;
	private long phno;
	private String email;
	private int pwd;
	private String dob;
	private String gender;



	Facebook(String firstName, long phno, int pwd)
	{
		this.firstName=firstName;
		this.phno = phno;
		this.pwd = pwd;
	}
	Facebook(String firstName, String email, int pwd)
	{
		this.firstName=firstName;
		this.email = email;
		this.pwd = pwd;
	}
	Facebook(String firstName, String surName, long phno, int pwd)
	{
		this(firstName,phno,pwd);	
		this.surName = surName;
	}
	Facebook(String firstName, String surName, String email, int pwd)
	{
		this(firstName, email, pwd);	
		this.surName = surName;
	}
	
	Facebook(String firstName, String surName, long phno, int pwd, String dob, String gender)
	{			
		this(firstName, surName, phno, pwd);
		this.dob = dob;
		this.gender = gender;
	}

	Facebook(String firstName, String surName, String email, int pwd, String dob, String gender)
	{		
		this(firstName, surName, email, pwd);	
		this.dob = dob;
		this.gender = gender;
	}

//----------------firstName--------------------------------
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}		
	public String getFirstName()
	{
		return firstName;
	}
//--------------------surName------------------------
	public void setSurName(String surName)
	{
		this.surName=surName;
	}		
	public String getSurName()
	{
		return surName;
	}
//-------------------phno-----------------------------
	
	public void setPhno(long phno)
	{
		this.phno=phno;
	}		
	public long getPhno()
	{
		return phno;
	}
//---------------------email---------------------------------
	public void setEmail(String email)
	{
		this.email=email;
	}		
	public String getEmail()
	{
		return email;
	}
//-----------------pwd-------------------------------------
	public void setPwd(int pwd)
	{
		this.pwd=pwd;
	}		
	public int getPwd()
	{
		return pwd;
	}
//-----------------dob---------------------------------------
	
	public void setDob(String dob)
	{
		this.dob=dob;
	}		
	public String getDob()
	{
		return dob;
	}
//--------------------gender----------------------------------
	public void setGender(String gender)
	{
		this.gender=gender;
	}

	public String getGender()
	{
		return gender;
	}
}








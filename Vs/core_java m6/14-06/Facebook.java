class Facebook{
private String user_name;
private int user_id;
private int password;

Facebook(String user_name, int user_id, int password){
this.user_name=user_name;
this.user_id= user_id;
this.password = password;
}

public String getName()
{
return user_name;
}

public void setName(String user_name)
{
this.user_name=user_name;
}

public int getId()
{
return user_id;
}

public void setPassword(int password)
{
this.password=password;
}
}
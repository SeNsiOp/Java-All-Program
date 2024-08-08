class Student
{
int roll;
String name;
long phoneNumber;

public void setRoll(int a)
{
	roll = a;
}

public void getRoll()
{
	System.out.println(roll);
}

public void setName(String s)
{
	name= s;
}

public void getName()
{
	System.out.println(name);
}

public void setPhoneNumber(long l)
{
	phoneNumber = l;
}
	
public void getPhoneNumber()
{
	System.out.println(phoneNumber);
}

public void setAllDetails(int a, String s, long l)
{
	roll = a;
	name = s;
	phoneNumber = l;
}

public void getAllDetails()
{
	System.out.println(roll);
	System.out.println(name);
	System.out.println(phoneNumber);
}

public static void main(String [] args)
{
	Student s1= new Student();
	s1.getRoll();
	s1.getName();
	s1.getPhoneNumber();

	s1.setRoll(3);
	s1.setName("Saurabh");
	s1.setPhoneNumber(8278646431l);

	s1.getRoll();
	s1.getName();
	s1.getPhoneNumber();
	
	s1.setAllDetails(10,"Kapil",9837914425l);
	s1.getAllDetails();
}

}
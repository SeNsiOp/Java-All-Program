class FacebookAccess{
public static void main(String [] args){
Facebook f= new Facebook("Saurabh",8278646431l,1234);
System.out.println(f.getFirstName());
//f.setGender("Male");
System.out.println(f.getSurName());
System.out.println(f.getPhno());
System.out.println(f.getPwd());
System.out.println(f.getGender());
}
}





























/*	System.out.println("----------------------------------------------------------");
	System.out.println("        Enter Your Details to Create Your Account         ");	
	System.out.println("----------------------------------------------------------");

	System.out.println("Enter First Name ");
	String fName= sc.next();

	System.out.println("Enter Surname ");
	String sName= sc.next();

	System.out.println("Enter Phone Number ");
	long phNo= sc.nextLong();

	System.out.println("Enter Email ");
	String email= sc.next();	

	System.out.println("Enter Password ");
	int pwd= sc.nextInt();
	
	System.out.println("Enter DOB ");
	String dob= sc.next();	

	System.out.println("Enter Gender ");
	String gender= sc.next();
											
	Facebook f1= new Facebook(fName,sName,phNo, email, pwd, dob, gender);		

	System.out.println("----------------------------------------------------------");
	System.out.println("             Your Account has been Created                ");
	System.out.println("----------------------------------------------------------"); 
	
	System.out.println(f1.getFirstName());
	System.out.println(f1.getSurName());
	System.out.println(f1.getPhno());
	System.out.println(f1.getEmail());
	System.out.println(f1.getPwd());
	System.out.println(f1.getDob());
	System.out.println(f1.getGender());									*/
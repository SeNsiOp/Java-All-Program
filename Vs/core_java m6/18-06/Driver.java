import java.util.Scanner;
class Driver{
public static void main(String[] args)
{	
	Scanner sc = new Scanner(System.in);

	System.out.println("----------------------------------------------------------");
	System.out.println("                   Welcome To facebook                    ");	
	System.out.println("----------------------------------------------------------");
	


	System.out.println("----------------------------------------------------------");
	System.out.println("        Enter Your Details to Create Your Account         ");	
	System.out.println("----------------------------------------------------------");
	System.out.println("Enter First Name ");
	
	String fName= sc.next();

	System.out.println("Enter Surname ");
	String SName= sc.next();

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

	Facebook f1= new Facebook(fName,SName,phNo, email, pwd, dob, gender);

	System.out.println("----------------------------------------------------------");
	System.out.println("             Your Account has been Created                ");
	System.out.println("----------------------------------------------------------");
	
	System.out.println(f1.getFirstName());
	System.out.println(f1.getSurName());
	System.out.println(f1.getPhno());
	System.out.println(f1.getEmail());
	System.out.println(f1.getPwd());
	System.out.println(f1.getDob());
	System.out.println(f1.getGender());
	boolean flag=true;
	while(flag){
	System.out.println("----------------------------------------------------------");
	System.out.println("                     Enter Your Choices                   ");
	System.out.println("----------------------------------------------------------");

	System.out.println("Press 1. for Update the First Name");
	System.out.println("Press 2. for Fetch the First Name");
	System.out.println("Press 3. for Update the Surname");
	System.out.println("Press 4. for fetch the Surname");
	System.out.println("Press 5. for Update the Phone Number");
	System.out.println("Press 6. for Fetch the Phone Number");
	System.out.println("Press 7. for Update the Email");
	System.out.println("Press 8. for Fetch the Email");
	System.out.println("Press 9. for Update the Password");
	System.out.println("Press 10. for Fetch the Password");
	System.out.println("Press 11. for Update the DOB");
	System.out.println("Press 12. for Fetch the DOB");
	System.out.println("Press 13. for Update the Gender");
	System.out.println("Press 14. for Fetch the Gender");
	System.out.println("Press 15. for Exit");

	System.out.println("----------------------------------------------------------");
	System.out.print("Enter Your Choices => ");
	
	int choice=sc.nextInt();
	switch(choice)
	{
		case 1:	
			System.out.println("Enter New First Name");
			String newFName = sc.next();
			f1.setFirstName(newFName);
			System.out.println("First Name Updated");
			break;

		case 2:
			System.out.print("Your First Name is -->  ");
			System.out.println(f1.getFirstName());
			break;

		case 3:
			System.out.println("Enter New Surname");
			String newSName = sc.next();
			f1.setSurName(newSName);
			System.out.println("Surname Updated");
			break;

		case 4:
			System.out.print("Your Surname is -->  ");
			System.out.println(f1.getSurName());
			break;
			
		case 5:	
			System.out.println("Enter New Phone Number");
			long newPhno = sc.nextLong();
			f1.setPhno(newPhno);
			System.out.println("Phone Number Updated");
			break;

		case 6:
			System.out.print("Your Phone Number is -->  ");
			System.out.println(f1.getPhno());
			break;
		case 7:
			System.out.println("Enter New Email");
			String newEmail = sc.next();
			f1.setEmail(newEmail);
			System.out.println("Email Updated");
			break;
		case 8:
			System.out.print("Your Email is -->  ");
			System.out.println(f1.getEmail());		
			break;
		case 9:
			System.out.println("Enter New Password");
			int newPwd = sc.nextInt();
			f1.setPwd(newPwd);
			System.out.println("Password Updated");
			break;
		case 10:
			System.out.print("Your Password is -->  ");
			System.out.println(f1.getPwd());
			break;
		case 11:
			System.out.println("Enter New DOB");
			String newDob = sc.next();
			f1.setDob(newDob);
			System.out.println("DOB Updated");
			break;
		case 12:
			System.out.print("Your DOB is -->  ");
			System.out.println(f1.getDob());
			break;
		case 13:
			System.out.println("Enter New Gender");
			String newGender = sc.next();
			f1.setGender(newGender);
			System.out.println("Gender Updated");
			break;
		case 14:
			System.out.print("Your Gender is -->  ");
			System.out.println(f1.getGender());
			break;
		case 15:
			flag = false;
			break;
			
		default:
			System.out.println("Please Choose Valid Option!!");
			
	}
}
}	
}
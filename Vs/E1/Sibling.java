/*
	Desgin an app to read age of three siblings Ramu, Raghu and Raju and store them in a variable. The app when executed should display the age of the youngest sibling.	
*/
import java.util.Scanner;
class Sibling{
	public static void main(String[] args){
	int ramu,raghu, raju;
	Scanner sc= new Scanner(System.in);
	ramu=sc.nextInt();
	raghu=sc.nextInt();
	raju=sc.nextInt();
	
	if(ramu<raghu && ramu< raju)
	{
	System.out.println(ramu);	
	}
	else if(raghu<raju)
	{	
		System.out.println(raghu);

	}
	else{
		System.out.println(raju);	
	}


	}	



}
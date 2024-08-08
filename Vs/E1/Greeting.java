import java.util.Scanner;
class Greeting{
	public static void main(String [] args)
	{
		Scanner sc = new Sanner(System.in);

		int hour=s.nextInt();
		if(hour>=5 && hour <=11)
		{
			System.out.println("Good Morning");
}
	else if(hour>=12 && hour <=16)
	{
		System.out.println("Good Afternoon");
	}
		
	else if(hour>=17 && hour <=20)
	{
	System.out.println("Good Evening");
	}

	else if(hour >=21 && hour <24 || hour>= 0 && hour<=4)
{
	System.out.prinln("Good Night");

}
else{
System.out.println("Invalid Hour");
}
}
}
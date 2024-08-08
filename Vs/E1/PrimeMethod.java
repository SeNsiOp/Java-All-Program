import java.util.Scanner;
class PrimeMethod{
public static boolean prime(int n){
int count = 2;
for(int i=2;i<=n/2;i++){
if(n%i==0)
count++;
}
if(count==2)
return true;

else
return false;
}

public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
boolean res = prime(num);
if(res)
System.out.println("Prime No."); 

else 
System.out.println("Not Prime No.");
}
}
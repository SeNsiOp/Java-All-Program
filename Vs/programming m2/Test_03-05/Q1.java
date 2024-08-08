import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A Number");
    int n = sc.nextInt();
    int n1=n;
    int n2=n;
    int count=0,sum=0;
    while (n!=0) {
        count++;
        n=n/10;
    }
    while (n1!=0) {
        int power = 1;
        int temp=n1%10;
        for(int i=0;i<count;i++){
            power=power*temp;

        }
        sum = sum+power;
        n1=n1/10;

    }
    if(n2==sum){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }

}
    
}
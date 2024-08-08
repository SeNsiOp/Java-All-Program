import java.util.Scanner;
class Main{
public static void main(String[] args){
int num1,num2,num3,num4;
Scanner sc = new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
num4=sc.nextInt();

int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        }
System.out.println(smallest);

}
}


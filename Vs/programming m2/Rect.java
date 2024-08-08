import java.util.Scanner;
public class Rect {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Vaalue of A");
    int a = sc.nextInt();
    System.out.println("Enter Vaalue of B");
    int b = sc.nextInt();
    if(a==b){
        System.out.println("Square");

    }
    else{
        System.out.println("Rectangle");
    }

   } 
}

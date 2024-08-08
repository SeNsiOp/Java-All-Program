import java.util.Scanner;
public class Upper {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter character");
        char ch = sc.next().charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println("Uppercase");

        }
        else if(ch>=90 && ch<=122){
            System.out.println("lowercase");
        }
        else{
            System.out.println("Number or Special Character");
        }
    }
}

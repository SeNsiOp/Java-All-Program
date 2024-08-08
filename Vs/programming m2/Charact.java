import java.util.Scanner;
class Charact{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character ");
        char ch= sc.next().charAt(0);
        if(ch>=97 && ch<=125 || ch>=65 && ch<=90){
            System.out.println("Alphabet");
        }
        else if(ch>=48 && ch<=57){
            System.out.println("Number");
        }
        else{
            System.out.println("Special Character");
        }    
}
}
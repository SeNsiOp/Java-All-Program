import java.util.Scanner;
class Age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Age ");
        int age1= sc.nextInt();
        System.out.println("Enter second Age ");
        int age2= sc.nextInt();
        System.out.println("Enter third Age ");
        int age3= sc.nextInt();
        if(age1>age2 && age1>age3){
            System.out.println(age1+" is Greater");
        }
        else if (age2>age1 && age2>age3) {
            System.out.println(age2+" is Greater");
        }
        else{
            System.out.println(age3+" is Greater"); 
        }
    }
}
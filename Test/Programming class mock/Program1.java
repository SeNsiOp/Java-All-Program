import java.util.Scanner;

/**
 * Program1 for Arm Strong Number
 * i/p  153
 * o/p  Yes
 * 
 * i/p  120
 * o/p  No
 */
public class Program1 {
    // For Count How many Digit in The Given Number;
    public static int count(int n){
        int c = 0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
    }
    
}
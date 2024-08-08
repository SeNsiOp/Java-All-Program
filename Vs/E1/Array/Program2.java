package Array;

import java.util.Scanner;

public class Program2 {
        //read size from the user
        // create int[] for user provided size
        // initialize data by reading it from the user
        // print all the data present in the array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // read size
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        // creating array object
        int [] a= new int[size];
        // read elements from user
        for(int index = 0 ; index < a.length ; index++){
            a[index] = sc.nextInt();
        }
        // print array element
        for(int index = 0; index < a.length ; index++){
            System.out.print(a[index]+ ", ");
        }
        


    }

}

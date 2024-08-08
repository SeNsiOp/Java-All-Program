public class CheckStartNum {
           public static void main(String[] args) {
            
            int n= 223;
            int rev=0;
            while(n!=0){
                int temp =n%10;
                rev=(rev*10)+temp;
                n=n/10;
            }
            int new1=rev%10;
            if(new1%2==0)
                System.out.println("Even");
            else
            System.out.println("Odd");
    
        }   
    }

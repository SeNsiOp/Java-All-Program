public class A2 {
    public static void main(String[] args) {
        
        int n= 123;
        int rev=0;
        // int a=1;
        while(n!=0){
            int temp =n%10;
            rev=(rev*10)+temp;
            n=n/10;
        }
            System.out.println(rev);

    }   
}

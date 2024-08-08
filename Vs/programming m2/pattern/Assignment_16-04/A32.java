public class A32 {
    public static void main(String[] args) {
        
        int n= 121;
        int n1=n;
        int rev=0;
        // int a=1;
        while(n!=0){
            int temp =n%10;
            rev=(rev*10)+temp;
            n=n/10;
        }
        if(n1==rev)
            System.out.println("Parindrome "+rev);
            else
            System.out.println("not parindrome");

    }   
}

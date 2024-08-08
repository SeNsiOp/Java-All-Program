public class Perfect {
    
        // public static int factorial(int n){
        //     int fact=1;
        //     for(int i = 1; i<=n; i++){
        //         fact=fact*i;
                
        //     }   return fact;
        // }
        public static void main(String[] args) {
            int n= 6;
            int n1=n;
            int sum=0;
            while(n!=0){
                int temp=n%10;
                sum = sum+temp;//factorial(temp);
                n=n/10;
            }
    
            if(n1==sum){
                System.out.println("Strong Number");
            }
            else{
                System.out.println("Not a Strong Number");
            }
    }
}

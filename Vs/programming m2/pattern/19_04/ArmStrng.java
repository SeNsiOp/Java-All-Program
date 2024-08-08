class ArmStrng{
   public static void main(String[] args) {
      int n= 153;
      int n1 = n;
      int n2 = n;
      int count = 0;
      int sum=0;
      while(n!=0){
        count++;
        n=n/10;
      }  
      while (n1!=0) {
        int power=1;
        int temp = n1%10;
        for(int i=1; i<=count; i++){
            power=power*temp;
        }  
        sum=sum+power;
        n1=n1/10;
    }
    if(sum==n2)
    System.out.println(sum+" is Arm Strong Number");
    else
    System.out.println("Not Arm Strong Numnber");
}
}
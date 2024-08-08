public class TechNumber {
public static int power(int base, int power){
    int result =1;
    for(int i=1;i<=power;i++){
        result =result*base;
    }
    return result;
}
    public static void main(String[] args) {
        
        int n=2025;
        int n1=n, n2=n;
        int count=0;
        // int power=1;
        while(n!=0){
            count++;
            n=n/10;
        } 
        int p=power(10,count/2);
        if (count%2==0) {
              int fp=0, lp=0, res=1;
            
              fp=n1/p;
              lp=n1%p;
              res=(fp+lp)*(fp+lp);
              if(n2==res)
              System.out.println("Tech Number");
            }
          else
          System.out.println("Not");
        }
}

public class dynamicpattern6 {
 public static void main(String[] args) {
    int n=5;
    char c='A';
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(c++ +" ");

        }
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
            c++;
        }
        System.out.println();
    }
 }   
}

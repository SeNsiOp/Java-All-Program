public class Rotate2 {
    public static void main(String[] args) {
        int a[]={10,0,8,2};
        int n= 2;
        for(int j=n;j>0;j--){
            int x=a[a.length-1];
            for(int i=a.length-1; i>0;i--){
                a[i]=a[i-1];
            }
            a[0]=x;
        }
        for(int i:a)
        System.out.print(i+" ");
    }
}

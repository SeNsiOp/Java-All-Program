public class Rotate {
    public static void main(String[] args) {
        int a[]={10,0,8,2};
        int n= 4;
        for(int j=0;j<n;j++){
            int x=a[0];
            for(int i=0; i<a.length-1;i++){
                a[i]=a[i+1];
            }
            a[a.length-1]=x;
        }
        for(int i:a)
        System.out.print(i+" ");
    }
}

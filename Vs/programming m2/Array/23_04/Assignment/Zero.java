public class Zero {
    public static void main(String[] args) {
        int a[] = {10,0,8,2,0,4,0,1};
        int b[] = new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0)
            b[k++]=a[i];
            
        }
        for(int i:b){
            System.out.print(i+" ");
        }

    }
}

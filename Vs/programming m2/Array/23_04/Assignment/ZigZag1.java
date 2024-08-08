public class ZigZag1 {
public static void main(String[] args) {
    int a[]= {10,20,30};
    int b[]= {40,50,60,70,80};
    int k=0;
    int c[]= new int[a.length+b.length];
    for(int i=0;i<c.length;i++){
        if(i<a.length)
        c[k++]=a[i];
        if(i<b.length)
        c[k++]=b[i];
    }
    for(int i=0;i<c.length;i++){
        System.out.print(c[i]+" ");
    }
}
    
}
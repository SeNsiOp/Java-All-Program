public class ZigZag {
    public static void main(String[] args) {
        int a[]={1,21,30};
        int b[]={40,5,60}; 
        int k=0;
        boolean flag=true;
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            if(flag==true){
            c[k++]=a[i];
            System.out.print(c[i]+" ");
            flag=false;
            }
            else{
                c[k++]=b[i];
                System.out.print(c[i]+" ");
                flag=true;
            }
           
         }
        for(int i=0;i<b.length;i++){
            if(flag==true){
            c[k++]=b[i];
            System.out.print(c[i]+" ");
            flag=false;
            }
            else{
                c[k++]=a[i];
                System.out.print(c[i]+" ");
                flag=true;
            }
           
         }
    }
}

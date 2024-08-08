public class ProArray {
        public static void main(String[] args) {
           int a[]={10,20,30,40};
           int product =1;
           for(int i=0;i<a.length;i++){
               product=product*a[i];
           }
           System.out.println("Array of product is "+product);
        }   
}

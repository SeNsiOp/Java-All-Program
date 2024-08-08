public class Odd1 {
    public static void main(String[] args) {
        int a[]={1,21,30,40,5,60}; 
        for(int i=0;i<a.length;i++){
            int temp =a[i];
            if(temp%2!=0)
                System.out.println(temp+" That is Odd Element");
         }
    }
}

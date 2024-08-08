public class Odd2 {
    public static void main(String[] args) {
        int a[]={1,21,30,40,5,60}; 
        int sum= 0;
        for(int i=0;i<a.length;i++){
            int temp =i;
            if(temp%2!=0){
                sum=temp+sum;
            }
        }
        System.out.println(sum+" That is Odd Element");

    }
}

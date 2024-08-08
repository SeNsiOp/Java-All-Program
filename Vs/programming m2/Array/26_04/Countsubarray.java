public class Countsubarray {
          public static void main(String[] args) {
            int a[]={1,2,3,4,5,6,7,8,9};
            int b=1;
            for(int i=0; i<a.length;i++){
                for(int j=i;j<a.length;j++){
                    System.out.print(b++ +" SubArray  ");
                    for (int k = i; k <=j; k++) {
                        System.out.print(a[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
            
    }

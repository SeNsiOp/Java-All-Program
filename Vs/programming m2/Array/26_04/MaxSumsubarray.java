public class MaxSumsubarray {
    
        public static void main(String[] args) {
            int a[]={1,2,3,4,5,6,7,8,9};
            // int b=1;
            int max=0;
            for(int i=0; i<a.length;i++){
                for(int j=i;j<a.length;j++){
                    // System.out.print(b+++ " ");
                    int sum= 0;
                    for (int k = i; k <=j; k++) {
                        // System.out.print(a[k]+" ");
                        sum = sum +a[k];
                    }
                        if(max<sum){
                            max=sum;
                        }
                        // else
                        // sum=max;
        
                            //    System.out.println();
                }
            }
              System.out.println("Max Sum  of Sub Array  "+max);
                
            }
        }

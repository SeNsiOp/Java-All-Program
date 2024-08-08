public class binarysearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int n =6;
        int start= 0;
        int end = a.length-1;
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
        while (start<=end) {
            int mid= (start+end)/2;
            if(a[mid]==n){
                System.out.print(n+" is present in given array in "+mid+" th position");
                break;
            }
            else if(a[mid]<n){
                start=a[mid]+1;

            }
            else if(a[mid]>n)
            end=a[mid]+1;

            else
            end = mid -1; 
            
    }

    }
}

class duplicate{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5,4, 5, 3};
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    break;
            }
            if(count>=2){
                System.out.println("Duplicate found at index " +arr[j]);
                break;
            }
        }
    }
}
}
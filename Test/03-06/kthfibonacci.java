class kthfibonacci {
    public static void main(String[] args) {
        int k = 5;
        int i=1;
        int n1=0;
        int n2=1;
        int n3=0;
        int x= 0;
        while(i<=k){
            // int x=0;
            x=n1;
            n3=n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }
        System.out.println(x);
    }
}
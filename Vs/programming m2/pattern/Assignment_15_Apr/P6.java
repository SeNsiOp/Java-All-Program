public class P6 {
    public static int power(int pow,int base){
        int res = 1;
        for(int i=1; i<=pow;i++){
            res *=base;

        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }
}

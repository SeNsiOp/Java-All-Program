public class prime {
    public static void main(String[] args) {
        int n = 11;
        int count = 0;
    if (n <= 1) {
      System.out.println("Not a Prime Number");
    }
    for (int j=1;j<=n/2;j++) {
      if (n % j == 0) {
        count++;
      }
    }

    if (count > 1) {
        System.out.println("Not a Prime Number");
    }
    else {
      System.out.println("Prime Number");
    }
}
}
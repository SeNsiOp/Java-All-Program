public class PrintDigits {
    public static void main(String[] args) {
        int num = 12345;
        printDigits(num);
    }

    public static void printDigits(int num) {
        if (num == 0) {
            return;
        }
        printDigits(num / 10);
        System.out.println(num % 10);
    }
}
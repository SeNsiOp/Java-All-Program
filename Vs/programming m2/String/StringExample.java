public class StringExample {
    public static void main(String[] args) {
        String s= new String("Saurabh");
        String s1= new String("Saurabh");

        System.out.println(s.equals(s1));
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf('r'));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        
        char[] c=s.toCharArray();
        for(char i:c)
        System.out.print(i+"    ");

    }
    
}
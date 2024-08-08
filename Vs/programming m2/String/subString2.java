public class subString2 {
    public static void main(String[] args) {
        String s= "qspider@gmail.com";
        // char c= 'q';

        int index=s.indexOf('q');
        int last = s.indexOf('r')+1;
        int domain = s.indexOf('@')+1;
        int domain2= s.indexOf('.');
        // System.out.println(s.substring(index, last));
        System.out.println(s.substring(domain,domain2));
    }
}

public class CountSpecialChar {
    public static void main(String[] args) {
        
        String s = "q@@#$%^123&";
        int sc = 0;
        int a = 0;
        int num = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='A' && c<= 'Z' || c>= 'a' && c<= 'z'){
                a++;

            }
            else if (c>='0' && c<='9'){
                num++;
            }
            else
            {
                sc++;
            }
        }
        System.out.println("Characters are: "+ a);
        System.out.println("Numbers are: "+ num);
        System.out.println("Special Characters are: "+ sc);
    }
}

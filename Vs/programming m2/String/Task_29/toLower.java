public class toLower {
        public static void main(String[] args) {
            String s= "HELLO";
            char ch[]=s.toCharArray();
            for(int i = 0; i<ch.length;i++){
                if(ch[i]>='A' && ch[i]<='Z'){
                    ch[i] = (char) (ch[i]+32);
                }
            }
            String s1 = new String(ch);
            System.out.println(s1);
        }
            
        }    

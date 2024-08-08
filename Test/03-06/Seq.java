public class Seq {

        public static void main(String[] args) {
            String s = "hello";
            char c1[]=s.toCharArray();
            char c2[]=s.toCharArray();
            int count = 0;
            for(int i = 0; i<c1.length;i++){
                char x = c1[i];
                for(int j= i; j<c2.length;j++){
                    if(x==c2[j]){
                        count++;  
                        c2[j] = '/';
                    }
                }if(count>0)
                System.out.println(x+ "-->"+count);
                count=0;
        }
    }
    }

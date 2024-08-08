public class Longestword {
        public static void main(String[] args) {
         String s= new String("My name is java");
         String temp ="";
         String longe="";
         for(int i=0;i<s.length();i++){
             temp = temp+s.charAt(i);
             if(s.charAt(i) == ' '){
                 if(temp!=(longe)){
                    longe = temp;

                }
                 temp ="";
             }
         }
         System.out.println(longe);
     }
}

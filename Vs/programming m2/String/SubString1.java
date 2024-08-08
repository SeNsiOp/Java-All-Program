public class SubString1 {
    public static void main(String[] args) {
        String s= "java is like a recipe it's easy to learn but it takes years to master";
        char c= 'a';
        String temp =" ";
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(c==s.charAt(i)){
                flag=true;
            }
            if(flag==true){
                temp=temp+s.charAt(i);
            }
        }
        System.out.println(temp);
        System.out.println(s.indexOf('l'));
        int index=s.indexOf('l');
        int last = s.indexOf('r');
        System.out.println(s.substring(index,last));
    }
}

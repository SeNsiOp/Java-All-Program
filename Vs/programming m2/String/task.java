public class task {
    public static void main(String[] args) {
        
        String s= "WooHoo";        
        int index= s.indexOf('W');       
        System.out.println(s.substring(index, s.length()/2));
        
        String s1= "HelloThere";
        int index1=s1.indexOf('H');    
        System.out.println(s1.substring(index1, s1.length()/2));
        
        String s2= "abcdef";
        int index2=s2.indexOf('a');        
        System.out.println(s2.substring(index2, s2.length()/2));

    }
}

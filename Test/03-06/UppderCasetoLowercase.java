public class UppderCasetoLowercase {
    public static void main(String[] args) {
        char a='a';
        if(a>=65 && a<=90){
            a+=32;
            System.out.println("character is converted into lowercase:  "+a);

        }
        else if(a>=90 && a<=122){
            a-=32;
            System.out.println("character is converted into Uppercase:  "+a);
        }
        else{
            System.out.println("Number or Special Character");
        }

}
}
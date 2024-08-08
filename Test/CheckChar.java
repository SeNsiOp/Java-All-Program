class CheckChar{
public static void main(String[] args){
char ch='a';
if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
System.out.println("Vowels");
}
else if(ch=='A' || ch=='E'||ch=='I'||ch=='O'||ch=='U'){
System.out.println("Vowels");
}
else if(ch>=48&&ch<=57){
System.out.println("Digits");
}
else {
System.out.println("Consonent Or Special Character");
}
}}
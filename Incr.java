class Incr{
public static void main(String[] args){
int a=10;
int b=20;
int c,d;
c= ++a+b+++a;
d = ++a+b+a++;
System.out.println(c);
System.out.println(d);
System.out.println(a);
System.out.println(b);
}}
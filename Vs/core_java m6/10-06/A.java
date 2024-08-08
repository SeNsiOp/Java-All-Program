class A {
static int a= 10;
int x = 25;
static int d= m1();
static int f = m1()+m2();
public static void main(String[] args){
int a =2;
A.a=5;
int b = 5;
}

static {
a= 25;
System.out.println(a);
}

public static int m1()
{
int c =a+20+d;
System.out.println(a);
System.out.println(c);
return c;
}
public static int m2()
{
int e=f+m1();
System.out.println(e);
return e;
}
}
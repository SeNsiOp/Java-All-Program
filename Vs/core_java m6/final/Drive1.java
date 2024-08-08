class Demo1{
public void test1(){
Demo2 d= new Demo2();
d.test2();
System.out.println("A");
}
}
class Demo2{
public void test2(){
Demo3 d =new Demo3();
d.test3();
System.out.println("B");
}
}
class Demo3{
public void test3(){
if(true)
{
Demo2 d = null;
d.test2();
}
}
}
class Drive1
{
public static void main(String [] args)
{
try{
Demo1 d= new Demo1();
d.test1();
}
catch(Exception ex)
{
System.out.println("error");
}
}
}
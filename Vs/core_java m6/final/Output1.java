class A{
int a=10;
public int hashCode(){
int hc=50;
return hc+a;
}
A(int a)
{
this.a=a;
}
A(){
}
}
class Output1{
public static void main(String [] args)
{
A b= new A();
A b1= new A(10);
System.out.println(b1.hashCode()==b.hashCode());
System.out.println(b.equals(b1));

}
}
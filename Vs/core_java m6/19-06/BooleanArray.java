class BooleanArray{
public static void main(String[] args){
boolean[] a;
a=new boolean[5];
System.out.println(a);
System.out.println("Default Value: "+a[0]);
System.out.println("Default Value: "+a[1]);
System.out.println("Default Value: "+a[2]);
System.out.println("Default Value: "+a[3]);
System.out.println("Default Value: "+a[4]);
System.out.println("-----------------------");
a[0]=false;
a[1]=true;
a[2]=false;
a[3]=true;
a[4]=false;
System.out.println("Updated Value: "+a[0]);
System.out.println("Updated Value: "+a[1]);
System.out.println("Updated Value: "+a[2]);
System.out.println("Updated Value: "+a[3]);
System.out.println("Updated Value: "+a[4]);
System.out.println("-----------------------");

boolean[] b={false, true, false, true, true};
System.out.println(b);
System.out.println(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
System.out.println(b[3]);
System.out.println(b[4]);
}

}
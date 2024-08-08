class FloatArray{
public static void main(String[] args){
float[] a;
a=new float[5];
System.out.println(a);
System.out.println("Default Value: "+a[0]);
System.out.println("Default Value: "+a[1]);
System.out.println("Default Value: "+a[2]);
System.out.println("Default Value: "+a[3]);
System.out.println("Default Value: "+a[4]);
System.out.println("-----------------------");
a[0]=2.3f;
a[1]=4.3f;
a[2]=5.7f;
a[3]=9.7f;
a[4]=5.1f;
System.out.println("Updated Value: "+a[0]);
System.out.println("Updated Value: "+a[1]);
System.out.println("Updated Value: "+a[2]);
System.out.println("Updated Value: "+a[3]);
System.out.println("Updated Value: "+a[4]);
System.out.println("-----------------------");

float[] b={1,2,8,6,5};
System.out.println(b);
System.out.println(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
System.out.println(b[3]);
System.out.println(b[4]);
}

}
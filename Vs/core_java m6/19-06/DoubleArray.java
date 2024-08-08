class DoubleArray{
public static void main(String[] args){
double[] a;
a=new double[5];
System.out.println(a);
System.out.println("Default Value: "+a[0]);
System.out.println("Default Value: "+a[1]);
System.out.println("Default Value: "+a[2]);
System.out.println("Default Value: "+a[3]);
System.out.println("Default Value: "+a[4]);
System.out.println("-----------------------");
a[0]=2.3;
a[1]=4.3;
a[2]=5.7;
a[3]=9.7;
a[4]=5.1;
System.out.println("Updated Value: "+a[0]);
System.out.println("Updated Value: "+a[1]);
System.out.println("Updated Value: "+a[2]);
System.out.println("Updated Value: "+a[3]);
System.out.println("Updated Value: "+a[4]);
System.out.println("-----------------------");

double[] b={1.4,2.6,8.3,6.2,5.5};
System.out.println(b);
System.out.println(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
System.out.println(b[3]);
System.out.println(b[4]);
}

}
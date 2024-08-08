class IntArray{
public static void main(String[] args){
int[] a;
a=new int[5];
System.out.println(a);
System.out.println("Default Value: "+a[0]);
System.out.println("Default Value: "+a[1]);
System.out.println("Default Value: "+a[2]);
System.out.println("Default Value: "+a[3]);
System.out.println("Default Value: "+a[4]);
System.out.println("-----------------------");
a[0]=1;
a[1]=2;
a[2]=3;
a[3]=4;
a[4]=5;
System.out.println("Updated Value: "+a[0]);
System.out.println("Updated Value: "+a[1]);
System.out.println("Updated Value: "+a[2]);
System.out.println("Updated Value: "+a[3]);
System.out.println("Updated Value: "+a[4]);
System.out.println("-----------------------");

int[] b={10,20,30,40,50};
System.out.println(b);
System.out.println(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
System.out.println(b[3]);
System.out.println(b[4]);
}

}
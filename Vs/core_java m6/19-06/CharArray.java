class CharArray{
public static void main(String[] args){
char[] a;
a=new char[5];
System.out.println(a+" ");
System.out.println("Default Value: "+a[0]);
System.out.println("Default Value: "+a[1]);
System.out.println("Default Value: "+a[2]);
System.out.println("Default Value: "+a[3]);
System.out.println("Default Value: "+a[4]);
System.out.println("-----------------------");
a[0]='S';
a[1]='H';
a[2]='Y';
a[3]='A';
a[4]='M';
System.out.println("Updated Value: "+a[0]);
System.out.println("Updated Value: "+a[1]);
System.out.println("Updated Value: "+a[2]);
System.out.println("Updated Value: "+a[3]);
System.out.println("Updated Value: "+a[4]);
System.out.println("-----------------------");

char[] b={'N', 'I', 'T', 'I', 'N'};
System.out.println(b+" ");
System.out.println(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
System.out.println(b[3]);
System.out.println(b[4]);
}

}
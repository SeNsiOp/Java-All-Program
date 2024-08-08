class Array7
{
public static void main(String[] args){
char[] a;
a=new char[5];
System.out.println(a);
int i=0;
while(i<a.length){
System.out.println(a[i]);
i++;
}
a[0]='a';
a[1]='b';
a[2]='c';
a[3]='d';
a[4]='e';
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
System.out.println();

char[] b={'t','y','u','i','o'};
for(char x:b){
System.out.println(x);
}

}
}
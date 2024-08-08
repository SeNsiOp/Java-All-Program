class Array2
{
public static void main(String[] args){
byte[] a;
a=new byte[5];
System.out.println(a);
int i=0;
while(i<a.length){
System.out.println(a[i]);
i++;
}
a[0]=55;
a[1]=116;
a[2]=76;
a[3]=89;
a[4]=109;
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
System.out.println();

byte[] b={101,26,35,48,57};
for(byte x:b){
System.out.println(x);
}
}
}
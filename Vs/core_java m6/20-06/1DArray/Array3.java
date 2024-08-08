class Array3
{
public static void main(String[] args){
short[] a;
a=new short[5];
System.out.println(a);
int i=0;
while(i<a.length){
System.out.println(a[i]);
i++;
}
a[0]=5545;
a[1]=6684;
a[2]=7452;
a[3]=8456;
a[4]=9789;
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
System.out.println();

short[] b={10,20,30,40,50};
for(short x:b){
System.out.println(x);
}
}
}
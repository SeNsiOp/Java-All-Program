class Array6
{
public static void main(String[] args){
double[] a;
a=new double[5];
System.out.println(a);
int i=0;
while(i<a.length){
System.out.println(a[i]);
i++;
}
a[0]=5.9765d;
a[1]=67.8689;
a[2]=798.789;
a[3]=8.98745;
a[4]=9.25441;
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
System.out.println();

double[] b={10.9887,20.6654411,30.36541,40.66998,50.65842};
for(double x:b){
System.out.println(x);
}
}
}
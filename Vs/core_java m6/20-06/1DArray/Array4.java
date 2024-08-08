class Array4
{
public static void main(String[] args){
long[] a;
a=new long[5];
System.out.println(a);
int i=0;
while(i<a.length){
System.out.println(a[i]);
i++;
}
a[0]=5987456123l;
a[1]=698744512l;
a[2]=758874;
a[3]=898745561225l;
a[4]=998744516l;
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
System.out.println();

long[] b={1648122360l,56677520l,308745566545l,40998745656l,506658874220l};
for(long x:b){
System.out.println(x);
}
}

}
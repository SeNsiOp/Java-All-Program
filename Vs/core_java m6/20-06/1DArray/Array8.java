class Array8
{
public static void main(String[] args){
boolean[] a;
a=new boolean[5];
System.out.println(a);
int i=0;
while(i<a.length){
System.out.println(a[i]);
i++;
}
a[0]=true;
a[1]=true;
a[2]=true;
a[3]=false;
a[4]=true;
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
System.out.println();

boolean[] b={true,false,true,true,false};
for(boolean x:b){
System.out.println(x);
}
}

}
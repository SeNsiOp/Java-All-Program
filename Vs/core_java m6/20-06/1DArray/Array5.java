class Array5
{
public static void main(String[] args){
float[] a;
a=new float[5];
System.out.println(a);
int i=0;
while(i<a.length){
System.out.println(a[i]);
i++;
}
a[0]=5.5f;
a[1]=6.9f;
a[2]=7.11f;
a[3]=8.3f;
a[4]=0.9f;
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
System.out.println();

float[] b={10.1f,20.2f,30.44f,40.45f,50.56f};
for(float x:b){
System.out.println(x);
}
}

}
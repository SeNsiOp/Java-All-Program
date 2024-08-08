class Array1{
public static void main(String[] args){
int[] a;
a=new int[5];
System.out.println(a);
int i=0;
while(i<a.length){
System.out.println(a[i]);
i++;
}

a[0]=5;
a[1]=6;
a[2]=7;
a[3]=8;
a[4]=9;
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
System.out.println();

int[] b={10,20,30,40,50};
for(int x:b){
System.out.println(x);
}

}

}
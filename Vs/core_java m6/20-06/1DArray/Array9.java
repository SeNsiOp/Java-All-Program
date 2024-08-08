class Array9
{
public static void main(String[] args){
String[] a;
a=new String[5];
System.out.println(a);
int i=0;
while(i<a.length){
System.out.println(a[i]);
i++;
}
a[0]="king";
a[1]="is";
a[2]="here";
a[3]="look";
a[4]="up";
for(int j=0;j<a.length;j++){
System.out.println(a[j]);
}
System.out.println();

String[] b={"Gopal","Nayan","Jha","Gaurav","Tewari"};
for(String x:b){
System.out.println(x);
}
}

}
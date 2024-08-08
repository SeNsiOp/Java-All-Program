class Digits{
public static int count(int num){
int count =0;
while(num!=0)
{
num/=10;
count++;
}
return count;
}

public static void main(String [] args)
{

int num =100;
int count=0;
//int len= count(num);

for(int i = num; i<=999;i++)
{
if(i%7==0)
{
System.out.println(i);
count++;
}
}
System.out.println(count);
}
}

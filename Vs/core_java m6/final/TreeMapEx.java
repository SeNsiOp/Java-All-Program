import java.util.*;

class C
{
String course; 
int count;

C(String course, int count)
{
this.course=course;
this.count=count;
}}
public class TreeMapEx{

public static void main(String[] args)
{
Map<Integer, C> courses = new TreeMap<Integer, C>(); courses.put(1,new C("Java Courses", 3));
courses.put(2,new C("AWS Courses", 7));
courses.put(3,new C("Programming Courses", 8));
courses.put(4,new C("Data Science Courses", 2)); 

System.out.println("Total courses:" + courses.size());

Collection <C> st=courses.values(); 
for(C me:st)
{
if(me.count==8)
System.out.println(me.course);

}
}
}
class Act6{
public static void main(String[] args){
int science = 78;
int socialScience = 89;
int math = 99;
int english = 88;
int hindi = 67;
int totalMarks = science + socialScience + math + english + hindi;
int totalSubjects = 5;
int maxMarksPerSubject = 100;
double percentage = ((double) totalMarks/(totalSubjects*maxMarksPerSubject))*100;
System.out.println("Total Marks = "+totalMarks);
System.out.println("Percentage = "+percentage+"%");
}
} 
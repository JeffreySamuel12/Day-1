import java.util.*;
class Student{
    String name;
    int studentId,age;
    double grade;
    public void set(int a,String b,int c,double d){
        this.studentId=a;
        this.name=b;
        this.age=c;
        this.grade=d;
    }
    public void get(){
        System.out.println("Details of Student:-");
        System.out.println("StudentId: "+this.studentId);
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Grade: "+this.grade);
    }
}
public class oops2
{
    public static void main(String[] args) {
		Student s1=new Student();
		s1.set(38,"Jeffrey",21,96.3);
		s1.get();
		Student s2=new Student();
		s2.set(78,"Jose",22,98.1);
		s2.get();
		Student s3=new Student();
                s3.set(12,"Vijay",21,90.3);
		s3.get();

	}
}
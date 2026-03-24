class student
{
    String name;
    int marks;
    boolean bool;
    student(int roll_no,String na_me,int mark_s)
    {
        name = na_me;
        marks = mark_s;
        System.out.println("parameterized constructor");
    }
    student(int rollno,String name,int marks,boolean bool)
    {
        this.name = name;
        this.marks = marks;
        this.bool = bool;
    }
    student(){
        System.out.println("From Default constructor");
    }
}
public class oops {
    public static void main(String[] args){
        student s1 = new student(11,"abcd",65);
        student s2 = new student();
        student s3 = new student(33,"dcba",55 ,false);
        System.out.println(s1.marks);
        System.out.println(s2.name);
        System.out.println(s3.bool);
    }
}


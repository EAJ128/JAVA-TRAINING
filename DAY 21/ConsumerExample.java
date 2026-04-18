import java.util.function.Consumer;

class Student
{
    String name;
    int marks;
    Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
}

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);
        Consumer<Student> printStudent = s -> System.out.println("Student Marks: " + s.name);
        print.accept("From Consumer Example");
        printStudent.accept(new Student("John", 85));
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    String name;
    int id;
    int mark;
    Student(String name, int mark,int id){
        this.name = name;
        this.mark = mark;
        this.id = id;

    }
    
    @Override
    public String toString(){
        return "Name: " + this.name + ", Mark: " + this.mark + ",Id:"+this.id;
    }
}



public class comparator {
    public static void main(String[] args)
    {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Alice", 85,1));
        student.add(new Student("Bob", 90,5));
        student.add(new Student("Charlie", 80,6));   
        student.add(new Student("David", 95,2));
        student.add(new Student("Eve", 88,8));
        @SuppressWarnings("Convert2Lambda")
        Comparator<Student> byId=new Comparator<Student>()
        {
            @Override
            public int compare(Student a,Student b)
            {
                return a.id-b.id;
            }
        };

        Collections.sort(student,byId);
        System.out.print(student);
        Collections.sort(student,(a,b)->a.mark-b.mark);
        System.out.println(student);

    }

}
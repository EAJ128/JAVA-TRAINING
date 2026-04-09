import java.util.*;

class Student implements Comparable<Student>
{
    String name;
    int mark;
    Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }
    @Override
    public int compareTo(Student s){
        return this.mark - s.mark; 
    }
    @Override
    public String toString(){
        return "Name: " + this.name + ", Mark: " + this.mark;
    }
}


public class comparable {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Alice", 85));
        student.add(new Student("Bob", 90));
        student.add(new Student("Charlie", 80));   
        student.add(new Student("David", 95));
        student.add(new Student("Eve", 88));

        Collections.sort(student);
        System.out.println(student);
        
    }
}

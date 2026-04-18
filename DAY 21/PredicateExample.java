import java.util.function.Predicate;

class Student
{
    int marks;
    Student(int marks)
    {
        this.marks=marks;
    }
}

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = isEven.negate();
        Predicate<Student> ispass=(s)->s.marks>=40;
        System.out.println(ispass.test(new Student(45)));
        System.out.println(isEven.test(4)); 
        System.out.println(isOdd.test(5));

    }
}
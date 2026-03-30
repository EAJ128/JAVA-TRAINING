class student
{
    int rollno=19;
    String name="AJ";
    char cj='E';
    boolean t=true;
    
    
}

@SuppressWarnings("unused")
class classeg
{

    public static void main(String[] args) {
        student s1=new student();
        System.out.println(s1.rollno);
        System.out.print(s1.cj);
        System.out.println(s1.name);
        System.out.println(s1.t);
    }
}
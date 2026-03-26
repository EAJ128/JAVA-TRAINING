class User
{
    String name;
    String role="User";
    User(String name)
    {
        this.name=name;
        System.out.print("USER CREATED SUCCESSFULLY");
    }
    void display()
    {
        System.out.println(role);
        System.out.println(name);
    }
}
class Driver extends User{
    String role="Driver";
    Driver(String name)
    {
        super(name);
        System.out.println(super.role);
        System.out.println(role);
        System.out.println(name);
        super.display();
    }
}
@SuppressWarnings("unused")
class task2
{
    public static void main(String[] args)
    {
        @SuppressWarnings("unused")
        Driver d=new Driver("DAVID");
    }
}
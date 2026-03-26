import java.util.Scanner;

class User
{
    String name;
    int phoneno;
    String location;
    User(String name,int phoneno,String location)
    {
        this.name=name;
        this.phoneno=phoneno;
        this.location=location;
    }
}

class RideBooking extends User
{
    String vehicletype;
    RideBooking(String name, int phoneno, String location, String vehicletype)
    {
        super(name,phoneno,location);
        this.vehicletype=vehicletype;
    }
    void displayinfo()
    {
        System.out.println(name);
        System.out.println(phoneno);
        System.out.println(location);
        System.out.println(vehicletype);
    }
}

class ParcelDelivery extends User
{
    int parcelweight;
    ParcelDelivery(String name, int phoneno, String location, int parcelweight) 
    {
        super(name,phoneno,location);
        this.parcelweight=parcelweight;
    }
    void displayinfo()
    {
        System.out.println(name);
        System.out.println(phoneno);
        System.out.println(location);
        System.out.println(parcelweight);
    }
}

class FoodDelivery extends User
{
    String favfood;

    FoodDelivery(String name, int phoneno, String location,String favfood) {
        super(name,phoneno,location);
        this.favfood=favfood;
    }
    void displayinfo()
    {
        System.out.println(name);
        System.out.println(phoneno);
        System.out.println(location);
        System.out.println(favfood);
    }
}





public class task3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        int phoneno=s.nextInt();
        s.nextLine();
        String location=s.nextLine();
        RideBooking r=new RideBooking(name,phoneno,location,"CAR");
        ParcelDelivery p=new ParcelDelivery(name,phoneno,location,10);
        FoodDelivery f=new FoodDelivery(name,phoneno,location,"PIZZA");

        r.displayinfo();
        p.displayinfo();
        f.displayinfo();
        s.close();
    }
}

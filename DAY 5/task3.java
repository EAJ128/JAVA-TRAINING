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
    public static void main(String[] args) {
        User u=new User("DAVID",1234567890,"HYDERABAD");
        RideBooking r=new RideBooking("CAR", 0, null, null);
        ParcelDelivery p=new ParcelDelivery(null, 5, null, 0);
        FoodDelivery f=new FoodDelivery("PIZZA", 0, null, null);
        r.displayinfo();
        p.displayinfo();
        f.displayinfo();
    }
}

import java.util.*;

class product
{
    int id;
    String name;
    Double price;
    int quantity;
    Double total;
    

    product(int id,String name,Double price,int quantity)
    {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;

    }
    void display(int i)
    {
        System.out.println("************************************************************************");
        System.out.println("PRODUCT "+(i+1)+" DETAILS");
        System.out.println("************************************************************************");
        System.out.println("ID:"+this.id);
        System.out.println("NAME:"+this.name);
        System.out.println("PRICE:"+this.price);
        System.out.println("QUANTITY:"+this.quantity);
        System.out.println("TOTAL:"+this.total);
        System.out.println();
    }
    Double totalprice()
    {
        this.total=quantity*price;
        return quantity*price;
    }
}

class day4task
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER NUMBER OF PRODUCT : ");
        int n=s.nextInt();
        int grandtotal=0;
        product[] p=new product[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("*************** ENTER PRODUCT "+(i+1)+" DETAILS ***************");
            System.out.println();
            System.out.println();System.out.println();
            System.out.print("ENTER ID : ");
            int id=s.nextInt();
            System.out.println();
            System.out.print("ENTER NAME : ");
            s.next();
            String name=s.nextLine();
            System.out.println();
            System.out.print("ENTER PRICE : ");
            Double price=s.nextDouble();
            System.out.println();
            System.out.print("ENTER QUANTITY : ");
            int quantity=s.nextInt();
            System.out.println();
            System.out.println();System.out.println();
            p[i]=new product(id,name,price,quantity);
            
            
        }
        for(int i=0;i<n;i++)
        {
            grandtotal+=p[i].totalprice();
            p[i].display(i);
        }
        System.out.println("************************************************************************");
        System.out.println("GRAND TOTAL : "+grandtotal);
        System.out.println("************************************************************************");


        s.close();
    }
}

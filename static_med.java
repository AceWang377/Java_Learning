import java.sql.SQLOutput;

class Mobile
{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + ":" + price + ":" + name);
    }
}


public class static_med {
    public static void main(String[] args){

        Mobile phone1 = new Mobile();
        phone1.brand = "IOS";
        phone1.price = 1999;
        Mobile.name = "smartphone";

        Mobile.name = "phone";

        phone1.show();
    }
}

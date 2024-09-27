class B{
    public void show1()
    {
        System.out.println("In B Show!");
    }
}
class C extends B{
    public void show2()
    {
        System.out.println("In C show!");
    }
}

public class upcasting {
    public static void main(String a[]){
        B obj = new C();
        obj.show1();

        //downcasting
        C obj1 = (C) obj;
        obj1.show2();

    }
}

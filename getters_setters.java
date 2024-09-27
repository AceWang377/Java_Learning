class Humen{
    private int age;
    private String name;

    //default constructor;
    public Humen(){
        age = 22;
        name = "Ace";
    }

    // parameter constructor;
    public Humen(int a, String n){
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class getters_setters {
    public static void main(String[] args){
        Humen man = new Humen();

        System.out.println(man.getAge() + ":" + man.getName());

        man.setAge(27);
        man.setName("ACE");
        System.out.println(man.getAge() + ":" + man.getName());

        Humen man1 = new Humen(30,"Abhi");
        System.out.println(man1.getAge() + ":" + man1.getName());

    }

}


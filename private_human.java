class Human{
    private int age = 11;
    private String name = "Alex";

    public int getAge(){
        return age;
    }
    // if you wanna get the private data from human, you have to access it through public method!!
    public void setAge(int age1){
        age = age1;
    }

    public String getName(){
        return name;
    }

    public void setName(String name1){
        name = name1;
    }

}

public class private_human {
    public static void main(String[] args){
        Human man = new Human();

        System.out.println(man.getAge() + ":" + man.getName());

        man.setAge(27);
        man.setName("ACE");
        System.out.println(man.getAge() + ":" + man.getName());
    }

}

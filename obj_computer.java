import java.awt.desktop.SystemEventListener;

class Computer{
    public void playMusic(){
        System.out.println("Music playing..");
    }

    public String getMe(int cost){
        if(cost>=10){
            return "Pen";
        }
        else
            return "Nothing";

    }
}


public class obj_computer {
    public static void main(String[] args){
        //instance
        Computer obj = new Computer();
        String result = obj.getMe(20);
        System.out.println(result);
        obj.playMusic();
    }
}

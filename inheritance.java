class Calcu{
    public int add(int a, int b){
        return  a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}

class AdvCalcu extends Calcu
{
    public int multi(int a , int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}


public class inheritance {
    public static void main(String[] args){
        Calcu cal = new Calcu();
        int r1 = cal.add(5,4);
        int r2 = cal.sub(6,1);

        AdvCalcu adv = new AdvCalcu();

        int r3 = adv.multi(5,2);
        int r4 = adv.divide(4,6);
        int r5 = adv.add(3,7);
        int r6 = adv.sub(6,2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5 + " " + r6);
    }
}

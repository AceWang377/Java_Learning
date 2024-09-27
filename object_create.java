class Calculator{

     public double add(double a, double b)
    {
        double result = a + b;
//        System.out.println(a+b);
        return result;
    }
}


public class object_create {
    public static void main(String[] args){
        double num1 = 1.22;
        double num2 = 2.23;
        // instance
        Calculator calcu = new Calculator();
        double result = calcu.add(num1,num2);
        System.out.println(result);
    }
}

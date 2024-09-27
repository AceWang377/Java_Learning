import java.sql.SQLOutput;

public class Switch_Statement {

    public static void main(String[] args){
        String n = "Sunday";
        String result = "";

        switch (n) {
            case "Saturday", "Sunday" -> result = "8am";
            case "Monday","Wednesday" -> result = "6am";
            default -> result = "7am";
        }
        System.out.println(result);
    }
}

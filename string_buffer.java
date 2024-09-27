public class string_buffer {
    public static void main(String[] args){
        String str = "Navin";
        StringBuffer sb = new StringBuffer("Buffer");

        sb.append(str);
        sb.insert(0,"I don't know ");
        System.out.println(sb);
    }
}

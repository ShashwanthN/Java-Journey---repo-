public class StringBuff {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("Shashwanth");
        sb.append(" Sivakumar");
        System.out.println(sb.insert(2, "hello"));
    }
}

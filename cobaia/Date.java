public class Date {
    public static String toISO(String s) {
        return s.split("/")[2] + "-" + s.split("/")[1] + "-" + s.split("/")[0];
    }

    public static void main(String[] args) {
        System.out.println(Date.toISO("13/08/2014"));
    }
}

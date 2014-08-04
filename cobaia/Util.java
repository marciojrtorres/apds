public class Util {
    public static String cotoiso(String s) {
        return s.split("/")[2] + "-" + s.split("/")[1] + "-" + s.split("/")[0];
    }

    public static void main(String[] args) {
        System.out.println(Util.cotoiso("13/08/2014"));
    }
}

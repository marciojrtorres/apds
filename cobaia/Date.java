public class Date {

    public static String toISO(String s) {
        return s.split("/")[2] + "-" + s.split("/")[1] + "-" + s.split("/")[0];
    }

    public static String formatAsISO(String s) {
        String[] partes = s.split("/");

        String ano = partes[2];
        String mes = partes[1];
        String dia = partes[0];

        return ano + "-" + mes + "-" + dia;
    }

    public static void main(String[] args) {
        System.out.println(Date.dias(2, 2012));
    }

}

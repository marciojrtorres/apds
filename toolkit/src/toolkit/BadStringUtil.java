package toolkit;

public class BadStringUtil {

    public static String limpa(String s) {
        char[] caracteres = s.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == 'á' || caracteres[i] == 'à' || caracteres[i] == 'ã' || caracteres[i] == 'ä') {
                caracteres[i] = 'a';
            }
            if (caracteres[i] == 'é' || caracteres[i] == 'ê') {
                caracteres[i] = 'e';
            }
            if (caracteres[i] == 'í') {
                caracteres[i] = 'i';
            }
            if (caracteres[i] == 'ó' || caracteres[i] == 'õ' || caracteres[i] == 'ö') {
                caracteres[i] = 'o';
            }
            if (caracteres[i] == 'ú' || caracteres[i] == 'ü') {
                caracteres[i] = 'o';
            }
        }

        return new String(caracteres);
    }

}
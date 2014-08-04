package toolkit;

public class GoodStringUtil {

    private static char[][] especiais = {
        {'á', 'à', 'ã', 'ä'},
        {'é'},
        {'í'},
        {'ó', 'õ', 'ö'},
        {'ú', 'ü'}
    };

    private static char[] normais = {
        'a',
        'e',
        'i',
        'o',
        'u'
    };

    public static String limpa(String s) {
        char[] caracteres = s.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < especiais.length; j++) {
                for (int q = 0; q < especiais[j].length; q++) {
                    if (caracteres[i] == especiais[j][q]) {
                        caracteres[i] = normais[j];
                    }
                }
            }
        }

        return new String(caracteres);
    }

}
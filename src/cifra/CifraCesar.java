package cifra;

/*
 *  Professor Gerson Risso
 */
public class CifraCesar {

    // Método para cifrar o texto
    public static String cifrar(String texto, int deslocamento) {
        StringBuilder resultado = new StringBuilder();

        // Ajuste para deslocamentos negativos
        deslocamento = (deslocamento % 26 + 26) % 26;

        for (int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + deslocamento) % 26 + base);
            }
            resultado.append(ch);
        }
        return resultado.toString();
    }

    // Método para decifrar o texto
    public static String decifrar(String texto, int chave) {
        // Inverte o deslocamento para decifrar
        return cifrar(texto, -chave);
    }

}


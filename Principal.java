package cifra;

import java.util.Scanner;

/*
 *  Professor Gerson Risso
 */
public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String texto = teclado.nextLine();
        System.out.println("Digite a chave");
        int chave = teclado.nextInt();

        String textoCifrado = CifraCesar.cifrar(texto, chave);
        System.out.println("Texto Cifrado: " + textoCifrado);

        String textoDecifrado = CifraCesar.decifrar("Bpqx coxpb bpqxsx zofmqldoxcxax!", chave);
        System.out.println("Texto Decifrado: " + textoDecifrado);

    }
}

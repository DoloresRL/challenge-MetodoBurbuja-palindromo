import java.text.Normalizer;
import java.util.Scanner;

/**
 * Clase que verifica si una palabra o frase ingresada es un palíndromo.
 */
public class Palindromo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean reiniciar = true;

        while (reiniciar) {
            System.out.println("Ingrese la palabra o frase:");
            String palindromo = s.nextLine();
            palindromo = normaliza(palindromo);
            char[] caracteres = palindromo.toCharArray();
            if (caracteres.length > 0) {
                boolean esPalindromo = true;
                for (int i = 0; i < caracteres.length / 2; i++) {
                    if (caracteres[i] != caracteres[caracteres.length - 1 - i]) {
                        esPalindromo = false;
                        break;
                    }
                }
                System.out.println(esPalindromo ? "Es palíndroma" : "No es palíndroma");
            } else {
                System.out.println("El texto ingresado no es una palabra o frase válida");
            }

            System.out.println("¿Desea ingresar otra palabra o frase? (S/N)");
            String respuesta = s.nextLine();

            if (respuesta.equalsIgnoreCase("N")) {
                reiniciar = false;
            }
        }

        s.close();
    }

    /**
     * Normaliza un texto eliminando los acentos, caracteres diacríticos y cualquier carácter que no sea una letra o un número.
     *
     * @param s el texto a normalizar
     * @return el texto normalizado sin acentos ni caracteres especiales
     */
    public static String normaliza(String s) {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s;
    }
}

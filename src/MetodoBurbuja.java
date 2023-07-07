import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase que implementa el algoritmo de ordenamiento con método burbuja para ordenar un arreglo de números.
 */
public class MetodoBurbuja {

    public static void main(String[] args) {
        try {
            int[] numeros = {19, 1, 9, 7, 3, 10, 13, 15, 8, 12, 2, 25, 11};
            int longitud = numeros.length;
            int ultimo = longitud - 1;
            // Algoritmo de ordenamiento con método burbuja
            for (int i = 0; i < longitud; i++) {
                for (int j = 0; j < ultimo; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        // Intercambio de elementos si están en el orden incorrecto
                        int temp = numeros[j + 1];
                        numeros[j + 1] = numeros[j];
                        numeros[j] = temp;
                    }
                }
                ultimo--;
            }
            System.out.println("Arreglo ordenado:" + Arrays.toString(numeros));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

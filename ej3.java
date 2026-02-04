import java.util.Arrays;
import java.util.Random;

public class ej3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }

        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println("Números  pares ordenados:");
        for (int i = 0; i < numeros.length; i++) {

        if (numeros[i] % 2 == 0) {

            System.out.println(numeros[i]);
        }
    }
}
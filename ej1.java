import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            suma += numeros[i];

            if (numeros[i] > mayor)
                mayor = numeros[i];
            if (numeros[i] < menor)
                menor = numeros[i];

            if (numeros[i] > 0)
                positivos++;
            else if (numeros[i] < 0)
                negativos++;
        }

        System.out.println("\nLos números que ingresaste son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        double media = (double) suma / numeros.length;
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        teclado.close();
    }
}
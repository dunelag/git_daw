import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] edades = new int[5];
        int min = 0;
        int max = 100;

        for (int i = 0; i < 5; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edades[i] = teclado.nextInt();
            if (edades[i] < min)
                min = edades[i];
            if (edades[i] > max)
                max = edades[i];
        }

        System.out.println("\nEdades introducidas:");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + (i + 1) + ": " + edades[i]);
        }

        System.out.println("Edad mínima: " + min);
        System.out.println("Edad máxima: " + max);

        teclado.close();
    }
}
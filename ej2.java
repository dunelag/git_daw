import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] edades = new int[5];
        int min = 0;
        int max = 100;
        int mayores = 0;
        int menores = 0;
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edades[i] = teclado.nextInt();
            if (edades[i] < min)
                min = edades[i];
            if (edades[i] > max)
                max = edades[i];
            if (edades[i] >= 18)
                mayores++;
            else
                menores++;
        }

        System.out.println("\nEdades introducidas:");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad " + (i + 1) + ": " + edades[i]);
        }

        System.out.println("Edad mínima: " + min);
        System.out.println("Edad máxima: " + max);
        System.out.println("Mayores de edad: " + mayores);
        System.out.println("Menores de edad: " + menores);

        double media = (double) suma / edades.length;
        System.out.println("Media de edad: " + media);

        teclado.close();
    }
}
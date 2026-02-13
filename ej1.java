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
        int tamaño = 5;

        boolean[] visitado = new boolean[5];

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

        System.out.println("\nFrecuencia de cada número:");
        for (int i = 0; i < 5; i++) {
            if (!visitado[i]) {
                int contador = 1;
                for (int j = i + 1; j < 5; j++) {
                    if (numeros[j] == numeros[i]) {
                        contador++;
                        visitado[j] = true;
                    }
                }
                System.out.println(numeros[i] + " aparece " + contador + " vez/veces");
                visitado[i] = true;
            }
        }

        System.out.print("\nIntroduce el número que deseas eliminar (solo se elimina una vez): ");
        int aEliminar = teclado.nextInt();
        boolean encontrado = false;

        // Buscar y eliminar la primera ocurrencia
        for (int i = 0; i < tamaño; i++) {
            if (numeros[i] == aEliminar && !encontrado) {
                // Desplazar elementos hacia la izquierda
                for (int j = i; j < tamaño - 1; j++) {
                    numeros[j] = numeros[j + 1];
                }
                tamaño--;
                encontrado = true;
            }
        }

        System.out.println("\nArray después de la eliminación:");
        if (encontrado) {
            for (int i = 0; i < tamaño; i++) {
                System.out.println(numeros[i]);
            }
        } else {
            System.out.println("El número no estaba en el array.");
            for (int i = 0; i < tamaño; i++) {
                System.out.println(numeros[i]);
            }
        }

        teclado.close();
    }
}

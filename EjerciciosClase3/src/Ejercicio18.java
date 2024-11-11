/*
 * Escriba un programa que genere 120 números aleatorios entre
 *  -100 y 100. Imprime los
siguientes cálculos:
- Sumar los valores positivos.
- Sumar los valores negativos.
- Calcule la media de los números negativos.
- Calcule la media de los números positivos.
- Cuente la cantidad de ceros.
 * 
 * 
 */

package src;
import java.util.Random;
public class Ejercicio18 {
    public static void main(String[] args) {
        Random random = new Random();
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int cantidadCeros = 0;

        for (int i = 0; i < 120; i++) {
            int numero = random.nextInt(201) - 100; // Genera números entre -100 y 100
            System.out.println("Número generado: " + numero);

            if (numero > 0) {
                sumaPositivos += numero;
                cantidadPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                cantidadNegativos++;
            } else {
                cantidadCeros++;
            }
        }

        double mediaPositivos = cantidadPositivos > 0 ? (double) sumaPositivos / cantidadPositivos : 0;
        double mediaNegativos = cantidadNegativos > 0 ? (double) sumaNegativos / cantidadNegativos : 0;

        System.out.println("\nResultados:");
        System.out.println("Suma de valores positivos: " + sumaPositivos);
        System.out.println("Suma de valores negativos: " + sumaNegativos);
        System.out.println("Media de valores positivos: " + mediaPositivos);
        System.out.println("Media de valores negativos: " + mediaNegativos);
        System.out.println("Cantidad de ceros: " + cantidadCeros);
    }
    
}

/*
 * Realice un programa que genere el tablero de ajedrez en 
 * consola usando instrucciones de repetición.
```
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
```
donde **N** representa al cuadro negro y **B**
 representa al cuadro blanco.
![Tablero de ajedrez](https://img.freepik.com/vector-premium/tablero-ajedrez-piezas-ajedrez_81894-1481.jpg)

 */


package src;

public class Ejercicio20 {
    public static void main(String[] args) {
        int tamañoTablero = 8;  // Tamaño del tablero (8x8)

        for (int fila = 0; fila < tamañoTablero; fila++) {
            for (int columna = 0; columna < tamañoTablero; columna++) {
                // Determinar si la posición es blanca (B) o negra (N)
                if ((fila + columna) % 2 == 0) {
                    System.out.print("| B ");
                } else {
                    System.out.print("| N ");
                }
            }
            System.out.println("|");  // Nueva línea para cada fila
        }
    }
}

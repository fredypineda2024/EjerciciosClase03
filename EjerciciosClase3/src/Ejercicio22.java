/*
 * Realizar un programa que permita controlar el juego
 *  de piedra, papel, tijera  introduciendo P para piedra, 
 * L para papel y T para tijera por cada jugador.  
El sistema debe indicar qué jugador gana la ronda o si
hay empate. Al final de cada ronda preguntar si desea volver a jugar.

 */


package src;
import java.util.Scanner;
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jugarDeNuevo;

        do {
            // Solicitar elección de cada jugador
            System.out.print("Jugador 1, elige (P)iedra, (L) Papel, o (T)ijera: ");
            char jugador1 = scanner.next().toUpperCase().charAt(0);

            System.out.print("Jugador 2, elige (P)iedra, (L) Papel, o (T)ijera: ");
            char jugador2 = scanner.next().toUpperCase().charAt(0);

            // Determinar el resultado
            String resultado = determinarGanador(jugador1, jugador2);
            System.out.println(resultado);

            // Preguntar si desean volver a jugar
            System.out.print("¿Quieres jugar otra vez? (S/N): ");
            jugarDeNuevo = scanner.next().toUpperCase();
        } while (jugarDeNuevo.equals("S"));

        scanner.close();
    }

    // Método para determinar el ganador
    public static String determinarGanador(char jugador1, char jugador2) {
        if (jugador1 == jugador2) {
            return "Empate";
        }

        switch (jugador1) {
            case 'P':
                return (jugador2 == 'T') ? "Jugador 1 gana (Piedra vence a Tijera)" : "Jugador 2 gana (Papel vence a Piedra)";
            case 'L':
                return (jugador2 == 'P') ? "Jugador 1 gana (Papel vence a Piedra)" : "Jugador 2 gana (Tijera vence a Papel)";
            case 'T':
                return (jugador2 == 'L') ? "Jugador 1 gana (Tijera vence a Papel)" : "Jugador 2 gana (Piedra vence a Tijera)";
            default:
                return "Elección inválida";
        }
    }
    
}

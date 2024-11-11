//Escriba un programa que permita ingresar tres 
//números (representan la longitud de una línea) 
//y compruebe si con estos números se puede formar
//un triángulo.



package src;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer lado: ");
        double lado1=scanner.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado: ");
        double lado2=scanner.nextDouble();

        System.out.println("Ingrese la longitud del tercer lado: ");
        double lado3=scanner.nextDouble();

        if ((lado1+lado2>lado3)&&(lado1+lado3>lado2)&&(lado2+lado3>lado1)){
            System.out.println("Los numeros pueden formar un triangulo");


        }else {
            System.out.println("Los numeros no pueden formar un triangulo");
        }
        scanner.close();

    }
    
}

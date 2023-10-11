import java.util.Scanner;
import java.lang.Math;

public class Ejercicio12{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random()*100)+1; //Se genera un numero aleatorio entre 1 y 100, se hace un cast porque random devuelve un double pero queremos un numero entero.
		int numeroUsuario;
		int numeroIntentos = 5;
	

		do{	
			//Prueba para ver el número aleatorio: System.out.println(numeroAleatorio);
			System.out.println("***JUEGO DE ADIVINAR EL NÚMERO***");
			System.out.println("Tienes " + numeroIntentos + " intentos para adivinar un número entre 1 y 100, empecemos:");
			System.out.println("Ingresa el primer número:");
			numeroUsuario = Integer.parseInt(lector.nextLine());
			
			if(numeroAleatorio > numeroUsuario){
				System.out.println("El número aleatorio es mayor, intenta otra vez");
				numeroIntentos = numeroIntentos - 1;

			}else if (numeroAleatorio < numeroUsuario){
				System.out.println("El número aleatorio es menor, intenta otra vez");
				numeroIntentos = numeroIntentos - 1;

			}else if (numeroAleatorio == numeroUsuario){
				System.out.println("HAS ACERTADO, el número es igual");
				numeroIntentos = numeroIntentos - 1;
				System.out.println("HAS GANADO CON ");
				break;
			}
			
			if (numeroIntentos == 0){
				System.out.println("Has llegado al maximo de intentos, vuelve a ejecutar el programa para jugar de nuevo");		
			}
		}while(numeroIntentos != 0);
	}
}
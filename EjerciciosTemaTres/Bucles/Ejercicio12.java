import java.util.Scanner;
import java.lang.Math;

public class Ejercicio12{
	public static void main(String[] args){
		//Declaración de las variables.
		Scanner lector = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random()*100)+1; //Se genera un numero aleatorio entre 1 y 100, se hace un cast porque random devuelve un double pero queremos un numero entero.
		int numeroUsuario;
		int numeroIntentos = 5;
		int opcion = 0;
	
		do{
			System.out.println("***ADIVINA EL NÚMERO***");
			System.out.println("Selecciona una opción:");
			System.out.println("1. Jugar");
			System.out.println("0. Salir");
			
			opcion = Integer.parseInt(lector.nextLine());

			switch (opcion){
				case 0:
					break;
				case 1:
					do{	
						//Prueba para ver el número aleatorio: 
						//System.out.println(numeroAleatorio);
						//System.out.println("***JUEGO DE ADIVINAR EL NÚMERO***");
						System.out.println("Tienes " + numeroIntentos + " intentos para adivinar un número entre 1 y 100, empecemos:");
						System.out.println("Ingresa el primer número:");
						numeroUsuario = Integer.parseInt(lector.nextLine());
						//Si el numero es mayor.
						if(numeroAleatorio > numeroUsuario){
							System.out.println("El número aleatorio es mayor, intenta otra vez");
							numeroIntentos = numeroIntentos - 1;
						//Si el numero es menor.
						}else if (numeroAleatorio < numeroUsuario){
							System.out.println("El número aleatorio es menor, intenta otra vez");
							numeroIntentos = numeroIntentos - 1;
						//Si el numero es igual.
						}else if (numeroAleatorio == numeroUsuario){
							System.out.println("HAS ACERTADO, el número es igual");
							numeroIntentos = numeroIntentos - 1;
							System.out.println("HAS GANADO CON ");
							break;
						}
						//Si se acaban los intentos imprimios un mensaje.
						if (numeroIntentos == 0){
							System.out.println("Has llegado al maximo de intentos y el número aleatorio es: " + numeroAleatorio);		
						}
					}while(numeroIntentos != 0); //Bucle do while para pedir números mientras se cumple una función.
			}
		}while(opcion != 0);
	
		//Se cierra el Scanner.
		lector.close();
	}
}
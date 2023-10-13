import java.util.Scanner;
import java.lang.Math;

public class Ejercicio12{
	public static void main(String[] args){
		//Declaración de las variables.
		Scanner lector = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random()*100)+1; //Se genera un numero aleatorio entre 1 y 100, se hace un cast porque random devuelve un double pero queremos un numero entero.
		int numeroUsuario;
		int numeroIntentos = 0;
		int opcion = 0;
	
		do{
			System.out.println("***ADIVINA EL NÚMERO***");
			System.out.println("Selecciona una opción:");
			System.out.println("1. Jugar");
			System.out.println("0. Salir");
			
			opcion = Integer.parseInt(lector.nextLine());
			//Si el usuario elige la opcion 1 se le pedira el número de intentos, si no saldrá del programa sin pedirselo.
			if(opcion == 1){
				System.out.println("Introduce un número de intentos para averiguar el número.");
				numeroIntentos = Integer.parseInt(lector.nextLine());
			}
			
			switch (opcion){
					case 0:
						break;
					case 1:
						do{	
							//Prueba para ver el número aleatorio: 
							//System.out.println(numeroAleatorio);
						
							System.out.println("Tienes " + numeroIntentos + " intentos para adivinar un número entre 1 y 100, empecemos:");
							System.out.println("Ingresa el primer número:");
							numeroUsuario = Integer.parseInt(lector.nextLine());
							//Si el numero es mayor.
							if(numeroAleatorio > numeroUsuario){
								System.out.println("El número aleatorio es mayor.");
								numeroIntentos = numeroIntentos - 1;
							//Si el numero es menor.
							}else if (numeroAleatorio < numeroUsuario){
								System.out.println("El número aleatorio es menor.");
								numeroIntentos = numeroIntentos - 1;
							//Si el numero es igual.
							}else if (numeroAleatorio == numeroUsuario){
								System.out.println("HAS GANADO, el número es: " + numeroAleatorio);
								numeroIntentos = numeroIntentos - 1;
							}
							//Si se acaban los intentos imprimios un mensaje.
							if (numeroIntentos == 0){
								System.out.println("Has llegado al maximo de intentos y el número aleatorio es: " + numeroAleatorio);		
							}
						}while(numeroIntentos != 0); //Condición si el número de intentos llega a 0, sale del programa.
						break;
					}
		}while(opcion != 0);
	
		//Se cierra el Scanner.
		lector.close();
	}
}
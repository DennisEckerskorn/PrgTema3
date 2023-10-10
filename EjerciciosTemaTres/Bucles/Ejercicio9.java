import java.util.Scanner;
public class Ejercicio9{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		int numeroUsuario = 0;
		int contador = 0;
		boolean esPrimo = numeroUsuario == 1 ? false : true;
		System.out.println("Ingresa un número para averiguar si es primo o no:");
		numeroUsuario = Integer.parseInt(lector.nextLine());
		
		//Número Primo o no.
		for(int i = numeroUsuario - 1; i >= 2; i--){
			if (numeroUsuario % i == 0){
			esPrimo = false;
			break;	
			}
		}
		System.out.println("El número " + numeroUsuario);
		if (esPrimo) {
			System.out.print(" es primo");
		}else{
			System.out.print(" no es primo");
		}
		lector.close();
	}
}
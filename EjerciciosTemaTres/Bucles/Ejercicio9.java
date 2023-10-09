import java.util.Scanner;
public class Ejercicio9{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		int numeroUsuario = 0;
		int contador = 0;
		System.out.println("Ingresa un número para averiguar si es primo o no:");
		numeroUsuario = Integer.parseInt(lector.nextLine());
		//Bucle for, recorre desde 1 hasta el numero indicado y comprueba si el resto es 0 aumentando el contador.
		for (int i = 1; i<=numeroUsuario; i++){
			if((numeroUsuario%i) == 0){
				contador++;
			}
		} 
		//Condicion, si el contador llega a 2 imprime el mensaje numero es primo.
		if(contador == 2){
			System.out.println("El número es primo");
		}else{
			System.out.println("El número no es primo");
		}
		
		lector.close();
	}
}
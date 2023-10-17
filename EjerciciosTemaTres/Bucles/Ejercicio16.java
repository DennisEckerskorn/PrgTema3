import java.util.Scanner;
import java.util.Random;

public class Ejercicio16{
	public static void main(String[] args){
		//Se declaran las variables.
		Scanner lector = new Scanner(System.in);
		Random rnd = new Random();
		int dado;
		final int MIN = 1;
		final int MAX = 6;
		int opcion;
		int tiradaJugador;
		int tiradaOrdenador;
		int puntosJugador = 0;
		int puntosOrdenador = 0;
		int porraJugador;
		int porraOrdenador;
		
		
		do{
			System.out.println("Bienvenido al Black Jack");
			System.out.println("El jugador tira los dados:");
			
			do{
				dado = rnd.nextInt(MAX-MIN+1)+MIN;
				tiradaJugador = dado;
				System.out.println("El jugador ha tirado un " + dado);
			}while(tiradaJugador == 11 || 
			
			
			

			if (tiradaJugador == 11) {
				System.out.println("HAS GANADO");
			}else if tiradaJugador 

		}while(opcion != 0);	
		
		
	}
}
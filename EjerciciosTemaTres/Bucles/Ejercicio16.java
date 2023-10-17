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
		int puntosJugador = 0;
		int puntosOrdenador = 0;
		
		
		
		do{
			System.out.println("Bienvenido al Black Jack");
			System.out.println("El jugador tira los dados:");
			
			
			opcion = Integer.parseInt(lector.nextLine());

			switch (opcion){
				case 0: //Sale del juego.
					break;
				case 1: //Empieza el juego.
						//Se establece el rango de números aleatorios entre el 1 y el 6.
						dado = rnd.nextInt(MAX-MIN+1)+MIN;
						
						System.out.println("El jugador ha tirado un " + dado);


					
					break;	
			}

		}while(opcion != 0);	
		
		
	}
}
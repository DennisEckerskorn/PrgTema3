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
		int puntosJugador = 0;
		int puntosOrdenador = 0;
		int porraJugador = 0;
		int porraOrdenador = 0;
		char opcion = ' ';
		
		
		
		System.out.println("Bienvenido al Black Jack");

		//Empieza el juego:
		
		while (porraJugador <= 5 && porraOrdenador <= 5) {
			System.out.println("El jugador tira los dados...");		
			dado = rnd.nextInt(MAX - MIN + 1) + MIN;
			puntosJugador += dado;
			System.out.println("El jugador ha tirado un " + dado + " y tiene " + puntosJugador + " puntos.");

			//a)
			if(puntosJugador == 11){
				porraJugador += 2;
				System.out.println("Has ganado 11 puntos y obtienes 2 porras.");
				System.out.println("Puntuación: " + porraJugador + " porras.");
			//c)
			} else if (puntosJugador > 11) {
				porraOrdenador += 1;
				System.out.println("Te has pasado de 11. El ordenador recibe 1 porra.");
				puntosJugador = 0;
			//b)	
			} else {
				System.out.println("¿Quieres plantarte o seguir? [S - Seguir] o [P - Plantarte]");
				opcion = lector.next().charAt(0);
				lector.nextLine();
			
				if (opcion == 'P' || opcion == 'p'){
					while (puntosOrdenador < puntosJugador) {
						dado = rnd.nextInt(MAX - MIN + 1) + MIN;
						puntosOrdenador += dado;
					}
				
					if (puntosOrdenador == puntosJugador) {
						porraOrdenador += 1;
						System.out.println("El ordenador iguala tus puntos y gana 1 porra.");
					} else if (puntosOrdenador == 11) {
						porraOrdenador += 2;
						System.out.println("El ordenador gana con 11 puntos y obtiene 2 porras");
					} else {
						System.out.println("El ordenador no iguala tus puntos");
					}
				}	
			}
			System.out.println("PORRAS JUGADOR: " + porraJugador + " --- " + "PORRAS ORDENADOR: " + porraOrdenador);
		}
		
		if(porraJugador == 5){
			System.out.println("Has ganado con " + porraJugador + " porras.");
		} else {
			System.out.println("El ordenador ha ganado con " + porraOrdenador + " porras.");
		}
	}
}
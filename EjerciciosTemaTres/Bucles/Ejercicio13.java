import java.util.Random;

public class Ejercicio13{
	public static void main(String[] args){
		//Declaración de las variables necesarias.
		Random rnd = new Random();
		int numAleatorio;
		int contadorCara = 0;
		int contadorCruz = 0;
		int numVeces = 1_000_000;
		final int CARA = 0;
		final int CRUZ = 1;
		double porcentajeCara;
		double porcentajeCruz;

		//Bucle for para generar números aleatorios 1_000_000 de veces.
		for (int i = 0; i < numVeces; i++){
			numAleatorio = rnd.nextInt(CRUZ - CARA + 1) + CARA; //0-1+1=2+0 es igual 2. Se genera un número entre 0 y 1.
			switch (numAleatorio){
				case CARA:
					contadorCara++;
					break;
				case CRUZ:
					contadorCruz++;
					break;
			}
		}
		
		//Se castea el resultado que sería un entero a un double y se calcula el porcentaje.
		porcentajeCara = ((double) contadorCara / numVeces) * 100;
		porcentajeCruz = ((double) contadorCruz / numVeces) * 100;
		
		//Se imprime el resultado por pantalla.
		System.out.println("Porcentaje de caras: " + porcentajeCara + " %");
		System.out.println("Porcentaje de cruz: " + porcentajeCruz + " %");
	}
}
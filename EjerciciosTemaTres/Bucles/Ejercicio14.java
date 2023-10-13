import java.util.Random;

public class Ejercicio14{
	public static void main(String[] args){
		//Variables.
		Random rnd = new Random();
		int numDado;
		int numVeces = 1_000_000;
		final int MAXCARAS = 6;
		final int MINCARAS = 1;
		int contadorUno = 0;
		int contadorDos = 0;
		int contadorTres = 0;
		int contadorCuatro = 0;
		int contadorCinco = 0;
		int contadorSeis = 0;
		double porcentajeUno;
		double porcentajeDos;
		double porcentajeTres;
		double porcentajeCuatro;
		double porcentajeCinco;
		double porcentajeSeis;
		double probabilidad;
		//Bucle para repetir la tirada del dado 1000000 de veces, contando que numero sale en cada tirada.
		for(int i = 0; i < numVeces; i++){
			numDado = rnd.nextInt(MAXCARAS - MINCARAS + 1) + MINCARAS; //Rango de 1 al 6
			
			switch(numDado){
				case 1:
					contadorUno++;
					break;
				case 2:
					contadorDos++;
					break;
				case 3: 
					contadorTres++;
					break;
				case 4: 
					contadorCuatro++;
					break;
				case 5: 
					contadorCinco++;
					break;
				case 6: 
					contadorSeis++;
					break;
			}
		}
		//La probabilidad de que salga un numero de los 6 en un dado:
		//probabilidad = ((double) 1/6)*100;
		//System.out.println("La probabilidad de que salga uno de los 6 números de un dado sería: " + probabilidad + "%");
		//Se calculan los porcentajes de cada contador.
		porcentajeUno = ((double) contadorUno / numVeces) * 100;
		porcentajeDos = ((double) contadorDos / numVeces) * 100;
		porcentajeTres = ((double) contadorTres / numVeces) * 100;
		porcentajeCuatro = ((double) contadorCuatro / numVeces) * 100;
		porcentajeCinco = ((double) contadorCinco / numVeces) * 100;
		porcentajeSeis = ((double) contadorSeis / numVeces) * 100;
		//Se imprimen los resultados.
		System.out.println("El 1 ha salido " + contadorUno + " veces y el porcentaje es " + porcentajeUno + "%");
		System.out.println("El 2 ha salido " + contadorDos + " veces y el porcentaje es " + porcentajeDos + "%");
		System.out.println("El 3 ha salido " + contadorTres + " veces y el porcentaje es " + porcentajeTres + "%");
		System.out.println("El 4 ha salido " + contadorCuatro + " veces y el porcentaje es " + porcentajeCuatro + "%");
		System.out.println("El 5 ha salido " + contadorCinco + " veces y el porcentaje es " + porcentajeCinco + "%");
		System.out.println("El 6 ha salido " + contadorSeis + " veces y el porcentaje es " + porcentajeSeis + "%");
	}
}
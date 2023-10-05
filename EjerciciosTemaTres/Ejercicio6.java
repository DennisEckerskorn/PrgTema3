import java.util.Scanner;
public class Ejercicio6{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		float euros;
		int moneda200;
		int moneda100;
		int moneda50;
		int moneda20;
		int moneda10;
		int moneda5;
		int moneda2;
		int moneda1;
		int restante;
		int centimos;

		//Pedimos datos con Decimal.
		System.out.println("¿Cuántos euros quieres convertir a la cantidad mínima en monedas?");
		euros = Float.parseFloat(lector.nextLine());

		//Convertimos el número con decimales a un entero para convertirlo a céntimos con un Casting.
		centimos =  (int) (euros * 100);

		//Convertimos los centimos a monedas y mostramos los resultados, uso las condiciones para que solo salgan las monedas necesarias, es decir si el valor es 0, no se imprime.
		
		moneda200 = centimos / 200; 
		restante = centimos % 200; //Resto es 100.
		
		moneda100 = restante / 100;
		restante = centimos % 100; //Resto es 0.
		
		moneda50 = restante / 50;
		restante = centimos % 50; 

		moneda20 = restante / 20;
		restante = centimos % 20;

		moneda10 = restante / 10;
		restante = centimos % 10; 
		
		moneda5 = restante / 5;
		restante = centimos % 5; 

		moneda2 = restante / 2;
		restante = centimos % 2;
		
		moneda1 = restante / 1;

		//Imprimios el resultado.
		System.out.println(euros + " equivalen a " + moneda200 + " monedas de 2 euros, " + moneda100 + " monedas de 1 euros, " + moneda50 + " monedas de 50 céntimos, " + moneda20 + 			" monedas de 20 céntimos, "  + moneda10 + " monedas de 10 céntimos, "  + moneda5 + " monedas de 5 céntimos, "  + moneda2 + " monedas de 2 céntimos, "  + moneda1 + " monedas de 1 		céntimo.");

		//Cerramos el Scanner.
		lector.close();
	}
}
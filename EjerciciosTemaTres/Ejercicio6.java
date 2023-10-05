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
		int devolver;
		//Pedimos datos con Decimal.
		System.out.println("¿Cuántos euros quieres convertir a la cantidad mínima en monedas?");
		euros = Float.parseFloat(lector.nextLine());
		//Convertimos el número con decimales a un entero para convertirlo a céntimos con un Casting.
		devolver =  (int) (euros * 100);
		//Convertimos los centimos a monedas y mostramos los resultados, uso las condiciones para que solo salgan las monedas necesarias, es decir si el valor es 0, no se imprime.
		if (devolver >= 200) {
            		System.out.println("Monedas de 2 euros: " + devolver / 200);
            		devolver = devolver % 200;
        	}
		if (devolver >= 100) {
            		System.out.println("Monedas de 1 euro: " + devolver / 100);
            		devolver = devolver % 100;
        	} 
		if (devolver >= 50) {
            		System.out.println("Monedas de 50 céntimos: " + devolver / 50);
            		devolver = devolver % 50;
        	}
		if (devolver >= 20) {
            		System.out.println("Monedas de 20 céntimos: " + devolver / 20);
            		devolver = devolver % 20;
        	}
		if (devolver >= 10) {
            		System.out.println("Monedas de 10 céntimos: " + devolver / 10);
            		devolver = devolver % 10;
        	} 
		if (devolver >= 5) {
            		System.out.println("Monedas de 5 céntimos: " + devolver / 5);
            		devolver = devolver % 5;
        	} 
		if (devolver >= 2) {
            		System.out.println("Monedas de 2 céntimos: " + devolver / 2);
            		devolver = devolver % 2;
        	} 
		if (devolver >= 1) {
            		System.out.println("Monedas de 1 céntimo: " + devolver);
            		devolver = devolver % 1;
        	}
		//Cerramos el Scanner.
		lector.close();
	}
}
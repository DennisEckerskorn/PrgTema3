import java.util.Scanner;
public class Ejercicio6{
	public static void main(String[] args){
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
		
		
		
		System.out.println("¿Cuántos euros quieres convertir a la cantidad mínima en monedas?");
		euros = Float.parseFloat(lector.nextLine());

		restante =  (int) (euros * 100);
		
		moneda200 = restante / 200;
		restante = restante % 200;

		moneda100 = restante / 100;
		restante = restante % 100;

		moneda50 = restante / 50;
		restante = restante % 50;

		moneda20 = restante / 20;
		restante = restante % 20;
		
		moneda10 = restante / 10;
		restante = restante % 10;
		
		moneda5 = restante / 5;
		restante = restante % 5;

		moneda2 = restante / 2;
		restante = restante % 2;
		
		moneda1 = restante / 1;
		restante = restante /1;
		
		System.out.println(restante);
		System.out.println(moneda200);
		System.out.println(moneda100);
		System.out.println(moneda50);
		System.out.println(moneda20);
		System.out.println(moneda10);
		System.out.println(moneda5);
		System.out.println(moneda2);
		System.out.println(moneda1);



		
		
	}
}
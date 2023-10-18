import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		double numeroReal;

		System.out.println("Ingresa un numero real");
		numeroReal = Double.parseDouble(lector.nextLine());	
		
		System.out.printf("%.2f", numeroReal);		
	}
}
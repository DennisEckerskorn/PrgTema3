import java.util.Scanner;

public class Ejercicio2{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int hora, minuto, segundo;
		boolean valido;

		do{
			System.out.println("Indica la hora");
			hora = Integer.parseInt(lector.nextLine());
			valido = hora >= 0 && hora <= 23;
			if(!valido){
				System.out.println("El valor de la hora no es correcto, ingresa un valor válido (0-23).");
			}
		}while(!valido);

		do{
			System.out.println("Indica los minutos");
			minuto = Integer.parseInt(lector.nextLine());
			valido = minuto >= 0 && minuto <= 60;
			if (!valido){
				System.out.println("El valor de los minutos no es correcto, ingresa un valor válido (0-60).");
			}	
		}while(!valido);
		
		do{
			System.out.println("Indica los segundos");
			segundo = Integer.parseInt(lector.nextLine());
			valido = segundo >= 0 && segundo <= 60;
			if (!valido){
				System.out.println("El valor de los segundos no es correcto, ingresa un valor válido (0-60).");
			}	
		}while(!valido);
		
		System.out.printf("%02d:%02d:%02d", hora, minuto, segundo);	
	}
}
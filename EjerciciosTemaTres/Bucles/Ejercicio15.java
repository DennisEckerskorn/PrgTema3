import java.util.Scanner;

public class Ejercicio15{
	public static void main(String[] args){
		//Variables
		Scanner lector = new Scanner(System.in);
		int horas = 0;
		int minutos = 0;
		int segundos = 0;
		boolean salir = false;

		do{
			System.out.println("Ingresa la hora");
			horas = Integer.parseInt(lector.nextLine());
			if (horas >= 0 && horas <= 23){
				salir = true;	
			} else {
				System.out.println("No es válido, ingresa un número válido.");
			}
		}while(salir != true);
		
		do{
			System.out.println("Ingresa los minutos");
			minutos = Integer.parseInt(lector.nextLine());
			if (minutos >= 0 && minutos <= 60){
				salir = true;	
			} else {
				System.out.println("No es válido, ingresa un número válido.");
				salir = false;
			}
		}while(salir != true);
		
		do{
			System.out.println("Ingresa los segundos");
			segundos = Integer.parseInt(lector.nextLine());
			if (segundos >= 0 && segundos <= 60){
				salir = true;	
			}else {
				System.out.println("No es válido, ingresa un número válido.");
			}
		}while(salir != true);
		
		System.out.println(horas + ":" + minutos + ":" + segundos);

		lector.close();
	}
}
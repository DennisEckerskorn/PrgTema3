import java.util.Scanner;

public class Ejercicio15{
	public static void main(String[] args){
		//Variables
		Scanner lector = new Scanner(System.in);
		int horas;
		int minutos;
		int segundos;

		//Se piden datos para las variables creadas.
		System.out.println("Ingresa la hora");
		horas = Integer.parseInt(lector.nextLine());
		
		System.out.println("Ingresa los minutos");
		minutos = Integer.parseInt(lector.nextLine());

		System.out.println("Ingresa los segundos");
		segundos = Integer.parseInt(lector.nextLine());

		//Se valida si las horas, minutos, segundos son correctas.
		if(horas >= 0 && horas <= 24 && minutos >= 0 && minutos <= 60 && segundos >= 0 && segundos <= 60){
			System.out.println("La hora indicada es válida: " + horas + ":" + minutos + ":" + segundos);
		} else {
			System.out.println("La hora indicada no es válida.");
		}
	}
}
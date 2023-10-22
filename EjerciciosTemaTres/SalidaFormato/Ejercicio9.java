import java.util.Scanner;

public class Ejercicio9{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		String ciudad = "";
		String titulo = "** DATOS ESTACIÓN METEOROLOGICA**";
		double temperatura, presionAtmosferica; 
		int dia, mes, anyo, hora, minutos, segundos, velocidadViento, lluvia, radiacionUltravioleta;
		boolean validado;

		//Se pide el nombre de la ciudad:
		System.out.println("Bienvenido a la Estación Meteorológica");
		System.out.println("Introduce el nombre de una ciudad:");
		ciudad = lector.nextLine();

		//Se pide la fecha, validando los días, meses, años.
		do{
			System.out.println("Introduce una fecha, primero los días:");
			dia = Integer.parseInt(lector.nextLine());
			validado = dia >= 1 && dia <= 31;
			if (!validado){
				System.out.println("El día no es válido, vuelve a introducir un día válido: [1-31]");
			}
		}while(!validado);
		
		do{
			System.out.println("Introduce el mes:");
			mes = Integer.parseInt(lector.nextLine());
			validado = mes >= 1 && mes <= 12;
			if(!validado){
				System.out.println("El mes no es válido, vuelve a introducir un mes válido: [1-12]");
			}
		}while(!validado);
		
		do{
			System.out.println("Introduce el año:");
			anyo = Integer.parseInt(lector.nextLine());
			validado = anyo >= 1930 && anyo <= 2023;
			if (!validado){
				System.out.println("El año no es válido, vuelve a introducir un año válido: [1930 - 2023]");
			}
		}while(!validado);

		//Se pide la hora, validando las horas, minutos, segundos.

		do{
			System.out.println("Introduce la hora:");
			hora = Integer.parseInt(lector.nextLine());
			validado = hora >= 0 && hora <= 23;
			if (!validado){
				System.out.println("La hora no es válida, vuelve a introducir una hora válida: [0-23]");
			}
		}while(!validado);
		
		do{
			System.out.println("Introduce los minutos:");
			minutos = Integer.parseInt(lector.nextLine());
			validado = minutos >= 0 && minutos <= 59;
			if(!validado){
				System.out.println("Los minutos no son válidos, vuelve a introducir unos minutos válidos: [0-59]");
			}
		}while(!validado);
		
		do{
			System.out.println("Introduce los segundos:");
			segundos = Integer.parseInt(lector.nextLine());
			validado = segundos >= 0 && segundos <= 59;
			if (!validado){
				System.out.println("Los segundos no son válidos, vuelve a introducir onos segundos válidos: [0 - 59]");
			}
		}while(!validado);

		//Se pide la velocidad del viento en km/h.
		System.out.println("Introduce la velocidad del viento en km/h:");
		velocidadViento = Integer.parseInt(lector.nextLine());

		//Se pide la temperatura, se mide en Cº:
		System.out.println("Introduce un número para la temperatura:");
		temperatura = Double.parseDouble(lector.nextLine());

		//Se pide la presion atmósferica, se mide en hPa.
		System.out.println("Introduce la presión atmósferica");
		presionAtmosferica = Double.parseDouble(lector.nextLine());

		//Se pide la probabilidad de la lluvia entre 0 y 100, se mide en %.
		do{
			System.out.println("Introduce un número entre 0 y 100 para la probabilidad de la lluvia:");
			lluvia = Integer.parseInt(lector.nextLine());
			validado = lluvia >= 0 && lluvia <= 100;
			if(!validado){
				System.out.println("El número introducido no es válido, vuelve a introducir un número: [0-100]");
			}
		}while(!validado);

		//Se pide el índice de la radiación ultraviolaeta (UVI):
		System.out.println("Introduce un número para el índice de la radiacón ultravioleta:");
		radiacionUltravioleta = Integer.parseInt(lector.nextLine());

		System.out.printf("%-33s\n", titulo);
	}
}
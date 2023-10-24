import java.util.Scanner;

public class Ejercicio9{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		String titulo = "** DATOS ESTACIÓN METEOROLOGICA **";
		String ciudad = "";
		double temperatura, presionAtmosferica; 
		int dia, mes, anyo, hora, minutos, segundos, velocidadViento, lluvia, radiacionUltravioleta;
		boolean validado;
		final int ANCHO_COLUMNA = 30;

		//Se pide el nombre de la ciudad:
		System.out.println("Bienvenido a la Estación Meteorológica");
		System.out.println("Introduce el nombre de una ciudad:");
		ciudad = lector.nextLine();

		//Se pide la fecha, validando los días, meses, años y se válidan.
		do{
			System.out.println("Introduce una fecha, primero los días:");
			dia = Integer.parseInt(lector.nextLine());
			validado = dia >= 1 && dia <= 31;
			if (!validado){
				System.out.println("El día no es válido, vuelve a introducir un día válido: [1-31 días]");
			}
		}while(!validado);
		
		do{
			System.out.println("Introduce el mes:");
			mes = Integer.parseInt(lector.nextLine());
			validado = mes >= 1 && mes <= 12;
			if(!validado){
				System.out.println("El mes no es válido, vuelve a introducir un mes válido: [1-12 meses]");
			}
		}while(!validado);
		
		do{
			System.out.println("Introduce el año:");
			anyo = Integer.parseInt(lector.nextLine());
			validado = anyo >= 0 && anyo <= 2023;
			if (!validado){
				System.out.println("El año no es válido, vuelve a introducir un año válido: [0 - 2023 años]");
			}
		}while(!validado);

		//Se pide la hora, validando las horas, minutos, segundos y se válidan.

		do{
			System.out.println("Introduce la hora:");
			hora = Integer.parseInt(lector.nextLine());
			validado = hora >= 0 && hora <= 23;
			if (!validado){
				System.out.println("La hora no es válida, vuelve a introducir una hora válida: [0-23 horas]");
			}
		}while(!validado);
		
		do{
			System.out.println("Introduce los minutos:");
			minutos = Integer.parseInt(lector.nextLine());
			validado = minutos >= 0 && minutos <= 59;
			if(!validado){
				System.out.println("Los minutos no son válidos, vuelve a introducir unos minutos válidos: [0-59 minutos]");
			}
		}while(!validado);
		
		do{
			System.out.println("Introduce los segundos:");
			segundos = Integer.parseInt(lector.nextLine());
			validado = segundos >= 0 && segundos <= 59;
			if (!validado){
				System.out.println("Los segundos no son válidos, vuelve a introducir unos segundos válidos: [0 - 59 segundos]");
			}
		}while(!validado);
		
	
		//Se pide la velocidad del viento en km/h.

		do{
			System.out.println("Introduce la velocidad del viento en km/h:");
			velocidadViento = Integer.parseInt(lector.nextLine());
			validado = velocidadViento >= 0 && velocidadViento <= 500;
			if(!validado){
				System.out.println("La velocidad del viento no es válida, vuelve a introducir una cifra válida: [0-500km/h]");
			}
		}while(!validado);
			
		//Se pide la temperatura, se mide en Cº:
		System.out.println("Introduce un número para la temperatura:");
		temperatura = Double.parseDouble(lector.nextLine());

		//Se pide la presion atmósferica, se mide en hPa.

		do{
			System.out.println("Introduce la presión atmósferica");
			presionAtmosferica = Double.parseDouble(lector.nextLine());
			validado = presionAtmosferica >= 0 && presionAtmosferica <= 1100;
			if(!validado){
				System.out.println("La presión atmósferica no es válida, vuelve a introducir una cifra válida. [0-1100hPA]");
			}
		}while(!validado);

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

		//SE IMPRIMEN LOS RESULTADOS: 

		//FALTA AJUSTAR LAS POSICIONES DE LOS RESULTADOS.	
		
		System.out.printf("\u001b[44m%s\n", titulo);
		System.out.printf("%" + ANCHO_COLUMNA + "s%s Ciudad:\n", ciudad); //EJEMPLO
		System.out.printf("Fecha:%16s%02d:%02d:%04d\u001B[0m\n","", dia, mes, anyo);
		System.out.printf("Hora de la mesura:%16s%02d:%02d:%02d\u001B[0m\n", "", hora, minutos, segundos);

		//CONDICION VELOCIDAD VIENTO
		if(velocidadViento < 30){
			System.out.printf("Velocidad viento:\u001B[32m%13d km/h\u001B[0m\n", velocidadViento );
		} else if(velocidadViento >= 30 && velocidadViento <= 60){
			System.out.printf("Velocidad viento:\u001B[33m%13d km/h\u001B[0m\n", velocidadViento );
		} else {
			System.out.printf("Velocidad viento:\u001B[31m%13d km/h\u001B[0m\n", velocidadViento );
		}

		//CONDICION TEMPERATURA
		if(temperatura < 22){
			System.out.printf("Temperatura:\u001B[34m%16.2f Cº\u001B[0m\n", temperatura);
		} else if(temperatura >= 22 && temperatura < 27){
			System.out.printf("Temperatura:\u001B[32m%16.2f Cº\u001B[0m\n", temperatura);
		} else if(temperatura >= 27 && temperatura <= 35){
			System.out.printf("Temperatura:\u001B[33m%16.2f Cº\u001B[0m\n", temperatura);
		} else {
			System.out.printf("Temperatura:\u001B[31m%16.2f Cº\u001B[0m\n", temperatura);
		}
		
		System.out.printf("Presión atmosférica:%11.1f hPa\n", presionAtmosferica);

		//CONDICION PROBABILIDAD DE LLUVIA
		if(lluvia < 35){
		System.out.printf("Probabilidad lluvia:\u001B[32m%7d\n", lluvia);	
		} else if (lluvia >= 35 && lluvia <= 70){
			System.out.printf("Probabilidad lluvia:\u001B[33m%7d\u001B[0m\n", lluvia);	
		} else {
			System.out.printf("Probabilidad lluvia:\u001B[31m%7d\u001B[0m\n", lluvia);
		}
		
		//CONDICION RADIACION ULTRAVIOLETA
		if(radiacionUltravioleta <= 2){
			System.out.printf("UVI:\u001b[32m%12d\u001B[0m", radiacionUltravioleta);
		} else if (radiacionUltravioleta >= 3 && radiacionUltravioleta <= 5){
			System.out.printf("UVI:\u001b[34m%12d\u001B[0m", radiacionUltravioleta);
		} else if (radiacionUltravioleta >= 6 && radiacionUltravioleta <= 7){
			System.out.printf("UVI:\u001b[33m%12d\u001B[0m", radiacionUltravioleta);
		} else if (radiacionUltravioleta >= 8 && radiacionUltravioleta <= 10){
			System.out.printf("UVI:\u001b[31m%12d\u001B[0m", radiacionUltravioleta);
		} else {
			System.out.printf("UVI:\u001b[35m%12d\u001B[0m", radiacionUltravioleta);
		}
		//RESET FORMATO
		System.out.printf("\u001B[0m");
		
		//Se cierra el Scanner.
		lector.close();
	}
}































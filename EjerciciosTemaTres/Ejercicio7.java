import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		//Variables.
		Scanner lector = new Scanner(System.in);
		int cuotaBase = 500;
		int edad;
		int resultadoDescuento = 0;
		int precioFinal = 0;
		char confirmacionSocio = ' ';
		boolean socio = false;
		
		//Pedimos los datos necesarios.
		System.out.println("¿Cuántos años tienes?");
		edad = Integer.parseInt(lector.nextLine());

		//Condición para saber si el usuario es mayor o menor y si es socio o no (o los padres).
		if (edad > 17){
			System.out.println("Eres mayor de edad");
			System.out.println("¿Eres socio/a del Club de Golf?");
			System.out.println("Contesta con Sí o No");
			confirmacionSocio = lector.next().charAt(0);
		} else {
			System.out.println("No eres mayor de edad, ¿tus padres son socios?");
			System.out.println("Contesta con Sí o No");
			confirmacionSocio = lector.next().charAt(0);
		}
		
		//Condición para comprobar el caracter introducido y si el usuario es socio o no.
		if (confirmacionSocio == 's' || confirmacionSocio == 'S'){
			socio = true;
		} 
		else {
			socio = false;
		}
		
		//Condiciones para comprobar si la edad es la que toca y si son socios o no para aplicar el descuento.
		if (edad >= 65 && socio == true){
			resultadoDescuento = cuotaBase * 50 / 100;
			precioFinal = cuotaBase - resultadoDescuento;
			System.out.println("El precio para mayores de 65 años y socios es: " + precioFinal + " euros.");
		} else if (edad < 18 && socio == true){
			resultadoDescuento = cuotaBase * 35 / 100;
			precioFinal = cuotaBase - resultadoDescuento;
			System.out.println("El precio para menores de edad y socios es: " + precioFinal + " euros.");
		} else if (edad < 18 && socio == false){
			resultadoDescuento = cuotaBase * 25 / 100;
			precioFinal = cuotaBase - resultadoDescuento;
			System.out.println("El precio para menores de edad y no socios es: " + precioFinal + " euros.");
		} else {
			System.out.println("Eres mayor que 18 años y menor que 65 años, no cumples los requisitos para un descuento.");
		}
		lector.close();
	}
}
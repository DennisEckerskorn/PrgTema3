import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		//Variables.
		Scanner lector = new Scanner(System.in);
		int cuotaBase = 500;
		int edad;
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
		

		
	}
}
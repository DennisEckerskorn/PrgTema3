import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		int edad;
		//Se pide el valor y se guarda en edad.
		System.out.println("¿Cuántos años tienes?");
		edad = Integer.parseInt(lector.nextLine());
		//Condición para saber si es mayor o menor.
		if (edad >= 18){
			System.out.println("Eres mayor de edad");
		}else{
			System.out.println("Eres menor de edad");
		}
		//Cerramos el Scanner.
		lector.close();
	}
}
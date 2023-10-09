import java.util.Scanner;

public class Ejercicio7{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		double numeroBase; //(a)
		int exponente; //(b)
		double resultado = 1;
		

		System.out.println("Ingresa un número real cómo número base");
		numeroBase = Float.parseFloat(lector.nextLine());

		System.out.println("Ingresa el exponente para calcular la potencia.");
		exponente = Integer.parseInt(lector.nextLine());
		
		for(int i = 0; i < exponente; i++){
			//Se calcula la potencia con el for, repitiendo el numero a multiplicar. Por alguna razón no me deja calcular el resultado negativo apropiado ni añadir el signo negativo en la operación. 
			//Falta corregir y acabar.
			resultado = (numeroBase * resultado);
			if (exponente < 0){
				resultado = 1/(numeroBase * resultado);
			}
		}
		
		System.out.println(numeroBase + " elevado a " + exponente + " es igual a " + resultado);

		lector.close();
	}
}
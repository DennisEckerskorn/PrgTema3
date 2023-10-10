import java.util.Scanner;

public class Ejercicio7{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		double numeroBase; //(a)
		int exponente; //(b)
		double resultado = 1;
		boolean negativo = true;
		boolean positivo = false;
		
		System.out.println("Ingresa un número real cómo número base");
		numeroBase = Double.parseDouble(lector.nextLine());

		System.out.println("Ingresa el exponente para calcular la potencia.");
		exponente = Integer.parseInt(lector.nextLine());

		if(exponente < 0){
			negativo = true;
		} else {
			positivo = false;
		}
		
		for(int i = 1; i <= exponente; i++){
			resultado = resultado * numeroBase;	
		}
		
		if(negativo){
			resultado = 1 / resultado;
		}
		
		System.out.println(numeroBase + " elevado a " + exponente + " es igual a " + resultado);

		lector.close();
	}
}
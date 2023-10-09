import java.util.Scanner;
public class Ejercicio8{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		//Variables.
		int numeroUsuario;
		double factorial = 1; //0!=1 por eso el factorial por defecto vale 1.
		//Entrada de datos.
		System.out.println("Ingresa un número para calcular el factorial.");
		numeroUsuario = Integer.parseInt(lector.nextLine());
		//El factorial se calcula multiplicando todos los números desde 1 hasta el indicado. (Ejemplo 4!=4*3*2*1).
		for (int i = 1; i<=numeroUsuario; i++){
			factorial = factorial * i;
		}
		//Resultado.
		System.out.println(numeroUsuario+"! = " + factorial);
		//Cerramos el Scanner.
		lector.close();
	}
}
import java.util.Scanner;
public class Ejercicio6{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		int numeroMultiplicar;
		int resultado = 0;
		//Se pide el número a multiplicar por consola(teclado).
		System.out.println("¿Qué tabla de multiplicar te gustaría ver? 1 - 10");
		numeroMultiplicar = Integer.parseInt(lector.nextLine());
		//Validamos la entrada del valor y si es correcto entrará en el bucle para sacar la tabla de multiplicar de este número.
		if (numeroMultiplicar <= 10 && numeroMultiplicar > 0){
			for(int i = 1; i<=10; i++){
				resultado = numeroMultiplicar * i;
				System.out.println(numeroMultiplicar + " * " + i + " = " + resultado);
			}
		} else {
			System.out.println("El número no es válido, solo se aceptan números entre el 1 y el 10");
		}
		
		lector.close(); //Cerramos el Scanner.
	}
}
import java.util.Scanner;
public class Ejercicio10{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		int numUsuario;
		int suma = 0;
		//Bucle do while, pedimos numeros mientras el numero no es 0. Cada iteracion suma otro numero.
		do {
			System.out.println("Ingresa un número");
			numUsuario = Integer.parseInt(lector.nextLine());
			suma = suma + numUsuario;
		}while(numUsuario != 0);
		//Mostramos el resultado.
		System.out.println("La suma de los numeros ingresados es: " + suma);
		
		lector.close();
	}
}
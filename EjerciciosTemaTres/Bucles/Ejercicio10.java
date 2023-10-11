import java.util.Scanner;
public class Ejercicio10{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		double numUsuario;
		double suma = 0;
		//Bucle do while, pedimos numeros mientras el numero no es 0. Cada iteracion suma otro numero.
		do {
			System.out.println("Ingresa un número");
			numUsuario = Double.parseDouble(lector.nextLine());
			suma = suma + numUsuario;
		}while(numUsuario != 0);
		//Se muestra el resultado.
		System.out.println("La suma de los numeros ingresados es: " + suma);
		//Se cierra el Scanner.
		lector.close();
	}
}
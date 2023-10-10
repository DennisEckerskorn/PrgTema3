import java.util.Scanner;
public class Ejercicio11{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		int suma = 0;
		double media = 0;
		//Pedimos números mientras el número es mayor a -1.
		do{
			System.out.println("Introduce un número");
			numero = Integer.parseInt(lector.nextLine());
			suma = suma + numero;
			contador = contador + 1;
		}while(numero > -1);
		//Se calcula la media.
		media = suma / contador;
		//Se imprime el resultado.
		System.out.println("La media de los números ingresados es: " + media);
		
		lector.close();
	}
}
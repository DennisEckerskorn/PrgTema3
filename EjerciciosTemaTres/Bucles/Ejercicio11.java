/import java.util.Scanner;
public class Ejercicio11{
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);
		double numero = 0;
		int contador = 0;
		double suma = 0;
		double media = 0;
		//Pedimos números mientras el número es mayor a -1.
		do{
			System.out.println("Introduce un número");
			numero = Double.parseDouble(lector.nextLine());
			if (numero >= 0){
				suma = suma + numero;
				contador = contador + 1;
			}
			
		}while(numero >= 0);
		//Se calcula la media. Si contador es 0 media es igual 0.
		//sino media es igual a suma / contador.
		//if(contador = 0)
		//	media = 0;
		//else
		//	media = suma / contador.
		media = contador == 0 ? 0 : suma / contador;
		//Se imprime el resultado.
		System.out.println("La media de los números ingresados es: " + media);
		//Se cierra el Scanner.
		lector.close();
	}
}
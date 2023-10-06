import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args){
		//Variables.
		Scanner lector = new Scanner(System.in);	
		double num1, num2;
		//Se pide el valor por pantalla y se guarda en la variable.
		System.out.println("Introduzca un número con Decimales");
		num1 = Double.parseDouble(lector.nextLine());

		System.out.println("Introduzca otro número con Decimales");
		num2 = Double.parseDouble(lector.nextLine());
		//Condicion, para ordenaro el numero de menor a mayor.
		if (num1<num2){
			System.out.println(num1 + " " + num2);
		}else{
			System.out.println(num2 + " " + num1);
		}
		//Cerramos el Scanner.
		lector.close();
	}
}
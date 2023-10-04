import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args){
		//Se declaran las variables.
		Scanner lector = new Scanner(System.in);
		int num1, num2;
		//Pedimos el primer número al usuario y los guardamos en num1.
		System.out.println("Introduzca el primer número");
		num1 = Integer.parseInt(lector.nextLine());
		//Pedimos el segundo número al usuario y los guardamos en num2.
		System.out.println("Introduzca el segundo número");
		num2 = Integer.parseInt(lector.nextLine());
		//Condición si es mayor, menor o igual.
		if (num1 > num2){
			System.out.println("El número es mayor");
		}else if(num1 < num2){
			System.out.println("El número es menor");
		}else{
			System.out.println("El número es igual");
		}
		//Cerramos el Scanner.
		lector.close();
	}
}
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args){
		//Se declaran las variables.
		Scanner lector = new Scanner(System.in);
		int num1;
		//Se pide el número por teclado al usuario.
		System.out.println("Ingresa un número");
		//Leemos el número introducido.
		num1 = Integer.parseInt(lector.nextLine());
		//Decidimos con una condición if si el número es divisible entre 2.
		if(num1%2==0){
			System.out.println("El número es par");
		}else{
			System.out.println("El número es impar");
		}
		//Cerramos el Scanner.
		lector.close();
	}
}
import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int suma = 0;
		int num1, num2, multiplicacion;
		System.out.println("Dime un numero");
		num1 = Integer.parseInt(lector.nextLine());
		System.out.println("Dime otro numero");
		num2 = Integer.parseInt(lector.nextLine());

		for(int i = 1; i<=num1; i++ ){
			suma = suma + num2;
		}
		System.out.println(suma);
	}	
}
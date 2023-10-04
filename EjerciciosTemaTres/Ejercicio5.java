import java.util.Scanner;
public class Ejercicio5{
	public static void main(String[] args){
		//Variables
		Scanner lector = new Scanner(System.in);
		int numeroUsuario;
		//Se piden datos.
		System.out.println("Dime la nota (entre 1 y 10) ");
		numeroUsuario = Integer.parseInt(lector.nextLine());
		//Switch para elegir el caso apropiado al número.
		switch(numeroUsuario) {
			case 0: case 1: case 2: case 3: case 4:
				System.out.println("INSUFICIENTE");
				break;
			case 5: System.out.println("SUFICIENTE");
				break;
			case 6: System.out.println("BIEN");
				break;
			case 7: case 8: 
				System.out.println("NOTABLE");
				break;
			case 9: case 10:
				System.out.println("SOBRESALIENTE");
				break;
			default:
				System.out.println("ERROR");
		}
			lector.close();
	}
}
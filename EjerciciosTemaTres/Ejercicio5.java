import java.util.Scanner;
public class Ejercicio5{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		int numeroUsuario;

		System.out.println("Dime la nota (entre 1 y 10) ");
		numeroUsuario = Integer.parseInt(lector.nextLine());

		switch(numeroUsuario) {
			case 0: System.out.println("INSUFICIENTE");
				break;
			case 1: System.out.println("INSUFICIENTE");
				break;
			case 2: System.out.println("INSUFICIENTE");
				break;
			case 3: System.out.println("INSUFICIENTE");
				break;
			case 4: System.out.println("INSUFICIENTE");
				break;
			case 5: System.out.println("SUFICIENTE");
				break;
			case 6: System.out.println("BIEN");
				break;
			case 7: System.out.println("NOTABLE");
				break;
			case 8: System.out.println("NOTABLE");
				break;
			case 9: System.out.println("SOBRESALIENTE");
				break;
			case 10: System.out.println("SOBRESALIENTE");
				break;
			default:
				System.out.println("ERROR");
		}		
	}
}
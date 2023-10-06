import java.util.Scanner;
public class Ejercicio5{
	public static void main(String[] args){
		//Variables
		Scanner lector = new Scanner(System.in);
		float calificacion;
		int nota;
		//Se piden datos.
		System.out.println("Dime la nota (entre 1 y 10) ");
		calificacion = Float.parseFloat(lector.nextLine());
		//Switch para elegir el caso apropiado al número. Convertimos el float a un Int para quitar las decimales (Casting).
		nota = (int) calificacion;
		switch(nota) {
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
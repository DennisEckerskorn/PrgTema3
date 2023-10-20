public class Ejercicio3{
	public static void main(String[] args){
		String numeros = ""; //Se almacenarán numeros dentro del bucle segun iteración.
		for (int i = 1; i <= 9; i++){
			numeros += i;
			System.out.printf("%9s\n", numeros);
		}
	}
}

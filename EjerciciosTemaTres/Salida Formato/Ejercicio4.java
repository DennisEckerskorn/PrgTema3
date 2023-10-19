public class Ejercicio4{
	public static void main(String[] args){
		String numeros = "";
		for (int i = 1; i <= 9; i++){
			numeros += i;
			System.out.printf("%-9s\n", numeros);
		}
	}
}
public class Ejercicio7{
	public static void main(String[] args){
		String numerosIzquierda = "";
		String numerosDerecha = "";
		
		for (int i = 1; i <= 9; i++){
			numerosIzquierda += i;
			for (int j = 0; j < 10; j++){
				numerosDerecha += j;
				System.out.printf("%s%s\n", numerosIzquierda, numerosDerecha);
			}
		}
	}
}
public class Ejercicio6{
	public static void main(String[] args){
		//Strings que almacenarán los numeros que genera cada iteración del bucle.
		String numerosIzquierda = "";
		String numerosDerecha = "";
		
		for (int i = 1; i <= 9; i++){
			numerosIzquierda += i;
			numerosDerecha += i;
			
			System.out.printf("%9s%s\n", numerosIzquierda, numerosDerecha);	
		}
	}
}
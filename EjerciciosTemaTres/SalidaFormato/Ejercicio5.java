public class Ejercicio5{
	public static void main(String[] args){
		//Se crea una variable que almacenara numeros cada iteración sumará un numero. 
		String numeros = "";
		for (int i = 1; i<=9; i++){ 
			numeros += i;
			//Se da formato al string desplazandolo 9 posiciones. i - 1 añadirá los numeros del color de 1 a 8 y calcula el resto que da 0, vuelve a empezar.
			System.out.printf("\u001B[3" + (i - 1)%8 + "m %9s \u001B[0m\n", numeros); 
		}
	}
}
	

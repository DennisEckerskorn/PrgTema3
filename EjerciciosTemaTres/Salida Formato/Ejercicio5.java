public class Ejercicio5{
	public static void main(String[] args){
		//Se crea una variable que almacenara numeros cada iteración sumará un numero. 
		String numeros = " ";
		for (int i = 1; i<=9; i++){ 
			numeros += i;
			//Se da formato al string desplazandolo 10 posiciones. cada iteracion 29 valdrá 1 más.
			System.out.printf("\u001B[" + (29 + i) + "m %10s \u001B[0m\n", numeros); 
		}
	}
}
	

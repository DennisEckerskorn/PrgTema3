public class Ejercicio4{
	public static void main(String[] args){
		for (int i = 1; i <= 9; i++){               	//Genera las filas de 1 a 9. 
			for (int j = 1; j <= i; j++){		//Genera las columnas de 1 a 9.
				System.out.printf("%d", j);	//Se imprime j como numero entero.
			}
		System.out.println();				//Salto de línea despues de cada iteración de j.
		}
	}
}
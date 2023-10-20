public class Ejercicio7{
	public static void main(String[] args){
		String numerosI = "";
		String numerosInvertidos = "";
		
		//Se recorre el bucle del 1 al 9.		
		for (int i = 1; i <= 9; i++){
			numerosI += i;
			numerosInvertidos = numerosI;
			//Recorre los numeros de 1 al 9 y los concatena al reves.
			for (int j = numerosI.length() - 1; j >= 0; j--){
				numerosInvertidos += numerosInvertidos.charAt(j);	
			} 
			System.out.printf("\u001B[7m%9s%-9s\u001B[0m\n", numerosI, numerosInvertidos);
		}	
	}
}
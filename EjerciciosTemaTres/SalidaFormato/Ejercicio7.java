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
			int pos = 9+i; //Se establece el ancho del campo de impresión.
			System.out.printf("%" + pos + "s\n", numerosInvertidos);
		}	
	}
}
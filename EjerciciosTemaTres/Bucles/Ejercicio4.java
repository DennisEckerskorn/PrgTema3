public class Ejercicio4 {
	public static void main(String[] args){
		int contadorPar = 0;
		int contadorImpar = 0;
		
		for (int i = 1; i<=100; i++){
			if(i%2!=0){
				System.out.println(i + " es impar");
				contadorImpar = contadorImpar + 1;
			} else {
				contadorPar = contadorPar + 1;
				System.out.println(i + " es par");
			}
		}
		System.out.println("Hay " + contadorImpar + " números impares.");
	}
}
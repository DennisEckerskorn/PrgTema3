public class Ejercicio5 {
	public static void main(String[] args){
		//Variables
		int contadorPar = 0;
		int contadorImpar = 0;
		int contadorMultiplo = 0;
		int sumaPar = 0;
		int sumaImpar = 0;
		int sumaMultiplo = 0;
		//Bucle for que empieza en 1 y acaba en 100, incrementando 1 cada iteración. Se sacan numeros pares, impares y múltiplos de 5 con su suma.
		for (int i = 1; i<=100; i++){
			//Número Par e Impar.
			if (i%2==0){
				contadorPar = contadorPar + 1;
				sumaPar = sumaPar + i;
				System.out.println(i + " es par.");
			}else{
				contadorImpar = contadorImpar + 1;
				sumaImpar = sumaImpar + i;
				System.out.println(i + " es impar");
			}
			//Múltiplo de 5
			if (i%5==0) {
				contadorMultiplo = contadorMultiplo + 1;
				sumaMultiplo = sumaMultiplo + i;
				System.out.println(i + " es múltiplo de 5");
			}
		}
		//Se imprimen los resultados.
		System.out.println("Hay " + contadorPar + " números pares y " + contadorImpar + " números impares.");
		System.out.println("Hay " + contadorMultiplo + " números que son múltiplos de 5." );
		System.out.println("La suma de los números pares es: " + sumaPar );
		System.out.println("La suma de los números impares es: " + sumaImpar);
		System.out.println("La suma de los números múltiplos es: " + sumaMultiplo);
	}
}
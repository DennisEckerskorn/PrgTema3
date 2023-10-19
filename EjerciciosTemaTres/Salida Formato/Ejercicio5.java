public class Ejercicio5 {
    public static void main(String[] args) {
	
        for (int i = 1; i <= 9; i++) { 							// i crea las filas de 1 - 9.
        	for (int j = 1; j <= 9; j++) {						// j crea las columnas de 1 - 9.
                	if (j <= 9 - i) {						// Si j es menor o igual a 9 - i, se imprime un espacio en blanco para el desplazamiento de los numeros.  
                		System.out.print(" ");
                	} else {
				int color = 30 + i - 1; 				//El numero 30 va junto a i, aumenta cuando aumenta i.
				if(color > 37){						//Si el color es mayor que 37 se reinicia la variable para volver a empezar desde 30.
				 color = 30;
				}
                		System.out.printf("\u001B[%dm%d",color, j - (9 - i));	// Usamos %d para imprimir el número entero y se usa 9-1 para imprimir los desplazamientos vacios, Ejemplo: i es 1, se imprimen 8 espacios.
                	}
            	}
        	System.out.print("\u001B[0m\n"); 					// Moverse a la siguiente línea y restablecer el formato de colores, si no la consola se queda en otro color.
        }
    }
}
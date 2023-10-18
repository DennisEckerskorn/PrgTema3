public class Ejercicio3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) { 					// i crea las filas de 1 - 9.
            for (int j = 1; j <= 9; j++) {				// j crea las columnas de 1 - 9.
                if (j <= 9 - i) {					// Si j es menor o igual a 9 - i, se imprime un espacio en blanco para el desplazamiento de los numeros.  
                    System.out.print(" ");
                } else {
                    System.out.printf("%d", j - (9 - i));		// Usamos %d para imprimir el número entero y se usa 9-1 para imprimir los desplazamientos vacios, Ejemplo: i es 1, se imprimen 8 espacios.
                }
            }
            System.out.println(); // Moverse a la siguiente línea
        }
    }
}

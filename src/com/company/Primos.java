package com.company;

public class Primos {
    /**
     * @param max El integrer es determinado en la clase main, que es escrita por el usuario
     * @return Devuelve los numeros primos
     */
    // Generar números primos de 1 a max
    public static int[] generarPrimos(int max) {
        int i, j;
        Primos primo = new Primos();
        if (max >= 2) {
            // Declaraciones
            int dim = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[dim];
            // Inicializar el array
            esPrimo=primo.inicializar(dim,esPrimo);

            // Eliminar el 0 y el 1, que no son primos
            esPrimo[0] = esPrimo[1] = false;

            // Criba
            esPrimo=primo.criba(dim,esPrimo);

            // ¿Cuántos primos hay?
            int cuenta = primo.cuantosPrimos(dim, esPrimo);

            // Rellenar el vector de números primos
            return primo.rellenaPrimos(cuenta,dim,esPrimo);

        } else { // max < 2
            return new int[0];
            // Vector vacío
        }

    }

    /**
     * @param dim es el integrer que se usa para determinar el tamaño del array
     * @param esPrimo es el array que almacena si los numeros usados son primos
     * @return
     */
    public int cuantosPrimos(int dim, boolean[] esPrimo) {
        int cuenta = 0;
        for (int i = 0; i < dim; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }
        return cuenta;
    }

    /**
     * @param cuenta Este metodo rellena los primos que hay en un array
     */
    public int[] rellenaPrimos(int cuenta, int dim, boolean[] esPrimo) {
        int[] primos = new int[cuenta];
        for (int i = 0, j = 0; i < dim; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }

    /**
     * Este metodo calcula que numeros no son primos
     * @return Devuelve los resultados falsos
     */
    public boolean[] criba(int dim, boolean[] esPrimo){
        for (int i = 2; i < Math.sqrt(dim) + 1; i++) {
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (int j = 2 * i; j < dim; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
        return esPrimo;
    }

    /**
     * Este metodo inicializa el Array
     * @return devuelve todos los resultados de esPrimo en verdaderos
     */
    public boolean[] inicializar(int dim, boolean[] esPrimo){
        for (int i = 0; i < dim; i++) {
            esPrimo[i] = true;
        }
        return esPrimo;
    }
}

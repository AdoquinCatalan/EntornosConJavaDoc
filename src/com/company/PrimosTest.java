package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {

    Primos primos = new Primos();
    int[] TestPrimos = {0,1,2,3,100};
    int numDePrimos = 3;
    boolean[] esPrimo = {true,false,true,true,false};
    boolean[] paraInicializar = {true,true,true,true,true};
    @Test
    void generarPrimos() {
      TestPrimos = Primos.generarPrimos(TestPrimos.length);
      for (int i = 0;i<TestPrimos.length;i++){
      }
    }

    @Test
    void cuantosPrimos() {
        int cuenta = 0;
        for (int i = 0; i < esPrimo.length; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }
        assertEquals(numDePrimos,cuenta);
    }

    @Test
    void rellenaPrimos() {
        int[] primos = new int [numDePrimos];
        for (int i = 0, j = 0; i < primos.length; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;

            }
        }
        assertEquals(numDePrimos,primos.length);
    }

    @Test
    void criba() {
    }

    @Test
    void inicializar() {
        boolean[] esPrimo = new boolean[TestPrimos.length];
        for (int i = 0; i < TestPrimos.length; i++) {
            esPrimo[i] = true;
        }
        assertArrayEquals(paraInicializar,esPrimo);
    }
}
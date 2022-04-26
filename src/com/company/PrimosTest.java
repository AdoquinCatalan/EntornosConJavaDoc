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
    void generarPrimosDe0() {
        int []array=new int[]{};
        int[] resultado =Primos.generarPrimos(0);
        assertArrayEquals(array,resultado);
    }

    @Test
    void generarPrimosDe1() {
        int []array=new int[]{};
        int[] resultado =Primos.generarPrimos(1);
        assertArrayEquals(array,resultado);
    }

    @Test
    void generarPrimosDe2() {
        int []array=new int[]{2};
        int[] resultado =Primos.generarPrimos(2);
        assertArrayEquals(array,resultado);
    }

    @Test
    void generarPrimosDe3() {
        int []array=new int[]{2,3};
        int[] resultado =Primos.generarPrimos(3);
        assertArrayEquals(array,resultado);
    }

    @Test
    void generarPrimosDe100() {
        int []array=new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] resultado =Primos.generarPrimos(100);
        assertArrayEquals(array,resultado);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CavernaCristalesTest {

    public CavernaCristalesTest() {
    }

    @Test
    public void testGravedad1() {
        System.out.println("aplicarGravedad Test 1");
        int[][] matrix = {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {1, 0, 1, 1},
                {0, 1, 0, 1}
        };
        int[][] result = CavernaCristales.aplicarGravedad(matrix);
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 1},
                {1, 1, 1, 1}
        };
        for (int i = 0; i < result.length; i++) {
            assertArrayEquals("Fila " + i + " no coincide", expected[i], result[i]);
        }
    }

    @Test
    public void testGravedad2() {
        System.out.println("aplicarGravedad Test 2");
        int[][] matrix = {
                {0, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 0, 1, 0},
                {1, 0, 1, 1}
        };
        int[][] result = CavernaCristales.aplicarGravedad(matrix);
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        for (int i = 0; i < result.length; i++) {
            assertArrayEquals("Fila " + i + " no coincide", expected[i], result[i]);
        }
    }

    @Test
    public void testGravedad3() {
        System.out.println("aplicarGravedad Test 3");
        int[][] matrix = {
                {1, 0, 1, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {1, 1, 1, 0}
        };
        int[][] result = CavernaCristales.aplicarGravedad(matrix);
        int[][] expected = {
                {0, 0, 0, 0},
                {1, 0, 0, 0},
                {1, 0, 1, 0},
                {1, 1, 1, 1}
        };
        for (int i = 0; i < result.length; i++) {
            assertArrayEquals("Fila " + i + " no coincide", expected[i], result[i]);
        }
    }

    @Test
    public void testGravedad4() {
        System.out.println("aplicarGravedad Test 4");
        int[][] matrix = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 1}
        };
        int[][] result = CavernaCristales.aplicarGravedad(matrix);
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 1, 1}
        };
        for (int i = 0; i < result.length; i++) {
            assertArrayEquals("Fila " + i + " no coincide", expected[i], result[i]);
        }
    }

    @Test
    public void testGravedad5() {
        System.out.println("aplicarGravedad Test 5");
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        int[][] result = CavernaCristales.aplicarGravedad(matrix);
        int[][] expected = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        for (int i = 0; i < result.length; i++) {
            assertArrayEquals("Fila " + i + " no coincide", expected[i], result[i]);
        }
    }
}

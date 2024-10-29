/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

public class CavernaCristales {

    public static int[][] aplicarGravedad(int[][] caverna) {
        int filas = caverna.length;
        int columnas = caverna[0].length;

        for (int col = 0; col < columnas; col++) {
            int fondo = filas - 1; // Posición donde el próximo '1' debe caer

            for (int fila = filas - 1; fila >= 0; fila--) {
                if (caverna[fila][col] == 1) {
                    caverna[fila][col] = 0;     // Elimina el cristal de su posición actual
                    caverna[fondo][col] = 1;    // Coloca el cristal en el fondo o en la posición disponible más cercana
                    fondo--;                    // Mueve el fondo una posición hacia arriba
                }
            }
        }

        return caverna;
    }

    public static void imprimirCaverna(int[][] caverna) {
        for (int[] fila : caverna) {
            for (int celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] caverna = {
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {1, 0, 1, 1},
                {0, 1, 0, 1}
        };

        System.out.println("Caverna antes de aplicar la gravedad:");
        imprimirCaverna(caverna);

        caverna = aplicarGravedad(caverna);

        System.out.println("Caverna después de aplicar la gravedad:");
        imprimirCaverna(caverna);
    }

}

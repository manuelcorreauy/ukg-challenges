/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

public class CavernaCristales {

    public static int[][] aplicarGravedad(int[][] caverna) {
        // TODO: Implementar la logica de gravedad aquí.

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
                {0, 0, 0, 1},
                {0, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 0, 1}
        };

        System.out.println("Caverna antes de aplicar la gravedad:");
        imprimirCaverna(caverna);

        caverna = aplicarGravedad(caverna);

        System.out.println("Caverna después de aplicar la gravedad:");
        imprimirCaverna(caverna);
    }

}

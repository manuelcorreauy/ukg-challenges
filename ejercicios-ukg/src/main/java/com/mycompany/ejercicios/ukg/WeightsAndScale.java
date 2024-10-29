/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

import java.util.Arrays;
import java.util.Random;

public class WeightsAndScale {

    public static int weightTimes = 0;

    public static int[] scale(int[] balls) {
        //TODO: Implementar la logica del pesaje
        return null;
    }

    private static WeightResult haveSameWeight(int a, int b) {
        weightTimes++;
        if (a > b) {
            return WeightResult.Left;
        }
        if (b > a) {
            return WeightResult.Right;
        }
        return WeightResult.SameWeight;
    }

    public enum WeightResult {
        SameWeight,
        Right,
        Left
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AllGreaterThanTest {

    public AllGreaterThanTest() {
    }

    @Test
    public void testRepeatOne() {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1};
        boolean areGreater = AllGreaterThan.AllGreaterThan(a, b);
        assertFalse(areGreater);
    }

    @Test
    public void testValid() {
        int[] a = {4, 5, 6};
        int[] b = {1, 2, 3};
        boolean areGreater = AllGreaterThan.AllGreaterThan(a, b);
        assertTrue(areGreater);
    }

    @Test
    public void testValid2() {
        int[] a = {10, 11, 12};
        int[] b = {1, 2, 3, 8, 9, 7, 7};
        boolean areGreater = AllGreaterThan.AllGreaterThan(a, b);
        assertTrue(areGreater);
    }

    @Test
    public void testValid3() {
        int[] a = {10, 11, 12, 10};
        int[] b = {1, 2, 3, 8, 9, 7, 7};
        boolean areGreater = AllGreaterThan.AllGreaterThan(a, b);
        assertTrue(areGreater);
    }

    @Test
    public void testInvalid() {
        int[] a = {10, 11, 12, 10, 9};
        int[] b = {1, 2, 3, 8, 9, 7, 7};
        boolean areGreater = AllGreaterThan.AllGreaterThan(a, b);
        assertFalse(areGreater);
    }

    @Test
    public void testInvalid2() {
        int[] a = {10, 11, 12, 10, 6};
        int[] b = {1, 2, 3, 8, 9, 7, 7};
        boolean areGreater = AllGreaterThan.AllGreaterThan(a, b);
        assertFalse(areGreater);
    }

    @Test
    public void testInvalid3() {
        int[] a = {10, 11, 12, 10, 9, 1};
        int[] b = {1, 2, 3, 8, 9, 7, 7};
        boolean areGreater = AllGreaterThan.AllGreaterThan(a, b);
        assertFalse(areGreater);
    }
}

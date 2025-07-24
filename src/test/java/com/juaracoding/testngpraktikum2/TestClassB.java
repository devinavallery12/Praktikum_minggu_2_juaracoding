package com.juaracoding.testngpraktikum2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassB {

    @Test
    public void testB01() {
        int actual = 1; // Dimulai dr 1
        int expected = 5000; // berakhir sampai 5000
        // PEGGANTI THREAD.SLEEP
        for (int i = 1; i <= expected; i++) { // i dimulai dr 1, akan berjalan terus sampai memenuhi ekspetasi
            actual = i; // sampai actual = nilai i sekarang, berakhir sama dengan target ekpetasinya
        }
        System.out.println("TestClassB - testB01 selesai di thread: " + Thread.currentThread().getId());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testB02() {
        int actual = 1; // Dimulai dr 1
        int expected = 2000; // berakhir sampai 2000
        // PEGGANTI THREAD.SLEEP
        for (int i = 1; i <= expected; i++) { // i dimulai dr 1, akan berjalan terus sampai memenuhi ekspetasi
            actual = i; // sampai actual = nilai i sekarang, berakhir sama dengan target ekpetasinya
        }
        System.out.println("TestClassB - testB02 selesai di thread: " + Thread.currentThread().getId());
        Assert.assertEquals(actual, expected);
    }

}

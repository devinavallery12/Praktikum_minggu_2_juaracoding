package com.juaracoding.testngpraktikum2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassA {

    @Test
    public void testA01() {
        int actual = 1; // Dimulai dr 1
        int expected = 4000; // berakhir sampai 4000
        // PEGGANTI THREAD.SLEEP
        for (int i = 1; i <= expected; i++) { // i dimulai dr 1, akan berjalan terus sampai memenuhi ekspetasi
            actual = i; // sampai actual = nilai i sekarang, berakhir sama dengan target ekpetasinya
        }
        System.out.println("TestClassA - testA01 selesai di thread: " + Thread.currentThread().getId());
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testA02() {
        int actual = 1; // Dimulai dr 1
        int expected = 1000; // berakhir sampai 1000
        // PENGGANTI THREAD.SLEEP
        for (int i = 1; i <= expected; i++) { // i dimulai dr 1, akan berjalan terus sampai memenuhi ekspetasi
            actual = i; // sampai actual = nilai i sekarang, berakhir sama dengan target ekpetasinya
        }
        System.out.println("TestClassA - testA02 selesai di thread: " + Thread.currentThread().getId());
        Assert.assertEquals(actual, expected);
    }

}

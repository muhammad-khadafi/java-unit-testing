package com.apap.unittest.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author muhammad.khadafi
 */
public class IMathTest {

    @Test
    public void testIsqrt() {
        assertEquals(0, IMath.isqrt(0));
        assertEquals(1, IMath.isqrt(1));
        assertEquals(1, IMath.isqrt(2));
        assertEquals(1, IMath.isqrt(3));
        assertEquals(2, IMath.isqrt(4));
        assertEquals(2, IMath.isqrt(7));
        assertEquals(3, IMath.isqrt(9));
        assertEquals(10, IMath.isqrt(100));

    }

}

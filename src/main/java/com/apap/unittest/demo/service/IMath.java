package com.apap.unittest.demo.service;

/**
 * @author muhammad.khadafi
 */
public class IMath {

//    public static int isqrt(int x) {
//
//        int guess = 1;
//
//        while (guess * guess < x) {
//            guess++;
//        }
//
//        return guess;
//    }

    public static int isqrt(int x) {

        if (x <= 1) {
            return x;
        }

        int left = 1;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }

        return result;

    }


}

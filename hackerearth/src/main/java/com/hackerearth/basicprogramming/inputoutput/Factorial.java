package com.hackerearth.basicprogramming.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-factorial/
 */
public class Factorial {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int factorial = 1;
        while (input > 0) {
            factorial *= input;
            input -= 1;
        }
        System.out.println(factorial);
    }
}

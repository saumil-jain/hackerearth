package com.hackerearth.basicprogramming.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/
 */
public class FindProduct {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        String input = br.readLine();
        String[] inputStrings = input.split(" ", size);

        long ans = 1;

        for (String num : inputStrings) {
            ans = (ans * Integer.parseInt(num)) % ((long) Math.pow(10, 9) + 7);
        }

        System.out.println(ans);
    }
}

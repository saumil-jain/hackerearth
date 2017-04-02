package com.hackerearth.basicprogramming.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/
 */
public class CountDivisors {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int l = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        int lower_quo = l / k;
        int upper_quo = r / k;
        int lower_rem = l % k;

        int ans = 0;

        if (lower_rem == 0) {
            ans = upper_quo - lower_quo + 1;
        } else {
            ans = upper_quo - lower_quo;
        }

        System.out.println(ans);
    }
}

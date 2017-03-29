package com.hackerearth.basicprogramming.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/
 */
public class ToggleString {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        for (int i = 0; i < line.length(); i++) {
            int val = line.charAt(i);
            if ((int) line.charAt(i) < 91) {
                System.out.print((char) (val + 32));
            } else {
                System.out.print((char) (val - 32));
            }
        }
    }

}

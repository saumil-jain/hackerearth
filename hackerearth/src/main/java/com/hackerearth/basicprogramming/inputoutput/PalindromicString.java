package com.hackerearth.basicprogramming.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/palindrome-check-2/
 */
public class PalindromicString {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        boolean isPalindrome = true;

        for (int i = 0, j = line.length() - 1; i < line.length() / 2; i++, j--) {
            if (line.charAt(i) != line.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

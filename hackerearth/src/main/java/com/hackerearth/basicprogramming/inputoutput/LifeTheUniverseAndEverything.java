package com.hackerearth.basicprogramming.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/life-the-universe-and-everything/
 */
public class LifeTheUniverseAndEverything {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input != 42)
                System.out.println(input);
            else
                break;
        }
    }
}

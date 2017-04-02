package com.hackerearth.basicprogramming.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/roy-and-profile-picture/
 */
public class RoyAndProfilePicture {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int w = Integer.parseInt(input[0]);
            int h = Integer.parseInt(input[1]);

            if (w < l || h < l) {
                System.out.println("UPLOAD ANOTHER");
            } else if (w != h) {
                System.out.println("CROP IT");
            } else {
                System.out.println("ACCEPTED");
            }
        }
    }
}

package com.loveable.RandonChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
 * <p>
 * Example
 * candles = [4, 3, 4, 2]
 * <p>
 * The maximum height candles are 4 units high. There are 2 of them, so return 2.
 * <p>
 * Function Description
 * <p>
 * Complete the function birthdayCakeCandles in the editor below.
 * <p>
 * birthdayCakeCandles has the following parameter(s):
 * <p>
 * int candles[n]: the candle heights
 * Returns
 * <p>
 * int: the number of candles that are the tallest
 * Input Format
 * <p>
 * The first line contains a single integer, n, the size of candles[].
 * The second line contains n space-separated integers, where each integer  describes the height of candles[i].
 */
public class BirthdayCakeCandles {
    public static void main(String[] args) {

        List<Integer> candles1 = new ArrayList<>(Arrays.asList(4, 3, 4, 2));
        System.out.println(birthdayCakeCandles(candles1));

        int[] candles2 = {3, 2, 1, 3};
        System.out.println(birthdayCakeCandles(candles2));

        List<Integer> candles3 = new ArrayList<>(Arrays.asList(8, 3, 4, 0, 8, 9));
        System.out.println(birthdayCakeCandles(candles3));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        Integer max = Collections.max(candles);
        return Collections.frequency(candles, max);
    }

    public static int birthdayCakeCandles(int[] candles) {
        int maxHeight = 0;
        int count = 0;
        for (int candle : candles) {
            if (candle > maxHeight) {
                maxHeight = candle;
                count = 1;
            } else if (candle == maxHeight) {
                count++;
            }
        }
        return count;
    }
}

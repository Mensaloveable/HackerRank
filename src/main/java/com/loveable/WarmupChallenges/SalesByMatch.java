package com.loveable.WarmupChallenges;

import java.util.*;

/**
 *There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 * <p>
 * Example
 * n = 7
 * ar = [1,2,1,2,1,3,2]
 * <p>
 * There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.
 * <p>
 * Function Description
 * Complete the sockMerchant function in the editor below.
 * sockMerchant has the following parameter(s):
 * int n: the number of socks in the pile
 * int ar[n]: the colors of each sock
 * <p>
 * Returns
 * int: the number of pairs
 * <p>
 * Input Format
 * The first line contains an integer n, the number of socks represented in ar.
 * The second line contains n space-separated integers, ar[i], the colors of the socks in the pile.
 *
 */

public class SalesByMatch {

    public static void main(String[] args) {
        List<Integer> q = new ArrayList<>(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
        int i = sockMerchant(9, q);
        System.out.println(i);

        System.out.println("==========================");

        int i1 = sockMerchant2(9, q);
        System.out.println(i1);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        List<Integer> counts = new ArrayList<>();
        int ans = 0;

        Set<Integer> numSet = new HashSet<>(ar);
        //numSet.addAll(ar);

        for (int num : numSet) {
            int freq = Collections.frequency(ar, num);
            counts.add(freq);
        }
        for (int num : counts) {
            ans += (num / 2);
        }

        return ans;

    }

    public static int sockMerchant(int n, int[] ar) {
        // Create a HashMap to count the number of socks of each color
        Map<Integer, Integer> sockCounts = new HashMap<>();
        for (int sock : ar) {
            sockCounts.put(sock, sockCounts.getOrDefault(sock, 0) + 1);
        }

        // Count the number of pairs of socks
        int numPairs = 0;
        for (int count : sockCounts.values()) {
            numPairs += count / 2;
        }

        return numPairs;
    }

    public static int sockMerchant2(int n, List<Integer> ar) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : ar) {
            Integer val = map.get(num);
            if (val == null) {  //Integer val = map.putIfAbsent(num, 1);
                map.put(num, 1);
            } else {
                map.put(num, val + 1);
            }

            /*Logic inside loop can be replaced with
             * map.merge(num, 1, Integer::sum);
             * */
        }

        int ans = 0;
        for (int num : map.values()) {
            ans += num / 2;
        }
        return ans;
    }
}

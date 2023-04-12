package com.loveable.WarmupChallenges;

/**
 * There is a string, s, of lowercase English letters that is repeated infinitely many times. Given an integer, n,
 * find and print the number of letter a's in the first n letters of the infinite string.
 * <p>
 * Example
 * s = 'abcac'
 * n = 10
 * <p>
 * The substring we consider is abcacabcac, the first 10 characters of the infinite string. There are 4 occurrences of a in the substring.
 * <p>
 * Function Description
 * <p>
 * Complete the repeatedString function in the editor below.
 * <p>
 * repeatedString has the following parameter(s):
 * <p>
 * s: a string to repeat
 * n: the number of characters to consider
 * Returns
 * <p>
 * int: the frequency of a in the substring
 * Input Format
 * <p>
 * The first line contains a single string, s.
 * <p>
 * The second line contains an integer, n.
 */

public class RepeatedStrings {
    public static void main(String[] args) {
        String s = "aba";
        long freq1 = repeatedString(s, 100979879798L);
        long freq2 = repeatedString1(s, 10000000000000000L);
        System.out.println(freq1);
        System.out.println(freq2);
    }

    public static long repeatedString(String s, long n) {
        int len = s.length();
        long numOfAsInS = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'a') {
                numOfAsInS++;
            }
        }
        long repeats = n / len;
        long remainder = n % len;
        long numOfAsInRemainder = 0;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                numOfAsInRemainder++;
            }
        }
        return numOfAsInS * repeats + numOfAsInRemainder;
    }

    public static long repeatedString1(String s, long n) {
        long numOfAsInS = s.chars().filter(ch -> ch == 'a').count();
        long repeats = n / s.length();
        long remainder = n % s.length();
        long numOfAsInRemainder = s.substring(0, (int) remainder)
                .chars().filter(ch -> ch == 'a').count();
        return numOfAsInS * repeats + numOfAsInRemainder;
    }

}

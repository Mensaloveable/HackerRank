package com.loveable.WarmupChallenges;

/**
 * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly "steps" steps, for every step it was noted if it was an uphill, U, or a downhill, U step. Hikes always start and end at sea level, and each step up or down represents a 1 unit change in altitude. We define the following terms:
 * <p>
 * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step-down to sea level.
 * A valley is a sequence of consecutive steps below sea level, starting with a step-down from sea level and ending with a step-up to sea level.
 * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
 * <p>
 * Example
 * steps = 8
 * path = [DDUUUUDD]
 * The hiker first enters a valley 2 units deep. Then they climb out and up onto a mountain 2 units high. Finally, the hiker returns to sea level and ends the hike.
 * <p>
 * Function Description
 * <p>
 * Complete the countingValleys function in the editor below.
 * <p>
 * countingValleys has the following parameter(s):
 * <p>
 * int steps: the number of steps on the hike
 * string path: a string describing the path
 * Returns
 * <p>
 * int: the number of valleys traversed
 * Input Format
 * <p>
 * The first line contains an integer steps, the number of steps in the hike.
 * The second line contains a single string path, of steps characters that describe the path.
 */

public class CountingValleys {
    public static void main(String[] args) {
        int ans = countingValleys(12, "DDUUDDUDUUUD");
        System.out.println(ans);
    }

    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int valleys = 0;
        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                altitude++;
            } else {
                altitude--;
            }
            if (step == 'D' && altitude == -1) {
                valleys++;
            }
        }
        return valleys;
    }
}
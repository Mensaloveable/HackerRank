package com.loveable.ArraysChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A left rotation operation on an array shifts each of the array's elements 1 unit to the left. For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2]. Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.
 * <p>
 * Given an array a of n integers and a number, d, perform d left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
 * <p>
 * Function Description
 * <p>
 * Complete the function rotLeft in the editor below.
 * <p>
 * rotLeft has the following parameter(s):
 * <p>
 * int a[n]: the array to rotate
 * int d: the number of rotations
 * Returns
 * <p>
 * int a'[n]: the rotated array
 * Input Format
 * <p>
 * The first line contains two space-separated integers n and d, the size of a and the number of left rotations.
 * The second line contains n space-separated integers, each an a[i].
 */
public class LeftRotation {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(rotLeft(arr, 2)));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(rotLeft(arr2, 4));
    }

    public static ArrayList<Integer> rotLeft(List<Integer> arr, int d) {
        // Create a new ArrayList to store the rotated elements
        ArrayList<Integer> rotated = new ArrayList<>(arr.size());

        // Copy the elements from the original ArrayList to the rotated ArrayList starting from index d
        for (int i = d; i < arr.size(); i++) {
            rotated.add(arr.get(i));
        }

        // Copy the elements from the original ArrayList to the rotated ArrayList up to index d
        for (int i = 0; i < d; i++) {
            rotated.add(arr.get(i));
        }

        return rotated;
    }

    public static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + n - d) % n] = a[i];
        }
        return rotated;
    }

}

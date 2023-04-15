package com.loveable.RandonChallenge;

/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * <p>
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 * <p>
 * Example
 * <p>
 * s="12:01:00PM"
 * <p>
 * Return '12:01:00'.
 * <p>
 * s="12:01:00AM"
 * <p>
 * Return '00:01:00'.
 * <p>
 * Function Description
 * <p>
 * Complete the timeConversion function in the editor below.
 * It should return a new string representing the input time in 24-hour format.
 * <p>
 * timeConversion has the following parameter(s):
 * <p>
 * string s: a time in 12-hour format
 * Returns
 * string: the time in 24-hour format
 * <p>
 * Input Format
 * <p>
 * A single string s that represents a time in
 * 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM).
 */

public class TimeConversion {
    public static void main(String[] args) {
        String s = "04:59:59AM";
        System.out.println(timeConversion(s));
        String s1 = "12:01:00AM";
        System.out.println(timeConversion2(s1));
    }

    public static String timeConversion(String s) {
        String meridiem = s.substring(8);
        String time = s.substring(0, 8);
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]);
        if (meridiem.equals("PM") && hour != 12) {
            hour += 12;
        } else if (meridiem.equals("AM") && hour == 12) {
            hour = 0;
        }

        String hh = String.valueOf(hour);
        if (hh.length() == 1) {
            split[0] = "0" + hh;
        } else {
            split[0] = hh;
        }
        return String.join(":", split);
    }

    public static String timeConversion2(String s) {
        // Extract the hour, minute, and second
        int hour = Integer.parseInt(s.substring(0, 2));
        int minute = Integer.parseInt(s.substring(3, 5));
        int second = Integer.parseInt(s.substring(6, 8));
        // Check if the time is in the afternoon and add 12 to the hour
        if (s.endsWith("PM") && hour != 12) {
            hour += 12;
        }
        // Check if the time is in the morning and the hour is 12
        if (s.endsWith("AM") && hour == 12) {
            hour = 0;
        }
        // Return the time in 24-hour format as a string
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

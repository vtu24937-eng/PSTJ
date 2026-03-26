Extract AM/PM
Extract hour
Convert based on rules:
AM
12 AM → 00
otherwise keep same
PM
12 PM → 12
otherwise add 12 to hour

CODE : 

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    String period = s.substring(8); // AM or PM
    int hour = Integer.parseInt(s.substring(0, 2));
    String rest = s.substring(2, 8); // :mm:ss

    if (period.equals("AM")) {
        if (hour == 12) {
            hour = 0;
        }
    } else { // PM
        if (hour != 12) {
            hour += 12;
        }
    }

    return String.format("%02d", hour) + rest;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

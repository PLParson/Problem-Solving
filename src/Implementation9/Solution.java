package Implementation9;

import java.io.*;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
public class Solution {
    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int feb=year>=1700&&year<=1917&&year%4==0||year>1918&&(year%4==0&&year%100!=0||year%400==0)?29:28;
        if (year==1918)
            feb-=13;
        int day = 256-(31+feb+31+30+31+30+31+31);
        return day+".09."+year;

    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner in = new Scanner(System.in);

//        int year = Integer.parseInt(bufferedReader.readLine().trim());
        int year = Integer.parseInt(in.nextLine().trim());

        String result = dayOfProgrammer(year);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        in.close();
        System.out.println(result);
    }
}

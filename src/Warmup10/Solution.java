package Warmup10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class Solution {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        try{
            Date d = new SimpleDateFormat("hh:mm:ssa").parse(s);
            SimpleDateFormat expectedFormat = new SimpleDateFormat("HH:mm:ss");

            return expectedFormat.format(d);
        }catch(Exception e){
            return s;
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        /*bw.write(result);
        bw.newLine();

        bw.close();*/
        System.out.println(result);
        scan.close();
    }
}

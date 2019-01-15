package Implementation13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class Solution {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int total=0,counter=n;
        for (char i:s.toCharArray()){
            if (i=='U'){
                counter++;
                if(counter==n){
                    total++;
                }
            }else if (i=='D'){
                counter--;
            }
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        System.out.println(result);

        scanner.close();
    }
}

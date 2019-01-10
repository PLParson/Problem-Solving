package Implementation5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
public class Solution {
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int[] result = {0,0};
        int min=scores[0],max=scores[0];
        for (int i:scores){
            if (i>max){
                max=i;
                result[0]+=1;
            }else if (i<min){
                min=i;
                result[1]+=1;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
            System.out.print(result[i]);

            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
                System.out.print(" ");
            }
        }

//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        System.out.println();

        scanner.close();
    }
}

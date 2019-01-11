package Implementation8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */
public class Solution {
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int type1=0,type2=0,type3=0,type4=0,type5=0;
        for (int i : arr) {
            type1 += i == 1 ? 1 : 0;
            type2 += i == 2 ? 1 : 0;
            type3 += i == 3 ? 1 : 0;
            type4 += i == 4 ? 1 : 0;
            type5 += i == 5 ? 1 : 0;
        }
        return type1>=type2&&type1>=type3&&type1>=type4&&type1>=type5?1
                :type2>=type1&&type2>=type3&&type2>=type4&&type2>=type5?2
                :type3>=type1&&type3>=type2&&type3>=type4&&type3>=type5?3
                :type4>=type1&&type4>=type2&&type4>=type3&&type4>=type5?4:5;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner in = new Scanner(System.in);

//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
        int arrCount = Integer.parseInt(in.nextLine().trim());

//        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] arrItems = in.nextLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        in.close();
        System.out.println(result);
    }
}

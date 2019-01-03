package Problem3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class Solution {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> results = Arrays.asList(0,0);
        for(int i = 0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
                results.set(0, results.get(0)+1);
            }else if(a.get(i)<b.get(i)){
                results.set(1, results.get(1) + 1);
            }
        }
        return results;

    }

    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");*/
        Scanner in = new Scanner(System.in);
        String[] aItems = in.nextLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        //String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] bItems = in.nextLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            //bufferedWriter.write(String.valueOf(result.get(i)));
            System.out.print(result.get(i));

            if (i != result.size() - 1) {
                //bufferedWriter.write(" ");
                System.out.print(" ");
            }
        }

        /*bufferedWriter.newLine();


        bufferedReader.close();
        bufferedWriter.close();*/
        System.out.println();
        in.close();
    }
}

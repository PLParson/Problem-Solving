package Warmup5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */
public class Solution {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        DecimalFormat df = new DecimalFormat("0.000000");
        double pos=0, neg=0, zer=0;
        for(int i : arr){
            if(i>0){
                pos++;
            }else if(i==0){
                zer++;
            }else if(i<0) {
                neg++;
            }
        }
        System.out.println(df.format(pos/arr.length));
        System.out.println(df.format(neg/arr.length));
        System.out.println(df.format(zer/arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}

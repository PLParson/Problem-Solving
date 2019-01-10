package Implementation4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */
public class Solution {
    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
        int result = 0;
        if(a[a.length-1]<b[0]){
            for(int i=a[a.length-1]; i<b[0]+1; i++){
                int counter=0;
                for(int j=0; j<b.length; j++){
                    if(b[j]%i==0)
                        counter++;
                }
                if(counter==b.length){
                    int newCounter=0;
                    for(int k=0; k<a.length; k++){
                        if(i%a[k]==0)
                            newCounter++;
                    }
                    if(newCounter==a.length){
                        result++;
                    }
                }
            }
        }
        return result;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

//        bw.write(String.valueOf(total));
//        bw.newLine();
//
//        bw.close();
        System.out.println(total);
        scan.close();
    }
}

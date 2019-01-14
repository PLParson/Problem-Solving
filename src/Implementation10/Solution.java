package Implementation10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class Solution {
    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int total=0;
        for (int i :bill)
            total+=i;
        total-=bill.get(k);
        total=total/2;
        if (total==b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b-total);


    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

//        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] nk = in.nextLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

//        String[] billItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] billItems = in.nextLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> bill = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int billItem = Integer.parseInt(billItems[i]);
            bill.add(billItem);
        }

//        int b = Integer.parseInt(bufferedReader.readLine().trim());
        int b = Integer.parseInt(in.nextLine().trim());

        bonAppetit(bill, k, b);

//        bufferedReader.close();
        in.close();
    }
}

package Implementation66;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/matrix-rotation-algo/problem
 */
public class Solution {
    // Complete the matrixRotation function below.
    static void matrixRotation(List<List<Integer>> matrix, int r) {
        int[] top = new int[matrix.get(0).size()];
        int[] bottom = new int[matrix.get(0).size()];
        int[] left = new int[matrix.size()];
        int[] right = new int[matrix.size()];
        for(int i=0;i<matrix.get(0).size();i++)
            top[i] = matrix.get(0).get(i);
        for(int i=0;i<matrix.get(0).size();i++)
            bottom[i] = matrix.get(matrix.size()-1).get(i);
        for (int i=0;i<matrix.size();i++)
            left[i] = matrix.get(i).get(0);
        for (int i=0;i<matrix.size();i++)
            right[i] = matrix.get(i).get(matrix.get(0).size()-1);


        int[] tempTop = new int[matrix.get(0).size()];
        int[] tempBottom = new int[matrix.get(0).size()];
        int[] tempLeft = new int[matrix.size()];
        int[] tempRight = new int[matrix.size()];
        while(r-- > 0){
            for(int i = 0;i<top.length;i++) {
                try {
                    tempTop[i] = top[i+1];
                } catch (Exception e) {
                    tempTop[i] = right[0];
                }
            }
            /*for(int i = 0;i<right.length;i++) {
                try {
                    tempRight[i] = right[i+1];
                } catch (Exception e) {
                    tempRight[i] = bottom[bottom.length-1];
                }
            }
            for(int i = bottom.length;i>0;i--) {
                try {
                    tempBottom[i] = bottom[i-1];
                } catch (Exception e) {
                    tempBottom[i] = left[left.length-1];
                }
            }
            for(int i = left.length;i>0;i--){
                try{
                    tempLeft[i] = left[i-1];
                }catch (Exception e){
                    tempLeft[i] = top[0];
                }
            }*/
        }

//        List<List<Integer>> newMatrix = new ArrayList<>();
        /*for (int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.get(0).size();i++){
                try {
                    System.out.print(tempTop[j]);
                }catch (Exception e){

                }
            }
        }*/
        for (int i : tempTop)
            System.out.print(i);
        System.out.println();
        for (int i : tempBottom)
            System.out.print(i);


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner in = new Scanner(System.in);

        String[] mnr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        //String[] mnr = in.nextLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(mnr[0]);

        int n = Integer.parseInt(mnr[1]);

        int r = Integer.parseInt(mnr[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] matrixRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            //String[] matrixRowTempItems = in.nextLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> matrixRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int matrixItem = Integer.parseInt(matrixRowTempItems[j]);
                matrixRowItems.add(matrixItem);
            }

            matrix.add(matrixRowItems);
        }

        matrixRotation(matrix, r);

        bufferedReader.close();
        //in.close();
    }
}

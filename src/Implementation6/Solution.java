package Implementation6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class Solution {
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int sum=0,result=0;
        for (int i = 0;i<s.size();i++){
            for (int j=0;j<m;j++){
                try {
                    sum+=s.get(i+j);
                }catch (Exception e){
                    sum=0;
                }
            }
            if (sum==d){
                result+=1;
            }
            sum=0;
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner in = new Scanner(System.in);

//        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int n = Integer.parseInt(in.nextLine().trim());

//        String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] sItems = in.nextLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sItem = Integer.parseInt(sItems[i]);
            s.add(sItem);
        }

//        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        String[] dm = in.nextLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
        System.out.println(result);

//        bufferedReader.close();
//        bufferedWriter.close();
        in.close();
    }
}

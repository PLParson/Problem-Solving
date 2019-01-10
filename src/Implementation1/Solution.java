package Implementation1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/grading/problem
 */
public class Solution {
    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int counter = 0;
        for (int i = 0;i<grades.length;i++){
            if (!(grades[i]%5==0)&&grades[i]>37){
                while ((counter+grades[i])%5!=0)
                    counter++;
                if (counter<3)
                    grades[i]+=counter;
                counter=0;
            }
        }
        return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
//            bw.write(String.valueOf(result[resultItr]));
            System.out.print(result[resultItr]);

            if (resultItr != result.length - 1) {
//                bw.write("\n");
                System.out.println();
            }
        }

//        bw.newLine();
        System.out.println();
//        bw.close();
        scan.close();
    }
}

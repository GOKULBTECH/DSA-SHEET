// Merge Overlapping Intervals 
// Given an array of time intervals where arr[i] = [starti, endi], the task is to merge all the 
// overlapping intervals into one and output the result which should have only mutually exclusive 
// intervals. 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> merge = new ArrayList<>();
        int[] cur = intervals[0];
        merge.add(cur);

        for (int i = 1; i < intervals.length; i++) {
            int currEnd = cur[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (currEnd >= nextStart) {
                cur[1] = Math.max(currEnd, nextEnd);
            } else {
                cur = intervals[i];
                merge.add(cur);
            }
        }
        return merge.toArray(new int[merge.size()][]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[][] matrix = new int[n][2];
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter start and end for interval " + (i + 1));
            matrix[i][0] = sc.nextInt();
            matrix[i][1] = sc.nextInt();
        }

        int[][] result = merge(matrix);
        System.out.println("Merged intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }

        sc.close();
    }
}

package assignment.week1;

public class Overlap {

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int n = intervals.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intervals[i][0] > intervals[j][0]) {
               
                    int tempStart = intervals[i][0];
                    int tempEnd = intervals[i][1];

                    intervals[i][0] = intervals[j][0];
                    intervals[i][1] = intervals[j][1];

                    intervals[j][0] = tempStart;
                    intervals[j][1] = tempEnd;
                }
            }
        }

       
        int[][] result = new int[n][2];
        int index = 0;

        result[0][0] = intervals[0][0];
        result[0][1] = intervals[0][1];

        for (int i = 1; i < n; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            int lastEnd = result[index][1];

            if (currentStart <= lastEnd) {
                if (currentEnd > lastEnd) {
                    result[index][1] = currentEnd;
                }
            } else {
              
                index++;
                result[index][0] = currentStart;
                result[index][1] = currentEnd;
            }
        }

        System.out.println("Merged Intervals:");
        for (int i = 0; i <= index; i++) {
            System.out.println("[" + result[i][0] + ", " + result[i][1] + "]");
        }
    }
}

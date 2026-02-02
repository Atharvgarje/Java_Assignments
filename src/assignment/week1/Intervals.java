package assignment.week1;
import java.util.Arrays;

class FourSum {

    public static void main(String[] args) {

        int[] a = {1, 0, -1, 0, -2, 2};
        int target = 0;
        int n = a.length;

        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            if (i > 0 && a[i] == a[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && a[j] == a[j - 1]) continue;

                for (int k = j + 1; k < n; k++) {
                    if (k > j + 1 && a[k] == a[k - 1]) continue;

                    for (int l = k + 1; l < n; l++) {
                        if (l > k + 1 && a[l] == a[l - 1]) continue;

                        int sum = a[i] + a[j] + a[k] + a[l];

                        if (sum == target) {
                            System.out.println(
                                a[i] + " " + a[j] + " " + a[k] + " " + a[l]
                            );
                        }
                    }
                }
            }
        }
    }
}


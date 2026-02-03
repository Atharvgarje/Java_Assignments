package assignment.week1;

public class ColorSort {

    public static void main(String[] args) {

        int[] a = {2, 0, 2, 1, 1, 0};

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                count0++;
            else if (a[i] == 1)
                count1++;
            else
                count2++;
        }

        int index = 0;

        for (int i = 0; i < count0; i++) {
            a[index++] = 0;
        }

        for (int i = 0; i < count1; i++) {
            a[index++] = 1;
        }

        for (int i = 0; i < count2; i++) {
            a[index++] = 2;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
    }
}

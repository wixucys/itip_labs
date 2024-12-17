import java.util.Arrays;

public class Second {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 32, 3},
                {12, 5, 6},
                {7, 45, 7}
        };


        int[] maxOfRow = new int[matrix.length];

        Thread[] threads = new Thread[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            threads[i] = new Thread(new RowMax(matrix[i], maxOfRow, i));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (Exception e) {
                System.out.println(e);
            }
        }


        int max = -99999;
        for (int rowMax : maxOfRow) {
            if (rowMax > max) {
                max = rowMax;
            }
        }

        System.out.println(max);
    }
}
public class ChangeTwoDimensionalArray {
    public static int[][] matrix(int[][] bruh) {
        // sample input
        int[][] array = new int[][] {
                {-1,  4, -5, -9,  3},
                {6, -4, -7,  4, -5},
                { 3,  5,  0, -9, -1},
                {1,  5, -7, -8, -9},
                {-3,  2,  1, -5,  6}
        };

        for (int i = 0; i < array.length; i++) {
            if (array[i][i] >= 0) {
                array[i][i] = 1;
            } else {
                array[i][i] = 0;
            }
        }

        return array;
    }
}

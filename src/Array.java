public class Array {
    public static void main(String[] agrs) {
        /*
        1. initialization of array
        2. finding sum and average of array element and using concept of foreach array and for array
         */
        int[][] datas = new int[4][4];
        double[] numbers = {4.56, 78.6, 9.36, 45.3, 215.0, 48.0, 36.23};

        int len = numbers.length;

        double sum = 0;

        for (double i : numbers) {
            sum += i;
        }
        System.out.println(sum);

        int[][][] threed = {
                {
                        {1, 2, 3},
                        {5, 6, 3},
                        {7, 8, 9}
                },

                {
                        {7, 8, 9}, {7, 9, 9}
                },

                {
                        {4, 55, 89, 12}, {8, 9, 6}
                }
        };


        for (int[][] row : threed) {
            for (int[] col : row) {
                for (int item : col) {
                    System.out.println(item);
                }
            }
        }
// two dimensional array implementaion
        
        int[][] data =
                {
                        {1, 2, 3, 5},
        {
            8, 9, 6, 5
        },
        {
            7, 8, 9, 3
        },
        {
            78, 9, 3, 6
        },
              };

        for (int[] lol : data) {
            for (int dol : lol) {
                System.out.println(dol);
            }
        }
    }
}
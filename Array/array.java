public class array {
    public static void main(String[] args) {
        // int [][][] arr = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}};
        // for (int i = 0; i < 3; i++) {
        //     System.out.println(i);
        // }
        // for (int j = 0; j < 3; j++) {
        //     System.out.println(j);
        // }
        // for (int k = 0; k < 3; k++) {
        //     System.out.println(k);,
        // }

        int [][][][] arr = {{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}}};
        int max = 0, smax = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    for (int l = 0; l < arr[i][j][k].length; l++) {
                         System.out.print(arr[i][j][k][l]);
        
        int num = arr[i][j][k][l];
        if (num > max) {
            smax = max;
            max = num;
        }
        else if (num > smax && smax != max) {
            smax = max;
            max = num;
        }
        System.out.println(smax);

                    }
                }
            }
        }
    }
}
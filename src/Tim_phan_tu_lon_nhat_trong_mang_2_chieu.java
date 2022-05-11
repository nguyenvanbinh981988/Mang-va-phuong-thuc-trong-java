public class Tim_phan_tu_lon_nhat_trong_mang_2_chieu {
    public static void main(String[] args) {
        int[][] arr = {
                { 1,5,8,6,7,9},
                { 5,10,15,20,6},
                { 46,44,12,24,85},
                { 86,45,10,25,60},
        };

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("maxValue is " + max);
    }
}

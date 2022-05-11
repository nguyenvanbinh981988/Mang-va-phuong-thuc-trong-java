public class Tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int[][] arr = {
                { 10,50,8,6,7,9},
                { 53,10,15,20,61},
                { 46,44,12,24,85},
                { 86,45,10,25,60},
        };

        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("maxValue is " + min);
    }
}

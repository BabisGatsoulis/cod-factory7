package gr.aueb.cf.ch6;

public class Exercise1 {

    public static void main(String[] args) {

    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        if(arr == null) return -1;
        if (low < 0 || high > arr.length -1) return -1;
        if (low > high) return -1;

        int maxPosition = low;
        int maxValue = arr[maxPosition];

        for (int i = low; i <= high; i++){
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}

package gr.aueb.cf.ch6;

public class Exercise2 {

    public static void main(String[] args) {
        int[] arr = {9, 8, 5, 6, 4, 3, 9, 2, 4, 0, -5, 6, 1};

        arr = bubblesort(arr);
        System.out.printf("The second minimum element is: %d", arr[1]);

    }

    public static int[] bubblesort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}




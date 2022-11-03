import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] numbers = {20, 35, -15, 7, 55, 1, -22};
        int start = 0;
        int finish = numbers.length;

        quickSort(numbers, start, finish);

        System.out.println(Arrays.toString(numbers));
    }

    public static void quickSort(int[] arr, int start, int finish) {

        if ((finish - start) <= 1) {
            return;
        }

        int pivotIdx = partition(arr, start, finish);

        quickSort(arr, start, pivotIdx);
        quickSort(arr, pivotIdx + 1, finish);
    }

    public static int partition(int[] arr, int start, int finish) {

        int i = start;
        int j = finish;
        int pivot = arr[start];

        while (i < j) {
            // NOTE: empty body loop
            while (i < j && arr[--j] >= pivot);
            if (i < j) {
                arr[i] = arr[j];
            }

            // NOTE: empty body loop
            while (i < j && arr[++i] <= pivot);
            if (i < j) {
                arr[j] = arr[i];
            }
        }

        arr[j] = pivot;

        return j;
    }
}

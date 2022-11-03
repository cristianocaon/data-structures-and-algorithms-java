import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] numbers = {20, 35, -15, 7, 55, 1, -22};
        int start = 0, finish = numbers.length;

        mergeSort(numbers, start, finish);

        System.out.println(Arrays.toString(numbers));
    }

    public static void mergeSort(int[] arr, int start, int finish) {

        if ((finish - start) <= 1) {
            return;
        }

        int mid = (start + finish) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, finish);
        merge(arr, start, mid, finish);
    }

    public static void merge(int[] arr, int start, int mid, int finish) {

        if (arr[mid - 1] <= arr[mid]) {
            return;
        }

        int i = start, j = mid, tempIdx = 0;
        int[] tempArr = new int[finish - start];

        while(i < mid && j < finish) {
            tempArr[tempIdx++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, start + tempIdx, mid - i);
        System.arraycopy(tempArr, 0, arr, start, tempIdx);
    }
}

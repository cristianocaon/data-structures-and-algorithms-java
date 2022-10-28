import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        for (int unsortedIdx = numbers.length - 1; unsortedIdx > 0; unsortedIdx--) {
            int largest = 0;
            for (int i = 1; i <= unsortedIdx; i++) {
                if (numbers[i] > numbers[largest]) {
                    largest = i;
                }
            }
            swap(numbers, largest, unsortedIdx);
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

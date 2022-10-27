import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        int unsortedPartitionIndex = numbers.length - 1;
        while (unsortedPartitionIndex > 0) {
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                }
            }
            unsortedPartitionIndex--;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

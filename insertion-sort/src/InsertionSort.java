import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        for (int unsortedIdx = 1; unsortedIdx < numbers.length; unsortedIdx++) {
            int element = numbers[unsortedIdx];
            int i;
            for (i = unsortedIdx; i > 0 && numbers[i - 1] > element; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[i] = element;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

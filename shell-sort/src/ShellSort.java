import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {

        int[] numbers = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = numbers.length / 2; gap > 0; gap /= 2){
            for (int i = gap; i < numbers.length; i++) {
                int element = numbers[i];
                int j;
                for (j = i; j >= gap && numbers[j - gap] > element; j -= gap) {
                    numbers[j] = numbers[j - gap];
                }
                numbers[j] = element;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}

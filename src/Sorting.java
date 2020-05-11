import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 4, 3, 7, 16);
        List<Integer> sortedArray = Sorting.sortArray(numbers);
        System.out.println(sortedArray);
    }

    public static List<Integer> sortArray(List<Integer> numbers) {

        List<Integer> oddArray = new ArrayList<>();
        List<Integer> evenArray = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenArray.add(num);
            } else {
                oddArray.add(num);
            }
        }

        oddArray.addAll(evenArray);

        return oddArray;
    }
}

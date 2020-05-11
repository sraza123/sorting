import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SortingTest {


    @Test
    public void testOddEvenSorting() {

        List<Integer> actual = Arrays.asList(1, 2, 4, 3, 7, 16);
        List<Integer> expectedResult = Arrays.asList(1, 3, 7, 2, 4, 16);
        Sorting sorting = new Sorting();
        List<Integer> expected = sorting.sortArray(actual);

        Assert.assertEquals(expectedResult.size(), expected.size());
        Assert.assertEquals(expected, expectedResult);
    }
}

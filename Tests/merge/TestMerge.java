package merge;

import org.junit.Assert;
import org.junit.Test;

public class TestMerge {
    private Merge merge = new Merge();

    @Test
    public void testMerge_001() {
        //given
        int [] array = {5, 3, 2, 1};
        int [] expectedResult = {1, 2, 3, 5};

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMerge_002() {
        //given
        int [] array = {5, 3, 2, 7, 8, 1, 4, 6};
        int [] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMerge_003() {
        //given
        int [] array = {5, 3};
        int [] expectedResult = {3, 5};

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMerge_004() {
        //given
        int [] array = {5};
        int [] expectedResult = {5};

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMerge_005() {
        //given
        int [] array = {};
        int [] expectedResult = null;

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMerge_006() {
        //given
        int [] array = {5, 3, 2};
        int [] expectedResult = {2, 3, 5};

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMerge_007() {
        //given
        int [] array = {5, 3, 2, 4, 1};
        int [] expectedResult = {1, 2, 3, 4, 5};

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMerge_008() {
        //given
        int [] array = {-1, 0, -5, 3, 2};
        int [] expectedResult = {-5, -1, 0, 2, 3};

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMerge_009() {
        //given
        int [] array = {3, 3, 2, 2, 1, 1};
        int [] expectedResult = {1, 1, 2, 2, 3, 3};

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMerge_010() {
        //given
        int [] array = {-5, 5, 0, 1, -3, -3, 0};
        int [] expectedResult = {-5, -3, -3, 0, 0, 1, 5};

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testMerge_011() {
        //given
        int [] array = null;
        int [] expectedResult = null;

        //run
        int [] result = merge.sortArray(array);

        //assert
        Assert.assertArrayEquals(expectedResult, result);
    }



}

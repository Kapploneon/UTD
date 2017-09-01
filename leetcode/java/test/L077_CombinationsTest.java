import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class L077_CombinationsTest {
    @Test
    public void combine() throws Exception {
        L077_Combinations solution = new L077_Combinations();

        int[][] expect1 = {{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};
        List<List<Integer>> ret1 = solution.combine(4, 2);
        Integer[][] actual1 = new Integer[ret1.size()][];
        int i = 0;
        for (List<Integer> nestedList : ret1) {
            actual1[i++] = nestedList.toArray(new Integer[nestedList.size()]);
        }
        assertArrayEquals(expect1, actual1);

        int[][] expect2 = {{1, 2, 3, 4, 5, 6, 7}, {1, 2, 3, 4, 5, 6, 8}, {1, 2, 3, 4, 5, 6, 9},
                {1, 2, 3, 4, 5, 6, 10}, {1, 2, 3, 4, 5, 7, 8}, {1, 2, 3, 4, 5, 7, 9},
                {1, 2, 3, 4, 5, 7, 10}, {1, 2, 3, 4, 5, 8, 9}, {1, 2, 3, 4, 5, 8, 10},
                {1, 2, 3, 4, 5, 9, 10}, {1, 2, 3, 4, 6, 7, 8}, {1, 2, 3, 4, 6, 7, 9},
                {1, 2, 3, 4, 6, 7, 10}, {1, 2, 3, 4, 6, 8, 9}, {1, 2, 3, 4, 6, 8, 10},
                {1, 2, 3, 4, 6, 9, 10}, {1, 2, 3, 4, 7, 8, 9}, {1, 2, 3, 4, 7, 8, 10},
                {1, 2, 3, 4, 7, 9, 10}, {1, 2, 3, 4, 8, 9, 10}, {1, 2, 3, 5, 6, 7, 8},
                {1, 2, 3, 5, 6, 7, 9}, {1, 2, 3, 5, 6, 7, 10}, {1, 2, 3, 5, 6, 8, 9},
                {1, 2, 3, 5, 6, 8, 10}, {1, 2, 3, 5, 6, 9, 10}, {1, 2, 3, 5, 7, 8, 9},
                {1, 2, 3, 5, 7, 8, 10}, {1, 2, 3, 5, 7, 9, 10}, {1, 2, 3, 5, 8, 9, 10},
                {1, 2, 3, 6, 7, 8, 9}, {1, 2, 3, 6, 7, 8, 10}, {1, 2, 3, 6, 7, 9, 10},
                {1, 2, 3, 6, 8, 9, 10}, {1, 2, 3, 7, 8, 9, 10}, {1, 2, 4, 5, 6, 7, 8},
                {1, 2, 4, 5, 6, 7, 9}, {1, 2, 4, 5, 6, 7, 10}, {1, 2, 4, 5, 6, 8, 9},
                {1, 2, 4, 5, 6, 8, 10}, {1, 2, 4, 5, 6, 9, 10}, {1, 2, 4, 5, 7, 8, 9},
                {1, 2, 4, 5, 7, 8, 10}, {1, 2, 4, 5, 7, 9, 10}, {1, 2, 4, 5, 8, 9, 10},
                {1, 2, 4, 6, 7, 8, 9}, {1, 2, 4, 6, 7, 8, 10}, {1, 2, 4, 6, 7, 9, 10},
                {1, 2, 4, 6, 8, 9, 10}, {1, 2, 4, 7, 8, 9, 10}, {1, 2, 5, 6, 7, 8, 9},
                {1, 2, 5, 6, 7, 8, 10}, {1, 2, 5, 6, 7, 9, 10}, {1, 2, 5, 6, 8, 9, 10},
                {1, 2, 5, 7, 8, 9, 10}, {1, 2, 6, 7, 8, 9, 10}, {1, 3, 4, 5, 6, 7, 8},
                {1, 3, 4, 5, 6, 7, 9}, {1, 3, 4, 5, 6, 7, 10}, {1, 3, 4, 5, 6, 8, 9},
                {1, 3, 4, 5, 6, 8, 10}, {1, 3, 4, 5, 6, 9, 10}, {1, 3, 4, 5, 7, 8, 9},
                {1, 3, 4, 5, 7, 8, 10}, {1, 3, 4, 5, 7, 9, 10}, {1, 3, 4, 5, 8, 9, 10},
                {1, 3, 4, 6, 7, 8, 9}, {1, 3, 4, 6, 7, 8, 10}, {1, 3, 4, 6, 7, 9, 10},
                {1, 3, 4, 6, 8, 9, 10}, {1, 3, 4, 7, 8, 9, 10}, {1, 3, 5, 6, 7, 8, 9},
                {1, 3, 5, 6, 7, 8, 10}, {1, 3, 5, 6, 7, 9, 10}, {1, 3, 5, 6, 8, 9, 10},
                {1, 3, 5, 7, 8, 9, 10}, {1, 3, 6, 7, 8, 9, 10}, {1, 4, 5, 6, 7, 8, 9},
                {1, 4, 5, 6, 7, 8, 10}, {1, 4, 5, 6, 7, 9, 10}, {1, 4, 5, 6, 8, 9, 10},
                {1, 4, 5, 7, 8, 9, 10}, {1, 4, 6, 7, 8, 9, 10}, {1, 5, 6, 7, 8, 9, 10},
                {2, 3, 4, 5, 6, 7, 8}, {2, 3, 4, 5, 6, 7, 9}, {2, 3, 4, 5, 6, 7, 10},
                {2, 3, 4, 5, 6, 8, 9}, {2, 3, 4, 5, 6, 8, 10}, {2, 3, 4, 5, 6, 9, 10},
                {2, 3, 4, 5, 7, 8, 9}, {2, 3, 4, 5, 7, 8, 10}, {2, 3, 4, 5, 7, 9, 10},
                {2, 3, 4, 5, 8, 9, 10}, {2, 3, 4, 6, 7, 8, 9}, {2, 3, 4, 6, 7, 8, 10},
                {2, 3, 4, 6, 7, 9, 10}, {2, 3, 4, 6, 8, 9, 10}, {2, 3, 4, 7, 8, 9, 10},
                {2, 3, 5, 6, 7, 8, 9}, {2, 3, 5, 6, 7, 8, 10}, {2, 3, 5, 6, 7, 9, 10},
                {2, 3, 5, 6, 8, 9, 10}, {2, 3, 5, 7, 8, 9, 10}, {2, 3, 6, 7, 8, 9, 10},
                {2, 4, 5, 6, 7, 8, 9}, {2, 4, 5, 6, 7, 8, 10}, {2, 4, 5, 6, 7, 9, 10},
                {2, 4, 5, 6, 8, 9, 10}, {2, 4, 5, 7, 8, 9, 10}, {2, 4, 6, 7, 8, 9, 10},
                {2, 5, 6, 7, 8, 9, 10}, {3, 4, 5, 6, 7, 8, 9}, {3, 4, 5, 6, 7, 8, 10},
                {3, 4, 5, 6, 7, 9, 10}, {3, 4, 5, 6, 8, 9, 10}, {3, 4, 5, 7, 8, 9, 10},
                {3, 4, 6, 7, 8, 9, 10}, {3, 5, 6, 7, 8, 9, 10}, {4, 5, 6, 7, 8, 9, 10}};

        List<List<Integer>> ret2 = solution.combine(10, 7);
        Integer[][] actual2 = new Integer[ret2.size()][];
        i = 0;
        for (List<Integer> nestedList : ret2) {
            actual2[i++] = nestedList.toArray(new Integer[nestedList.size()]);
        }
        assertArrayEquals(expect2, actual2);
    }
}
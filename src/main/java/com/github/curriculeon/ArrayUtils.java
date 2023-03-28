package com.github.curriculeon;

import java.util.Arrays;

public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of integers between `start` and `stop` incrementing by 1
     */
    public static Integer[] getRange(Integer start, Integer end) {
        Integer length = Math.abs(start - end)+1;
        Integer[] range = new Integer[length];
        for (int i = 0; i < length; i++) {
            range[i] = start;
            start++;

        }
        return range;
    }
}

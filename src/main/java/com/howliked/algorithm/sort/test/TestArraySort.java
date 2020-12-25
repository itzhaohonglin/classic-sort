package com.howliked.algorithm.sort.test;

import com.howliked.algorithm.sort.ArraySortContext;
import com.howliked.algorithm.sort.IArraySort;
import com.howliked.algorithm.sort.impl.InsertSort;

public class TestArraySort {
    public static void main(String[] args) {
        int[] sourceArr = new int[]{0, 2, 1, 4, 7, 3, 5, 6};
        IArraySort arraySort = new InsertSort();
        ArraySortContext arraySortContext = new ArraySortContext(arraySort,sourceArr);
        arraySortContext.executeArraySort();
    }


}

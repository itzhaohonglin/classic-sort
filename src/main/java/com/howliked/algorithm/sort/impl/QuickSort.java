package com.howliked.algorithm.sort.impl;

import com.howliked.algorithm.sort.IArraySort;

import java.util.Arrays;

/**
 * 快速排序(要求时间最快时)
 * 1.选择第一个数为p，小于p的数放在左边，大于p的数放在右边。
 * 2.递归的将p左边和右边的数都按照第一步进行，直到不能递归。
 */
public class QuickSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        return new int[0];
    }

    private int[] querySort() {
        return new int[0];
    }
}

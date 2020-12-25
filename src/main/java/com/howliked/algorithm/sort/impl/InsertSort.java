package com.howliked.algorithm.sort.impl;

import com.howliked.algorithm.sort.IArraySort;

import java.util.Arrays;

/**
 * 插入排序(经常碰到这样一类排序问题：把新的数据插入到已经排好的数据列中)
 */
public class InsertSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        int[] sortArr = Arrays.copyOf(sourceArray, sourceArray.length);
        int length = sortArr.length;
        int insertNum;  //要插入的数
        //要插入的次数,默认index 为0,已排序,所以从1开始
        for (int i = 1; i < length; i++) {
            insertNum = sortArr[i];  //要插入的数
            int j = i - 1;
            while (j >= 0 & sortArr[j] > insertNum) {
                sortArr[j + 1] = sortArr[j];
                j--;
            }
            sortArr[j + 1] = insertNum;
        }
        return sortArr;
    }
}

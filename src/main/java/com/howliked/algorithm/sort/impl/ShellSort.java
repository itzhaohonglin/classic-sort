package com.howliked.algorithm.sort.impl;

import com.howliked.algorithm.sort.IArraySort;

import java.util.Arrays;

/**
 * 希尔排序(对于直接插入排序问题，数据量巨大时)
 * 1. 将数的个数设为n，取奇数k=n/2，将下标差值为k的书分为一组，构成有序序列。
 * 2. 再取k=k/2 ，将下标差值为k的书分为一组，构成有序序列。
 * 3. 重复第二步，直到k=1执行简单插入排序。
 * <p>
 * <p>
 * 1.首先确定分的组数。
 * 2.然后对组中元素进行插入排序。
 * 3.然后将length/2，重复1,2步，直到length=0为止。
 */
public class ShellSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int length = arr.length;
        while (length != 0) {
            length = length / 2;
            for (int x = 0; x < length; x++) {//分的组数
                for (int i = x + length; i < arr.length; i += length) {//组中的元素，从第二个数开始
                    int j = i - length;//j为有序序列最后一位的位数
                    int temp = arr[i];//要插入的元素
                    for (; j >= 0 && temp < arr[j]; j -= length) {//从后往前遍历。
                        arr[j + length] = arr[j];//向后移动d位
                    }
                    arr[j + length] = temp;
                }
            }
        }
        return arr;
    }
}

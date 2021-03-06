package com.howliked.algorithm.sort.impl;

import com.howliked.algorithm.sort.IArraySort;

import java.util.Arrays;

/**
 * 冒泡排序(一般不用)
 * 1.比较相邻的元素。如果第一个比第二个大,就交换他们。
 * 2.对每一对相邻元素做同样的工作,从开始第一对到结尾最后一对。这步做完后，最后的元素会是最大的数。
 * 3.针对所有的元素重复以上的步骤，除了最后一个。
 * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort implements IArraySort {
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        //外层循环:确定遍历次数
        for (int i = 0; i < arr.length; i++) {
            //内层循环:比较相邻的元素，如果第一个比第二个大,就交换。
            for (int j = 0; j < arr.length - i - 1; j++) {
                //相邻元素比较,若前数比后数大,则交换
                if (arr[j] > arr[j + 1]) {
                    //临时变量记录大值,两个位置做交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

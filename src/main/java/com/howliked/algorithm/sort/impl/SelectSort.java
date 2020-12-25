package com.howliked.algorithm.sort.impl;

import com.howliked.algorithm.sort.IArraySort;

import java.util.Arrays;

/**
 * 选择排序:选择其中最小(大)的数进行排序
 * (常用于取序列中最大最小的几个数时)
 * (如果每次比较都交换，那么就是交换排序；如果每次比较完一个循环再交换，就是简单选择排序)
 * 1.首先确定循环次数，并且记住当前数字和当前位置。
 * 2.将当前位置后面所有的数与当前数字进行对比，小数赋值给key，并记住小数的位置。
 * 3.比对完成后，将最小的值与第一个数的值交换。
 * 4.重复2、3步。
 */
public class SelectSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        //循环数组
        for (int i = 0; i < arr.length; i++) {
            int min = i;    //min:最小的数。默认i的位置最小
            for (int j = i + 1; j < arr.length; j++) {  //从i中的下一个元素开始寻找
                if (arr[j] < arr[min]) {    //如果当前位置比min的位置小,则取出当前位置做为最小值
                    min = j;
                }
            }
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return arr;
    }
}

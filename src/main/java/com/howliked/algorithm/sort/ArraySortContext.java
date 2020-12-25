package com.howliked.algorithm.sort;


import java.util.Arrays;
import java.util.List;

public class ArraySortContext {

    public ArraySortContext(List<IArraySort> arraySorts) {
        this.arraySorts = arraySorts;
    }

    public ArraySortContext(List<IArraySort> arraySorts, int[] sourceArray) {
        this.arraySorts = arraySorts;
        this.sourceArray = sourceArray;
    }

    public ArraySortContext(IArraySort arraySort) {
        this.arraySorts = Arrays.asList(arraySort);
    }

    public ArraySortContext(IArraySort arraySort, int[] sourceArray) {
        this.arraySorts = Arrays.asList(arraySort);
        this.sourceArray = sourceArray;
    }

    private List<IArraySort> arraySorts;
    private int[] sourceArray = new int[]{0, 2, 1, 4, 7, 3, 5, 6};

    public void executeArraySort() {
        if (arraySorts != null && !arraySorts.isEmpty()) {
            arraySorts.forEach(arraySort -> {
                int[] sortArray = arraySort.sort(sourceArray);
                printArray(sortArray);
            });
        }
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}

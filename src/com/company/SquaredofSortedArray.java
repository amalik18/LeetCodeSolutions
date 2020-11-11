package com.company;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SquaredofSortedArray {
    public static int[] sortedSquares(int @NotNull [] A) {
        int [] squaredArray = new int [A.length];
        for (int i = 0; i < A.length; i++) {
            squaredArray[i] = (A[i] * A[i]);
        }
        // manual sorting.
        for (int i = 0; i < squaredArray.length; i++) {
            for (int j = i; j > 0; j--){
                if (squaredArray[j] < squaredArray[j - 1]) {
                    int temp = squaredArray[j];
                    squaredArray[j] = squaredArray[j - 1];
                    squaredArray[j - 1] = temp;
                }
            }
        }

        //using Arrays package
        // Arrays.sort(squaredArray);
        return squaredArray;
    }
}

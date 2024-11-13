package com.example.lab2;

public class TruyXuat1PhanTu {
    public int truyXuat1PhanTu(int[] arr, int index1) {
        if (arr == null || index1 < 0 || index1 >= arr.length) {
            throw new IndexOutOfBoundsException("Invalid array or index");
        }
        return arr[index1];
    }
}

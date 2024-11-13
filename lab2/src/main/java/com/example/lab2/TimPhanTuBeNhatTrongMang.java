package com.example.lab2;

public class TimPhanTuBeNhatTrongMang {
    public int timSoBeNhatMang(int[] mang){
        if (mang == null || mang.length == 0) {
            throw new NullPointerException("Array is empty or null");
        }
        int min = mang[0];
        for (int a:mang
        ) {
            if(a < min){
                min = a;
            }
        }
        return min;
    }
}

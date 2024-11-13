package com.example.lab2;

public class TinhThuong2SN {
    public double tinhThuong(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Devide by 0");
        }else{
            return (double) a/b;
        }
    }
}

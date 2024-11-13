package com.example.lab2;

public class TinhTich2SN {
    public int tinhTich2So(String a, String b) {
        try {
            Integer.parseInt(a);
            Integer.parseInt(b);
        } catch (Exception e) {
            throw new NumberFormatException("Bạn phải nhập vào số nguyên");
        }
        return Integer.parseInt(a) *
                Integer.parseInt(b);
    }
}

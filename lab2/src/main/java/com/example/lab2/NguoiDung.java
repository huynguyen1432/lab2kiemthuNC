package com.example.lab2;

public class NguoiDung {
    private String ma;
    private String  nhiemVu;

    public NguoiDung(String maNV, String nhiemVu) {
        this.ma = maNV;
        this.nhiemVu = nhiemVu;
    }

    public String getMaNV() {
        return ma;
    }

    public void setMaNV(String maNV) {
        this.ma = maNV;
    }

    public String getNhiemVu() {
        return nhiemVu;
    }

    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }

    public NguoiDung() {
    }
}

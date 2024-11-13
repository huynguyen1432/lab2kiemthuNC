package com.example.lab2;

import java.util.ArrayList;
import java.util.List;

public class TruyXuatNguoiDung {
    public String truyXuatMaND(String maNhanVien){
        List<NguoiDung> listHoSo= new ArrayList<>();
        listHoSo.add(new NguoiDung("Nguyễn Đức Huy","TuDo"));
        listHoSo.add(new NguoiDung("Huy","KinhDoanh"));
        listHoSo.add(new NguoiDung("Huy1","Sale"));
        listHoSo.add(new NguoiDung("PH4","Sale"));
        listHoSo.add(new NguoiDung("PH5","Sale"));
        listHoSo.add(new NguoiDung("PH6","Sale"));
        listHoSo.add(new NguoiDung("PH7","Sale"));
        listHoSo.add(new NguoiDung("PH8","Sale"));


        for (NguoiDung a :listHoSo
        ) {
            if(a.getMaNV().equalsIgnoreCase(maNhanVien)){
                return a.getMaNV();
            }
        }
        throw new NullPointerException();
    }
}

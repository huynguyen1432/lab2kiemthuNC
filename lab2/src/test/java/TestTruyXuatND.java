import com.example.lab2.TruyXuatNguoiDung;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTruyXuatND {
    TruyXuatNguoiDung truyXuatMaNhanVienTuMotPhongBan = new TruyXuatNguoiDung();
    @Test
    public void testCaseDumg(){
        assertEquals("Nguyễn Đức Huy",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaND("Nguyễn Đức Huy"));
    }
    @Test
    public void testCaseDumg1(){
        assertEquals("Huy",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaND("Huy"));
    }
    @Test
    public void testCaseDumg2(){
        assertEquals("Huy1",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaND("Huy1"));
    }
    @Test
    public void testCaseChuaTaoMaNhanVien(){
        assertThrows(NullPointerException.class,() -> {truyXuatMaNhanVienTuMotPhongBan.truyXuatMaND("PH33");});
    }
    @Test
    public void testCaseDumg5(){
        assertEquals("PH4",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaND("PH4"));
    }
    @Test
    public void testCaseDumg6(){
        assertEquals("PH3",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaND("PH5"));
    }
    @Test
    public void testCaseDumg7(){
        assertEquals("PH6",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaND("PH6"));
    }
    @Test
    public void testCaseDumg8(){
        assertEquals("PH7",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaND("PH7"));
    }
    @Test
    public void testCaseDumg9(){
        assertEquals("PH8",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaND("PH8"));
    }
    @Test
    public void testCaseDumg10(){
        assertEquals("PH5",truyXuatMaNhanVienTuMotPhongBan.truyXuatMaND("PH6"));
    }
}


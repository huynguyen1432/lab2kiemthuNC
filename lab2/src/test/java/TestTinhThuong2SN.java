import com.example.lab2.TinhThuong2SN;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTinhThuong2SN {
    TinhThuong2SN tinhThuong2SoService = new TinhThuong2SN();

    @Test
    public void testcase1ChiaCho0() {
        assertThrows(ArithmeticException.class, () -> {
            tinhThuong2SoService.tinhThuong(2, 0);
        });
    }

    @Test
    public void testcase2() {
        assertEquals(-2, tinhThuong2SoService.tinhThuong(4, -2));
    }

    @Test
    public void testcase3() {
        assertEquals(1, tinhThuong2SoService.tinhThuong(5, 5));
    }
    @Test
    public void testcase4() {
        assertEquals(0.3333333333333333, tinhThuong2SoService.tinhThuong(5, 15));
    }
    @Test
    public void testcase5() {
        assertEquals(5, tinhThuong2SoService.tinhThuong(5, 1));
    }
    @Test
    public void testcase6() {
        assertEquals(5/2, tinhThuong2SoService.tinhThuong(5, 2));
    }
    @Test
    public void testcase7() {
        assertEquals(2, tinhThuong2SoService.tinhThuong(18, 9));
    }
    @Test
    public void testcase8() {
        assertEquals(2, tinhThuong2SoService.tinhThuong(18, 9));
    }
    @Test
    public void testcase9() {
        assertEquals(2, tinhThuong2SoService.tinhThuong(20, 10));
    }
    @Test
    public void testcase10() {
        assertEquals(22/11, tinhThuong2SoService.tinhThuong(22, 11));
    }
}


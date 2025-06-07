public class NhanVien {
    private String tenNhanVien;
    private String diaChi;
    private String soDienThoai;
    private String chucVu;
    private double luong;
    private int soGioLamViec;
    private int soNgayNghi;
    private int soGioTangCa;

    public NhanVien(String tenNhanVien, String diaChi, String soDienThoai, String chucVu, double luong, int soGioLamViec, int soNgayNghi, int soGioTangCa) {
        this.tenNhanVien = tenNhanVien;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.chucVu = chucVu;
        this.luong = luong;
        this.soGioLamViec = soGioLamViec;
        this.soNgayNghi = soNgayNghi;
        this.soGioTangCa = soGioTangCa;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getChucVu() {
        return chucVu;
    }

    public double getLuong() {
        return luong;
    }
}
public class arr {
    public static void main(String[] args) {
        // Example usage of the NhanVien class
        NhanVien nv1 = new NhanVien("Nguyen Van A", "123 Street", "0123456789", "Manager", 5000.0, 160, 2, 10);
        System.out.println("Ten Nhan Vien: " + nv1.getTenNhanVien());
        System.out.println("Dia Chi: " + nv1.getDiaChi());
        System.out.println("So Dien Thoai: " + nv1.getSoDienThoai());
        System.out.println("Chuc Vu: " + nv1.getChucVu());
        System.out.println("Luong: " + nv1.getLuong());
    }
}

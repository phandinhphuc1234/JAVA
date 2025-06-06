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

import java.util.Scanner;
public class CuaHang
{   
    private String tenCuaHang;
    private String diaChi;  
    private String soDienThoai;
    private NhanVien[] danhSachNhanVien;
    private KhachHang[] danhSachKhachHang;
    private int soLuongNhanVien;
    private int soLuongKhachHang;

    public CuaHang(String tenCuaHang, String diaChi, String soDienThoai)
    {
        this.tenCuaHang = tenCuaHang;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.danhSachNhanVien = new NhanVien[100];
        this.danhSachKhachHang = new KhachHang[100];
        this.soLuongNhanVien = 0;
        this.soLuongKhachHang = 0;
    }

    public String getTenCuaHang()
    {
        return tenCuaHang;
    }
    public void setTenCuaHang(String tenCuaHang)
    {
        this.tenCuaHang = tenCuaHang;
    }
    public String getDiaChi()
    {
        return diaChi;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    public String getSoDienThoai()
    {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai)
    {
        this.soDienThoai = soDienThoai;
    }

    public NhanVien[] getDanhSachNhanVien()
    {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(NhanVien[] danhSachNhanVien)
    {
        this.danhSachNhanVien = danhSachNhanVien;
    }
    public KhachHang[] getDanhSachKhachHang()
    {
        return danhSachKhachHang;
    }
    public void setDanhSachKhachHang(KhachHang[] danhSachKhachHang)
    {
        this.danhSachKhachHang = danhSachKhachHang;
    }
    public int getSoLuongNhanVien()
    {
        return soLuongNhanVien;
    }

    public void setSoLuongNhanVien(int soLuongNhanVien)
    {
        this.soLuongNhanVien = soLuongNhanVien;
    }
    public int getSoLuongKhachHang()
    {
        return soLuongKhachHang;
    }
    public void setSoLuongKhachHang(int soLuongKhachHang)
    {
        this.soLuongKhachHang = soLuongKhachHang;
    }
    public void themNhanVien(NhanVien nhanVien)
    {
        if (soLuongNhanVien < danhSachNhanVien.length) {
            danhSachNhanVien[soLuongNhanVien] = nhanVien;
            soLuongNhanVien++;
        } else {
            System.out.println("Danh sách nhân viên đã đầy.");
        }
    }

    public void themKhachHang(KhachHang khachHang)
    {
        if (soLuongKhachHang < danhSachKhachHang.length) {
            danhSachKhachHang[soLuongKhachHang] = khachHang;
            soLuongKhachHang++;
        } else {
            System.out.println("Danh sách khách hàng đã đầy.");
        }
    }
    public void hienThiThongTinCuaHang()
    {
        System.out.println("Tên cửa hàng: " + tenCuaHang);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Số lượng nhân viên: " + soLuongNhanVien);
        System.out.println("Số lượng khách hàng: " + soLuongKhachHang);
    }
}

public class NhanVien
{
    private String tenNhanVien;
    private String diaChi;
    private String soDienThoai;
    private String chucVu;
    private double luong;
    private int soGioLamViec;
    private int soNgayNghi;
    private int soGioLamThem;
    private double luongThang;
    private double luongLamThem;
    private double luongNgayNghi;
    private double luongTong;
    
    public NhanVien()
    {
        this.tenNhanVien = "";
        this.diaChi = "";
        this.soDienThoai = "";
        this.chucVu = "";
        this.luong = 0.0;
        this.soGioLamViec = 0;
        this.soNgayNghi = 0;
        this.soGioLamThem = 0;
        this.luongThang = 0.0;
        this.luongLamThem = 0.0;
        this.luongNgayNghi = 0.0;
        this.luongTong = 0.0;
    }
    public NhanVien(String tenNhanVien, String diaChi, String soDienThoai, String chucVu, double luong, int soGioLamViec, int soNgayNghi, int soGioLamThem)
    {
        this.tenNhanVien = tenNhanVien;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.chucVu = chucVu;
        this.luong = luong;
        this.soGioLamViec = soGioLamViec;
        this.soNgayNghi = soNgayNghi;
        this.soGioLamThem = soGioLamThem;
        this.luongThang = 0.0;
        this.luongLamThem = 0.0;
        this.luongNgayNghi = 0.0;
        this.luongTong = 0.0;
    }
    public String getTenNhanVien()
    {
        return tenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien)
    {
        this.tenNhanVien = tenNhanVien;
    }
    public String getDiaChi()
    {
        return diaChi;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    public String getSoDienThoai()
    {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai)
    {
        this.soDienThoai = soDienThoai;
    }
    public String getChucVu()
    {
        return chucVu;
    }

    public void setChucVu(String chucVu)
    {
        this.chucVu = chucVu;
    }
    public double getLuong()
    {
        return luong;
    }
    public void setLuong(double luong)
    {
        this.luong = luong;
    }
    public int getSoGioLamViec()
    {
        return soGioLamViec;
    }
    public void setSoGioLamViec(int soGioLamViec)
    {
        this.soGioLamViec = soGioLamViec;
    }
    public int getSoNgayNghi()
    {
        return soNgayNghi;
    }
    public void setSoNgayNghi(int soNgayNghi)
    {
        this.soNgayNghi = soNgayNghi;
    }
}

public class KhachHang
{   
    private String tenKhachHang;
    private String diaChi;
    private String soDienThoai;
    private String email;
    private String gioiTinh;
    private int soLanMuaHang;
    private double tongChiTieu;
    private String ngaySinh;
    private String ngayDangKy;
    
    public KhacHang()
    {
        this.tenKhachHang = "";
        this.diaChi = "";
        this.soDienThoai = "";
        this.email = "";
        this.gioiTinh = "";
        this.soLanMuaHang = 0;
        this.tongChiTieu = 0.0;
        this.ngaySinh = "";
        this.ngayDangKy = "";
    }

    public KhachHang(String tenKhachHang, String diaChi, String soDienThoai, String email, String gioiTinh, int soLanMuaHang, double tongChiTieu, String ngaySinh, String ngayDangKy)
    {
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.soLanMuaHang = soLanMuaHang;
        this.tongChiTieu = tongChiTieu;
        this.ngaySinh = ngaySinh;
        this.ngayDangKy = ngayDangKy;
    }
    public String getTenKhachHang()
    {
        return tenKhachHang;
    }
    public void setTenKhachHang(String tenKhachHang)
    {
        this.tenKhachHang = tenKhachHang;
    }
    public String getDiaChi()
    {
        return diaChi;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    public String getSoDienThoai()
    {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai)
    {
        this.soDienThoai = soDienThoai;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getGioiTinh()
    {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh)
    {
        this.gioiTinh = gioiTinh;
    }
    public int getSoLanMuaHang()
    {
        return soLanMuaHang;
    }
    public void setSoLanMuaHang(int soLanMuaHang)
    {
        this.soLanMuaHang = soLanMuaHang;
    }
    public double getTongChiTieu()
    {
        return tongChiTieu;
    }

    public void setTongChiTieu(double tongChiTieu)
    {
        this.tongChiTieu = tongChiTieu;
    }
    public String getNgaySinh()
    {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh)
    {
        this.ngaySinh = ngaySinh;
    }
    public String getNgayDangKy()
    {
        return ngayDangKy;
    }

    public void setNgayDangKy(String ngayDangKy)
    {
        this.ngayDangKy = ngayDangKy;
    }

}

public class learn
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên cửa hàng: :");
        String tenCuaHang = scanner.nextLine();
        CuaHang cuaHang1 = new CuaHang(tenCuaHang, "123 Street", "0123456789");
        cuaHang1.hienThiThongTinCuaHang();
        for (int i = 0; i < 2; i++) {
            System.out.print("Nhập tên nhân viên: ");
            String tenNhanVien = scanner.nextLine();
            System.out.print("Nhập địa chỉ: ");
            String diaChi = scanner.nextLine();
            System.out.print("Nhập số điện thoại: ");
            String soDienThoai = scanner.nextLine();
            System.out.print("Nhập chức vụ: ");
            String chucVu = scanner.nextLine();
            System.out.print("Nhập lương: ");
            double luong = scanner.nextDouble();
            System.out.print("Nhập số giờ làm việc: ");
            int soGioLamViec = scanner.nextInt();
            System.out.print("Nhập số ngày nghỉ: ");
            int soNgayNghi = scanner.nextInt();
            System.out.print("Nhập số giờ làm thêm: ");
            int soGioLamThem = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            NhanVien nhanVien = new NhanVien(tenNhanVien, diaChi, soDienThoai, chucVu, luong, soGioLamViec, soNgayNghi, soGioLamThem);
            cuaHang1.themNhanVien(nhanVien);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập tên khách hàng: ");
            String tenKhachHang = scanner.nextLine();
            System.out.print("Nhập địa chỉ: ");
            String diaChi = scanner.nextLine();
            System.out.print("Nhập số điện thoại: ");
            String soDienThoai = scanner.nextLine();
            System.out.print("Nhập email: ");
            String email = scanner.nextLine();
            System.out.print("Nhập giới tính: ");
            String gioiTinh = scanner.nextLine();
            System.out.print("Nhập số lần mua hàng: ");
            int soLanMuaHang = scanner.nextInt();
            System.out.print("Nhập tổng chi tiêu: ");
            double tongChiTieu = scanner.nextDouble();
            scanner.nextLine(); // Clear the newline character
            System.out.print("Nhập ngày sinh: ");
            String ngaySinh = scanner.nextLine();
            System.out.print("Nhập ngày đăng ký: ");
            String ngayDangKy = scanner.nextLine();

            KhachHang khachHang = new KhachHang(tenKhachHang, diaChi, soDienThoai, email, gioiTinh, soLanMuaHang, tongChiTieu, ngaySinh, ngayDangKy);
            cuaHang1.themKhachHang(khachHang);
        }
        scanner.close();
    }
}
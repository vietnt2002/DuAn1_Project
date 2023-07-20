/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodels.HoaDon;
import domainmodels.SanPhamBanChay;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import utilities.DBConnection;
import viewmodel.viewSapHetHang;

/**
 *
 * @author ADMIN
 */
public class ThongKeRepository {

    private Connection con = DBConnection.getConnection();

    public List<String> getSLDonHangTim(LocalDateTime ngayDau, LocalDateTime ngayCuoi) {
        List<String> list = new ArrayList<>();
        String sql = "select Count(id) as 'SoLuong' From HoaDon Where NgayThanhToan Between ? And  ?";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            PS.setObject(1, ngayDau);
            PS.setObject(2, ngayCuoi);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                list.add(RS.getString("SoLuong"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getSLKhachHangTim(LocalDateTime ngayDau, LocalDateTime ngayCuoi) {
        List<String> list = new ArrayList<>();
        String sql = "select Count(Idkh) as 'SoLuong' From HoaDon Where NgayThanhToan Between ? And ?";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            PS.setObject(1, ngayDau);
            PS.setObject(2, ngayCuoi);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                list.add(RS.getString("SoLuong"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getDoanhThuTim(LocalDateTime ngayDau, LocalDateTime ngayCuoi) {
        List<String> list = new ArrayList<>();
        String sql = "Select Sum(ThanhTien) AS 'ThanhTien' from ChiTietHD\n"
                + " Join hoadon on HoaDon.Id = ChiTietHD.IdHD\n"
                + " Where NgayThanhToan Between ? and ?";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            PS.setObject(1, ngayDau);
            PS.setObject(2, ngayCuoi);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                list.add(RS.getString("ThanhTien"));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<String> getSLDonHangNgay() {
        List<String> list = new ArrayList<>();
        String sql = "select Count(id) as 'SoLuong' From HoaDon Where Day(NgayThanhToan) = day(GetDate())";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                list.add(RS.getString("SoLuong"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getSLKhachHangNgay() {
        List<String> list = new ArrayList<>();
        String sql = "select Count(Idkh) as 'SoLuong' From HoaDon Where  Day(NgayThanhToan) = day(GetDate())";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                list.add(RS.getString("SoLuong"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<String> getDoanhThuNgay() {
        List<String> list = new ArrayList<>();
        String sql = "Select Sum(ThanhTien) AS 'ThanhTien' from ChiTietHD\n"
                + " Join hoadon on HoaDon.Id = ChiTietHD.IdHD\n"
                + " Where Day(NgayThanhToan) = day(GetDate())";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                list.add(RS.getString("ThanhTien"));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<SanPhamBanChay> getTop5SPBanChay() {
        List<SanPhamBanChay> list = new ArrayList<>();
        String sql = "	select Top 5 SP.Ten, count(CTHD.IMei) AS 'SoLuong' From ChiTietHD CTHD\n"
                + "	Join ChiTietSP CTSP on  CTSP.Id = CTHD.IdChiTietSP\n"
                + "	JOin SanPham SP on CTSP.IDSP = SP.Id\n"
                + "	Where CTHD.TrangThai = 0 \n"
                + "	Group by  SP.Ten\n"
                + "	Order by 'SoLuong' DESC";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                SanPhamBanChay sp = new SanPhamBanChay();
                sp.setTen(RS.getString("Ten"));
                sp.setDaBan(RS.getInt("SoLuong"));
                list.add(sp);
            }

        } catch (Exception e) {
        }
        return list;
    }

    public List<HoaDon> getLichSu() {
        List<HoaDon> list = new ArrayList<>();
        String sql = "Select HD.Ma,NV.Ho+' '+ NV.tenDem +' '+ NV.Ten  As 'HoTenNV', KH.Ho+' '+ KH.tenDem +' '+ KH.Ten  As 'HoTenKH',HD.NgayTao,HD.TrangThai From HoaDon HD \n"
                + "				Join NhanVien NV On HD.idNV = NV.Id\n"
                + "				Join KhachHang KH On HD.IdKH = KH.Id";

        try {
            PreparedStatement PS = con.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                HoaDon hd = new HoaDon();
                hd.setId(RS.getString("Ma"));
                hd.setIdNV(RS.getString("HoTenNV"));
                hd.setIdKH(RS.getString("HoTenKH"));
                hd.setNgayTao(RS.getDate("NgayTao"));
                hd.setTrangThai(RS.getInt("TrangThai"));
                list.add(hd);
            }

        } catch (Exception e) {
        }
        return list;
    }

    public List<HoaDon> locTrangThai(int trangThai) {
        List<HoaDon> list = new ArrayList<>();
        String sql = "Select HD.Ma,NV.Ho+' '+ NV.tenDem +' '+ NV.Ten  As 'HoTenNV', KH.Ho+' '+ KH.tenDem +' '+ KH.Ten  As 'HoTenKH',HD.NgayTao,HD.TrangThai From HoaDon HD \n"
                + " Join NhanVien NV On HD.idNV = NV.Id\n"
                + " Join KhachHang KH On HD.IdKH = KH.Id Where HD.TrangThai =" + trangThai;

        try {
            PreparedStatement PS = con.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                HoaDon hd = new HoaDon();
                hd.setId(RS.getString("Ma"));
                hd.setIdNV(RS.getString("HoTenNV"));
                hd.setIdKH(RS.getString("HoTenKH"));
                hd.setNgayTao(RS.getDate("NgayTao"));
                hd.setTrangThai(RS.getInt("TrangThai"));
                list.add(hd);
            }

        } catch (Exception e) {
        }
        return list;
    }

    public List<HoaDon> timHoaDon(String tim) {
        List<HoaDon> list = new ArrayList<>();
        String sql = "Select HD.Ma,NV.Ho+' '+ NV.tenDem +' '+ NV.Ten  As 'HoTenNV', KH.Ho+' '+ KH.tenDem +' '+ KH.Ten  As 'HoTenKH',HD.NgayTao,HD.TrangThai From HoaDon HD \n"
                + " Join NhanVien NV On HD.idNV = NV.Id\n"
                + " Join KhachHang KH On HD.IdKH = KH.Id Where HD.Ma Like '%" + tim + "%' OR NV.Ho+' '+ NV.tenDem +' '+ NV.Ten Like N'%" + tim + "%' OR KH.Ho+' '+ KH.tenDem +' '+ KH.Ten Like N'%" + tim + "%'";

        try {
            PreparedStatement PS = con.prepareStatement(sql);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                HoaDon hd = new HoaDon();
                hd.setId(RS.getString("Ma"));
                hd.setIdNV(RS.getString("HoTenNV"));
                hd.setIdKH(RS.getString("HoTenKH"));
                hd.setNgayTao(RS.getDate("NgayTao"));
                hd.setTrangThai(RS.getInt("TrangThai"));
                list.add(hd);
            }

        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
//        ThongKeRepository tk = new ThongKeRepository();
//        List<String> list = tk.getDoanhThuNgay("2023-07-17","2023-07-19");
//        for (HoaDon hoaDon : list) {
//            System.out.println(hoaDon.toString());
//        }

    }

    public List<viewSapHetHang> getSapHetHang() {
        List<viewSapHetHang> listsp = new ArrayList<>();
        String sql = "Select Ma,Ten,SoLuongTon From SanPham SP\n"
                + "		     Join ChiTietSP CTSP on SP.Id = CTSP.IdSP\n"
                + "		     Where SoLuongTon <=5";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                viewSapHetHang sp = new viewSapHetHang();
                sp.setMa(rs.getString("Ma"));
                sp.setTen(rs.getString("Ten"));
                sp.setSoLuongTon(rs.getInt("SoLuongTon"));
                listsp.add(sp);
            }
        } catch (Exception e) {
        }
        return listsp;
    }
}

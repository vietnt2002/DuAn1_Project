/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodels.ChucVu;
import domainmodels.NhanVien;
import irepositories.INhanVienRepository;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utilities.DBConnection;

/**
 *
 * @author ADMIN
 */
public class NhanVienRepository implements INhanVienRepository {

    private Connection con = DBConnection.getConnection();

    @Override
    public List<NhanVien> getAll() {
        try {
            List<NhanVien> lstNhanVien = new ArrayList<>();
            Connection connection = DBConnection.getConnection();
            String sql = "SELECT NV.Id AS 'Id', CV.Id AS 'IdCV', CV.Ma AS 'MaCV', CV.Ten AS 'TenCV', NV.Ma AS 'Ma', NV.Ten AS 'Ten', NV.TenDem AS 'TenDem', NV.Ho AS 'Ho', NV.GioiTinh AS 'GioiTinh', \n" +
                        "NV.NgaySinh AS 'NgaySinh', NV.Sdt AS 'Sdt', NV.DiaChi AS 'DiaChi', NV.MatKhau AS 'MatKhau', NV.NgayTao AS 'NgayTao', NV.NgaySua AS 'NgaySua', NV.TrangThai AS 'TrangThai' \n" +
                        "FROM dbo.NhanVien NV JOIN dbo.ChucVu CV\n" +
                        "ON CV.Id = NV.IdCV";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String id = rs.getString("Id");
                String idCV = rs.getString("IdCV");
                String maCV = rs.getString("MaCV");
                String tenCV = rs.getString("TenCV");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String tenDem = rs.getString("TenDem");
                String ho = rs.getString("Ho");
                String gioiTinh = rs.getString("GioiTinh");
                Date ngaySinh = rs.getDate("NgaySinh");
                String sdt = rs.getString("Sdt");
                String diaChi = rs.getString("DiaChi");
                String matKhau = rs.getString("MatKhau");
                Date ngayTao = rs.getDate("NgayTao");
                Date ngaySua = rs.getDate("NgaySua");
                int trangThai = rs.getInt("TrangThai");
                
                ChucVu chucVu = new ChucVu();
                chucVu.setId(idCV);
                chucVu.setMa(maCV);
                chucVu.setTen(tenCV);
                
                NhanVien nhanVien = new NhanVien();
                nhanVien.setId(id);
                nhanVien.setMa(ma);
                nhanVien.setTen(ten);
                nhanVien.setTenDem(tenDem);
                nhanVien.setHo(ho);
                nhanVien.setGioiTinh(gioiTinh);
                nhanVien.setNgaySinh(ngaySinh);
                nhanVien.setSdt(sdt);
                nhanVien.setDiaChi(diaChi);
                nhanVien.setMatKhau(matKhau);
                nhanVien.setNgayTao(ngayTao);
                nhanVien.setNgaySua(ngaySua);
                nhanVien.setTrangThai(trangThai);
                nhanVien.setIdCV(chucVu+"");
                
                lstNhanVien.add(nhanVien);
            }
            rs.close();
            ps.close();
            connection.close();
            return lstNhanVien;
        } catch (Exception e) {
            return null;
        }
    }
    
        @Override
    public NhanVien getTaiKhoan(String username) {
        List<NhanVien> lstNhanVien = getAll();
        for (NhanVien nhanVien : lstNhanVien) {
            if(nhanVien.getMa().equals(username)){
                return nhanVien;
            }
        }
        return null;
    }

    @Override
    public Integer them(NhanVien nhanVien) {
        String sql = "Insert into NhanVien (idCV,Ma,Ten,tenDem,Ho,GioiTinh,NgaySinh,Sdt,DiaChi,MatKhau,NgayTao,NgaySua,TrangThai) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            PS.setObject(1, nhanVien.getIdCV());
            PS.setObject(2, nhanVien.getMa());
            PS.setObject(3, nhanVien.getTen());
            PS.setObject(4, nhanVien.getTenDem());
            PS.setObject(5, nhanVien.getHo());
            PS.setObject(6, nhanVien.getGioiTinh());
            PS.setObject(7, nhanVien.getNgaySinh());
            PS.setObject(8, nhanVien.getSdt());
            PS.setObject(9, nhanVien.getDiaChi());
            PS.setObject(10, nhanVien.getMatKhau());
            PS.setObject(11, nhanVien.getNgayTao());
            PS.setObject(12, nhanVien.getNgaySua());
            PS.setObject(13, nhanVien.getTrangThai());
            PS.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer sua(NhanVien nhanVien) {
        String sql = "Update NhanVien Set idCV =?,Ten=?,tenDem=?,Ho=?,GioiTinh=?,NgaySinh=?,Sdt=?,DiaChi=?,MatKhau=?,NgayTao=?,NgaySua=?,TrangThai=? Where ma = ?";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            PS.setObject(1, nhanVien.getIdCV());
            PS.setObject(2, nhanVien.getTen());
            PS.setObject(3, nhanVien.getTenDem());
            PS.setObject(4, nhanVien.getHo());
            PS.setObject(5, nhanVien.getGioiTinh());
            PS.setObject(6, nhanVien.getNgaySinh());
            PS.setObject(7, nhanVien.getSdt());
            PS.setObject(8, nhanVien.getDiaChi());
            PS.setObject(9, nhanVien.getMatKhau());
            PS.setObject(10, nhanVien.getNgayTao());
            PS.setObject(11, nhanVien.getNgaySua());
            PS.setObject(12, nhanVien.getTrangThai());
            PS.setObject(13, nhanVien.getMa());
            PS.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public Integer xoa(String ma) {
        String sql = "Delete from NhanVien Where ma = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            int result = ps.executeUpdate();
            return result;
        } catch (Exception e) {
        }
        return null;
    }
    
    @Override
    public NhanVien getIdByTen(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public List<String> getChucVu() {
        List<String> list = new ArrayList<>();
        String sql = "Select ten from ChucVu";
        try (PreparedStatement Ps = con.prepareStatement(sql)) {
            ResultSet Rs = Ps.executeQuery();
            while (Rs.next()) {
                list.add(Rs.getString("Ten"));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    @Override
    public NhanVien checkTrungMa(String ma) {
        String sql = "Select * from Nhanvien where ma = ?";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            PS.setString(1, ma);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                String id = RS.getString("Id");
                String chucVu = RS.getString("IdCv");
                String ma1 = RS.getString("Ma");
                String ten = RS.getString("Ten");
                String tenDem = RS.getString("TenDem");
                String ho = RS.getString("Ho");
                String gTinh = RS.getString("GioiTinh");
                Date ngaySinh = RS.getDate("NgaySinh");
                String sdt = RS.getString("Sdt");
                String diaChi = RS.getString("DiaChi");
                String matKhau = RS.getString("MatKhau");
                Date ngayTao = RS.getDate("NgayTao");
                Date ngaySua = RS.getDate("NgaySua");
                Integer trangThai = RS.getInt("TrangThai");
                NhanVien nhanVien = new NhanVien(id, chucVu, ma1, ten, tenDem, ho, gTinh, ngaySinh, diaChi, sdt, matKhau, ngayTao, ngaySua, trangThai);

                return nhanVien;
            }
        } catch (Exception e) {
        }
        return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

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
        List<NhanVien> listNhanVien = new ArrayList<>();
        String sql = "Select * from Nhanvien";
        try (PreparedStatement PS = con.prepareStatement(sql); ResultSet RS = PS.executeQuery()) {
            while (RS.next()) {
                String id = RS.getString("Id");
                String chucVu = RS.getString("IdCv");
                String ma = RS.getString("Ma");
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
                NhanVien nhanVien = new NhanVien(id, chucVu, ma, ten, tenDem, ho, gTinh, ngaySinh, diaChi, sdt, matKhau, ngayTao, ngaySua, trangThai);
                listNhanVien.add(nhanVien);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNhanVien;
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

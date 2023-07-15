/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodels.KhachHang;
import irepositories.IKhachHangRepository;
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
public class KhachHangRepository implements IKhachHangRepository {

    private Connection con = DBConnection.getConnection();

    @Override
    public List<KhachHang> getAll() {
        List<KhachHang> listKhachHang = new ArrayList<>();
        String sql = "Select * from KhachHang";
        try (PreparedStatement PS = con.prepareStatement(sql); ResultSet RS = PS.executeQuery()) {
            while (RS.next()) {
                String id = RS.getString("Id");
                String ma = RS.getString("Ma");
                String ten = RS.getString("Ten");
                String tenDem = RS.getString("TenDem");
                String ho = RS.getString("Ho");
                Date ngaySinh = RS.getDate("NgaySinh");
                String sdt = RS.getString("Sdt");
                String diaChi = RS.getString("DiaChi");
                String thanhPho = RS.getString("ThanhPho");
                String quocGia = RS.getString("QuocGia");
                int soLanMuaHang = RS.getInt("SoLanMuaHang");
                Date ngayTao = RS.getDate("NgayTao");
                Date ngaySua = RS.getDate("NgaySua");
                Integer trangThai = RS.getInt("TrangThai");
                KhachHang khachHang = new KhachHang(id, ma, ten, tenDem, ho, ngaySinh, sdt, diaChi, thanhPho, quocGia, soLanMuaHang, ngayTao, ngaySua, trangThai);
                listKhachHang.add(khachHang);
            }
        } catch (Exception e) {
        }
        return listKhachHang;
    }

    @Override
    public Integer them(KhachHang khachHang) {
        String sql = "Insert into KhachHang (Ma,Ten,tenDem,Ho,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,NgayTao,NgaySua,TrangThai) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            PS.setObject(1, khachHang.getMa());
            PS.setObject(2, khachHang.getTen());
            PS.setObject(3, khachHang.getTenDem());
            PS.setObject(4, khachHang.getHo());
            PS.setObject(5, khachHang.getNgaySinh());
            PS.setObject(6, khachHang.getSdt());
            PS.setObject(7, khachHang.getDiaChi());
            PS.setObject(8, khachHang.getThanhPho());
            PS.setObject(9, khachHang.getQuocGia());
            PS.setObject(10, khachHang.getNgayTao());
            PS.setObject(11, khachHang.getNgaySua());
            PS.setObject(12, khachHang.getTrangThai());
            PS.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer sua(KhachHang khachHang) {
        String sql = "Update KhachHang Set Ten = ?,TenDem = ?,Ho=?,NgaySinh=?,Sdt=?,DiaChi=?,ThanhPho=?,QuocGia=?,NgayTao=?,NgaySua=?,TrangThai=? Where Ma = ?";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            PS.setObject(1, khachHang.getTen());
            PS.setObject(2, khachHang.getTenDem());
            PS.setObject(3, khachHang.getHo());
            PS.setObject(4, khachHang.getNgaySinh());
            PS.setObject(5, khachHang.getSdt());
            PS.setObject(6, khachHang.getDiaChi());
            PS.setObject(7, khachHang.getThanhPho());
            PS.setObject(8, khachHang.getQuocGia());
            PS.setObject(9, khachHang.getNgayTao());
            PS.setObject(10, khachHang.getNgaySua());
            PS.setObject(11, khachHang.getTrangThai());
            PS.setObject(12, khachHang.getMa());
            PS.executeUpdate();
        } catch (Exception e) {
        }
        return 0;
    }

    @Override
    public Integer xoa(String ma) {
        String sql = "Delete from KhachHang Where ma = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ma);
            int result = ps.executeUpdate();
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public KhachHang getIdByTen(String ten) {
        String sql = "Select Ten from KhachHang Where Ma = ?";
        return null;
    }

    @Override
    public List<KhachHang> findTen(String ten1, String thanhPho1) {
        List<KhachHang> listKhachHang = new ArrayList<>();
        String sql = "Select Ma,Ten,tenDem,Ho,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,NgayTao,NgaySua,TrangThai from Khachhang where ten like '?%' and thanhPho = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, ten1);
            ps.setObject(2, thanhPho1);
            ResultSet RS = ps.executeQuery();
            while (RS.next()) {
                String ma = RS.getString("Ma");
                String ten = RS.getString("Ten");
                String tenDem = RS.getString("TenDem");
                String ho = RS.getString("Ho");
                Date ngaySinh = RS.getDate("NgaySinh");
                String sdt = RS.getString("Sdt");
                String diaChi = RS.getString("DiaChi");
                String thanhPho = RS.getString("ThanhPho");
                String quocGia = RS.getString("QuocGia");
                int soLanMuaHang = RS.getInt("SoLanMuaHang");
                Date ngayTao = RS.getDate("NgayTao");
                Date ngaySua = RS.getDate("NgaySua");
                Integer trangThai = RS.getInt("TrangThai");
                KhachHang khachHang = new KhachHang("", ma, ten, tenDem, ho, ngaySinh, sdt, diaChi, thanhPho, quocGia, soLanMuaHang, ngayTao, ngaySua, trangThai);
                listKhachHang.add(khachHang);
            }
            return listKhachHang;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<KhachHang> sapXepTenGiam() {
        List<KhachHang> listKhachHang = new ArrayList<>();
        String sql = "Select * from KhachHang Order by ten";
        try (PreparedStatement PS = con.prepareStatement(sql); ResultSet RS = PS.executeQuery()) {
            while (RS.next()) {
                String id = RS.getString("Id");
                String ma = RS.getString("Ma");
                String ten = RS.getString("Ten");
                String tenDem = RS.getString("TenDem");
                String ho = RS.getString("Ho");
                Date ngaySinh = RS.getDate("NgaySinh");
                String sdt = RS.getString("Sdt");
                String diaChi = RS.getString("DiaChi");
                String thanhPho = RS.getString("ThanhPho");
                String quocGia = RS.getString("QuocGia");
                int soLanMuaHang = RS.getInt("SoLanMuaHang");
                Date ngayTao = RS.getDate("NgayTao");
                Date ngaySua = RS.getDate("NgaySua");
                Integer trangThai = RS.getInt("TrangThai");
                KhachHang khachHang = new KhachHang(id, ma, ten, tenDem, ho, ngaySinh, sdt, diaChi, thanhPho, quocGia, soLanMuaHang, ngayTao, ngaySua, trangThai);
                listKhachHang.add(khachHang);
            }
        } catch (Exception e) {
        }
        return listKhachHang;
    }

    @Override
    public List<KhachHang> sapXepTenTang() {
        List<KhachHang> listKhachHang = new ArrayList<>();
        String sql = "Select * from KhachHang Order by ten Desc";
        try (PreparedStatement PS = con.prepareStatement(sql); ResultSet RS = PS.executeQuery()) {
            while (RS.next()) {
                String id = RS.getString("Id");
                String ma = RS.getString("Ma");
                String ten = RS.getString("Ten");
                String tenDem = RS.getString("TenDem");
                String ho = RS.getString("Ho");
                Date ngaySinh = RS.getDate("NgaySinh");
                String sdt = RS.getString("Sdt");
                String diaChi = RS.getString("DiaChi");
                String thanhPho = RS.getString("ThanhPho");
                String quocGia = RS.getString("QuocGia");
                int soLanMuaHang = RS.getInt("SoLanMuaHang");
                Date ngayTao = RS.getDate("NgayTao");
                Date ngaySua = RS.getDate("NgaySua");
                Integer trangThai = RS.getInt("TrangThai");
                KhachHang khachHang = new KhachHang(id, ma, ten, tenDem, ho, ngaySinh, sdt, diaChi, thanhPho, quocGia, soLanMuaHang, ngayTao, ngaySua, trangThai);
                listKhachHang.add(khachHang);
            }
        } catch (Exception e) {
        }
        return listKhachHang;
    }

    @Override
    public List<String> gettenThanhPho() {
        List<String> list = new ArrayList<>();
        String sql = "Select ThanhPho from KhachHang";
        try (PreparedStatement Ps = con.prepareStatement(sql)) {
            ResultSet Rs = Ps.executeQuery();
            while (Rs.next()) {
                list.add(Rs.getString("ThanhPho"));
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public KhachHang checkTrungMa(String ma) {
        String sql = "Select * from khachhang where ma = ?";
        try {
            PreparedStatement PS = con.prepareStatement(sql);
            PS.setString(1, ma);
            ResultSet RS = PS.executeQuery();
            while (RS.next()) {
                KhachHang khachHang = new KhachHang();
                khachHang.setId(RS.getString("Id"));
                khachHang.setMa(RS.getString("Ma"));
                khachHang.setTen(RS.getString("Ten"));
                khachHang.setTenDem(RS.getString("TenDem"));
                khachHang.setHo(RS.getString("Ho"));
                khachHang.setNgaySinh(RS.getDate("NgaySinh"));
                khachHang.setSdt(RS.getString("Sdt"));
                khachHang.setDiaChi(RS.getString("DiaChi"));
                khachHang.setThanhPho(RS.getString("ThanhPho"));
                khachHang.setQuocGia(RS.getString("QuocGia"));
                khachHang.setNgayTao(RS.getDate("NgayTao"));
                khachHang.setNgaySua(RS.getDate("NgaySua"));
                khachHang.setTrangThai(RS.getInt("TrangThai"));

                return khachHang;
            }
        } catch (Exception e) {
        }
        return null;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodels.Sanpham;
import irepositories.ISanPhamRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import utilities.ULHelper;

/**
 *
 * @author ADMIN
 */
public class SanPhamRepository implements ISanPhamRepository {
    @Override
    public List<Sanpham> getAll() {
        try {
            List<Sanpham> lst = new ArrayList<>();
            Connection con = utilities.ULHelper.getConnection();
            String lenh = "select id,ma,ten,ngayTao,ngaySua,trangThai from sanpham";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(lenh);
            while (rs.next()) {
                lst.add(new Sanpham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getInt(6)));
            }
            return lst;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer them(Sanpham sp) {
        try {
            Connection con = ULHelper.getConnection();
            String lenh = "insert into sanpham(Ma,Ten,ngayTao,ngaySua,trangThai) values(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(lenh);
            st.setString(1, sp.getMa());
            st.setString(2, sp.getTen());
            st.setDate(3, sp.getNgayTao());
            st.setDate(4, sp.getNgaySua());
            st.setInt(5, sp.getTrangThai());
            return st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Integer sua(Sanpham sp) {
        try {
            Connection con = ULHelper.getConnection();
            String lenh = "update sanpham set ten=?, ngayTao=?, ngaySua=?,trangThai=? where ma=?";
            PreparedStatement st = con.prepareStatement(lenh);
            st.setString(5, sp.getMa());
            st.setString(1, sp.getTen());
            st.setDate(2, sp.getNgayTao());
            st.setDate(3, sp.getNgaySua());
            st.setInt(4, sp.getTrangThai());
            return st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Integer xoa(String ma) {
        try {
            Connection con = ULHelper.getConnection();
            String lenh = "delete sanpham where ma like '" + ma + "'";
            PreparedStatement st = con.prepareStatement(lenh);

            return st.executeUpdate();
        } catch (Exception e) {
        }
        return -1;
    }
}

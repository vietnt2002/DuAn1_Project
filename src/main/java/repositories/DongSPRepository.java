/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodels.DongSP;
import irepositories.IDongSPRepository;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import utilities.ULHelper;

/**
 *
 * @author ADMIN
 */
public class DongSPRepository implements IDongSPRepository {

    @Override
    public List<DongSP> getAll() {
        try {
            List<DongSP> lst = new ArrayList<>();
            Connection con = utilities.ULHelper.getConnection();
            String lenh = "select id,ma,ten,ngayTao,ngaySua,trangThai from mausac";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(lenh);
            while (rs.next()) {
                lst.add(new DongSP(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(4), rs.getInt(5)));
            }
            return lst;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer them(DongSP dongSP) {
        try {
            Connection con = ULHelper.getConnection();
            String lenh = "insert into DongSP(Ma,Ten) values(?,?)";
            PreparedStatement st = con.prepareStatement(lenh);
            st.setString(1, dongSP.getMa());
            st.setString(2, dongSP.getTen());
            return st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Integer sua(DongSP dongSP) {
        try {
            Connection con = ULHelper.getConnection();
            String lenh = "update DongSP set ten=? where ma=?";
            PreparedStatement st = con.prepareStatement(lenh);
            st.setString(2, dongSP.getMa());
            st.setString(1, dongSP.getTen());
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
            String lenh = "delete mausac where ma like '" + ma + "'";
            PreparedStatement st = con.prepareStatement(lenh);

            return st.executeUpdate();
        } catch (Exception e) {
        }
        return -1;
    }

    @Override
    public DongSP getIdByTen(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

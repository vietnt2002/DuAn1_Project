package repositories;

import irepositories.IMauSacRepository;
import domainmodels.MauSac;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import utilities.ULHelper;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class MauSacRepository implements IMauSacRepository {

    @Override
    public List<MauSac> getAll() {
        try {
            List<MauSac> lst = new ArrayList<>();
            Connection con = utilities.ULHelper.getConnection();
            String lenh = "select id,ma,ten,ngayTao,ngaySua,trangThai from mausac";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(lenh);
            while (rs.next()) {
                lst.add(new MauSac(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(4), rs.getInt(5)));
            }
            return lst;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer them(MauSac mauSac) {
        try {
            Connection con = ULHelper.getConnection();
            String lenh = "insert into MauSac(Ma,Ten) values(?,?)";
            PreparedStatement st = con.prepareStatement(lenh);
            st.setString(1, mauSac.getMa());
            st.setString(2, mauSac.getTen());
            return st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Integer sua(MauSac mauSac) {
        try {
            Connection con = ULHelper.getConnection();
            String lenh = "update MauSac set ten=? where ma=?";
            PreparedStatement st = con.prepareStatement(lenh);
            st.setString(2, mauSac.getMa());
            st.setString(1, mauSac.getTen());
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

}

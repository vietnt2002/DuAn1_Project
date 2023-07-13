/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodels.CPU;
import irepositories.ICPURepository;
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
public class CPURepository implements ICPURepository {
    @Override
    public List<CPU> getAll() {
        try {
            List<CPU> lst = new ArrayList<>();
            Connection con = utilities.ULHelper.getConnection();
            String lenh = "select id,ma,ten,ngayTao,ngaySua,trangThai from mausac";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(lenh);
            while (rs.next()) {
                lst.add(new CPU(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(4), rs.getInt(5)));
            }
            return lst;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Integer them(CPU cpu) {
        try {
            Connection con = ULHelper.getConnection();
            String lenh = "insert into CPU(Ma,Ten) values(?,?)";
            PreparedStatement st = con.prepareStatement(lenh);
            st.setString(1, cpu.getMa());
            st.setString(2, cpu.getTen());
            return st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Integer sua(CPU cpu) {
        try {
            Connection con = ULHelper.getConnection();
            String lenh = "update CPU set ten=? where ma=?";
            PreparedStatement st = con.prepareStatement(lenh);
            st.setString(2, cpu.getMa());
            st.setString(1, cpu.getTen());
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


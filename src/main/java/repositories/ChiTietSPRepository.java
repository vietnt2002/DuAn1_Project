/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodels.ChiTietSP;
import irepositories.IChiTietSPRepository;
import java.math.BigDecimal;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import utilities.DBConnection;

/**
 *
 * @author ADMIN
 */
public class ChiTietSPRepository implements IChiTietSPRepository {

    @Override
    public List<ChiTietSP> getAll() {
        try {
            List<ChiTietSP> lstChiTietSP = new ArrayList<>();
            Connection connection = DBConnection.getConnection();
            String sql = "SELECT I.IMei AS 'IMei', SP.Id AS 'IdSP', SP.Ten AS 'TenSP', MS.Id AS 'IdMauSac', MS.Ten AS 'MauSac', RAM.Id AS 'IdRAM', RAM.Ten AS 'RAM', SSD.Id AS 'IdSSD', SSD.Ten AS 'SSD', CPU.Id AS 'IdCPU', CPU.Ten AS 'CPU', MH.Id AS 'IdMH', MH.DoPhanGiai AS 'DoPhanGiai', MH.Inch AS 'Inch', CTSP.GiaBan AS 'GiaBan', BH.Id AS 'IdBH', BH.SoThangBH AS 'BaoHanh', I.TrangThai AS 'TrangThai'\n" +
                        "FROM dbo.ChiTietSP CTSP JOIN dbo.IMei I\n" +
                        "ON I.IdChiTietSP = CTSP.Id JOIN dbo.SanPham SP\n" +
                        "ON SP.Id = CTSP.IdSP JOIN dbo.RAM \n" +
                        "ON RAM.Id = CTSP.IdRAM JOIN dbo.SSD\n" +
                        "ON SSD.Id = CTSP.IdSSD JOIN dbo.MauSac MS\n" +
                        "ON MS.Id = CTSP.IdMauSac JOIN dbo.CPU\n" +
                        "ON CPU.Id = CTSP.IdCPU JOIN dbo.ManHinh MH\n" +
                        "ON MH.Id = CTSP.IdManHinh JOIN dbo.BaoHanh BH\n" +
                        "ON BH.Id = CTSP.IdBH\n" +
                        "WHERE I.TrangThai = 0";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String imei = rs.getString("IMei");
                String idSP = rs.getString("IdSP");
                String tenSP = rs.getString("TenSP");
                String idMauSac = rs.getString("IdMauSac");
                String tenMauSac = rs.getString("MauSac");
                String idRAM = rs.getString("IdRAM");
                String tenRAM = rs.getString("RAM");
                String idSSD = rs.getString("IdSSD");
                String tenSSD = rs.getString("SSD");
                String idCPU = rs.getString("IdCPU");
                String tenCPU = rs.getString("CPU");
                String idMH = rs.getString("IdMH");
                String doPhanGiai = rs.getString("DoPhanGiai");
                float inch = rs.getFloat("Inch");
                BigDecimal giaBan = rs.getBigDecimal("GiaBan");
                String idBH = rs.getString("IdBBH");
                int soThangBH = rs.getInt("BaoHanh");
                int trangThai = rs.getInt("TrangThai");
            }
            rs.close();
            ps.close();
            connection.close();
            return lstChiTietSP;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Integer them(ChiTietSP chiTietSP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer sua(ChiTietSP chiTietSP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer xoa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ChiTietSP getIdByTen(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

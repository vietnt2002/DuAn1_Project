/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import irepositories.IChiTietSPRepository;
import java.math.BigDecimal;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import utilities.DBConnection;
import irepositories.IDongSPRepository;
import irepositories.IManHinhRepository;
import irepositories.IMauSacRepository;
import irepositories.ICPURepository;
import irepositories.IRAMRepository;
import irepositories.INSXRepository;
import irepositories.ISSDRepository;
import irepositories.ISanPhamRepository;
import irepositories.IBaoHanhRepository;
import domainmodels.ChiTietSP;
import domainmodels.DongSP;
import domainmodels.ManHinh;
import domainmodels.MauSac;
import domainmodels.CPU;
import domainmodels.RAM;
import domainmodels.NSX;
import domainmodels.SSD;
import domainmodels.SanPham;
import domainmodels.ChiTietHD;
import domainmodels.BaoHanh;
import java.math.BigDecimal;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import utilities.ULHelper;

/**
 *
 * @author ADMIN
 */
public class ChiTietSPRepository implements IChiTietSPRepository {

    private final IDongSPRepository RepositoryDongSp = new DongSPRepository();
    private final IMauSacRepository RepositoryMau = new MauSacRepository();
    private final IManHinhRepository RepositoryMH = new ManHinhRepository();
    private final ICPURepository RepositoryCPU = new CPURepository();
    private final IRAMRepository RepositoryRAM = new RAMRepository();
    private final ISSDRepository RepositorySSD = new SSDRepository();
    private final INSXRepository RepositoryNoiSx = new NSXRepository();
    private final IBaoHanhRepository RepositoryBaoHanh = new BaoHanhRepository();
    private final ISanPhamRepository RepositoryTenSp = new SanPhamRepository();
    private final Connection con = DBConnection.getConnection();

    @Override
    public List<ChiTietSP> getAll() {
        try {
            List<ChiTietSP> lst = new ArrayList<>();
            String lenh = "select id,IdSP,IdNsx,IdMauSac,IdDongSP,idCPU,idRam,idSSD,idManHinh,idBH,"
                    + "canNang,moTa,SoLuongTon,GiaNhap,GiaBan,ngayTao,ngaySua,trangThai from ChiTietSP";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(lenh);
            while (rs.next()) {
                lst.add(new ChiTietSP(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getDouble(11), rs.getString(12), rs.getInt(13), rs.getBigDecimal(14), rs.getBigDecimal(15), rs.getDate(16), rs.getDate(17), rs.getInt(18)));
            }
            return lst;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Integer them(ChiTietSP sp) {
        try {
            String lenh = "insert into ChiTietSP(IdSP,IdNsx,IdMauSac,IdDongSP,idCPU,idRam,idSSD,idManHinh,idBH,"
                    + "canNang,moTa,SoLuongTon,GiaNhap,GiaBan,ngayTao,ngaySua,trangThai) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(lenh);
            if (sp.getIdSP().equalsIgnoreCase("null")) {
                st.setString(1, null);
            } else {
                st.setString(1, sp.getIdSP());
            }
            if (sp.getIdNSX().equalsIgnoreCase("null")) {
                st.setString(2, null);
            } else {
                st.setString(2, sp.getIdNSX());
            }
            if (sp.getIdMauSac().equalsIgnoreCase("null")) {
                st.setString(3, null);
            } else {
                st.setString(3, sp.getIdMauSac());
            }
            if (sp.getIdDongSP().equalsIgnoreCase("null")) {
                st.setString(4, null);
            } else {
                st.setString(4, sp.getIdDongSP());
            }
            if (sp.getIdCPU().equalsIgnoreCase("null")) {
                st.setString(5, null);
            } else {
                st.setString(5, sp.getIdCPU());
            }
            if (sp.getIdRam().equalsIgnoreCase("null")) {
                st.setString(6, null);
            } else {
                st.setString(6, sp.getIdRam());
            }
            if (sp.getIdSSD().equalsIgnoreCase("null")) {
                st.setString(7, null);
            } else {
                st.setString(7, sp.getIdSSD());
            }
            if (sp.getIdManHinh().equalsIgnoreCase("null")) {
                st.setString(8, null);
            } else {
                st.setString(8, sp.getIdManHinh());
            }
            if (sp.getIdBH().equalsIgnoreCase("null")) {
                st.setString(9, null);
            } else {
                st.setString(9, sp.getIdBH());
            }
            st.setDouble(10, sp.getCanNang());
            st.setString(11, sp.getMoTa());
            st.setInt(12, sp.getSoLuongTon());
            st.setBigDecimal(13, sp.getGiaNhap());
            st.setBigDecimal(14, sp.getGiaBan());
            st.setDate(15, sp.getNgayTao());
            st.setDate(16, sp.getNgaySua());
            st.setInt(17, sp.getTrangThai());

            return st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Integer sua(ChiTietSP sp, String id) {
        try {
            java.util.UUID idCt = UUID.fromString(id);
            String lenh = "update ChiTietSP set IdSP=?,IdNsx=?,IdMauSac=?,IdDongSP=?,idCPU=?,idRam=?,idSSD=?,idManHinh=?,idBH=?,"
                    + "NamBH=?,MoTa=?,SoLuongTon=?,GiaNhap=?,GiaBan=?,ngayTao=?,ngaySua=?,trangThai=? where id=?";
            PreparedStatement st = con.prepareStatement(lenh);
            if (sp.getIdSP().equalsIgnoreCase("null")) {
                st.setString(1, null);
            } else {
                st.setString(1, sp.getIdSP());
            }
            if (sp.getIdNSX().equalsIgnoreCase("null")) {
                st.setString(2, null);
            } else {
                st.setString(2, sp.getIdNSX());
            }
            if (sp.getIdMauSac().equalsIgnoreCase("null")) {
                st.setString(3, null);
            } else {
                st.setString(3, sp.getIdMauSac());
            }
            if (sp.getIdDongSP().equalsIgnoreCase("null")) {
                st.setString(4, null);
            } else {
                st.setString(4, sp.getIdDongSP());
            }
            if (sp.getIdCPU().equalsIgnoreCase("null")) {
                st.setString(5, null);
            } else {
                st.setString(5, sp.getIdCPU());
            }
            if (sp.getIdRam().equalsIgnoreCase("null")) {
                st.setString(6, null);
            } else {
                st.setString(6, sp.getIdRam());
            }
            if (sp.getIdSSD().equalsIgnoreCase("null")) {
                st.setString(7, null);
            } else {
                st.setString(7, sp.getIdSSD());
            }
            if (sp.getIdManHinh().equalsIgnoreCase("null")) {
                st.setString(8, null);
            } else {
                st.setString(8, sp.getIdManHinh());
            }
            if (sp.getIdBH().equalsIgnoreCase("null")) {
                st.setString(9, null);
            } else {
                st.setString(9, sp.getIdBH());
            }
            st.setDouble(10, sp.getCanNang());
            st.setString(11, sp.getMoTa());
            st.setInt(12, sp.getSoLuongTon());
            st.setBigDecimal(13, sp.getGiaNhap());
            st.setBigDecimal(14, sp.getGiaBan());
            st.setDate(15, sp.getNgayTao());
            st.setDate(16, sp.getNgaySua());
            st.setInt(17, sp.getTrangThai());
            st.setObject(18, idCt);

            return st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Integer xoa(String ma) {
        try {
            java.util.UUID id = UUID.fromString(ma);
            String lenh = "delete from chitietsp where id =?";
            PreparedStatement st = con.prepareStatement(lenh);
            st.setObject(1, id);
            return st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;

    }

    @Override
    public Map<String, String> hashMapTenSp() {
        Map<String, String> tenSp = new HashMap<>();
        List<SanPham> lst = RepositoryTenSp.getAll();
        for (SanPham a : lst) {
            tenSp.put(a.getId(), a.getTen());
        }
        return tenSp;
    }

    @Override
    public Map<String, String> hashMapNoiSx() {
        Map<String, String> noiSx = new HashMap<>();
        List<NSX> lst = RepositoryNoiSx.getAll();
        for (NSX a : lst) {
            noiSx.put(a.getId(), a.getTen());
        }
        return noiSx;
    }

    @Override
    public Map<String, String> hashMapMauSac() {
        Map<String, String> mauSac = new HashMap<>();
        List<MauSac> lst = RepositoryMau.getAll();
        for (MauSac a : lst) {
            mauSac.put(a.getId(), a.getTen());
        }
        return mauSac;
    }

    @Override
    public Map<String, String> hashMapDongSp() {

        Map<String, String> dongSp = new HashMap<>();
        List<DongSP> lst = RepositoryDongSp.getAll();
        for (DongSP a : lst) {
            dongSp.put(a.getId(), a.getTen());
        }
        return dongSp;
    }

    @Override
    public Map<String, String> hashMapManHinh() {
        Map<String, String> manhinh = new HashMap<>();
        List<ManHinh> lst = RepositoryMH.getAll();
        for (ManHinh a : lst) {
            manhinh.put(a.getId(), a.getDoPhanGiai());
        }
        return manhinh;
    }

    @Override
    public Map<String, String> hashMapCPU() {
        Map<String, String> cpu = new HashMap<>();
        List<CPU> lst = RepositoryCPU.getAll();
        for (CPU a : lst) {
            cpu.put(a.getId(), a.getTen());
        }
        return cpu;
    }

    @Override
    public Map<String, String> hashMapRAM() {
        Map<String, String> ram = new HashMap<>();
        List<RAM> lst = RepositoryRAM.getAll();
        for (RAM a : lst) {
            ram.put(a.getId(), a.getTen());
        }
        return ram;
    }

    @Override
    public Map<String, String> hashMapSSD() {
        Map<String, String> ssd = new HashMap<>();
        List<SSD> lst = RepositorySSD.getAll();
        for (SSD a : lst) {
            ssd.put(a.getId(), a.getTen());
        }
        return ssd;
    }

    public Map<String, String> hashMapBaoHanh() {
        Map<String, String> bh = new HashMap<>();
        List<BaoHanh> lst = RepositoryBaoHanh.getAll();
        for (BaoHanh a : lst) {
            bh.put(a.getId(), a.getMa());
        }
        return bh;
    }

}

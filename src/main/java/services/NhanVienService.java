/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.NhanVien;
import irepositories.INhanVienRepository;
import iservices.INhanVienService;
import java.util.ArrayList;
import java.util.List;
import repositories.NhanVienRepository;
import viewmodels.NhanVienView;

/**
 *
 * @author ADMIN
 */
public class NhanVienService implements INhanVienService {

    private INhanVienRepository iNhanVienRepo = new NhanVienRepository();

    @Override
    public List<NhanVienView> getAll() {
        List<NhanVienView> lstNhanVienView = new ArrayList<>();
        List<NhanVien> lstNhanVien = iNhanVienRepo.getAll();
        for (NhanVien nhanVien : lstNhanVien) {
            lstNhanVienView.add(new NhanVienView(nhanVien.getId(), nhanVien.getIdCV(), nhanVien.getMa(), nhanVien.getTen(), nhanVien.getTenDem(), nhanVien.getHo(), nhanVien.getGioiTinh(), nhanVien.getNgaySinh(), nhanVien.getDiaChi(), nhanVien.getSdt(), nhanVien.getMatKhau(), nhanVien.getNgayTao(), nhanVien.getNgaySua(), nhanVien.getTrangThai()));
        }
        return lstNhanVienView;
    }

    @Override
    public NhanVien getTaiKhoan(String username) {
        return iNhanVienRepo.getTaiKhoan(username);
    }

    @Override
    public Integer them(NhanVienView nhanVienView) {
        NhanVien nhanVien = new NhanVien(
                nhanVienView.getIdCV(),
                nhanVienView.getMa(),
                nhanVienView.getTen(),
                nhanVienView.getTenDem(),
                nhanVienView.getHo(),
                nhanVienView.getGioiTinh(),
                nhanVienView.getNgaySinh(),
                nhanVienView.getSdt(),
                nhanVienView.getDiaChi(),
                nhanVienView.getMatKhau(),
                nhanVienView.getNgayTao(),
                nhanVienView.getNgaySua(),
                nhanVienView.getTrangThai()
        );
        return iNhanVienRepo.them(nhanVien);
    }

    @Override
    public Integer sua(NhanVienView nhanVienView) {
        NhanVien nhanVien = new NhanVien(
                nhanVienView.getIdCV(),
                nhanVienView.getMa(),
                nhanVienView.getTen(),
                nhanVienView.getTenDem(),
                nhanVienView.getHo(),
                nhanVienView.getGioiTinh(),
                nhanVienView.getNgaySinh(),
                nhanVienView.getSdt(),
                nhanVienView.getDiaChi(),
                nhanVienView.getMatKhau(),
                nhanVienView.getNgayTao(),
                nhanVienView.getNgaySua(),
                nhanVienView.getTrangThai()
        );
        return iNhanVienRepo.sua(nhanVien);
    }

    @Override
    public Integer xoa(String ma) {
        return iNhanVienRepo.xoa(ma);
    }

    @Override
    public NhanVienView getIdByTen(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> getTenChucVu() {
        return iNhanVienRepo.getChucVu();
    }

    @Override
    public NhanVienView checkTrungMa(String ma) {
        NhanVien nhanVien = iNhanVienRepo.checkTrungMa(ma);
        if (nhanVien != null) {
            NhanVienView nhanVienView = new NhanVienView(
                    nhanVien.getIdCV(),
                    nhanVien.getMa(),
                    nhanVien.getTen(),
                    nhanVien.getTenDem(),
                    nhanVien.getHo(),
                    nhanVien.getGioiTinh(),
                    nhanVien.getNgaySinh(),
                    nhanVien.getSdt(),
                    nhanVien.getDiaChi(),
                    nhanVien.getMatKhau(),
                    nhanVien.getNgayTao(),
                    nhanVien.getNgaySua(),
                    nhanVien.getTrangThai()
            );
            return nhanVienView;

        }
        return null;
    }

}

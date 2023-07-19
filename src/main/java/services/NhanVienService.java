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

/**
 *
 * @author ADMIN
 */
public class NhanVienService implements INhanVienService {

    private INhanVienRepository iNhanVienRepo = new NhanVienRepository();

    @Override
    public List<NhanVien> getAll() {
        return iNhanVienRepo.getAll();
    }

    @Override
    public NhanVien getTaiKhoan(String username) {
        return iNhanVienRepo.getTaiKhoan(username);
    }

    @Override
    public Integer them(NhanVien nhanVien) {
        return iNhanVienRepo.them(nhanVien);
    }

    @Override
    public Integer sua(NhanVien nhanVien) {
        return iNhanVienRepo.sua(nhanVien);
    }

    @Override
    public Integer xoa(String ma) {
        return iNhanVienRepo.xoa(ma);
    }

    @Override
    public String getIdByTen(String ma) {
        return iNhanVienRepo.getIdByTen(ma);
    }

    @Override
    public List<String> getTenChucVu() {
        return iNhanVienRepo.getChucVu();
    }

    @Override
    public NhanVien checkTrungMa(String ma) {
        return iNhanVienRepo.checkTrungMa(ma);
    }

    @Override
    public List<NhanVien> timTen(String ten) {
        return iNhanVienRepo.timTen(ten);
    }

    @Override
    public List<NhanVien> sapXepTenGiam() {
        return iNhanVienRepo.sapXepTenGiam();
    }

    @Override
    public List<NhanVien> sapXepTenTang() {
        return iNhanVienRepo.sapXepTenTang();
    }

    @Override
    public NhanVien getHoTenByMa(String ma) {
        return iNhanVienRepo.getHoTenByMa(ma);
    }
    
}

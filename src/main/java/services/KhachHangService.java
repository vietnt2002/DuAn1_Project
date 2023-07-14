/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.KhachHang;
import irepositories.IKhachHangRepository;
import iservices.IKhachHangService;
import java.util.ArrayList;
import java.util.List;
import repositories.KhachHangRepository;
import viewmodels.KhachHangView;

/**
 *
 * @author ADMIN
 */
public class KhachHangService implements IKhachHangService {

    private IKhachHangRepository ikhachHangRepo = new KhachHangRepository();

    @Override
    public List<KhachHangView> getAll() {
        List<KhachHangView> listKhachHangView = new ArrayList<>();
        List<KhachHang> listKhachHang = ikhachHangRepo.getAll();
        for (KhachHang khachHang : listKhachHang) {
            KhachHangView khachHangView = new KhachHangView(
                    khachHang.getId(),
                    khachHang.getMa(),
                    khachHang.getTen(),
                    khachHang.getTenDem(),
                    khachHang.getHo(),
                    khachHang.getNgaySinh(),
                    khachHang.getSdt(),
                    khachHang.getDiaChi(),
                    khachHang.getThanhPho(),
                    khachHang.getQuocGia(),
                    khachHang.getNgayTao(),
                    khachHang.getNgaySua(),
                    khachHang.getTrangThai()
            );
            listKhachHangView.add(khachHangView);
        }
        return listKhachHangView;
    }

    @Override
    public Integer them(KhachHangView khachHangView) {
        KhachHang khachHang = new KhachHang(
                khachHangView.getMa(),
                khachHangView.getTen(),
                khachHangView.getTenDem(),
                khachHangView.getHo(),
                khachHangView.getNgaySinh(),
                khachHangView.getSdt(),
                khachHangView.getDiaChi(),
                khachHangView.getThanhPho(),
                khachHangView.getQuocGia(),
                khachHangView.getNgayTao(),
                khachHangView.getNgaySua(),
                khachHangView.getTrangThai()
        );
        return ikhachHangRepo.them(khachHang);
    }

    @Override
    public Integer sua(KhachHangView khachHangView) {
        KhachHang khachHang = new KhachHang(
                khachHangView.getMa(),
                khachHangView.getTen(),
                khachHangView.getTenDem(),
                khachHangView.getHo(),
                khachHangView.getNgaySinh(),
                khachHangView.getSdt(),
                khachHangView.getDiaChi(),
                khachHangView.getThanhPho(),
                khachHangView.getQuocGia(),
                khachHangView.getNgayTao(),
                khachHangView.getNgaySua(),
                khachHangView.getTrangThai()
        );
        return ikhachHangRepo.sua(khachHang);
    }

    @Override
    public Integer xoa(String ma) {
        return ikhachHangRepo.xoa(ma);
    }

    @Override
    public KhachHangView getIdByTen(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhachHangView> findTen(String ten1, String thanhPho1) {
        List<KhachHangView> listKhachHangView = new ArrayList<>();
        List<KhachHang> listKhachHang = ikhachHangRepo.findTen(ten1, thanhPho1);
        for (KhachHang khachHang : listKhachHang) {
            KhachHangView khview = new KhachHangView(khachHang.getMa(),
                    khachHang.getTen(),
                    khachHang.getTenDem(),
                    khachHang.getHo(),
                    khachHang.getNgaySinh(),
                    khachHang.getSdt(),
                    khachHang.getDiaChi(),
                    khachHang.getThanhPho(),
                    khachHang.getQuocGia(),
                    khachHang.getNgayTao(),
                    khachHang.getNgaySua(),
                    khachHang.getTrangThai());
            listKhachHangView.add(khview);
        }
        return listKhachHangView;
    }

    @Override
    public List<KhachHangView> sapXepTenGiam() {
        List<KhachHangView> listKhachHangView = new ArrayList<>();
        List<KhachHang> listKhachHang = ikhachHangRepo.sapXepTenGiam();
        for (KhachHang khachHang : listKhachHang) {
            KhachHangView khachHangView = new KhachHangView(
                    khachHang.getId(),
                    khachHang.getMa(),
                    khachHang.getTen(),
                    khachHang.getTenDem(),
                    khachHang.getHo(),
                    khachHang.getNgaySinh(),
                    khachHang.getSdt(),
                    khachHang.getDiaChi(),
                    khachHang.getThanhPho(),
                    khachHang.getQuocGia(),
                    khachHang.getNgayTao(),
                    khachHang.getNgaySua(),
                    khachHang.getTrangThai()
            );
            listKhachHangView.add(khachHangView);
        }
        return listKhachHangView;
    }

    @Override
    public List<KhachHangView> sapXepTenTang() {
        List<KhachHangView> listKhachHangView = new ArrayList<>();
        List<KhachHang> listKhachHang = ikhachHangRepo.sapXepTenTang();
        for (KhachHang khachHang : listKhachHang) {
            KhachHangView khachHangView = new KhachHangView(
                    khachHang.getId(),
                    khachHang.getMa(),
                    khachHang.getTen(),
                    khachHang.getTenDem(),
                    khachHang.getHo(),
                    khachHang.getNgaySinh(),
                    khachHang.getSdt(),
                    khachHang.getDiaChi(),
                    khachHang.getThanhPho(),
                    khachHang.getQuocGia(),
                    khachHang.getNgayTao(),
                    khachHang.getNgaySua(),
                    khachHang.getTrangThai()
            );
            listKhachHangView.add(khachHangView);
        }
        return listKhachHangView;
    }

    @Override
    public List<String> gettenThanhPho() {
        return ikhachHangRepo.gettenThanhPho();
    }

    @Override
    public KhachHangView checkTrungMa(String ma) {
        KhachHang khachHang = ikhachHangRepo.checkTrungMa(ma);
        if (khachHang != null) {
            KhachHangView khachHangView = new KhachHangView(
                    khachHang.getId(),
                    khachHang.getMa(),
                    khachHang.getTen(),
                    khachHang.getTenDem(),
                    khachHang.getHo(),
                    khachHang.getNgaySinh(),
                    khachHang.getSdt(),
                    khachHang.getDiaChi(),
                    khachHang.getThanhPho(),
                    khachHang.getQuocGia(),
                    khachHang.getNgayTao(),
                    khachHang.getNgaySua(),
                    khachHang.getTrangThai()
            );
            return khachHangView;
        }
        return null;
    }

}

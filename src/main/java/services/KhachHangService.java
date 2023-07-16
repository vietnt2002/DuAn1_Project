/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.KhachHang;
import irepositories.IKhachHangRepository;
import iservices.IKhachHangService;
import java.util.List;
import repositories.KhachHangRepository;
/**
 *
 * @author ADMIN
 */
public class KhachHangService implements IKhachHangService {

    private IKhachHangRepository ikhachHangRepo = new KhachHangRepository();

    @Override
    public List<KhachHang> getAll() {
        return ikhachHangRepo.getAll();
    }

    @Override
    public Integer them(KhachHang khachHang) {
        return ikhachHangRepo.them(khachHang);
    }

    @Override
    public Integer sua(KhachHang khachHang) {
        return ikhachHangRepo.sua(khachHang);
    }

    @Override
    public Integer xoa(String ma) {
        return ikhachHangRepo.xoa(ma);
    }

    @Override
    public KhachHang getIdByTen(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

    @Override
    public List<KhachHang> sapXepTenGiam() {
        return ikhachHangRepo.sapXepTenGiam();
    }

    @Override
    public List<KhachHang> sapXepTenTang() {
        return ikhachHangRepo.sapXepTenTang();
    }



    @Override
    public KhachHang checkTrungMa(String ma) {
        return ikhachHangRepo.checkTrungMa(ma);
    }
}

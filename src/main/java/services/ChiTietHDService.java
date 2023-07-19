/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.ChiTietHD;
import irepositories.IChiTietHDRepository;
import iservices.IChiTietHDService;
import java.util.List;
import repositories.ChiTietHDRepository;

/**
 *
 * @author ADMIN
 */
public class ChiTietHDService implements IChiTietHDService{
    private IChiTietHDRepository chiTietHDRepo = new ChiTietHDRepository();

    @Override
    public List<ChiTietHD> getAll() {
        return chiTietHDRepo.getAll();
    }
    
    @Override
    public List<ChiTietHD> getAllByIdHD(String idHD) {
        return chiTietHDRepo.getAllByIdHD(idHD);
    }

    @Override
    public Integer them(ChiTietHD chiTietHD) {
        return chiTietHDRepo.them(chiTietHD);
    }

    @Override
    public Integer sua(ChiTietHD chiTietHD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer xoa(String idCtsp, String idHD) {
        return chiTietHDRepo.xoa(idCtsp, idHD);
    }

    @Override
    public String getIdByIdHD(String idHD) {
        return chiTietHDRepo.getIdByIdHD(idHD);
    }

    @Override
    public Integer themSoLuong(ChiTietHD chiTietHD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer botSoLuong(ChiTietHD chiTietHD) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

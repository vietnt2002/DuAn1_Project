/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.ChucVu;
import irepositories.IChucVuRepository;
import iservices.IChucVuService;
import java.util.ArrayList;
import java.util.List;
import repositories.ChucVuRepository;
import viewmodels.ChucVuView;

/**
 *
 * @author ADMIN
 */
public class ChucVuService implements IChucVuService {

    private IChucVuRepository iChucVuRepo = new ChucVuRepository();

    @Override
    public List<ChucVuView> getAll() {
        List<ChucVuView> listChucVuView = new ArrayList<>();
        List<ChucVu> listChucVu = iChucVuRepo.getAll();
        for (ChucVu chucVu : listChucVu) {
            ChucVuView chucVuView = new ChucVuView(chucVu.getId(),
                    chucVu.getMa(),
                    chucVu.getTen(),
                    chucVu.getNgayTao(),
                    chucVu.getNgaySua(),
                    chucVu.getTrangThai());
            listChucVuView.add(chucVuView);
        }
        return listChucVuView;
    }

    @Override
    public Integer them(ChucVuView chucVuView) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer sua(ChucVuView chucVuView) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer xoa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ChucVuView getIdByTen(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

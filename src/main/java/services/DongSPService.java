/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.DongSP;
import irepositories.IDongSPRepository;
import iservices.IDongSPService;
import java.util.ArrayList;
import java.util.List;
import repositories.DongSPRepository;
import viewmodels.DongSPView;

/**
 *
 * @author ADMIN
 */
public class DongSPService implements IDongSPService {

    private final IDongSPRepository reposytory = new DongSPRepository();

    @Override
    public List<DongSPView> getAll() {
        List<DongSP> lst = reposytory.getAll();
        List<viewmodels.DongSPView> lst1 = new ArrayList<>();
        for (domainmodels.DongSP a : lst) {
            lst1.add(new viewmodels.DongSPView(a.getId(), a.getMa(), 
                    a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getTrangThai()));
        }
        return lst1;
    }

    @Override
    public Integer them(DongSPView dong) {
        DongSP dongS = new DongSP(dong.getMa(), dong.getTen(), dong.getNgayTao(), dong.getNgaySua(), dong.getTrangThai());
        return reposytory.them(dongS);
    }

    @Override
    public Integer sua(DongSPView dong) {
        DongSP dongS = new DongSP(dong.getMa(), dong.getTen(), dong.getNgayTao(), dong.getNgaySua(), dong.getTrangThai());
        return reposytory.sua(dongS);
    }

    @Override
    public Integer xoa(String ma) {
        return reposytory.xoa(ma);
    }

    @Override
    public DongSPView getIdByTen(String ten) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.Sanpham;
import irepositories.ISanPhamRepository;
import iservices.ISanPhamService;
import java.util.ArrayList;
import java.util.List;
import repositories.SanPhamRepository;
import viewmodels.SanPhamView;

/**
 *
 * @author ADMIN
 */
public class SanPhamService implements ISanPhamService {

    private final ISanPhamRepository reposytory = new SanPhamRepository();

    @Override
    public List<SanPhamView> getAll() {
        List<Sanpham> lst = reposytory.getAll();
        List<viewmodels.SanPhamView> lst1 = new ArrayList<>();
        for (domainmodels.Sanpham a : lst) {
            lst1.add(new viewmodels.SanPhamView(a.getId(), a.getMa(),
                    a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getTrangThai()));
        }
        return lst1;
    }

    @Override
    public Integer them(SanPhamView sp) {
        Sanpham spS = new Sanpham(sp.getMa(), sp.getTen(), sp.getNgayTao(), sp.getNgaySua(), sp.getTrangThai());
        return reposytory.them(spS);
    }

    @Override
    public Integer sua(SanPhamView sp) {
        Sanpham spS = new Sanpham(sp.getMa(), sp.getTen(), sp.getNgayTao(), sp.getNgaySua(), sp.getTrangThai());
        return reposytory.sua(spS);
    }

    @Override
    public Integer xoa(String ma) {
        return reposytory.xoa(ma);
    }

}


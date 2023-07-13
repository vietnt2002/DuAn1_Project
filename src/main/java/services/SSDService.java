/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.SSD;
import irepositories.ISSDRepository;
import iservices.ISSDService;
import java.util.ArrayList;
import java.util.List;
import repositories.SSDRepository;
import viewmodels.SSDView;

/**
 *
 * @author ADMIN
 */
public class SSDService implements ISSDService {

    private final ISSDRepository reposytory = new SSDRepository();

    @Override
    public List<SSDView> getAll() {
        List<SSD> lst = reposytory.getAll();
        List<viewmodels.SSDView> lst1 = new ArrayList<>();
        for (domainmodels.SSD a : lst) {
            lst1.add(new viewmodels.SSDView(a.getId(), a.getMa(),
                    a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getTrangThai()));
        }
        return lst1;
    }

    @Override
    public Integer them(SSDView ssd) {
        SSD ssdS = new SSD(ssd.getMa(), ssd.getTen(), ssd.getNgayTao(), ssd.getNgaySua(), ssd.getTrangThai());
        return reposytory.them(ssdS);
    }

    @Override
    public Integer sua(SSDView ssd) {
        SSD ssdS = new SSD(ssd.getMa(), ssd.getTen(), ssd.getNgayTao(), ssd.getNgaySua(), ssd.getTrangThai());
        return reposytory.sua(ssdS);
    }

    @Override
    public Integer xoa(String ma) {
        return reposytory.xoa(ma);
    }

}
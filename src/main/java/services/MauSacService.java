package services;

import domainmodels.MauSac;
import irepositories.IMauSacRepository;
import iservices.IMauSacService;
import java.util.ArrayList;
import java.util.List;
import repositories.MauSacRepository;
import viewmodels.MauSacView;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class MauSacService implements IMauSacService {

    private final IMauSacRepository reposytory = new MauSacRepository();

    @Override
    public List<MauSacView> getAll() {
        List<MauSac> lst = reposytory.getAll();
        List<viewmodels.MauSacView> lst1 = new ArrayList<>();
        for (domainmodels.MauSac a : lst) {
            lst1.add(new viewmodels.MauSacView(a.getId(), a.getMa(),
                    a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getTrangThai()));
        }
        return lst1;
    }

    @Override
    public Integer them(MauSacView mau) {
        MauSac mauS = new MauSac(mau.getMa(), mau.getTen(), mau.getNgayTao(), mau.getNgaySua(), mau.getTrangThai());
        return reposytory.them(mauS);
    }

    @Override
    public Integer sua(MauSacView mau) {
        MauSac mauS = new MauSac(mau.getMa(), mau.getTen(), mau.getNgayTao(), mau.getNgaySua(), mau.getTrangThai());
        return reposytory.sua(mauS);
    }

    @Override
    public Integer xoa(String ma) {
        return reposytory.xoa(ma);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.RAM;
import irepositories.IRAMRepository;
import iservices.IRAMService;
import java.util.ArrayList;
import java.util.List;
import repositories.RAMRepository;
import viewmodels.RAMView;

/**
 *
 * @author ADMIN
 */
public class RAMService implements IRAMService {
    private final IRAMRepository reposytory = new RAMRepository();

    @Override
    public List<RAMView> getAll() {
        List<RAM> lst = reposytory.getAll();
        List<viewmodels.RAMView> lst1 = new ArrayList<>();
        for (domainmodels.RAM a : lst) {
            lst1.add(new viewmodels.RAMView(a.getId(), a.getMa(),
                    a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getTrangThai()));
        }
        return lst1;
    }

    @Override
    public Integer them(RAMView ram) {
        RAM ramS = new RAM(ram.getMa(), ram.getTen(), ram.getNgayTao(), ram.getNgaySua(), ram.getTrangThai());
        return reposytory.them(ramS);
    }

    @Override
    public Integer sua(RAMView ram) {
        RAM ramS = new RAM(ram.getMa(), ram.getTen(), ram.getNgayTao(), ram.getNgaySua(), ram.getTrangThai());
        return reposytory.sua(ramS);
    }

    @Override
    public Integer xoa(String ma) {
        return reposytory.xoa(ma);
    }
}

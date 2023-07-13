/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.CPU;
import irepositories.ICPURepository;
import iservices.ICPUService;
import java.util.ArrayList;
import java.util.List;
import repositories.CPURepository;
import viewmodels.CPUView;

/**
 *
 * @author ADMIN
 */
public class CPUService implements ICPUService {

    private final ICPURepository reposytory = new CPURepository();

    @Override
    public List<CPUView> getAll() {
        List<CPU> lst = reposytory.getAll();
        List<viewmodels.CPUView> lst1 = new ArrayList<>();
        for (domainmodels.CPU a : lst) {
            lst1.add(new viewmodels.CPUView(a.getId(), a.getMa(),
                    a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getTrangThai()));
        }
        return lst1;
    }

    @Override
    public Integer them(CPUView cpu) {
        CPU cpuS = new CPU(cpu.getMa(), cpu.getTen(), cpu.getNgayTao(), cpu.getNgaySua(), cpu.getTrangThai());
        return reposytory.them(cpuS);
    }

    @Override
    public Integer sua(CPUView cpu) {
        CPU cpuS = new CPU(cpu.getMa(), cpu.getTen(), cpu.getNgayTao(), cpu.getNgaySua(), cpu.getTrangThai());
        return reposytory.sua(cpuS);
    }

    @Override
    public Integer xoa(String ma) {
        return reposytory.xoa(ma);
    }

}

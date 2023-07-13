/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.CPUView;

/**
 *
 * @author ADMIN
 */
public interface ICPUService {
    List<CPUView> getAll();
    Integer them(CPUView cpuView);
    Integer sua(CPUView cpuView);
    Integer xoa(String ma);
}

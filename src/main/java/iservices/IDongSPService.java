/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.DongSPView;

/**
 *
 * @author ADMIN
 */
public interface IDongSPService {
    List<DongSPView> getAll();
    Integer them(DongSPView dongSPView);
    Integer sua(DongSPView dongSPView);
    Integer xoa(String ma);
    DongSPView getIdByTen(String ten);
}

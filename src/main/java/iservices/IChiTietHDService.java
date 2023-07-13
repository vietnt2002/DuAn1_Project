/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.ChiTietHDView;

/**
 *
 * @author ADMIN
 */
public interface IChiTietHDService {
    List<ChiTietHDView> getAll();
    Integer them(ChiTietHDView chiTietHDView);
    Integer sua(ChiTietHDView chiTietHDView);
    Integer xoa(String ma);
    ChiTietHDView getIdByTen(String ten);
}

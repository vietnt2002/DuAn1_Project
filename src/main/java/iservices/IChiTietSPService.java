/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.ChiTietSPView;

/**
 *
 * @author ADMIN
 */
public interface IChiTietSPService {
    List<ChiTietSPView> getAll();
    Integer them(ChiTietSPView chiTietSPView);
    Integer sua(ChiTietSPView chiTietSPView);
    Integer xoa(String ma);
    ChiTietSPView getIdByTen(String ten);
}

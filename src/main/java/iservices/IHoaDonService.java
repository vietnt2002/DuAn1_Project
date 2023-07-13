/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.HoaDonView;

/**
 *
 * @author ADMIN
 */
public interface IHoaDonService {
    List<HoaDonView> getAll();
    Integer them(HoaDonView hoaDonView);
    Integer sua(HoaDonView hoaDonView);
    Integer xoa(String ma);
    HoaDonView getIdByTen(String ten);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import domainmodels.ChiTietHD;
import irepositories.*;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IChiTietHDService {
    List<ChiTietHD> getAll();
    List<ChiTietHD> getAllByIdHD(String idHD);
    Integer them(ChiTietHD chiTietHD);
    Integer sua(ChiTietHD chiTietHD);
    Integer xoa(String idCtsp, String idHD);
    String getIdByIdHD(String idHD);
    Integer themSoLuong(ChiTietHD chiTietHD);
    Integer botSoLuong(ChiTietHD chiTietHD);
}

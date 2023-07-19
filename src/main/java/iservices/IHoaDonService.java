/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import domainmodels.HoaDon;
import irepositories.*;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IHoaDonService {
    List<HoaDon> getAll();
    List<HoaDon> getAllByMa(String ma);
    Integer them(HoaDon hoaDon);
    Integer sua(HoaDon hoaDon);
    Integer xoa(String ma);
    String getIdByMa(String ma);
}

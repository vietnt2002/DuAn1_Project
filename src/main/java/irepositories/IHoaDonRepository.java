/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package irepositories;

import domainmodels.CPU;
import domainmodels.HoaDon;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IHoaDonRepository {
    List<HoaDon> getAll();
    Integer them(HoaDon hoaDon);
    Integer sua(HoaDon hoaDon);
    Integer xoa(String ma);
    HoaDon getIdByTen(String ten);
}

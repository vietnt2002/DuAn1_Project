/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.SanPhamView;

/**
 *
 * @author ADMIN
 */
public interface ISanPhamService {
    List<SanPhamView> getAll();
    Integer them(SanPhamView sanPhamView);
    Integer sua(SanPhamView sanPhamView);
    Integer xoa(String ma);
    SanPhamView getIdByTen(String ten);
}

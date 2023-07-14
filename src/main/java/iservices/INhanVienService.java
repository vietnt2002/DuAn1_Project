/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.NhanVienView;

/**
 *
 * @author ADMIN
 */
public interface INhanVienService {

    List<NhanVienView> getAll();

    Integer them(NhanVienView nhanVienView);

    Integer sua(NhanVienView nhanVienView);

    Integer xoa(String ma);

    NhanVienView getIdByTen(String ten);

    NhanVienView checkTrungMa(String ma);

    List<String> getTenChucVu();
}

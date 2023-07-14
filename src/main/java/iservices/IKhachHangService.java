/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import java.util.List;

import viewmodels.KhachHangView;

/**
 *
 * @author ADMIN
 */
public interface IKhachHangService {

    List<KhachHangView> getAll();

    Integer them(KhachHangView khachHangView);

    Integer sua(KhachHangView khachHangView);

    Integer xoa(String ma);

    KhachHangView getIdByTen(String ten);

    KhachHangView checkTrungMa(String ma);

    List<KhachHangView> sapXepTenGiam();

    List<KhachHangView> sapXepTenTang();

    List<KhachHangView> findTen(String ten1, String thanhPho1);

    List<String> gettenThanhPho();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import domainmodels.KhachHang;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IKhachHangService {

    List<KhachHang> getAll();

    Integer them(KhachHang khachHang);

    Integer sua(KhachHang khachHang);

    Integer xoa(String ma);

    String getIdBySDT(String sdt);

    String getIdByMa(String ma);

    KhachHang checkTrungMa(String ma);

    List<KhachHang> sapXepTenGiam();

    List<KhachHang> sapXepTenTang();

    List<KhachHang> timTen(String timTen);

    KhachHang getHoTenByMa(String ma);

    KhachHang getThongTinBySdtOrEmail(String sdt);

    List<Integer> getSoLanMua();

    List<KhachHang> locSoLanMua(int solan);
}

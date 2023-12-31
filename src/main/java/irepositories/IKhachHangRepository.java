/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package irepositories;

import domainmodels.KhachHang;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IKhachHangRepository {

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

    KhachHang getThongTinBySdtOrEmail(String sdtOrEmail);

    List<Integer> getSoLanMua();

    List<KhachHang> locSoLanMua(int solan);
}

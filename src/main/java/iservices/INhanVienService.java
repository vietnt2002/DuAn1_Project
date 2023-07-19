/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import domainmodels.NhanVien;
import irepositories.*;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface INhanVienService {

    List<NhanVien> getAll();

    NhanVien getTaiKhoan(String username);

    Integer them(NhanVien nhanVien);

    Integer sua(NhanVien nhanVien);

    Integer xoa(String ma);

    String getIdByTen(String ten);

    NhanVien checkTrungMa(String ma);

    List<String> getTenChucVu();

    List<NhanVien> timTen(String ten);

    List<NhanVien> sapXepTenGiam();

    List<NhanVien> sapXepTenTang();
    
    NhanVien getHoTenByMa(String ma);
}

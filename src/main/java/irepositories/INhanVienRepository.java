/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package irepositories;

import domainmodels.CPU;
import domainmodels.NhanVien;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface INhanVienRepository {

    List<NhanVien> getAll();

    NhanVien getTaiKhoan(String username);

    Integer them(NhanVien nhanVien);

    Integer sua(NhanVien nhanVien);

    Integer xoa(String ma);

    NhanVien getIdByTen(String ten);

    NhanVien checkTrungMa(String ma);

    List<String> getChucVu();
}

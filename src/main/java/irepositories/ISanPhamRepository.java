/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package irepositories;

import domainmodels.CPU;
import domainmodels.Sanpham;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ISanPhamRepository {
    List<Sanpham> getAll();
    Integer them(Sanpham sanPham);
    Integer sua(Sanpham sanPham);
    Integer xoa(String ma);
}

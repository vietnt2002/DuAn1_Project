/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package irepositories;

import domainmodels.CPU;
import domainmodels.ChiTietSP;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IChiTietSPRepository {
    List<ChiTietSP> getAll();
    Integer them(ChiTietSP chiTietSP);
    Integer sua(ChiTietSP chiTietSP);
    Integer xoa(String ma);
    ChiTietSP getIdByTen(String ten);
}

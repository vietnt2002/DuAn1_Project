/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import domainmodels.ChiTietSP;
import irepositories.*;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IChiTietSPService {
    List<ChiTietSP> getAll();
    Integer them(ChiTietSP chiTietSP);
    Integer sua(ChiTietSP chiTietSP);
    Integer xoa(String ma);
    ChiTietSP getIdByTen(String ten);
}

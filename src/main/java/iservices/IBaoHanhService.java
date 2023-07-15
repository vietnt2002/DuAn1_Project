/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import domainmodels.BaoHanh;
import irepositories.*;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IBaoHanhService {
    List<BaoHanh> getAll();
    Integer them(BaoHanh baoHanh);
    Integer sua(BaoHanh baoHanh);
    Integer xoa(String ma);
    BaoHanh getIdByTen(String ten);
}

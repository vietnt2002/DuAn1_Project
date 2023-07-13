/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;

/**
 *
 * @author ADMIN
 */
public interface IBaoHanhService {
    List<BaoHanhView> getAll();
    Integer them(BaoHanhView baoHanhView);
    Integer sua(BaoHanhView baoHanhView);
    Integer xoa(String ma);
    BaoHanhView getIdByTen(String ten);
}

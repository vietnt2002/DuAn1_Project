/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.ChucVuView;

/**
 *
 * @author ADMIN
 */
public interface IChucVuService {
    List<ChucVuView> getAll();
    Integer them(ChucVuView chucVuView);
    Integer sua(ChucVuView chucVuView);
    Integer xoa(String ma);
    ChucVuView getIdByTen(String ten);
}

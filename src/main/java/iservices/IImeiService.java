/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.ImeiView;

/**
 *
 * @author ADMIN
 */
public interface IImeiService {
    List<ImeiView> getAll();
    Integer them(ImeiView imeiView);
    Integer sua(ImeiView imeiView);
    Integer xoa(String ma);
    ImeiView getIdByTen(String ten);
}

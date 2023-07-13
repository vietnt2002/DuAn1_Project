/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.ImeiDaBanView;

/**
 *
 * @author ADMIN
 */
public interface IImeiDaBanService {
    List<ImeiDaBanView> getAll();
    Integer them(ImeiDaBanView imeiDaBanView);
    Integer sua(ImeiDaBanView imeiDaBanView);
    Integer xoa(String ma);
    ImeiDaBanView getIdByTen(String ten);
}

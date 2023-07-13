/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.MauSacView;

/**
 *
 * @author ADMIN
 */
public interface IMauSacService {
    List<MauSacView> getAll();
    Integer them(MauSacView mauSacView);
    Integer sua(MauSacView mauSacView);
    Integer xoa(String ma);
    MauSacView getIdByTen(String ten);
}

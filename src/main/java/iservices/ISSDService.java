/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.SSDView;

/**
 *
 * @author ADMIN
 */
public interface ISSDService {
    List<SSDView> getAll();
    Integer them(SSDView ssdView);
    Integer sua(SSDView ssdView);
    Integer xoa(String ma);
}

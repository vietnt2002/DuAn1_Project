/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.RAMView;

/**
 *
 * @author ADMIN
 */
public interface IRAMService {
    List<RAMView> getAll();
    Integer them(RAMView ramView);
    Integer sua(RAMView ramView);
    Integer xoa(String ma);
}

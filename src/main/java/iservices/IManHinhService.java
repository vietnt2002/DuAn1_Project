/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.ManHinhView;

/**
 *
 * @author ADMIN
 */
public interface IManHinhService {
    List<ManHinhView> getAll();
    Integer them(ManHinhView manHinhView);
    Integer sua(ManHinhView manHinhView);
    Integer xoa(String ma);
    ManHinhView getIdByTen(String ten);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import irepositories.*;
import java.util.List;
import viewmodels.BaoHanhView;
import viewmodels.NSXView;

/**
 *
 * @author ADMIN
 */
public interface INSXService {
    List<NSXView> getAll();
    Integer them(NSXView nsxView);
    Integer sua(NSXView nsxView);
    Integer xoa(String ma);
    NSXView getIdByTen(String ten);
}

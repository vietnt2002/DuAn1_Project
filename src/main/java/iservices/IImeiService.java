/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import domainmodels.Imei;
import irepositories.*;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IImeiService {
    List<Imei> getAll();
    List<Imei> getAllByIdCtsp(String idCtsp);
    Integer them(Imei imei);
    Integer sua(Imei imei);
    Integer xoa(String ma);
    Imei getIdByIMei(String im);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.Imei;
import irepositories.IImeiRepository;
import iservices.IImeiService;
import java.util.List;
import repositories.ImeiRepository;

/**
 *
 * @author ADMIN
 */
public class ImeiService implements IImeiService{
    private IImeiRepository imeiRepo = new ImeiRepository();
    
    @Override
    public List<Imei> getAll() {
        return imeiRepo.getAll();
    }
    
    @Override
    public List<Imei> getAllByIdCtsp(String idCtsp) {
        return imeiRepo.getAllByIdCtsp(idCtsp);
    }

    @Override
    public Integer them(Imei imei) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer sua(Imei imei) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer xoa(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Imei getIdByIMei(String im) {
        return imeiRepo.getIdByIMei(im);
    }
}

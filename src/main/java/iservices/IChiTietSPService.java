/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservices;

import domainmodels.ChiTietSP;
import domainmodels.ChiTietSPView;
import irepositories.*;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public interface IChiTietSPService {
    List<ChiTietSP> getAllCTSP();
    List<ChiTietSP> getAllByDongSP(String tenDongSP);
    Integer themCTSP(ChiTietSP chiTietSP);
    Integer suaCTSP(ChiTietSP chiTietSP);
    Integer xoaCTSP(String ma);
    
    
    ChiTietSP getIdByMa(String ma);
    List<ChiTietSPView> getAll(Map<String, String> TenSp,
         Map<String, String> NSX, Map<String, String> MauSac ,
         Map<String, String> DongSp, Map<String, String> CPU, Map<String, String> RAM, Map<String, String> SSD, Map<String, String> ManHinh, Map<String, String> BaoHanh);
    Integer them(ChiTietSPView sp, Map<String, String> TenSp,
         Map<String, String> NSX, Map<String, String> MauSac ,
         Map<String, String> DongSp, Map<String, String> CPU, Map<String, String> RAM, Map<String, String> SSD, Map<String, String> ManHinh, Map<String, String> BaoHanh);
    Integer sua(ChiTietSPView sp,Map<String, String> TenSp,
         Map<String, String> NSX, Map<String, String> MauSac ,
         Map<String, String> DongSp, Map<String, String> CPU, Map<String, String> RAM, Map<String, String> SSD, Map<String, String> ManHinh, Map<String, String> BaoHanh, String id);
    Integer xoa(String ma);
    Map<String, String> hashMapTenSp();
    Map<String, String> hashMapNoiSx();
    Map<String, String> hashMapMauSac();
    Map<String, String> hashMapDongSp();
    Map<String, String> hashMapManHinh();
    Map<String, String> hashMapCPU();
    Map<String, String> hashMapRAM();
    Map<String, String> hashMapSSD();
    Map<String, String> hashMapBaoHanh();
    Map<String, String> hashMapHoaDon();
}

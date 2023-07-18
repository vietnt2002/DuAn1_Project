/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package irepositories;

import domainmodels.CPU;
import domainmodels.ChiTietSP;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public interface IChiTietSPRepository {
    List<ChiTietSP> getAll();
    Integer them(ChiTietSP sp);
    Integer sua(ChiTietSP sp,String id);
    Integer xoa(String ma);
    Map<String, String> hashMapTenSp();
    Map<String, String> hashMapNoiSx();
    Map<String, String> hashMapMauSac();
    Map<String, String> hashMapDongSp();
    Map<String, String> hashMapManHinh();
    Map<String, String> hashMapCPU();
    Map<String, String> hashMapRAM();
    Map<String, String> hashMapSSD();
    Map<String, String> hashMapCTHD();
    Map<String, String> hashMapBaoHanh();
}

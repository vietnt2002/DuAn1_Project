/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import domainmodels.ChiTietSP;
import domainmodels.ChiTietSPView;
import irepositories.IChiTietSPRepository;
import iservices.IChiTietSPService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import repositories.ChiTietSPRepository;

/**
 *
 * @author ADMIN
 */
public class ChiTietSPService implements IChiTietSPService {

    private final IChiTietSPRepository Repository = new ChiTietSPRepository();

    @Override
    public List<ChiTietSPView> getAll(Map<String, String> TenSp, Map<String, String> NSX, Map<String, String> MauSac, Map<String, String> DongSp, Map<String, String> CPU, Map<String, String> RAM, Map<String, String> SSD, Map<String, String> ManHinh, Map<String, String> CTHD, Map<String, String> BaoHanh) {
        List<ChiTietSP> lst = Repository.getAll();
        List<ChiTietSPView> lst1 = new ArrayList<>();
        for (ChiTietSP a : lst) {
            String tenSp = TenSp.get(a.getIdSP());
            String noiSx = NSX.get(a.getIdNSX());
            String mauSac = MauSac.get(a.getIdMauSac());
            String dongSp = DongSp.get(a.getIdDongSP());
            String cpu = DongSp.get(a.getIdCPU());
            String ram = DongSp.get(a.getIdRam());
            String ssd = DongSp.get(a.getIdSSD());
            String cthd = DongSp.get(a.getIdChiTietHD());
            String manhinh = DongSp.get(a.getIdManHinh());
            String baohanh = DongSp.get(a.getIdBH());
            lst1.add(new ChiTietSPView(a.getId(), tenSp, noiSx, mauSac,
                    dongSp, cpu, ram, ssd, manhinh, cthd, baohanh, a.getCanNang(), a.getMoTa(), a.getSoLuongTon(),
                    a.getGiaNhap(), a.getGiaBan(), a.getNgayTao(), a.getNgaySua(), a.getSoLuongTon()));

        }
        return lst1;
    }

    @Override
    public Integer them(ChiTietSPView sp, Map<String, String> TenSp, Map<String, String> NSX, Map<String, String> MauSac, Map<String, String> DongSp, Map<String, String> CPU, Map<String, String> RAM, Map<String, String> SSD, Map<String, String> ManHinh, Map<String, String> CTHD, Map<String, String> BaoHanh) {
        Set<String> keyTenSp = TenSp.keySet();
        Set<String> keyNoiSx = NSX.keySet();
        Set<String> keyMauS = MauSac.keySet();
        Set<String> keyDongSp = DongSp.keySet();
        Set<String> keyCpu = CPU.keySet();
        Set<String> keyRam = RAM.keySet();
        Set<String> keySsd = SSD.keySet();
        Set<String> keyCthd = CTHD.keySet();
        Set<String> keyBaohanh = BaoHanh.keySet();
        String idSp = "Null";
        String idNSX = "Null";
        String idMauSac = "Null";
        String idDongSp = "Null";
        String idCPU = "Null";
        String idRAM = "Null";
        String idSSD = "Null";
        String idCTHD = "Null";
        String idBH = "Null";
        for (String a : keyTenSp) {
            if (sp.getTenSP().equalsIgnoreCase(TenSp.get(a))) {
                idSp = a;
            }
        }
        for (String a : keyNoiSx) {
            if (sp.getNSX().equalsIgnoreCase(NSX.get(a))) {
                idNSX = a;
            }
        }
        for (String a : keyMauS) {
            if (sp.getMauSac().equalsIgnoreCase(MauSac.get(a))) {
                idMauSac = a;
            }
        }
        for (String a : keyDongSp) {
            if (sp.getDongSP().equalsIgnoreCase(DongSp.get(a))) {
                idDongSp = a;
            }
        }
        for (String a : keyCpu) {
            if (sp.getCPU().equalsIgnoreCase(CPU.get(a))) {
                idDongSp = a;
            }
        }
        for (String a : keyRam) {
            if (sp.getRAM().equalsIgnoreCase(RAM.get(a))) {
                idDongSp = a;
            }
        }
        for (String a : keySsd) {
            if (sp.getSSD().equalsIgnoreCase(SSD.get(a))) {
                idDongSp = a;
            }
        }
        for (String a : keyCthd) {
            if (sp.getCTHD().equalsIgnoreCase(CTHD.get(a))) {
                idDongSp = a;
            }
        }
        for (String a : keyBaohanh) {
            if (sp.getBaoHanh().equalsIgnoreCase(BaoHanh.get(a))) {
                idDongSp = a;
            }
        }
        ChiTietSP CtD = new ChiTietSP(idSp, idSSD, idNSX, idMauSac, idDongSp, idCPU, idRAM, idSSD, idMauSac, idCTHD, idBH, sp.getCanNang(), sp.getMoTa(), sp.getSoLuongTon(), sp.getGiaNhap(), sp.getGiaBan(), sp.getNgayTao(), sp.getNgaySua(), sp.getTrangThai());
        return Repository.them(CtD);
    }

    @Override
    public Integer xoa(String ma) {
        return Repository.xoa(ma);
    }

    @Override
    public Map<String, String> hashMapTenSp() {
        return Repository.hashMapTenSp();
    }

    @Override
    public Map<String, String> hashMapNoiSx() {
        return Repository.hashMapNoiSx();
    }

    @Override
    public Map<String, String> hashMapMauSac() {
        return Repository.hashMapMauSac();
    }

    @Override
    public Map<String, String> hashMapDongSp() {
        return Repository.hashMapDongSp();
    }

    @Override
    public Map<String, String> hashMapManHinh() {
        return Repository.hashMapManHinh();
    }

    @Override
    public Map<String, String> hashMapCPU() {
        return Repository.hashMapCPU();
    }

    @Override
    public Map<String, String> hashMapRAM() {
        return Repository.hashMapRAM();
    }

    @Override
    public Map<String, String> hashMapSSD() {
        return Repository.hashMapSSD();
    }

    @Override
    public Map<String, String> hashMapCTHD() {
        return Repository.hashMapCTHD();
    }

    @Override
    public Map<String, String> hashMapBaoHanh() {
        return Repository.hashMapBaoHanh();
    }

    @Override
    public Integer sua(ChiTietSPView sp, Map<String, String> TenSp, Map<String, String> NSX, Map<String, String> MauSac, Map<String, String> DongSp, Map<String, String> CPU, Map<String, String> RAM, Map<String, String> SSD, Map<String, String> ManHinh, Map<String, String> CTHD, Map<String, String> BaoHanh, String id) {
        Set<String> keyTenSp = TenSp.keySet();
        Set<String> keyNoiSx = NSX.keySet();
        Set<String> keyMauS = MauSac.keySet();
        Set<String> keyDongSp = DongSp.keySet();
        Set<String> keyCpu = CPU.keySet();
        Set<String> keyRam = RAM.keySet();
        Set<String> keySsd = SSD.keySet();
        Set<String> keyCthd = CTHD.keySet();
        Set<String> keyBaohanh = BaoHanh.keySet();
        String idSp = "Null";
        String idNSX = "Null";
        String idMauSac = "Null";
        String idDongSp = "Null";
        String idCPU = "Null";
        String idRAM = "Null";
        String idSSD = "Null";
        String idCTHD = "Null";
        String idBH = "Null";
        for (String a : keyTenSp) {
            if (sp.getTenSP().equalsIgnoreCase(TenSp.get(a))) {
                idSp = a;
            }
        }
        for (String a : keyNoiSx) {
            if (sp.getNSX().equalsIgnoreCase(NSX.get(a))) {
                idNSX = a;
            }
        }
        for (String a : keyMauS) {
            if (sp.getMauSac().equalsIgnoreCase(MauSac.get(a))) {
                idMauSac = a;
            }
        }
        for (String a : keyDongSp) {
            if (sp.getDongSP().equalsIgnoreCase(DongSp.get(a))) {
                idDongSp = a;
            }
        }
        for (String a : keyCpu) {
            if (sp.getCPU().equalsIgnoreCase(CPU.get(a))) {
                idDongSp = a;
            }
        }
        for (String a : keyRam) {
            if (sp.getRAM().equalsIgnoreCase(RAM.get(a))) {
                idDongSp = a;
            }
        }
        for (String a : keySsd) {
            if (sp.getSSD().equalsIgnoreCase(SSD.get(a))) {
                idDongSp = a;
            }
        }
        for (String a : keyCthd) {
            if (sp.getCTHD().equalsIgnoreCase(CTHD.get(a))) {
                idDongSp = a;
            }
        }
        for (String a : keyBaohanh) {
            if (sp.getBaoHanh().equalsIgnoreCase(BaoHanh.get(a))) {
                idDongSp = a;
            }
        }
        ChiTietSP CtD = new ChiTietSP(idSp, idSSD, idNSX, idMauSac, idDongSp, idCPU, idRAM, idSSD, idMauSac, idCTHD, idBH, sp.getCanNang(), sp.getMoTa(), sp.getSoLuongTon(), sp.getGiaNhap(), sp.getGiaBan(), sp.getNgayTao(), sp.getNgaySua(), sp.getTrangThai());
        return Repository.them(CtD);
    }

}

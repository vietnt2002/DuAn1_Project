/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class ChiTietSPView {

    private String id;
    private String tenSP;
    private String NSX;
    private String MauSac;
    private String DongSP;
    private String CPU;
    private String RAM;
    private String SSD;
    private String ManHinh;
    private String CTHD;
    private String BaoHanh;
    private double canNang;
    private String moTa;
    private int soLuongTon;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;
    private Date ngayTao;
    private Date ngaySua;
    private int trangThai;

    public ChiTietSPView() {
    }

    public ChiTietSPView(String id, String idSP, String idNSX, String idMauSac, String idDongSP, String idCPU, String idRam, String idSSD, String idManHinh, String idChiTietHD, String idBH, double canNang, String moTa, int soLuongTon, BigDecimal giaNhap, BigDecimal giaBan, Date ngayTao, Date ngaySua, int trangThai) {
        this.id = id;
        this.tenSP = idSP;
        this.NSX = idNSX;
        this.MauSac = idMauSac;
        this.DongSP = idDongSP;
        this.CPU = idCPU;
        this.RAM = idRam;
        this.SSD = idSSD;
        this.ManHinh = idManHinh;
        this.CTHD = idChiTietHD;
        this.BaoHanh = idBH;
        this.canNang = canNang;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public ChiTietSPView(String idSP, String idNSX, String idMauSac, String idDongSP, String idCPU, String idRam, String idSSD, String idManHinh, String idChiTietHD, String idBH, double canNang, String moTa, int soLuongTon, BigDecimal giaNhap, BigDecimal giaBan, Date ngayTao, Date ngaySua, int trangThai) {
        this.tenSP = idSP;
        this.NSX = idNSX;
        this.MauSac = idMauSac;
        this.DongSP = idDongSP;
        this.CPU = idCPU;
        this.RAM = idRam;
        this.SSD = idSSD;
        this.ManHinh = idManHinh;
        this.CTHD = idChiTietHD;
        this.BaoHanh = idBH;
        this.canNang = canNang;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNSX() {
        return NSX;
    }

    public void setNSX(String NSX) {
        this.NSX = NSX;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public String getDongSP() {
        return DongSP;
    }

    public void setDongSP(String DongSP) {
        this.DongSP = DongSP;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public String getManHinh() {
        return ManHinh;
    }

    public void setManHinh(String ManHinh) {
        this.ManHinh = ManHinh;
    }

    public String getCTHD() {
        return CTHD;
    }

    public void setCTHD(String CTHD) {
        this.CTHD = CTHD;
    }

    public String getBaoHanh() {
        return BaoHanh;
    }

    public void setBaoHanh(String BaoHanh) {
        this.BaoHanh = BaoHanh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "ChiTietSP{" + "id=" + id + ", idSP=" + tenSP + ", idNSX=" + NSX + ", idMauSac=" + MauSac + ", idDongSP=" + DongSP + ", idCPU=" + CPU + ", idRam=" + RAM + ", idSSD=" + SSD + ", idManHinh=" + ManHinh + ", idChiTietHD=" + CTHD + ", idBH=" + BaoHanh + ", canNang=" + canNang + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", ngayTao=" + ngayTao + ", ngaySua=" + ngaySua + ", trangThai=" + trangThai + '}';
    }

}

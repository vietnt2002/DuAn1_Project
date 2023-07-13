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
public class ChiTietHD {
    private String idHD;
    private int soLuong;
    private BigDecimal donGia;
    private BigDecimal thanhTien;
    private Date ngayTao;
    private Date ngaySua;
    private int trangThai;

    public ChiTietHD() {
    }

    public ChiTietHD(String idHD, int soLuong, BigDecimal donGia, BigDecimal thanhTien, Date ngayTao, Date ngaySua, int trangThai) {
        this.idHD = idHD;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public BigDecimal getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(BigDecimal thanhTien) {
        this.thanhTien = thanhTien;
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
        return "ChiTietHD{" + "idHD=" + idHD + ", soLuong=" + soLuong + ", donGia=" + donGia + ", thanhTien=" + thanhTien + ", ngayTao=" + ngayTao + ", ngaySua=" + ngaySua + ", trangThai=" + trangThai + '}';
    }
    
}

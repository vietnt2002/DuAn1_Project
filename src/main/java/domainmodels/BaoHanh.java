/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class BaoHanh {
    private String id;
    private String ma;
    private Integer soThangBH;
    private Date ngayHetHan;
    private Date ngayTao;
    private Date ngaySua;
    private int trangThai;

    public BaoHanh() {
    }

    public BaoHanh(String id, String ma, Integer soThangBH, Date ngayHetHan, Date ngayTao, Date ngaySua, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.soThangBH = soThangBH;
        this.ngayHetHan = ngayHetHan;
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

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Integer getSoThangBH() {
        return soThangBH;
    }

    public void setSoThangBH(Integer soThangBH) {
        this.soThangBH = soThangBH;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
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
        return "Baohanh{" + "id=" + id + ", ma=" + ma + ", soThangBH=" + soThangBH + ", ngayHetHan=" + ngayHetHan + ", ngayTao=" + ngayTao + ", ngaySua=" + ngaySua + ", trangThai=" + trangThai + '}';
    }
    
}

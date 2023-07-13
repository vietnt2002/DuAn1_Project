/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodels;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class ImeiDaBanView {
    private String id;
    private String imei;
    private String idChiTietSP;
    private Date ngayBan;
    private Date ngayTao;
    private Date ngaySua;
    private int trangThai;

    public ImeiDaBanView() {
    }

    public ImeiDaBanView(String id, String imei, String idChiTietSP, Date ngayBan, Date ngayTao, Date ngaySua, int trangThai) {
        this.id = id;
        this.imei = imei;
        this.idChiTietSP = idChiTietSP;
        this.ngayBan = ngayBan;
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

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(String idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
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
        return "ImeiDaBanView{" + "id=" + id + ", imei=" + imei + ", idChiTietSP=" + idChiTietSP + ", ngayBan=" + ngayBan + ", ngayTao=" + ngayTao + ", ngaySua=" + ngaySua + ", trangThai=" + trangThai + '}';
    }
    
}

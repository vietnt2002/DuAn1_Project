/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodels;

/**
 *
 * @author ADMIN
 */
public class SanPhamBanChay {

    private String ten;
    private int daBan;

    public SanPhamBanChay() {
    }

    public SanPhamBanChay(String ten, int daBan) {
        this.ten = ten;
        this.daBan = daBan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getDaBan() {
        return daBan;
    }

    public void setDaBan(int daBan) {
        this.daBan = daBan;
    }

    @Override
    public String toString() {
        return "SanPhamBanChay{" + "tenDT=" + ten + ", daBan=" + daBan + '}';
    }

}

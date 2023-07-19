/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.ThuKho;

import domainmodels.ChiTietSPView;
import domainmodels.ChiTietSP;
import iservices.IChiTietSPService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.ChiTietSPService;
import utilities.ULHelper;
import java.sql.Date;
import java.time.LocalDate;
import services.CheckTrungService;
import services.ChiTietSPService;
import utilities.ULHelper;

/**
 *
 * @author ADMIN
 */
public class JplChiTietSP extends javax.swing.JPanel {

    private final IChiTietSPService Services = new ChiTietSPService() {
    };
    List<ChiTietSPView> lstDSP = new ArrayList<>();
    DefaultTableModel modelDSP = new DefaultTableModel();
    Map<String, String> ten = new HashMap<>();
    Map<String, String> nsx = new HashMap<>();
    Map<String, String> mau = new HashMap<>();
    Map<String, String> dong = new HashMap<>();
    Map<String, String> cpu = new HashMap<>();
    Map<String, String> ram = new HashMap<>();
    Map<String, String> ssd = new HashMap<>();
    Map<String, String> mh = new HashMap<>();
    Map<String, String> bh = new HashMap<>();
    Date date = Date.valueOf(LocalDate.now());
    int index;

    public JplChiTietSP() {
        initComponents();
        modelDSP = (DefaultTableModel) tblDSP.getModel();
        ten = Services.hashMapTenSp();
        nsx = Services.hashMapNoiSx();
        mau = Services.hashMapMauSac();
        dong = Services.hashMapDongSp();
        cpu = Services.hashMapCPU();
        ram = Services.hashMapRAM();
        ssd = Services.hashMapSSD();
        mh = Services.hashMapManHinh();
        bh = Services.hashMapBaoHanh();
        loadTen();
        filltable();
    }

    public void loadTen() {
        Set<String> keyTenSp = ten.keySet();
        Set<String> keyNoiSx = nsx.keySet();
        Set<String> keyMauSx = mau.keySet();
        Set<String> keyDongSp = dong.keySet();
        Set<String> keyCPU = cpu.keySet();
        Set<String> keyRAM = ram.keySet();
        Set<String> keySSD = ssd.keySet();
        Set<String> keyMH = mh.keySet();
        Set<String> keyBH = bh.keySet();
        cboTenSp.removeAllItems();
        cboNoiSX.removeAllItems();
        cbomauSac.removeAllItems();
        cboDongsp.removeAllItems();
        cboCPU.removeAllItems();
        cboRAM.removeAllItems();
        cboSSD.removeAllItems();
        cboMH.removeAllItems();
        cboBH.removeAllItems();
        for (String a : keyTenSp) {
            cboTenSp.addItem(ten.get(a));
        }
        for (String a : keyNoiSx) {
            cboNoiSX.addItem(nsx.get(a));
        }
        for (String a : keyMauSx) {
            cbomauSac.addItem(mau.get(a));
        }
        for (String a : keyDongSp) {
            cboDongsp.addItem(dong.get(a));
        }
        for (String a : keyCPU) {
            cboCPU.addItem(cpu.get(a));
        }
        for (String a : keyRAM) {
            cboRAM.addItem(ram.get(a));
        }
        for (String a : keySSD) {
            cboSSD.addItem(ssd.get(a));
        }
        for (String a : keyMH) {
            cboMH.addItem(mh.get(a));
        }
        for (String a : keyBH) {
            cboBH.addItem(bh.get(a));
        }
    }

    public void filltable() {
        try {
            modelDSP.setRowCount(0);
            lstDSP = Services.getAll(ten, nsx, mau, dong, cpu, ram, ssd, mh, bh);
            for (ChiTietSPView a : lstDSP) {
                modelDSP.addRow(new Object[]{
                    a.getTenSP(), a.getNSX(), a.getMauSac(), a.getDongSP(), a.getCPU(), a.getRAM(), a.getSSD(), a.getManHinh(), a.getBaoHanh(), a.getCanNang(), a.getMoTa(), a.getSoLuongTon(), a.getGiaNhap(), a.getGiaBan(), a.getNgayTao(), a.getNgaySua(), a.getStatus(a.getTrangThai())
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showdetailDSP(int index) {
        try {
            cboTenSp.setSelectedItem(lstDSP.get(index).getTenSP());
            cboNoiSX.setSelectedItem(lstDSP.get(index).getNSX());
            cbomauSac.setSelectedItem(lstDSP.get(index).getNSX());
            cboDongsp.setSelectedItem(lstDSP.get(index).getDongSP());
            cboRAM.setSelectedItem(lstDSP.get(index).getRAM());
            cboSSD.setSelectedItem(lstDSP.get(index).getSSD());
            cboMH.setSelectedItem(lstDSP.get(index).getManHinh());
            cboBH.setSelectedItem(lstDSP.get(index).getBaoHanh());
            txtCanNang.setText("" + lstDSP.get(index).getSoLuongTon());
            txtMota.setText(lstDSP.get(index).getMoTa());
            txtTon.setText("" + lstDSP.get(index).getSoLuongTon());
            txtNhap.setText("" + lstDSP.get(index).getGiaNhap());
            txtBan.setText("" + lstDSP.get(index).getGiaBan());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDSP = new javax.swing.ButtonGroup();
        pnlDongSP = new javax.swing.JPanel();
        pnlDongInfo = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        radCon1 = new javax.swing.JRadioButton();
        radHet1 = new javax.swing.JRadioButton();
        pnlDSPbtn = new javax.swing.JPanel();
        btnAdd1 = new javax.swing.JButton();
        btnShow1 = new javax.swing.JButton();
        btnEdit1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnHide1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboTenSp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboNoiSX = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbomauSac = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboDongsp = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboCPU = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboSSD = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cboMH = new javax.swing.JComboBox<>();
        cboRAM = new javax.swing.JComboBox<>();
        cboBH = new javax.swing.JComboBox<>();
        txtMota = new javax.swing.JTextField();
        txtTon = new javax.swing.JTextField();
        txtNhap = new javax.swing.JTextField();
        txtBan = new javax.swing.JTextField();
        txtCanNang = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDSP = new javax.swing.JTable();
        pnlDSPsrc = new javax.swing.JPanel();
        btnAdd2 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnTang1 = new javax.swing.JButton();
        btnGiam1 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        cboTrangThai1 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();

        pnlDongSP.setBackground(new java.awt.Color(255, 230, 234));

        pnlDongInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlDongInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin dòng sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel48.setText("Trạng thái");

        radCon1.setText("Còn hàng");
        radCon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCon1ActionPerformed(evt);
            }
        });

        radHet1.setText("Hết hàng");

        btnAdd1.setBackground(new java.awt.Color(255, 51, 0));
        btnAdd1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd1.setText("Thêm");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnShow1.setBackground(new java.awt.Color(255, 51, 0));
        btnShow1.setForeground(new java.awt.Color(255, 255, 255));
        btnShow1.setText("Hiện");
        btnShow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShow1ActionPerformed(evt);
            }
        });

        btnEdit1.setBackground(new java.awt.Color(255, 51, 0));
        btnEdit1.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit1.setText("Sửa");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        btnDelete1.setBackground(new java.awt.Color(255, 51, 0));
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setText("Xóa");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        btnHide1.setBackground(new java.awt.Color(255, 51, 0));
        btnHide1.setForeground(new java.awt.Color(255, 255, 255));
        btnHide1.setText("Ẩn");
        btnHide1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHide1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDSPbtnLayout = new javax.swing.GroupLayout(pnlDSPbtn);
        pnlDSPbtn.setLayout(pnlDSPbtnLayout);
        pnlDSPbtnLayout.setHorizontalGroup(
            pnlDSPbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSPbtnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlDSPbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHide1)
                    .addComponent(btnDelete1)
                    .addComponent(btnEdit1)
                    .addComponent(btnShow1)
                    .addComponent(btnAdd1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlDSPbtnLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd1, btnDelete1, btnEdit1, btnHide1, btnShow1});

        pnlDSPbtnLayout.setVerticalGroup(
            pnlDSPbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSPbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShow1)
                .addGap(18, 18, 18)
                .addComponent(btnHide1)
                .addGap(18, 18, 18)
                .addComponent(btnAdd1)
                .addGap(18, 18, 18)
                .addComponent(btnEdit1)
                .addGap(18, 18, 18)
                .addComponent(btnDelete1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDSPbtnLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd1, btnDelete1, btnEdit1, btnHide1, btnShow1});

        jLabel1.setText("Tên");

        cboTenSp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("NSX");

        cboNoiSX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Màu");

        cbomauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Dòng");

        cboDongsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("CPU");

        cboCPU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("RAM");

        jLabel7.setText("SSD");

        jLabel8.setText("Màn hình");

        jLabel9.setText("Bảo hành");

        jLabel10.setText("Cân nặng");

        cboSSD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Giá nhập");

        jLabel12.setText("Lượng tồn");

        jLabel13.setText("Mô tả");

        jLabel14.setText("Giá bán");

        cboMH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboRAM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboBH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDongInfoLayout = new javax.swing.GroupLayout(pnlDongInfo);
        pnlDongInfo.setLayout(pnlDongInfoLayout);
        pnlDongInfoLayout.setHorizontalGroup(
            pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDongInfoLayout.createSequentialGroup()
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cboTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cboNoiSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cbomauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                                .addComponent(cboRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                                .addComponent(cboSSD, 0, 171, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                                .addComponent(cboMH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))))
                    .addGroup(pnlDongInfoLayout.createSequentialGroup()
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cboCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cboDongsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboBH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCanNang))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))))
                .addGap(18, 18, 18)
                .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDongInfoLayout.createSequentialGroup()
                        .addComponent(radHet1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radCon1))
                    .addComponent(txtTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlDSPbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDongInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel2, jLabel3, jLabel4, jLabel48, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        pnlDongInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cboBH, cboCPU, cboDongsp, cboMH, cboNoiSX, cboRAM, cboSSD, cboTenSp, cbomauSac, txtBan, txtCanNang, txtMota, txtNhap, txtTon});

        pnlDongInfoLayout.setVerticalGroup(
            pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDongInfoLayout.createSequentialGroup()
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(cboRAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboNoiSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12)
                            .addComponent(cboSSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbomauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(cboMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboDongsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(cboBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel48)
                            .addComponent(radHet1)
                            .addComponent(radCon1)
                            .addComponent(txtCanNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlDSPbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDongInfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboBH, cboCPU, cboDongsp, cboMH, cboNoiSX, cboRAM, cboSSD, cboTenSp, cbomauSac, jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel2, jLabel3, jLabel4, jLabel48, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, txtBan, txtCanNang, txtMota, txtNhap, txtTon});

        tblDSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên", "NSX", "Màu", "Dòng", "CPU", "RAM", "SSD", "Màn hình", "Mã BH", "Cân", "Mô tả", "Tồn", "Giá nhập", "Giá bán", "Ngày tạo", "Ngày sửa", "Trạng thái"
            }
        ));
        tblDSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSPMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblDSP);

        pnlDSPsrc.setBackground(new java.awt.Color(255, 255, 255));

        btnAdd2.setBackground(new java.awt.Color(255, 51, 0));
        btnAdd2.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd2.setText("Thêm");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        btnDelete2.setBackground(new java.awt.Color(255, 51, 0));
        btnDelete2.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete2.setText("Xóa");
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });

        jLabel15.setText("IDCTSP");

        jLabel16.setText("IMEI");

        jLabel17.setText("jLabel17");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlDSPsrcLayout = new javax.swing.GroupLayout(pnlDSPsrc);
        pnlDSPsrc.setLayout(pnlDSPsrcLayout);
        pnlDSPsrcLayout.setHorizontalGroup(
            pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSPsrcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDSPsrcLayout.createSequentialGroup()
                        .addComponent(btnAdd2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnDelete2))
                    .addGroup(pnlDSPsrcLayout.createSequentialGroup()
                        .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(6, 6, 6))
        );
        pnlDSPsrcLayout.setVerticalGroup(
            pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSPsrcLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd2)
                    .addComponent(btnDelete2))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnTang1.setText("Tăng");

        btnGiam1.setText("Giảm");

        jLabel49.setText("Tìm tên:");

        jLabel51.setText("Trạng thái:");

        jLabel50.setText("Sắp xếp theo tên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(36, 36, 36)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName1)
                            .addComponent(cboTrangThai1, 0, 129, Short.MAX_VALUE)
                            .addComponent(btnGiam1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel50))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(cboTrangThai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTang1)
                    .addComponent(btnGiam1))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDongSPLayout = new javax.swing.GroupLayout(pnlDongSP);
        pnlDongSP.setLayout(pnlDongSPLayout);
        pnlDongSPLayout.setHorizontalGroup(
            pnlDongSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDongSPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDongSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlDongInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDongSPLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlDSPsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDongSPLayout.setVerticalGroup(
            pnlDongSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDongSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDongInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlDongSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDSPsrc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radCon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCon1ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
//        try {
//            if (ULHelper.checknull(txtMota, "Không được để mã trống!")) {
//                return;
//            } else {
//                int trungMa = CheckTrungService.checkTrung(txtMota.getText(),
//                        "dongsp", "ma");
//                if (trungMa != -1) {
//                    JOptionPane.showMessageDialog(this, "Mã đã tồn tại!");
//                    return;
//                }
//            }
//
//            if (ULHelper.checknull(txtTon, "Không được để tên trống!")) {
//                return;
//            }
//            int stt = (radHet1.isSelected() ? 1 : 0);
//            ChiTietSP dsp = new ChiTietSP(txtMota.getText(), txtTon.getText(), date, date, stt);
//            int thongBao = Services.them(dsp);
//            if (thongBao == 1) {
//                JOptionPane.showMessageDialog(this, "Thêm thành công!");
//                filltable();
//                return;
//            } else {
//                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
//                return;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnShow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShow1ActionPerformed
        // TODO add your handling code here:
//        try {
//            filltable();
//            showdetailDSP(0);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_btnShow1ActionPerformed

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMota, "Không được để mã trống!")) {
                return;
            }

            if (ULHelper.checknull(txtTon, "Không được để tên trống!")) {
                return;
            }
            lstDSP = Services.getAll(ten, nsx, mau, dong, cpu, ram, ssd, mh, bh);

            Date tao = lstDSP.get(index).getNgayTao();
            int stt = (radHet1.isSelected() ? 1 : 0);
            ChiTietSPView dsp = new ChiTietSPView(cboTenSp.getSelectedItem() + "", cboNoiSX.getSelectedItem() + "", cbomauSac.getSelectedItem() + "", cboDongsp.getSelectedItem() + "", cboCPU.getSelectedItem() + "", cboRAM.getSelectedItem() + "", cboSSD.getSelectedItem() + "", cboMH.getSelectedItem() + "", cboBH.getSelectedItem() + "", Integer.parseInt(txtCanNang.getText()), txtMota.getText(), Integer.parseInt(txtCanNang.getText()), BigDecimal.ONE, BigDecimal.TEN, tao, tao, 1);
            int thongBao = Services.sua(dsp, ten, nsx, mau, dong, cpu, ram, ssd, mau, dong, TOOL_TIP_TEXT_KEY);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                filltable();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEdit1ActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        try {
            String ma = txtMota.getText();
            int thongBao = Services.xoa(ma);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                filltable();
                showdetailDSP(0);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnHide1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHide1ActionPerformed
        // TODO add your handling code here:
        try {
            cboTenSp.setSelectedItem("");
            cboNoiSX.setSelectedItem("");
            cbomauSac.setSelectedItem("");
            cboDongsp.setSelectedItem("");
            cboRAM.setSelectedItem("");
            cboSSD.setSelectedItem("");
            cboMH.setSelectedItem("");
            cboBH.setSelectedItem("");
            txtCanNang.setText("");
            txtMota.setText("");
            txtTon.setText("");
            txtNhap.setText("");
            txtBan.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHide1ActionPerformed

    private void tblDSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSPMouseClicked
        // TODO add your handling code here:
        try {
            int index = tblDSP.getSelectedRow();
            showdetailDSP(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblDSPMouseClicked

    private void txtBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelete2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDSP;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnGiam1;
    private javax.swing.JButton btnHide1;
    private javax.swing.JButton btnShow1;
    private javax.swing.JButton btnTang1;
    private javax.swing.JComboBox<String> cboBH;
    private javax.swing.JComboBox<String> cboCPU;
    private javax.swing.JComboBox<String> cboDongsp;
    private javax.swing.JComboBox<String> cboMH;
    private javax.swing.JComboBox<String> cboNoiSX;
    private javax.swing.JComboBox<String> cboRAM;
    private javax.swing.JComboBox<String> cboSSD;
    private javax.swing.JComboBox<String> cboTenSp;
    private javax.swing.JComboBox<String> cboTrangThai1;
    private javax.swing.JComboBox<String> cbomauSac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnlDSPbtn;
    private javax.swing.JPanel pnlDSPsrc;
    private javax.swing.JPanel pnlDongInfo;
    private javax.swing.JPanel pnlDongSP;
    private javax.swing.JRadioButton radCon1;
    private javax.swing.JRadioButton radHet1;
    private javax.swing.JTable tblDSP;
    private javax.swing.JTextField txtBan;
    private javax.swing.JTextField txtCanNang;
    private javax.swing.JTextField txtMota;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtNhap;
    private javax.swing.JTextField txtTon;
    // End of variables declaration//GEN-END:variables
}

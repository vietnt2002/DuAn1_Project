/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import iservices.ICPUService;
import iservices.IDongSPService;
import iservices.IRAMService;
import iservices.ISSDService;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.CPUService;
import services.CheckTrungService;
import services.DongSPService;
import services.RAMService;
import services.SSDService;
import utilities.ULHelper;
import viewmodels.CPUView;
import viewmodels.DongSPView;
import viewmodels.RAMView;
import viewmodels.SSDView;

/**
 *
 * @author ADMIN
 */
public class ThuKho extends javax.swing.JFrame {

    private final ICPUService svcCPU = new CPUService() {
    };
    List<CPUView> lstCPU = new ArrayList<>();
    private final IRAMService svcRAM = new RAMService() {
    };
    List<RAMView> lstRAM = new ArrayList<>();
    private final IDongSPService svcDSP = new DongSPService() {
    };
    List<SSDView> lstSSD = new ArrayList<>();
    private final ISSDService svcSSD = new SSDService() {
    };
    List<DongSPView> lstDSP = new ArrayList<>();
    DefaultTableModel modelCPU = new DefaultTableModel();
    DefaultTableModel modelDSP = new DefaultTableModel();
    DefaultTableModel modelRAM = new DefaultTableModel();
    DefaultTableModel modelSSD = new DefaultTableModel();
    Date date = Date.valueOf(LocalDate.now());
    int index;

    /**
     */
    public ThuKho() {
        initComponents();
        setLocationRelativeTo(null);
        modelCPU = (DefaultTableModel) tblCPU.getModel();
        modelDSP = (DefaultTableModel) tblDSP.getModel();
        modelRAM = (DefaultTableModel) tblRAM.getModel();
        modelSSD = (DefaultTableModel) tblSSD.getModel();
    }

    public void filltableCPU() {
        try {
            modelCPU.setRowCount(0);
            lstCPU = svcCPU.getAll();
            for (CPUView a : lstCPU) {
                modelCPU.addRow(new Object[]{
                    a.getMa(), a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getStatus(a.getTrangThai())
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void filltableRAM() {
        try {
            modelRAM.setRowCount(0);
            lstRAM = svcRAM.getAll();
            for (RAMView a : lstRAM) {
                modelRAM.addRow(new Object[]{
                    a.getMa(), a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getStatus(a.getTrangThai())
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void filltableDSP() {
        try {
            modelDSP.setRowCount(0);
            lstDSP = svcDSP.getAll();
            for (DongSPView a : lstDSP) {
                modelDSP.addRow(new Object[]{
                    a.getMa(), a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getStatus(a.getTrangThai())
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void filltableSSD() {
        try {
            modelSSD.setRowCount(0);
            lstSSD = svcSSD.getAll();
            for (SSDView a : lstSSD) {
                modelSSD.addRow(new Object[]{
                    a.getMa(), a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getStatus(a.getTrangThai())
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showdetailCPU(int index) {
        try {
            txtMa.setText(lstCPU.get(index).getMa());
            txtTen.setText(lstCPU.get(index).getTen());
            if (lstCPU.get(index).getTrangThai() == 0) {
                radCon.setSelected(true);
            } else {
                if (lstCPU.get(index).getTrangThai() == 1) {
                    radHet.setSelected(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showdetailDSP(int index) {
        try {
            txtMa1.setText(lstDSP.get(index).getMa());
            txtTen1.setText(lstDSP.get(index).getTen());
            if (lstDSP.get(index).getTrangThai() == 0) {
                radCon1.setSelected(true);
            } else {
                if (lstDSP.get(index).getTrangThai() == 1) {
                    radHet1.setSelected(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showdetailRAM(int index) {
        try {
            txtMa2.setText(lstRAM.get(index).getMa());
            txtTen2.setText(lstRAM.get(index).getTen());
            if (lstRAM.get(index).getTrangThai() == 0) {
                radCon2.setSelected(true);
            } else {
                if (lstRAM.get(index).getTrangThai() == 1) {
                    radHet2.setSelected(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void showdetailSSD(int index) {
        try {
            txtMa3.setText(lstSSD.get(index).getMa());
            txtTen3.setText(lstSSD.get(index).getTen());
            if (lstSSD.get(index).getTrangThai() == 0) {
                radCon3.setSelected(true);
            } else {
                if (lstSSD.get(index).getTrangThai() == 1) {
                    radHet3.setSelected(true);
                }
            }
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

        btgCPU = new javax.swing.ButtonGroup();
        btgDSP = new javax.swing.ButtonGroup();
        btgRAM = new javax.swing.ButtonGroup();
        btgSSD = new javax.swing.ButtonGroup();
        tabKho = new javax.swing.JTabbedPane();
        pnlCPU = new javax.swing.JPanel();
        pnlCPUInfo = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        radCon = new javax.swing.JRadioButton();
        radHet = new javax.swing.JRadioButton();
        pnlCPUbtn = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnHide = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCPU = new javax.swing.JTable();
        pnlCPUsrc = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        btnTang = new javax.swing.JButton();
        btnGiam = new javax.swing.JButton();
        cboTrangThai = new javax.swing.JComboBox<>();
        jLabel41 = new javax.swing.JLabel();
        pnlDongSP = new javax.swing.JPanel();
        pnlDongInfo = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        radCon1 = new javax.swing.JRadioButton();
        radHet1 = new javax.swing.JRadioButton();
        pnlDSPbtn = new javax.swing.JPanel();
        btnAdd1 = new javax.swing.JButton();
        btnShow1 = new javax.swing.JButton();
        btnEdit1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        btnHide1 = new javax.swing.JButton();
        txtMa1 = new javax.swing.JTextField();
        txtTen1 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDSP = new javax.swing.JTable();
        pnlDSPsrc = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        btnTang1 = new javax.swing.JButton();
        btnGiam1 = new javax.swing.JButton();
        cboTrangThai1 = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        pnlRAM = new javax.swing.JPanel();
        pnlRAMinfo = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        radCon2 = new javax.swing.JRadioButton();
        radHet2 = new javax.swing.JRadioButton();
        pnlRAMbtn = new javax.swing.JPanel();
        btnAdd2 = new javax.swing.JButton();
        btnShow2 = new javax.swing.JButton();
        btnEdit2 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        btnHide2 = new javax.swing.JButton();
        txtMa2 = new javax.swing.JTextField();
        txtTen2 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblRAM = new javax.swing.JTable();
        pnlRAMsrc = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        btnTang2 = new javax.swing.JButton();
        btnGiam2 = new javax.swing.JButton();
        cboTrangThai2 = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        pnlSSD = new javax.swing.JPanel();
        pnlSSDinfo = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        radCon3 = new javax.swing.JRadioButton();
        radHet3 = new javax.swing.JRadioButton();
        pnlSSDbtn = new javax.swing.JPanel();
        btnAdd3 = new javax.swing.JButton();
        btnShow3 = new javax.swing.JButton();
        btnEdit3 = new javax.swing.JButton();
        btnDelete3 = new javax.swing.JButton();
        btnHide3 = new javax.swing.JButton();
        txtMa3 = new javax.swing.JTextField();
        txtTen3 = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblSSD = new javax.swing.JTable();
        pnlSSDsrc = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        txtName3 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        btnTang3 = new javax.swing.JButton();
        btnGiam3 = new javax.swing.JButton();
        cboTrangThai3 = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        pnlThongKe = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabKho.setBackground(new java.awt.Color(255, 255, 255));
        tabKho.setForeground(new java.awt.Color(51, 51, 51));
        tabKho.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabKho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        pnlCPUInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlCPUInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin CPU", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel27.setText("Mã");

        jLabel28.setText("Tên");

        jLabel38.setText("Trạng thái");

        btgCPU.add(radCon);
        radCon.setText("Còn hàng");
        radCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radConActionPerformed(evt);
            }
        });

        btgCPU.add(radHet);
        radHet.setText("Hết hàng");

        btnAdd.setBackground(new java.awt.Color(255, 51, 0));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnShow.setBackground(new java.awt.Color(255, 51, 0));
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("Hiện");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 51, 0));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnHide.setBackground(new java.awt.Color(255, 51, 0));
        btnHide.setForeground(new java.awt.Color(255, 255, 255));
        btnHide.setText("Ẩn");
        btnHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCPUbtnLayout = new javax.swing.GroupLayout(pnlCPUbtn);
        pnlCPUbtn.setLayout(pnlCPUbtnLayout);
        pnlCPUbtnLayout.setHorizontalGroup(
            pnlCPUbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPUbtnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlCPUbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHide)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit)
                    .addComponent(btnShow)
                    .addComponent(btnAdd))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlCPUbtnLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnEdit, btnHide, btnShow});

        pnlCPUbtnLayout.setVerticalGroup(
            pnlCPUbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPUbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShow)
                .addGap(18, 18, 18)
                .addComponent(btnHide)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCPUbtnLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnDelete, btnEdit, btnHide, btnShow});

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCPUInfoLayout = new javax.swing.GroupLayout(pnlCPUInfo);
        pnlCPUInfo.setLayout(pnlCPUInfoLayout);
        pnlCPUInfoLayout.setHorizontalGroup(
            pnlCPUInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPUInfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlCPUInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(pnlCPUInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCPUInfoLayout.createSequentialGroup()
                        .addComponent(radCon)
                        .addGap(18, 18, 18)
                        .addComponent(radHet)))
                .addGap(18, 18, 18)
                .addComponent(pnlCPUbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(828, Short.MAX_VALUE))
        );

        pnlCPUInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel27, jLabel28, jLabel38});

        pnlCPUInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMa, txtTen});

        pnlCPUInfoLayout.setVerticalGroup(
            pnlCPUInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPUInfoLayout.createSequentialGroup()
                .addGroup(pnlCPUInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCPUInfoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlCPUInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCPUInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCPUInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(radCon)
                            .addComponent(radHet)))
                    .addGroup(pnlCPUInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlCPUbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pnlCPUInfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel27, jLabel28, jLabel38, radCon, radHet, txtMa, txtTen});

        tblCPU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Ngày tạo", "Ngày sửa", "Trạnng thái"
            }
        ));
        tblCPU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCPUMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCPU);

        pnlCPUsrc.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setText("Tra cứu tên:");

        jLabel40.setText("Sắp xếp theo tên");

        btnTang.setText("Tăng");

        btnGiam.setText("Giảm");

        jLabel41.setText("Trạng thái:");

        javax.swing.GroupLayout pnlCPUsrcLayout = new javax.swing.GroupLayout(pnlCPUsrc);
        pnlCPUsrc.setLayout(pnlCPUsrcLayout);
        pnlCPUsrcLayout.setHorizontalGroup(
            pnlCPUsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCPUsrcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCPUsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCPUsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCPUsrcLayout.createSequentialGroup()
                        .addComponent(btnTang)
                        .addGap(18, 18, 18)
                        .addComponent(btnGiam))
                    .addComponent(cboTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName))
                .addGap(110, 110, 110))
        );

        pnlCPUsrcLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel39, jLabel40, jLabel41});

        pnlCPUsrcLayout.setVerticalGroup(
            pnlCPUsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPUsrcLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlCPUsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(pnlCPUsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(pnlCPUsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTang)
                    .addComponent(jLabel40)
                    .addComponent(btnGiam))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCPULayout = new javax.swing.GroupLayout(pnlCPU);
        pnlCPU.setLayout(pnlCPULayout);
        pnlCPULayout.setHorizontalGroup(
            pnlCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCPULayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlCPUInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCPULayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addComponent(pnlCPUsrc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        pnlCPULayout.setVerticalGroup(
            pnlCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCPULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCPUInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(pnlCPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCPUsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabKho.addTab("CPU", pnlCPU);

        pnlDongInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlDongInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin dòng sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel31.setText("Mã");

        jLabel32.setText("Tên");

        jLabel48.setText("Trạng thái");

        btgDSP.add(radCon1);
        radCon1.setText("Còn hàng");
        radCon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCon1ActionPerformed(evt);
            }
        });

        btgDSP.add(radHet1);
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

        txtTen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTen1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDongInfoLayout = new javax.swing.GroupLayout(pnlDongInfo);
        pnlDongInfo.setLayout(pnlDongInfoLayout);
        pnlDongInfoLayout.setHorizontalGroup(
            pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel48))
                .addGap(18, 18, 18)
                .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMa1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDongInfoLayout.createSequentialGroup()
                        .addComponent(radCon1)
                        .addGap(18, 18, 18)
                        .addComponent(radHet1)))
                .addGap(18, 18, 18)
                .addComponent(pnlDSPbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pnlDongInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMa1, txtTen1});

        pnlDongInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel31, jLabel32, jLabel48, radCon1, radHet1});

        pnlDongInfoLayout.setVerticalGroup(
            pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDongInfoLayout.createSequentialGroup()
                .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDongInfoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtMa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtTen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDongInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(radCon1)
                            .addComponent(radHet1)))
                    .addGroup(pnlDongInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlDSPbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pnlDongInfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMa1, txtTen1});

        pnlDongInfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel31, jLabel32, jLabel48});

        pnlDongInfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {radCon1, radHet1});

        tblDSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Ngày tạo", "Ngày sửa", "Trạnng thái"
            }
        ));
        tblDSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSPMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblDSP);

        pnlDSPsrc.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setText("Tra cứu tên:");

        jLabel50.setText("Sắp xếp theo tên");

        btnTang1.setText("Tăng");

        btnGiam1.setText("Giảm");

        jLabel51.setText("Trạng thái:");

        javax.swing.GroupLayout pnlDSPsrcLayout = new javax.swing.GroupLayout(pnlDSPsrc);
        pnlDSPsrc.setLayout(pnlDSPsrcLayout);
        pnlDSPsrcLayout.setHorizontalGroup(
            pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDSPsrcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDSPsrcLayout.createSequentialGroup()
                        .addComponent(btnTang1)
                        .addGap(18, 18, 18)
                        .addComponent(btnGiam1))
                    .addComponent(cboTrangThai1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName1))
                .addGap(110, 110, 110))
        );
        pnlDSPsrcLayout.setVerticalGroup(
            pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDSPsrcLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addGap(18, 18, 18)
                .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrangThai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addGap(18, 18, 18)
                .addGroup(pnlDSPsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTang1)
                    .addComponent(jLabel50)
                    .addComponent(btnGiam1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlDongSPLayout = new javax.swing.GroupLayout(pnlDongSP);
        pnlDongSP.setLayout(pnlDongSPLayout);
        pnlDongSPLayout.setHorizontalGroup(
            pnlDongSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDongSPLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlDongSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlDongInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDongSPLayout.createSequentialGroup()
                        .addComponent(jScrollPane6)
                        .addGap(18, 18, 18)
                        .addComponent(pnlDSPsrc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        pnlDongSPLayout.setVerticalGroup(
            pnlDongSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDongSPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDongInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(pnlDongSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDSPsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabKho.addTab("Dòng SP", pnlDongSP);

        pnlRAMinfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlRAMinfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin RAM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel33.setText("Mã");

        jLabel34.setText("Tên");

        jLabel52.setText("Trạng thái");

        btgDSP.add(radCon2);
        radCon2.setText("Còn hàng");
        radCon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCon2ActionPerformed(evt);
            }
        });

        btgDSP.add(radHet2);
        radHet2.setText("Hết hàng");

        btnAdd2.setBackground(new java.awt.Color(255, 51, 0));
        btnAdd2.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd2.setText("Thêm");
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        btnShow2.setBackground(new java.awt.Color(255, 51, 0));
        btnShow2.setForeground(new java.awt.Color(255, 255, 255));
        btnShow2.setText("Hiện");
        btnShow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShow2ActionPerformed(evt);
            }
        });

        btnEdit2.setBackground(new java.awt.Color(255, 51, 0));
        btnEdit2.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit2.setText("Sửa");
        btnEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit2ActionPerformed(evt);
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

        btnHide2.setBackground(new java.awt.Color(255, 51, 0));
        btnHide2.setForeground(new java.awt.Color(255, 255, 255));
        btnHide2.setText("Ẩn");
        btnHide2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHide2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRAMbtnLayout = new javax.swing.GroupLayout(pnlRAMbtn);
        pnlRAMbtn.setLayout(pnlRAMbtnLayout);
        pnlRAMbtnLayout.setHorizontalGroup(
            pnlRAMbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRAMbtnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlRAMbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHide2)
                    .addComponent(btnDelete2)
                    .addComponent(btnEdit2)
                    .addComponent(btnShow2)
                    .addComponent(btnAdd2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlRAMbtnLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd2, btnDelete2, btnEdit2, btnHide2, btnShow2});

        pnlRAMbtnLayout.setVerticalGroup(
            pnlRAMbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRAMbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShow2)
                .addGap(18, 18, 18)
                .addComponent(btnHide2)
                .addGap(18, 18, 18)
                .addComponent(btnAdd2)
                .addGap(18, 18, 18)
                .addComponent(btnEdit2)
                .addGap(18, 18, 18)
                .addComponent(btnDelete2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRAMbtnLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd2, btnDelete2, btnEdit2, btnHide2, btnShow2});

        txtTen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTen2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRAMinfoLayout = new javax.swing.GroupLayout(pnlRAMinfo);
        pnlRAMinfo.setLayout(pnlRAMinfoLayout);
        pnlRAMinfoLayout.setHorizontalGroup(
            pnlRAMinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRAMinfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlRAMinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel52))
                .addGap(18, 18, 18)
                .addGroup(pnlRAMinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMa2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlRAMinfoLayout.createSequentialGroup()
                        .addComponent(radCon2)
                        .addGap(18, 18, 18)
                        .addComponent(radHet2)))
                .addGap(18, 18, 18)
                .addComponent(pnlRAMbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pnlRAMinfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMa2, txtTen2});

        pnlRAMinfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel33, jLabel34, jLabel52, radCon2, radHet2});

        pnlRAMinfoLayout.setVerticalGroup(
            pnlRAMinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRAMinfoLayout.createSequentialGroup()
                .addGroup(pnlRAMinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRAMinfoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlRAMinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtMa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRAMinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txtTen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlRAMinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(radCon2)
                            .addComponent(radHet2)))
                    .addGroup(pnlRAMinfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlRAMbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pnlRAMinfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtMa2, txtTen2});

        pnlRAMinfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel33, jLabel34, jLabel52, radCon2, radHet2});

        tblRAM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Ngày tạo", "Ngày sửa", "Trạnng thái"
            }
        ));
        tblRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRAMMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblRAM);

        pnlRAMsrc.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setText("Tra cứu tên:");

        jLabel54.setText("Sắp xếp theo tên");

        btnTang2.setText("Tăng");

        btnGiam2.setText("Giảm");

        jLabel55.setText("Trạng thái:");

        javax.swing.GroupLayout pnlRAMsrcLayout = new javax.swing.GroupLayout(pnlRAMsrc);
        pnlRAMsrc.setLayout(pnlRAMsrcLayout);
        pnlRAMsrcLayout.setHorizontalGroup(
            pnlRAMsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRAMsrcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRAMsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel53)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlRAMsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlRAMsrcLayout.createSequentialGroup()
                        .addComponent(btnTang2)
                        .addGap(18, 18, 18)
                        .addComponent(btnGiam2))
                    .addComponent(cboTrangThai2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName2))
                .addGap(110, 110, 110))
        );
        pnlRAMsrcLayout.setVerticalGroup(
            pnlRAMsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRAMsrcLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlRAMsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addGroup(pnlRAMsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrangThai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(18, 18, 18)
                .addGroup(pnlRAMsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTang2)
                    .addComponent(jLabel54)
                    .addComponent(btnGiam2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlRAMLayout = new javax.swing.GroupLayout(pnlRAM);
        pnlRAM.setLayout(pnlRAMLayout);
        pnlRAMLayout.setHorizontalGroup(
            pnlRAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRAMLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlRAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlRAMinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlRAMLayout.createSequentialGroup()
                        .addComponent(jScrollPane7)
                        .addGap(18, 18, 18)
                        .addComponent(pnlRAMsrc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        pnlRAMLayout.setVerticalGroup(
            pnlRAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRAMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRAMinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(pnlRAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRAMsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabKho.addTab("RAM", pnlRAM);

        pnlSSDinfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlSSDinfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin SSD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel35.setText("Mã");

        jLabel36.setText("Tên");

        jLabel56.setText("Trạng thái");

        btgDSP.add(radCon3);
        radCon3.setText("Còn hàng");
        radCon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCon3ActionPerformed(evt);
            }
        });

        btgDSP.add(radHet3);
        radHet3.setText("Hết hàng");

        btnAdd3.setBackground(new java.awt.Color(255, 51, 0));
        btnAdd3.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd3.setText("Thêm");
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });

        btnShow3.setBackground(new java.awt.Color(255, 51, 0));
        btnShow3.setForeground(new java.awt.Color(255, 255, 255));
        btnShow3.setText("Hiện");
        btnShow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShow3ActionPerformed(evt);
            }
        });

        btnEdit3.setBackground(new java.awt.Color(255, 51, 0));
        btnEdit3.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit3.setText("Sửa");
        btnEdit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit3ActionPerformed(evt);
            }
        });

        btnDelete3.setBackground(new java.awt.Color(255, 51, 0));
        btnDelete3.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete3.setText("Xóa");
        btnDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete3ActionPerformed(evt);
            }
        });

        btnHide3.setBackground(new java.awt.Color(255, 51, 0));
        btnHide3.setForeground(new java.awt.Color(255, 255, 255));
        btnHide3.setText("Ẩn");
        btnHide3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHide3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSSDbtnLayout = new javax.swing.GroupLayout(pnlSSDbtn);
        pnlSSDbtn.setLayout(pnlSSDbtnLayout);
        pnlSSDbtnLayout.setHorizontalGroup(
            pnlSSDbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSSDbtnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlSSDbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHide3)
                    .addComponent(btnDelete3)
                    .addComponent(btnEdit3)
                    .addComponent(btnShow3)
                    .addComponent(btnAdd3))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlSSDbtnLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd3, btnDelete3, btnEdit3, btnHide3, btnShow3});

        pnlSSDbtnLayout.setVerticalGroup(
            pnlSSDbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSSDbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShow3)
                .addGap(18, 18, 18)
                .addComponent(btnHide3)
                .addGap(18, 18, 18)
                .addComponent(btnAdd3)
                .addGap(18, 18, 18)
                .addComponent(btnEdit3)
                .addGap(18, 18, 18)
                .addComponent(btnDelete3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSSDbtnLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd3, btnDelete3, btnEdit3, btnHide3, btnShow3});

        txtTen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTen3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSSDinfoLayout = new javax.swing.GroupLayout(pnlSSDinfo);
        pnlSSDinfo.setLayout(pnlSSDinfoLayout);
        pnlSSDinfoLayout.setHorizontalGroup(
            pnlSSDinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSSDinfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlSSDinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel56))
                .addGap(18, 18, 18)
                .addGroup(pnlSSDinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMa3, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen3, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSSDinfoLayout.createSequentialGroup()
                        .addComponent(radCon3)
                        .addGap(18, 18, 18)
                        .addComponent(radHet3)))
                .addGap(18, 18, 18)
                .addComponent(pnlSSDbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pnlSSDinfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel35, jLabel36, jLabel56, radCon3, radHet3});

        pnlSSDinfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtMa3, txtTen3});

        pnlSSDinfoLayout.setVerticalGroup(
            pnlSSDinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSSDinfoLayout.createSequentialGroup()
                .addGroup(pnlSSDinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSSDinfoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlSSDinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txtMa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSSDinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtTen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSSDinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(radCon3)
                            .addComponent(radHet3)))
                    .addGroup(pnlSSDinfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlSSDbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pnlSSDinfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel35, jLabel36, jLabel56, radCon3, radHet3, txtMa3, txtTen3});

        tblSSD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Ngày tạo", "Ngày sửa", "Trạnng thái"
            }
        ));
        tblSSD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSSDMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblSSD);

        pnlSSDsrc.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setText("Tra cứu tên:");

        jLabel58.setText("Sắp xếp theo tên");

        btnTang3.setText("Tăng");

        btnGiam3.setText("Giảm");

        jLabel59.setText("Trạng thái:");

        javax.swing.GroupLayout pnlSSDsrcLayout = new javax.swing.GroupLayout(pnlSSDsrc);
        pnlSSDsrc.setLayout(pnlSSDsrcLayout);
        pnlSSDsrcLayout.setHorizontalGroup(
            pnlSSDsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSSDsrcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSSDsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(jLabel57)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSSDsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlSSDsrcLayout.createSequentialGroup()
                        .addComponent(btnTang3)
                        .addGap(18, 18, 18)
                        .addComponent(btnGiam3))
                    .addComponent(cboTrangThai3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName3))
                .addGap(110, 110, 110))
        );
        pnlSSDsrcLayout.setVerticalGroup(
            pnlSSDsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSSDsrcLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlSSDsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addGroup(pnlSSDsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrangThai3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addGap(18, 18, 18)
                .addGroup(pnlSSDsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTang3)
                    .addComponent(jLabel58)
                    .addComponent(btnGiam3))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlSSDLayout = new javax.swing.GroupLayout(pnlSSD);
        pnlSSD.setLayout(pnlSSDLayout);
        pnlSSDLayout.setHorizontalGroup(
            pnlSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSSDLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlSSDinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlSSDLayout.createSequentialGroup()
                        .addComponent(jScrollPane8)
                        .addGap(18, 18, 18)
                        .addComponent(pnlSSDsrc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        pnlSSDLayout.setVerticalGroup(
            pnlSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSSDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSSDinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(pnlSSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSSDsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabKho.addTab("SSD", pnlSSD);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Doanh thu theo tháng"));
        jPanel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Doanh thu");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Số hoá đơn");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel4.setText("Tổng khách hàng");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Tra cứu"));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc theo dòng sản phẩm"));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Sản phẩm", "Số lượng", "Doanh thu"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Top sản phẩm bán chạy"));
        jPanel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng bán"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlThongKeLayout = new javax.swing.GroupLayout(pnlThongKe);
        pnlThongKe.setLayout(pnlThongKeLayout);
        pnlThongKeLayout.setHorizontalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlThongKeLayout.createSequentialGroup()
                        .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlThongKeLayout.createSequentialGroup()
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3))
                        .addGap(50, 50, 50)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(363, 363, 363)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlThongKeLayout.setVerticalGroup(
            pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongKeLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlThongKeLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlThongKeLayout.createSequentialGroup()
                                .addGroup(pnlThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlThongKeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabKho.addTab("Thống kê", pnlThongKe);

        jLabel5.setText("Họ và tên:");

        jLabel6.setText("Vai trò:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabKho, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabKho, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMa, "Không được để mã trống!")) {
                return;
            } else {
                int trungMa = CheckTrungService.checkTrung(txtMa.getText(),
                        "cpu", "ma");
                if (trungMa != -1) {
                    JOptionPane.showMessageDialog(this, "Mã đã tồn tại!");
                    return;
                }
            }

            if (ULHelper.checknull(txtTen, "Không được để tên trống!")) {
                return;
            }
            int stt = (radHet.isSelected() ? 1 : 0);
            CPUView cpu = new CPUView(txtMa.getText(), txtTen.getText(), date, date, stt);
            int thongBao = svcCPU.them(cpu);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                filltableCPU();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void radConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radConActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            String ma = txtMa.getText();
            int thongBao = svcCPU.xoa(ma);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                filltableCPU();
                showdetailCPU(0);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        try {
            filltableCPU();
            showdetailCPU(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMa, "Không được để mã trống!")) {
                return;
            }

            if (ULHelper.checknull(txtTen, "Không được để tên trống!")) {
                return;
            }
            lstCPU = svcCPU.getAll();

            Date tao = lstCPU.get(index).getNgayTao();
            int stt = (radHet.isSelected() ? 1 : 0);
            CPUView cpu = new CPUView(txtMa.getText(), txtTen.getText(), tao, date, stt);
            int thongBao = svcCPU.sua(cpu);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                filltableCPU();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tblCPUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCPUMouseClicked
        // TODO add your handling code here:
        try {
            int index = tblCPU.getSelectedRow();
            showdetailCPU(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblCPUMouseClicked

    private void btnHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHideActionPerformed
        // TODO add your handling code here:
        try {
            modelCPU.setRowCount(0);
            txtMa.setText("");
            txtTen.setText("");
            radCon.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHideActionPerformed

    private void radCon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCon1ActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMa1, "Không được để mã trống!")) {
                return;
            } else {
                int trungMa = CheckTrungService.checkTrung(txtMa1.getText(),
                        "dongsp", "ma");
                if (trungMa != -1) {
                    JOptionPane.showMessageDialog(this, "Mã đã tồn tại!");
                    return;
                }
            }

            if (ULHelper.checknull(txtTen1, "Không được để tên trống!")) {
                return;
            }
            int stt = (radHet1.isSelected() ? 1 : 0);
            DongSPView dsp = new DongSPView(txtMa1.getText(), txtTen1.getText(), date, date, stt);
            int thongBao = svcDSP.them(dsp);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                filltableDSP();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnShow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShow1ActionPerformed
        // TODO add your handling code here:
        try {
            filltableDSP();
            showdetailDSP(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnShow1ActionPerformed

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMa1, "Không được để mã trống!")) {
                return;
            }

            if (ULHelper.checknull(txtTen1, "Không được để tên trống!")) {
                return;
            }
            lstDSP = svcDSP.getAll();

            Date tao = lstDSP.get(index).getNgayTao();
            int stt = (radHet1.isSelected() ? 1 : 0);
            DongSPView dsp = new DongSPView(txtMa1.getText(), txtTen1.getText(), tao, date, stt);
            int thongBao = svcDSP.sua(dsp);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                filltableDSP();
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
            String ma = txtMa1.getText();
            int thongBao = svcDSP.xoa(ma);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                filltableDSP();
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
            modelDSP.setRowCount(0);
            txtMa1.setText("");
            txtTen1.setText("");
            radCon1.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHide1ActionPerformed

    private void txtTen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTen1ActionPerformed

    private void tblDSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSPMouseClicked
        // TODO add your handling code here:
        try {
            int index = tblDSP.getSelectedRow();
            showdetailDSP(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblDSPMouseClicked

    private void radCon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCon2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCon2ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMa2, "Không được để mã trống!")) {
                return;
            } else {
                int trungMa = CheckTrungService.checkTrung(txtMa2.getText(),
                        "RAM", "ma");
                if (trungMa != -1) {
                    JOptionPane.showMessageDialog(this, "Mã đã tồn tại!");
                    return;
                }
            }

            if (ULHelper.checknull(txtTen2, "Không được để tên trống!")) {
                return;
            }
            int stt = (radHet2.isSelected() ? 1 : 0);
            RAMView ram = new RAMView(txtMa2.getText(), txtTen2.getText(), date, date, stt);
            int thongBao = svcRAM.them(ram);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                filltableRAM();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnShow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShow2ActionPerformed
        // TODO add your handling code here:
        try {
            filltableRAM();
            showdetailRAM(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnShow2ActionPerformed

    private void btnEdit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit2ActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMa2, "Không được để mã trống!")) {
                return;
            }

            if (ULHelper.checknull(txtTen2, "Không được để tên trống!")) {
                return;
            }
            lstRAM = svcRAM.getAll();

            Date tao = lstRAM.get(index).getNgayTao();
            int stt = (radHet2.isSelected() ? 1 : 0);
            RAMView ram = new RAMView(txtMa2.getText(), txtTen2.getText(), tao, date, stt);
            int thongBao = svcRAM.sua(ram);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                filltableRAM();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEdit2ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        // TODO add your handling code here:
        try {
            String ma = txtMa2.getText();
            int thongBao = svcRAM.xoa(ma);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                filltableDSP();
                showdetailDSP(0);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void btnHide2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHide2ActionPerformed
        // TODO add your handling code here:
        try {
            modelRAM.setRowCount(0);
            txtMa2.setText("");
            txtTen2.setText("");
            radCon2.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHide2ActionPerformed

    private void txtTen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTen2ActionPerformed

    private void tblRAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRAMMouseClicked
        // TODO add your handling code here:
        try {
            int index = tblRAM.getSelectedRow();
            showdetailRAM(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblRAMMouseClicked

    private void radCon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCon3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCon3ActionPerformed

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMa3, "Không được để mã trống!")) {
                return;
            } else {
                int trungMa = CheckTrungService.checkTrung(txtMa3.getText(),
                        "SSD", "ma");
                if (trungMa != -1) {
                    JOptionPane.showMessageDialog(this, "Mã đã tồn tại!");
                    return;
                }
            }

            if (ULHelper.checknull(txtTen3, "Không được để tên trống!")) {
                return;
            }
            int stt = (radHet3.isSelected() ? 1 : 0);
            SSDView ssd = new SSDView(txtMa3.getText(), txtTen3.getText(), date, date, stt);
            int thongBao = svcSSD.them(ssd);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                filltableSSD();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAdd3ActionPerformed

    private void btnShow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShow3ActionPerformed
        // TODO add your handling code here:
        try {
            filltableSSD();
            showdetailSSD(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnShow3ActionPerformed

    private void btnEdit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit3ActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMa3, "Không được để mã trống!")) {
                return;
            }

            if (ULHelper.checknull(txtTen3, "Không được để tên trống!")) {
                return;
            }
            lstSSD = svcSSD.getAll();

            Date tao = lstSSD.get(index).getNgayTao();
            int stt = (radHet3.isSelected() ? 1 : 0);
            SSDView ssd = new SSDView(txtMa3.getText(), txtTen3.getText(), tao, date, stt);
            int thongBao = svcSSD.sua(ssd);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                filltableSSD();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEdit3ActionPerformed

    private void btnDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete3ActionPerformed
        // TODO add your handling code here:
        try {
            String ma = txtMa3.getText();
            int thongBao = svcSSD.xoa(ma);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                filltableSSD();
                showdetailSSD(0);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDelete3ActionPerformed

    private void btnHide3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHide3ActionPerformed
        // TODO add your handling code here:
        try {
            modelSSD.setRowCount(0);
            txtMa3.setText("");
            txtTen3.setText("");
            radCon3.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHide3ActionPerformed

    private void txtTen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTen3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTen3ActionPerformed

    private void tblSSDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSSDMouseClicked
        // TODO add your handling code here:
        try {
            int index = tblSSD.getSelectedRow();
            showdetailSSD(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblSSDMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThuKho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgCPU;
    private javax.swing.ButtonGroup btgDSP;
    private javax.swing.ButtonGroup btgRAM;
    private javax.swing.ButtonGroup btgSSD;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnEdit2;
    private javax.swing.JButton btnEdit3;
    private javax.swing.JButton btnGiam;
    private javax.swing.JButton btnGiam1;
    private javax.swing.JButton btnGiam2;
    private javax.swing.JButton btnGiam3;
    private javax.swing.JButton btnHide;
    private javax.swing.JButton btnHide1;
    private javax.swing.JButton btnHide2;
    private javax.swing.JButton btnHide3;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnShow1;
    private javax.swing.JButton btnShow2;
    private javax.swing.JButton btnShow3;
    private javax.swing.JButton btnTang;
    private javax.swing.JButton btnTang1;
    private javax.swing.JButton btnTang2;
    private javax.swing.JButton btnTang3;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JComboBox<String> cboTrangThai1;
    private javax.swing.JComboBox<String> cboTrangThai2;
    private javax.swing.JComboBox<String> cboTrangThai3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnlCPU;
    private javax.swing.JPanel pnlCPUInfo;
    private javax.swing.JPanel pnlCPUbtn;
    private javax.swing.JPanel pnlCPUsrc;
    private javax.swing.JPanel pnlDSPbtn;
    private javax.swing.JPanel pnlDSPsrc;
    private javax.swing.JPanel pnlDongInfo;
    private javax.swing.JPanel pnlDongSP;
    private javax.swing.JPanel pnlRAM;
    private javax.swing.JPanel pnlRAMbtn;
    private javax.swing.JPanel pnlRAMinfo;
    private javax.swing.JPanel pnlRAMsrc;
    private javax.swing.JPanel pnlSSD;
    private javax.swing.JPanel pnlSSDbtn;
    private javax.swing.JPanel pnlSSDinfo;
    private javax.swing.JPanel pnlSSDsrc;
    private javax.swing.JPanel pnlThongKe;
    private javax.swing.JRadioButton radCon;
    private javax.swing.JRadioButton radCon1;
    private javax.swing.JRadioButton radCon2;
    private javax.swing.JRadioButton radCon3;
    private javax.swing.JRadioButton radHet;
    private javax.swing.JRadioButton radHet1;
    private javax.swing.JRadioButton radHet2;
    private javax.swing.JRadioButton radHet3;
    private javax.swing.JTabbedPane tabKho;
    private javax.swing.JTable tblCPU;
    private javax.swing.JTable tblDSP;
    private javax.swing.JTable tblRAM;
    private javax.swing.JTable tblSSD;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMa1;
    private javax.swing.JTextField txtMa2;
    private javax.swing.JTextField txtMa3;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtName3;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTen1;
    private javax.swing.JTextField txtTen2;
    private javax.swing.JTextField txtTen3;
    // End of variables declaration//GEN-END:variables
}

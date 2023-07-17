/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.ThuKho;

import iservices.INhanVienService;
import java.awt.Color;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import services.NhanVienService;
import utilities.UserInfo;

import views.FrmDangNhap;

/**
 *
 * @author ADMIN
 */
public class FrmThuKho extends javax.swing.JFrame {

    private JPanel panel;
    private String dir = null;
    INhanVienService nhanVienService = new NhanVienService();

    public FrmThuKho() {
        String path = "src\\main\\java\\icon\\";
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        dir = absolutePath;

        initComponents();
        setTitle("Thủ kho");
        setLocationRelativeTo(null);

        panel = new JplSanPham();
        setPanel(panel);
    }

    public FrmThuKho(JPanel panel) {
        setPanel(panel);
    }

    private void setColor(JPanel p) {
        p.setBackground(new Color(170, 190, 255));
    }

    private void resetColor(JPanel p) {
        p.setBackground(new Color(255, 153, 153));
    }

    private void setPanel(JPanel p) {
        jplContain.removeAll();
        jplContain.add(p);
        jplContain.updateUI();
    }
    
    private void LoadThongTinNhanVien(){
        domainmodels.NhanVien nhanVien = nhanVienService.getHoTenByMa(utilities.UserInfo.tenTK);
        String hoTen = nhanVien.getHo() +" "+ nhanVien.getTenDem() +" "+ nhanVien.getTen();
        lblHoTen.setText(hoTen);
    }

    private void setNhanVien() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jplSanPham = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jplChiTietSP = new javax.swing.JPanel();
        lblChiTietSP = new javax.swing.JLabel();
        jplCPU = new javax.swing.JPanel();
        lblCPU = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jplRAM = new javax.swing.JPanel();
        lblRAM = new javax.swing.JLabel();
        jplSSD = new javax.swing.JPanel();
        lblSSD = new javax.swing.JLabel();
        jplMauSac = new javax.swing.JPanel();
        lblMauSac = new javax.swing.JLabel();
        jplManHinh = new javax.swing.JPanel();
        lblManHinh = new javax.swing.JLabel();
        jplDongSP = new javax.swing.JPanel();
        lblDongSP = new javax.swing.JLabel();
        jplNSX = new javax.swing.JPanel();
        lblNSX = new javax.swing.JLabel();
        jplNhapXuat = new javax.swing.JPanel();
        lblNhapXuat = new javax.swing.JLabel();
        jplContain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(dir+"\\store.png"));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("CỬA HÀNG BÁN LAPTOP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jplSanPham.setLayout(new java.awt.GridLayout(1, 0));

        lblSanPham.setText("Sản phẩm");
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseExited(evt);
            }
        });
        jplSanPham.add(lblSanPham);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nhân viên:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Vai trò:");

        jplChiTietSP.setLayout(new java.awt.GridLayout(1, 0));

        lblChiTietSP.setText("Chi tiết sản phẩm");
        lblChiTietSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChiTietSPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChiTietSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblChiTietSPMouseExited(evt);
            }
        });
        jplChiTietSP.add(lblChiTietSP);

        jplCPU.setLayout(new java.awt.GridLayout(1, 0));

        lblCPU.setText("CPU");
        lblCPU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCPUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCPUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCPUMouseExited(evt);
            }
        });
        jplCPU.add(lblCPU);

        lblDangXuat.setIcon(new javax.swing.ImageIcon(dir+"\\thoat.png"));
        lblDangXuat.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setText("Đăng xuất");
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseExited(evt);
            }
        });

        jLabel5.setText("Thủ kho");

        jplRAM.setLayout(new java.awt.GridLayout(1, 0));

        lblRAM.setText("RAM");
        lblRAM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRAMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRAMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRAMMouseExited(evt);
            }
        });
        jplRAM.add(lblRAM);

        jplSSD.setLayout(new java.awt.GridLayout(1, 0));

        lblSSD.setText("SSD");
        lblSSD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSSDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSSDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSSDMouseExited(evt);
            }
        });
        jplSSD.add(lblSSD);

        jplMauSac.setLayout(new java.awt.GridLayout(1, 0));

        lblMauSac.setText("Màu sắc");
        lblMauSac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMauSacMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMauSacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMauSacMouseExited(evt);
            }
        });
        jplMauSac.add(lblMauSac);

        jplManHinh.setLayout(new java.awt.GridLayout(1, 0));

        lblManHinh.setText("Màn hình");
        lblManHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManHinhMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblManHinhMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblManHinhMouseExited(evt);
            }
        });
        jplManHinh.add(lblManHinh);

        jplDongSP.setLayout(new java.awt.GridLayout(1, 0));

        lblDongSP.setText("Dòng sản phẩm");
        lblDongSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDongSPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDongSPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDongSPMouseExited(evt);
            }
        });
        jplDongSP.add(lblDongSP);

        jplNSX.setLayout(new java.awt.GridLayout(1, 0));

        lblNSX.setText("Nhà sản xuất");
        lblNSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNSXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNSXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNSXMouseExited(evt);
            }
        });
        jplNSX.add(lblNSX);

        jplNhapXuat.setLayout(new java.awt.GridLayout(1, 0));

        lblNhapXuat.setText("Quản lý nhập xuất");
        lblNhapXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNhapXuatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNhapXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNhapXuatMouseExited(evt);
            }
        });
        jplNhapXuat.add(lblNhapXuat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jplChiTietSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jplSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jplCPU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jplRAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jplSSD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jplMauSac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jplManHinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jplDongSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jplNSX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jplNhapXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                        .addGap(39, 39, 39))
                    .addComponent(lblDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblHoTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addComponent(jplSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jplChiTietSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jplCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jplRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jplSSD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jplMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jplManHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jplDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jplNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jplNhapXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel5, lblHoTen});

        jplContain.setLayout(new javax.swing.BoxLayout(jplContain, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jplContain, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jplContain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jplContain.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseClicked
        panel = new JplSanPham();
        setPanel(panel);
    }//GEN-LAST:event_lblSanPhamMouseClicked

    private void lblSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseEntered
        setColor(jplSanPham);
    }//GEN-LAST:event_lblSanPhamMouseEntered

    private void lblSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseExited
        resetColor(jplSanPham);
    }//GEN-LAST:event_lblSanPhamMouseExited

    private void lblCPUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCPUMouseClicked
        panel = new JplCPU();
        setPanel(panel);
    }//GEN-LAST:event_lblCPUMouseClicked

    private void lblCPUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCPUMouseEntered
        setColor(jplCPU);
    }//GEN-LAST:event_lblCPUMouseEntered

    private void lblCPUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCPUMouseExited
        resetColor(jplCPU);
    }//GEN-LAST:event_lblCPUMouseExited

    private void lblDongSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDongSPMouseClicked
        panel = new JplDongSP();
        setPanel(panel);
    }//GEN-LAST:event_lblDongSPMouseClicked

    private void lblDongSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDongSPMouseEntered
        setColor(jplDongSP);
    }//GEN-LAST:event_lblDongSPMouseEntered

    private void lblDongSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDongSPMouseExited
        resetColor(jplDongSP);
    }//GEN-LAST:event_lblDongSPMouseExited

    private void lblChiTietSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChiTietSPMouseClicked
        panel = new JplChiTietSP();
        setPanel(panel);
    }//GEN-LAST:event_lblChiTietSPMouseClicked

    private void lblChiTietSPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChiTietSPMouseEntered
        setColor(jplChiTietSP);
    }//GEN-LAST:event_lblChiTietSPMouseEntered

    private void lblChiTietSPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChiTietSPMouseExited
        resetColor(jplChiTietSP);
    }//GEN-LAST:event_lblChiTietSPMouseExited

    private void lblRAMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRAMMouseClicked
        panel = new JplRAM();
        setPanel(panel);
    }//GEN-LAST:event_lblRAMMouseClicked

    private void lblRAMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRAMMouseEntered
        setColor(jplRAM);
    }//GEN-LAST:event_lblRAMMouseEntered

    private void lblRAMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRAMMouseExited
        resetColor(jplRAM);
    }//GEN-LAST:event_lblRAMMouseExited

    private void lblSSDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSSDMouseClicked
        panel = new JplSSD();
        setPanel(panel);
    }//GEN-LAST:event_lblSSDMouseClicked

    private void lblSSDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSSDMouseEntered
        setColor(jplSSD);
    }//GEN-LAST:event_lblSSDMouseEntered

    private void lblSSDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSSDMouseExited
        resetColor(jplSSD);
    }//GEN-LAST:event_lblSSDMouseExited

    private void lblMauSacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMauSacMouseClicked
        panel = new JplMauSac();
        setPanel(panel);
    }//GEN-LAST:event_lblMauSacMouseClicked

    private void lblMauSacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMauSacMouseEntered
        setColor(jplMauSac);
    }//GEN-LAST:event_lblMauSacMouseEntered

    private void lblMauSacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMauSacMouseExited
        resetColor(jplMauSac);
    }//GEN-LAST:event_lblMauSacMouseExited

    private void lblManHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManHinhMouseClicked
        panel = new JplManHinh();
        setPanel(panel);
    }//GEN-LAST:event_lblManHinhMouseClicked

    private void lblManHinhMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManHinhMouseEntered
        setColor(jplManHinh);
    }//GEN-LAST:event_lblManHinhMouseEntered

    private void lblManHinhMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManHinhMouseExited
        resetColor(jplManHinh);
    }//GEN-LAST:event_lblManHinhMouseExited

    private void lblNSXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNSXMouseEntered
        setColor(jplNSX);
    }//GEN-LAST:event_lblNSXMouseEntered

    private void lblNSXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNSXMouseClicked
        panel = new JplNSX();
        setPanel(panel);
    }//GEN-LAST:event_lblNSXMouseClicked

    private void lblNSXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNSXMouseExited
        resetColor(jplNSX);
    }//GEN-LAST:event_lblNSXMouseExited

    private void lblNhapXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhapXuatMouseClicked
        panel = new JplNhapXuat();
        setPanel(panel);
    }//GEN-LAST:event_lblNhapXuatMouseClicked

    private void lblNhapXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhapXuatMouseEntered
        setColor(jplNhapXuat);
    }//GEN-LAST:event_lblNhapXuatMouseEntered

    private void lblNhapXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhapXuatMouseExited
        resetColor(jplNhapXuat);
    }//GEN-LAST:event_lblNhapXuatMouseExited

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        int hoi = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất không?");
        if (hoi != JOptionPane.OK_OPTION) {
            return;
        } else {
            UserInfo.tenTK = null;
            new FrmDangNhap().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void lblDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseEntered
        lblDangXuat.setForeground(Color.red);
    }//GEN-LAST:event_lblDangXuatMouseEntered

    private void lblDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseExited
        lblDangXuat.setForeground(Color.BLACK);
    }//GEN-LAST:event_lblDangXuatMouseExited

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
            java.util.logging.Logger.getLogger(FrmThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmThuKho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jplCPU;
    private javax.swing.JPanel jplChiTietSP;
    private javax.swing.JPanel jplContain;
    private javax.swing.JPanel jplDongSP;
    private javax.swing.JPanel jplManHinh;
    private javax.swing.JPanel jplMauSac;
    private javax.swing.JPanel jplNSX;
    private javax.swing.JPanel jplNhapXuat;
    private javax.swing.JPanel jplRAM;
    private javax.swing.JPanel jplSSD;
    private javax.swing.JPanel jplSanPham;
    private javax.swing.JLabel lblCPU;
    private javax.swing.JLabel lblChiTietSP;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblDongSP;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblManHinh;
    private javax.swing.JLabel lblMauSac;
    private javax.swing.JLabel lblNSX;
    private javax.swing.JLabel lblNhapXuat;
    private javax.swing.JLabel lblRAM;
    private javax.swing.JLabel lblSSD;
    private javax.swing.JLabel lblSanPham;
    // End of variables declaration//GEN-END:variables
}

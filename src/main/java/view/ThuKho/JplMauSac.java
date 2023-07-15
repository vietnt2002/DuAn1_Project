/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.ThuKho;

import domainmodels.MauSac;
import iservices.IMauSacService;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.CheckTrungService;
import services.MauSacService;
import utilities.ULHelper;

/**
 *
 * @author ADMIN
 */
public class JplMauSac extends javax.swing.JPanel {

    private final IMauSacService svcMS = new MauSacService() {
    };
    List<MauSac> lstMS = new ArrayList<>();
    DefaultTableModel modelMauSac = new DefaultTableModel();
    Date date = Date.valueOf(LocalDate.now());
    int index;

    public JplMauSac() {
        initComponents();
        modelMauSac = (DefaultTableModel) tblMauSac.getModel();
    }
  public void filltableMS() {
        try {
            modelMauSac.setRowCount(0);
            lstMS = svcMS.getAll();
            for (MauSac a : lstMS) {
                modelMauSac.addRow(new Object[]{
                    a.getMa(), a.getTen(), a.getNgayTao(), a.getNgaySua(), a.getStatus(a.getTrangThai())
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void showdetailMS(int index) {
        try {
            txtMa4.setText(lstMS.get(index).getMa());
            txtTen4.setText(lstMS.get(index).getTen());
            if (lstMS.get(index).getTrangThai() == 0) {
                radCon4.setSelected(true);
            } else {
                if (lstMS.get(index).getTrangThai() == 1) {
                    radHet4.setSelected(true);
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

        pnlMauSac = new javax.swing.JPanel();
        pnlMauSacinfo = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        radCon4 = new javax.swing.JRadioButton();
        radHet4 = new javax.swing.JRadioButton();
        pnlMauSacbtn = new javax.swing.JPanel();
        btnAdd4 = new javax.swing.JButton();
        btnShow4 = new javax.swing.JButton();
        btnEdit4 = new javax.swing.JButton();
        btnDelete4 = new javax.swing.JButton();
        btnHide4 = new javax.swing.JButton();
        txtMa4 = new javax.swing.JTextField();
        txtTen4 = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblMauSac = new javax.swing.JTable();
        pnlMauSacsrc = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        txtName4 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        btnTang4 = new javax.swing.JButton();
        btnGiam4 = new javax.swing.JButton();
        cboTrangThai4 = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();

        pnlMauSac.setBackground(new java.awt.Color(255, 230, 234));

        pnlMauSacinfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlMauSacinfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin màu sắc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel37.setText("Mã");

        jLabel42.setText("Tên");

        jLabel60.setText("Trạng thái");

        radCon4.setText("Còn hàng");
        radCon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCon4ActionPerformed(evt);
            }
        });

        radHet4.setText("Hết hàng");

        btnAdd4.setBackground(new java.awt.Color(255, 51, 0));
        btnAdd4.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd4.setText("Thêm");
        btnAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd4ActionPerformed(evt);
            }
        });

        btnShow4.setBackground(new java.awt.Color(255, 51, 0));
        btnShow4.setForeground(new java.awt.Color(255, 255, 255));
        btnShow4.setText("Hiện");
        btnShow4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShow4ActionPerformed(evt);
            }
        });

        btnEdit4.setBackground(new java.awt.Color(255, 51, 0));
        btnEdit4.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit4.setText("Sửa");
        btnEdit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit4ActionPerformed(evt);
            }
        });

        btnDelete4.setBackground(new java.awt.Color(255, 51, 0));
        btnDelete4.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete4.setText("Xóa");
        btnDelete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete4ActionPerformed(evt);
            }
        });

        btnHide4.setBackground(new java.awt.Color(255, 51, 0));
        btnHide4.setForeground(new java.awt.Color(255, 255, 255));
        btnHide4.setText("Ẩn");
        btnHide4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHide4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMauSacbtnLayout = new javax.swing.GroupLayout(pnlMauSacbtn);
        pnlMauSacbtn.setLayout(pnlMauSacbtnLayout);
        pnlMauSacbtnLayout.setHorizontalGroup(
            pnlMauSacbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMauSacbtnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlMauSacbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHide4)
                    .addComponent(btnDelete4)
                    .addComponent(btnEdit4)
                    .addComponent(btnShow4)
                    .addComponent(btnAdd4))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlMauSacbtnLayout.setVerticalGroup(
            pnlMauSacbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMauSacbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShow4)
                .addGap(18, 18, 18)
                .addComponent(btnHide4)
                .addGap(18, 18, 18)
                .addComponent(btnAdd4)
                .addGap(18, 18, 18)
                .addComponent(btnEdit4)
                .addGap(18, 18, 18)
                .addComponent(btnDelete4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTen4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTen4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMauSacinfoLayout = new javax.swing.GroupLayout(pnlMauSacinfo);
        pnlMauSacinfo.setLayout(pnlMauSacinfoLayout);
        pnlMauSacinfoLayout.setHorizontalGroup(
            pnlMauSacinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMauSacinfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlMauSacinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel42)
                    .addComponent(jLabel60))
                .addGap(18, 18, 18)
                .addGroup(pnlMauSacinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMa4, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen4, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMauSacinfoLayout.createSequentialGroup()
                        .addComponent(radCon4)
                        .addGap(18, 18, 18)
                        .addComponent(radHet4)))
                .addGap(18, 18, 18)
                .addComponent(pnlMauSacbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnlMauSacinfoLayout.setVerticalGroup(
            pnlMauSacinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMauSacinfoLayout.createSequentialGroup()
                .addGroup(pnlMauSacinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMauSacinfoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlMauSacinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(txtMa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMauSacinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(txtTen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMauSacinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(radCon4)
                            .addComponent(radHet4)))
                    .addGroup(pnlMauSacinfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlMauSacbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        tblMauSac.setModel(new javax.swing.table.DefaultTableModel(
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
        tblMauSac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMauSacMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblMauSac);

        pnlMauSacsrc.setBackground(new java.awt.Color(255, 255, 255));

        jLabel61.setText("Tra cứu tên:");

        jLabel62.setText("Sắp xếp theo tên");

        btnTang4.setText("Tăng");

        btnGiam4.setText("Giảm");

        jLabel63.setText("Trạng thái:");

        javax.swing.GroupLayout pnlMauSacsrcLayout = new javax.swing.GroupLayout(pnlMauSacsrc);
        pnlMauSacsrc.setLayout(pnlMauSacsrcLayout);
        pnlMauSacsrcLayout.setHorizontalGroup(
            pnlMauSacsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMauSacsrcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMauSacsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel61)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMauSacsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMauSacsrcLayout.createSequentialGroup()
                        .addComponent(btnTang4)
                        .addGap(18, 18, 18)
                        .addComponent(btnGiam4))
                    .addComponent(cboTrangThai4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName4))
                .addGap(110, 110, 110))
        );
        pnlMauSacsrcLayout.setVerticalGroup(
            pnlMauSacsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMauSacsrcLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlMauSacsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGap(18, 18, 18)
                .addGroup(pnlMauSacsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrangThai4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addGap(18, 18, 18)
                .addGroup(pnlMauSacsrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTang4)
                    .addComponent(jLabel62)
                    .addComponent(btnGiam4))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMauSacLayout = new javax.swing.GroupLayout(pnlMauSac);
        pnlMauSac.setLayout(pnlMauSacLayout);
        pnlMauSacLayout.setHorizontalGroup(
            pnlMauSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMauSacLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlMauSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlMauSacinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMauSacLayout.createSequentialGroup()
                        .addComponent(jScrollPane9)
                        .addGap(18, 18, 18)
                        .addComponent(pnlMauSacsrc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        pnlMauSacLayout.setVerticalGroup(
            pnlMauSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMauSacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMauSacinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(pnlMauSacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMauSacsrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radCon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCon4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radCon4ActionPerformed

    private void btnAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd4ActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMa4, "Không được để mã trống!")) {
                return;
            } else {
                int trungMa = CheckTrungService.checkTrung(txtMa4.getText(),
                        "mausac", "ma");
                if (trungMa != -1) {
                    JOptionPane.showMessageDialog(this, "Mã đã tồn tại!");
                    return;
                }
            }

            if (ULHelper.checknull(txtTen4, "Không được để tên trống!")) {
                return;
            }
            int stt = (radHet4.isSelected() ? 1 : 0);
            MauSac mau = new MauSac(txtMa4.getText(), txtTen4.getText(), date, date, stt);
            int thongBao = svcMS.them(mau);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                filltableMS();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAdd4ActionPerformed

    private void btnShow4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShow4ActionPerformed
        // TODO add your handling code here:
        try {
            filltableMS();
            showdetailMS(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnShow4ActionPerformed

    private void btnEdit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit4ActionPerformed
        // TODO add your handling code here:
        try {
            if (ULHelper.checknull(txtMa4, "Không được để mã trống!")) {
                return;
            }

            if (ULHelper.checknull(txtTen4, "Không được để tên trống!")) {
                return;
            }
            lstMS = svcMS.getAll();

            Date tao = lstMS.get(index).getNgayTao();
            int stt = (radHet4.isSelected() ? 1 : 0);
            MauSac mau = new MauSac(txtMa4.getText(), txtTen4.getText(), tao, date, stt);
            int thongBao = svcMS.sua(mau);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                filltableMS();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEdit4ActionPerformed

    private void btnDelete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete4ActionPerformed
        // TODO add your handling code here:
        try {
            String ma = txtMa4.getText();
            int thongBao = svcMS.xoa(ma);
            if (thongBao == 1) {
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
                filltableMS();
                showdetailMS(0);
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDelete4ActionPerformed

    private void btnHide4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHide4ActionPerformed
        // TODO add your handling code here:
        try {
            modelMauSac.setRowCount(0);
            txtMa4.setText("");
            txtTen4.setText("");
            radCon4.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHide4ActionPerformed

    private void txtTen4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTen4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTen4ActionPerformed

    private void tblMauSacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMauSacMouseClicked
        // TODO add your handling code here:
        try {
            int index = tblMauSac.getSelectedRow();
            showdetailMS(index);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblMauSacMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd4;
    private javax.swing.JButton btnDelete4;
    private javax.swing.JButton btnEdit4;
    private javax.swing.JButton btnGiam4;
    private javax.swing.JButton btnHide4;
    private javax.swing.JButton btnShow4;
    private javax.swing.JButton btnTang4;
    private javax.swing.JComboBox<String> cboTrangThai4;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel pnlMauSac;
    private javax.swing.JPanel pnlMauSacbtn;
    private javax.swing.JPanel pnlMauSacinfo;
    private javax.swing.JPanel pnlMauSacsrc;
    private javax.swing.JRadioButton radCon4;
    private javax.swing.JRadioButton radHet4;
    private javax.swing.JTable tblMauSac;
    private javax.swing.JTextField txtMa4;
    private javax.swing.JTextField txtName4;
    private javax.swing.JTextField txtTen4;
    // End of variables declaration//GEN-END:variables
}

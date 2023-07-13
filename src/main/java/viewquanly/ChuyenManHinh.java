package viewquanly;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ADMIN
 */
public class ChuyenManHinh {

    private JPanel root;
    private String kindSelected = "";
    private List<DanhMucBean> listitem = null;

    public ChuyenManHinh(JPanel jonRoot) {
        this.root = jonRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "QLdonhang";
        jpnItem.setBackground(new Color(255, 77, 77));
        jlbItem.setBackground(new Color(255, 77, 77));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new QlDonHangJ());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<DanhMucBean> listitem) {
        this.listitem = listitem;

        for (DanhMucBean danhmucbean : listitem) {
            danhmucbean.getJlb().addMouseListener(new labelEvent(danhmucbean.getKind(), danhmucbean.getJpn(), danhmucbean.getJlb()));
        }
    }

    class labelEvent implements MouseListener {

        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public labelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "QLdonhang":
                    node = new QlDonHangJ();
                    break;
                case "QLnhanvien":
                    node = new QLNhanVienJ();
                    break;
                case "QLkhachhang":
                    node = new QLKhachHangJ();

                    break;
                case "Thongke":
                    node = new ThongKeJ();
                    break;
                default:
                    throw new AssertionError();
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(222, 73, 93));
            jlbItem.setBackground(new Color(222, 73, 93));
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(222, 73, 93));
            jlbItem.setBackground(new Color(222, 73, 93));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(0, 153, 0));
                jlbItem.setBackground(new Color(0, 153, 0));

            }
        }

        private void setChangeBackground(String kind) {
            for (DanhMucBean danhmucbean : listitem) {
                if (danhmucbean.getKind().equalsIgnoreCase(kind)) {
                    danhmucbean.getJlb().setBackground(new Color(222, 73, 93));
                    danhmucbean.getJpn().setBackground(new Color(222, 73, 93));
                } else {
                    danhmucbean.getJlb().setBackground(new Color(0, 153, 0));
                    danhmucbean.getJpn().setBackground(new Color(0, 153, 0));

                }
            }
        }
    }

}

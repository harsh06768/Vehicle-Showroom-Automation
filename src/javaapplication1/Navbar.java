package javaapplication1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.text.Text;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author micr
 */
public class Navbar extends javax.swing.JFrame {

    /**
     * Creates new form Navbar
     */
    private String gen, egen, cmp, mode, fue, c;
    private int flag, gcn;
    Connection con = null;

    public Navbar() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);
        setVisible(true);

        initComponents();
        slideShow();
        DisplayTable();
        eDisplayTable();
        vDisplayTable();
        sDisplayTable();
        dDisplayTable();
        vhsbyt.setEnabled(false);
        vhch.setEditable(false);
        dmobc.setSelected(false);

        svc.setEditable(false);
        scn.setEditable(false);
        ssn.setEditable(false);
        svm.setEditable(false);
        scaa.setEditable(false);
        sen.setEditable(false);
        svct.setEditable(false);
        sdat.setText("0");
        ccid.setEditable(false);
        vcci.setEditable(false);
        sbyt.setEnabled(false);
        ssbyt.setEnabled(false);
        cnt.setEnabled(false);
        fnt.setEnabled(false);
        pdt.setEnabled(false);
        vnt.setEnabled(false);

        spd.setEditable(false);
        emplyid.setEditable(false);
        veci.setEditable(false);
        srat.setEditable(false);

        sdd.setEnabled(false);
        sda.setEnabled(false);
        spd.setEnabled(false);
        mnt.setEnabled(false);
        sdi.setEnabled(false);
        svct.setEnabled(false);
        sdat.setEnabled(false);
        srat.setEnabled(false);

        esbyt.setEnabled(false);
        sid.setEditable(false);
        mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select"}));
    }
    static String wn;

    public Navbar(String na) {
        wn = na;

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);
        setVisible(true);

        initComponents();
        slideShow();
        DisplayTable();
        eDisplayTable();
        vDisplayTable();
        sDisplayTable();
        dDisplayTable();
        vhsbyt.setEnabled(false);
        svc.setEditable(false);
        scn.setEditable(false);
        ssn.setEditable(false);
        svm.setEditable(false);
        mnt.setEnabled(false);
        scaa.setEditable(false);
        sen.setEditable(false);
        svct.setEditable(false);
        sdd.setEnabled(false);
        ssbyt.setEnabled(false);
        sda.setEnabled(false);
        spd.setEnabled(false);
        sdi.setEnabled(false);
        svct.setEnabled(false);
        sdat.setEnabled(false);

        cnt.setEnabled(false);
        fnt.setEnabled(false);
        pdt.setEnabled(false);
        vnt.setEnabled(false);
        dmobc.setSelected(false);
        srat.setEnabled(false);
        srat.setEditable(false);
        sdat.setText("0");
        vhch.setEditable(false);
        ccid.setEditable(false);
        vcci.setEditable(false);
        sbyt.setEnabled(false);
        esbyt.setEnabled(false);
        sid.setEditable(false);
        spd.setEditable(false);

        veci.setEditable(false);
        mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select"}));
        emplyid.setEditable(false);

    }

    public void slideShow() {

        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    while (true) {
                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/c10.jpg")));

                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/dsBuffer.jpg")));

                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/c6.jpg")));

                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/c3.jpg")));
                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/c4.jpg")));
                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/c2.jpg")));
                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/c8.jpg")));

                        Thread.sleep(2000);
                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/c7.jpg")));
                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/c1.jpg")));
                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/c5.jpg")));
                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/c9.jpg")));

                        Thread.sleep(2000);

                        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/1090x640.jpg")));
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        ).start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     * @param evt
     */
    public void showDate() {
        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat se = new SimpleDateFormat("yyyy-MM-dd");

        date.setText(s.format(d));
        spd.setText(se.format(d));
    }

    private void DisplayTable() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select * from customer";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            vctable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vccu, e);

        }

    }

    private void eDisplayTable() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select * from employee";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            vetable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(esbyt, e);

        }

    }

    private void dDisplayTable() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select * from dealer";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            dtable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(dsbyt, e);

        }

    }

    public void vDisplayTable() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select * from vehicle";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            vtable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vhsbyt, e);

        }

    }

    public void sDisplayTable() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select * from sale";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();
            stable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.ViewSale, e);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        Autoicon = new javax.swing.JLabel();
        weln = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        Autohub1 = new javax.swing.JLabel();
        Autohub2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Home_main = new javax.swing.JPanel();
        Home1 = new javax.swing.JPanel();
        hpic = new javax.swing.JLabel();
        customer2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ViewaddHeader = new javax.swing.JPanel();
        Addc = new javax.swing.JLabel();
        Searchc = new javax.swing.JLabel();
        customermain = new javax.swing.JPanel();
        registration = new javax.swing.JPanel();
        centry = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cdob = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        caddress = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ccity = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cemail = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        caddharno = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cpannum = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cname = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        mobnumber = new javax.swing.JTextField();
        cvehino = new javax.swing.JTextField();
        cfathername = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ccid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        inn = new javax.swing.JLabel();
        inn1 = new javax.swing.JLabel();
        inn2 = new javax.swing.JLabel();
        inn3 = new javax.swing.JLabel();
        inn4 = new javax.swing.JLabel();
        inn5 = new javax.swing.JLabel();
        inn6 = new javax.swing.JLabel();
        inn7 = new javax.swing.JLabel();
        inn8 = new javax.swing.JLabel();
        inn9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Searchcustomer = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        sby = new javax.swing.JComboBox<>();
        vcci = new javax.swing.JTextField();
        searchicon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vctable = new javax.swing.JTable();
        jLabel99 = new javax.swing.JLabel();
        sbyt = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        vcfa = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        vcda = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        vcaa = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        vcmo = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        vcve = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        vcge = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        vcpa = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        vcct = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        vcad = new javax.swing.JTextField();
        vcupdate = new javax.swing.JButton();
        vcem = new javax.swing.JTextField();
        vcreset = new javax.swing.JButton();
        vcdelete = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        vccu = new javax.swing.JTextField();
        employee3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        registrationemployee = new javax.swing.JPanel();
        vecreg1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        efathername = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        eaddress = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        emobnumber = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        esalary = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        edateofjoin = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        esave = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        eemail = new javax.swing.JTextField();
        save3 = new javax.swing.JButton();
        emplyid = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        ename = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        eaddharno = new javax.swing.JTextField();
        epannum = new javax.swing.JTextField();
        ecity = new javax.swing.JTextField();
        cusname8 = new javax.swing.JTextField();
        em = new javax.swing.JRadioButton();
        ef = new javax.swing.JRadioButton();
        jLabel72 = new javax.swing.JLabel();
        edob = new javax.swing.JTextField();
        gi = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        viewemployee = new javax.swing.JPanel();
        viewemply = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        esby = new javax.swing.JComboBox<>();
        veci = new javax.swing.JTextField();
        searchicon1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        vetable = new javax.swing.JTable();
        jLabel112 = new javax.swing.JLabel();
        esbyt = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        vefa = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        veda = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        veaa = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        vepa = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        vejo = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        vege = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        vesa = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        vect = new javax.swing.JTextField();
        jLabel122 = new javax.swing.JLabel();
        vead = new javax.swing.JTextField();
        vcupdate1 = new javax.swing.JButton();
        veem = new javax.swing.JTextField();
        vcreset1 = new javax.swing.JButton();
        vcdelete1 = new javax.swing.JButton();
        jLabel123 = new javax.swing.JLabel();
        vecu = new javax.swing.JTextField();
        jLabel124 = new javax.swing.JLabel();
        vede = new javax.swing.JTextField();
        jLabel125 = new javax.swing.JLabel();
        vemo = new javax.swing.JTextField();
        Dealer8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        ViewaddHeader2 = new javax.swing.JPanel();
        Addc2 = new javax.swing.JLabel();
        Searchc2 = new javax.swing.JLabel();
        dealermain1 = new javax.swing.JPanel();
        registration1 = new javax.swing.JPanel();
        centry1 = new javax.swing.JPanel();
        damo = new javax.swing.JTextField();
        daad = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        daci = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        daem = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        save1 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        dade = new javax.swing.JTextField();
        reset2 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        dala = new javax.swing.JTextField();
        daco = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        dadi = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        dmobc = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        Searchdealer1 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        dsby = new javax.swing.JComboBox<>();
        ddi = new javax.swing.JTextField();
        searchicon4 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        dtable = new javax.swing.JTable();
        jLabel139 = new javax.swing.JLabel();
        dsbyt = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        dla = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        dmn = new javax.swing.JTextField();
        jLabel155 = new javax.swing.JLabel();
        dco = new javax.swing.JTextField();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        dci = new javax.swing.JTextField();
        jLabel158 = new javax.swing.JLabel();
        dad = new javax.swing.JTextField();
        vcupdate6 = new javax.swing.JButton();
        dem = new javax.swing.JTextField();
        vcreset3 = new javax.swing.JButton();
        vcdelete3 = new javax.swing.JButton();
        dde = new javax.swing.JTextField();
        Report4 = new javax.swing.JPanel();
        billing1 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        rep = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        qsr = new javax.swing.JRadioButton();
        cnt = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        fnt = new javax.swing.JTextField();
        pdt = new javax.swing.JTextField();
        vnt = new javax.swing.JTextField();
        reset1 = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        mnt = new javax.swing.JTextField();
        vehicle5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        additionvehicle = new javax.swing.JPanel();
        addingvehicle = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        save5 = new javax.swing.JButton();
        deli = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        fltp = new javax.swing.JComboBox<>();
        cpy = new javax.swing.JComboBox<>();
        mod = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        mil = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        tps = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        chno = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        egno = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        col = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        save11 = new javax.swing.JButton();
        save12 = new javax.swing.JButton();
        save13 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        cst = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        viewvehicle = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        vtable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        vhsby = new javax.swing.JComboBox<>();
        vhsbyt = new javax.swing.JTextField();
        searchicon2 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        vhch = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        vhen = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        vhco = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        vhst = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        vhde = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        vhto = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        vhmi = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        vhfu = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        vhda = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        vhcl = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        vhct = new javax.swing.JTextField();
        vcupdate2 = new javax.swing.JButton();
        vcupdate3 = new javax.swing.JButton();
        vcupdate4 = new javax.swing.JButton();
        jLabel137 = new javax.swing.JLabel();
        vhmo = new javax.swing.JTextField();
        Sale6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ViewaddHeader1 = new javax.swing.JPanel();
        Addc1 = new javax.swing.JLabel();
        Searchc1 = new javax.swing.JLabel();
        SaleMain = new javax.swing.JPanel();
        AddSale = new javax.swing.JPanel();
        sentry1 = new javax.swing.JPanel();
        sid = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel142 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        scid = new javax.swing.JTextField();
        jLabel179 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        sdd = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        sda = new javax.swing.JTextField();
        adc = new javax.swing.JCheckBox();
        jButton10 = new javax.swing.JButton();
        jLabel180 = new javax.swing.JLabel();
        sdi = new javax.swing.JTextField();
        jLabel181 = new javax.swing.JLabel();
        sen = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        jLabel182 = new javax.swing.JLabel();
        scn = new javax.swing.JTextField();
        jLabel183 = new javax.swing.JLabel();
        svc = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        paym = new javax.swing.JComboBox<>();
        jLabel185 = new javax.swing.JLabel();
        svm = new javax.swing.JTextField();
        scaa = new javax.swing.JTextField();
        spd = new javax.swing.JTextField();
        svct = new javax.swing.JTextField();
        sdat = new javax.swing.JTextField();
        srat = new javax.swing.JTextField();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        ssid = new javax.swing.JTextField();
        sch = new javax.swing.JTextField();
        scidc = new javax.swing.JCheckBox();
        ssidc = new javax.swing.JCheckBox();
        schc = new javax.swing.JCheckBox();
        conf = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ViewSale = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        stable = new javax.swing.JTable();
        ssby = new javax.swing.JComboBox<>();
        ssbyt = new javax.swing.JTextField();
        searchicon3 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        vsem = new javax.swing.JTextField();
        vcupdate5 = new javax.swing.JButton();
        vcdelete2 = new javax.swing.JButton();
        vcreset2 = new javax.swing.JButton();
        vssa = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        vscu = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        vsvi = new javax.swing.JTextField();
        vspu = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        vsct = new javax.swing.JTextField();
        jLabel164 = new javax.swing.JLabel();
        vsen = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        vsvc = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        vsde = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        vspa = new javax.swing.JTextField();
        vsve = new javax.swing.JTextField();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        vsvm = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        vsdp = new javax.swing.JTextField();
        jLabel174 = new javax.swing.JLabel();
        vsre = new javax.swing.JTextField();
        billing = new javax.swing.JPanel();
        jLabel166 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        bil = new javax.swing.JTextArea();
        jButton12 = new javax.swing.JButton();
        stock7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        addstock = new javax.swing.JPanel();
        addingstock = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        save8 = new javax.swing.JButton();
        vs = new javax.swing.JTextField();
        vsc = new javax.swing.JComboBox<>();
        vsm = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        Reports = new javax.swing.JLabel();
        Stock = new javax.swing.JLabel();
        Customer = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Vehicle = new javax.swing.JLabel();
        Employee = new javax.swing.JLabel();
        Sale = new javax.swing.JLabel();
        Dealer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AutoHub");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 102, 0));

        Autoicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/racing co-white 64px.png"))); // NOI18N

        weln.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        weln.setForeground(new java.awt.Color(255, 255, 255));
        weln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weln.setText("Welcome");

        logout.setBackground(new java.awt.Color(0, 153, 0));
        logout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/aalogout.png"))); // NOI18N
        logout.setText("Logout");
        logout.setToolTipText("\nLogout\n");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        Autohub1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Autohub1.setForeground(new java.awt.Color(255, 255, 255));
        Autohub1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Autohub1.setText("AutoHub");

        Autohub2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Autohub2.setForeground(new java.awt.Color(255, 255, 255));
        Autohub2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Autohub2.setText("Welcome");

        date.setBackground(new java.awt.Color(0, 153, 0));
        date.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setToolTipText("");
        date.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weln, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Autohub2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(Autohub1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Autoicon, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Autoicon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Autohub1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Autohub2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weln, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1090, 100));

        Home_main.setEnabled(false);
        Home_main.setLayout(new java.awt.CardLayout());

        Home1.setPreferredSize(new java.awt.Dimension(1090, 560));
        Home1.setVerifyInputWhenFocusTarget(false);

        hpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/1090x640.jpg"))); // NOI18N

        javax.swing.GroupLayout Home1Layout = new javax.swing.GroupLayout(Home1);
        Home1.setLayout(Home1Layout);
        Home1Layout.setHorizontalGroup(
            Home1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hpic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Home1Layout.setVerticalGroup(
            Home1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hpic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Home_main.add(Home1, "card3");

        customer2.setEnabled(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewaddHeader.setBackground(new java.awt.Color(0, 204, 204));
        ViewaddHeader.setToolTipText("");
        ViewaddHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Addc.setBackground(new java.awt.Color(0, 204, 204));
        Addc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Addc.setForeground(new java.awt.Color(255, 255, 255));
        Addc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Addc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/addc.png"))); // NOI18N
        Addc.setText("Add Customer");
        Addc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Addc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Addc.setIconTextGap(15);
        Addc.setOpaque(true);
        Addc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddcMouseExited(evt);
            }
        });
        ViewaddHeader.add(Addc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 40));

        Searchc.setBackground(new java.awt.Color(0, 204, 204));
        Searchc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Searchc.setForeground(new java.awt.Color(255, 255, 255));
        Searchc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Searchc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/eye.png"))); // NOI18N
        Searchc.setText("View Customer");
        Searchc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Searchc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Searchc.setIconTextGap(10);
        Searchc.setOpaque(true);
        Searchc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
       
        centry.setBackground(new java.awt.Color(255, 255, 255));
        centry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText("Vehicle number : ");
        centry.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 150, 30));

        cdob.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        cdob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdobActionPerformed(evt);
            }
        });
        cdob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cdobKeyReleased(evt);
            }
        });
        centry.add(cdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 270, 30));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setText("              Pan Number :");
        centry.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 30));

        caddress.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        caddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caddressActionPerformed(evt);
            }
        });
        caddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caddressKeyPressed(evt);
            }
        });
        centry.add(caddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 270, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setText("  Date of Birth:");
        centry.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 30));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel21.setText("     Gender:");
        centry.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 130, 30));

        ccity.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        ccity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ccity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccityActionPerformed(evt);
            }
        });
        ccity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ccityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ccityKeyReleased(evt);
            }
        });
        centry.add(ccity, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 30));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel22.setText("Phone Number:");
        centry.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 30));

        cemail.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        cemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cemailActionPerformed(evt);
            }
        });
        cemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cemailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cemailKeyReleased(evt);
            }
        });
        centry.add(cemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 270, 30));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel23.setText("            Email :");
        centry.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 150, 30));

        caddharno.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        caddharno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        caddharno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caddharnoActionPerformed(evt);
            }
        });
        caddharno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caddharnoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caddharnoKeyReleased(evt);
            }
        });
        centry.add(caddharno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 270, 30));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel24.setText("      Address:");
        centry.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 130, 30));

        cpannum.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        cpannum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cpannum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpannumActionPerformed(evt);
            }
        });
        cpannum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpannumKeyPressed(evt);
            }
        });
        centry.add(cpannum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 270, 30));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel25.setText("Aadhar Number :");
        centry.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 180, 30));

        save.setBackground(new java.awt.Color(0, 204, 204));
        save.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        save.setText("Save");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        centry.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 100, 40));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setText("Customer ID :");
        centry.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 120, 30));

        cname.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        cname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });
        cname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnameKeyReleased(evt);
            }
        });
        centry.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 270, 30));

        reset.setBackground(new java.awt.Color(0, 204, 204));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reset.setText("Reset");
        reset.setBorder(null);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        centry.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 100, 40));

        m.setBackground(new java.awt.Color(255, 255, 255));
        m.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        m.setText("Male");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        centry.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        f.setBackground(new java.awt.Color(255, 255, 255));
        f.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        f.setText("Female");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        centry.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel26.setText("Customer Name:");
        centry.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 160, 30));

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel54.setText("Father Name :");
        centry.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 130, 30));

        mobnumber.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        mobnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mobnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobnumberActionPerformed(evt);
            }
        });
        mobnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobnumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobnumberKeyReleased(evt);
            }
        });
        centry.add(mobnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 270, 30));

        cvehino.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        cvehino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cvehino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvehinoActionPerformed(evt);
            }
        });
        centry.add(cvehino, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 270, 30));

        cfathername.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        cfathername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cfathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfathernameActionPerformed(evt);
            }
        });
        cfathername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cfathernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cfathernameKeyReleased(evt);
            }
        });
        centry.add(cfathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 270, 30));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel28.setText("City :");
        centry.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 60, 30));

        ccid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ccid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ccid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccidActionPerformed(evt);
            }
        });
        ccid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ccidKeyPressed(evt);
            }
        });
        centry.add(ccid, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 80, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Generate Id");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        centry.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 120, 30));

        inn.setForeground(new java.awt.Color(255, 0, 0));
        centry.add(inn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 130, 20));

        inn1.setForeground(new java.awt.Color(255, 0, 0));
        centry.add(inn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 130, 20));

        inn2.setForeground(new java.awt.Color(255, 0, 0));
        centry.add(inn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 130, 20));

        inn3.setForeground(new java.awt.Color(255, 0, 0));
        centry.add(inn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 290, 20));

        inn4.setForeground(new java.awt.Color(255, 0, 0));
        centry.add(inn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 130, 20));

        inn5.setForeground(new java.awt.Color(255, 0, 0));
        centry.add(inn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 130, 20));

        inn6.setForeground(new java.awt.Color(255, 0, 0));
        centry.add(inn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, 20));

        inn7.setForeground(new java.awt.Color(255, 0, 0));
        centry.add(inn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 130, 20));

        inn8.setForeground(new java.awt.Color(255, 0, 0));
        centry.add(inn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 130, 20));

        inn9.setForeground(new java.awt.Color(255, 0, 0));
        centry.add(inn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 130, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add Customer ");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout registrationLayout = new javax.swing.GroupLayout(registration);
        registration.setLayout(registrationLayout);
        registrationLayout.setHorizontalGroup(
            registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(centry, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        registrationLayout.setVerticalGroup(
            registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centry, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        customermain.add(registration, "card2");

        Searchcustomer.setBackground(new java.awt.Color(255, 255, 255));
        Searchcustomer.setPreferredSize(new java.awt.Dimension(1090, 640));
        Searchcustomer.setLayout(null);

        jLabel98.setBackground(new java.awt.Color(255, 255, 255));
        jLabel98.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel98.setText("                                                        View Customer ");
        jLabel98.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel98.setMaximumSize(new java.awt.Dimension(661, 43));
        jLabel98.setMinimumSize(new java.awt.Dimension(661, 43));
        jLabel98.setPreferredSize(new java.awt.Dimension(661, 43));
        Searchcustomer.add(jLabel98);
        jLabel98.setBounds(0, 0, 1098, 43);

        sby.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By", "Customer Id", "Customer Name", "Father Name", "Aadhar No.", "Vehicle No.", "Mobile No.", "City" }));
        sby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbyActionPerformed(evt);
            }
        });
        Searchcustomer.add(sby);
        sby.setBounds(10, 310, 201, 37);

        vcci.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcciActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcci);
        vcci.setBounds(770, 320, 200, 30);

        searchicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/searchbs.png"))); // NOI18N
        searchicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchiconMouseClicked(evt);
            }
        });
        Searchcustomer.add(searchicon);
        searchicon.setBounds(440, 310, 30, 41);

        vctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "cid", "cname", "cfathername", "mobnumber", "caddress", "ccity", "cemail", "caddharno", "cpannum", "cgender", "cdob", "cvehino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vctable.setGridColor(new java.awt.Color(0, 0, 0));
        vctable.setSelectionBackground(new java.awt.Color(0, 255, 255));
        vctable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        vctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vctableMouseClicked(evt);
            }
        });
        vctable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vctableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(vctable);
        if (vctable.getColumnModel().getColumnCount() > 0) {
            vctable.getColumnModel().getColumn(8).setHeaderValue("cpannum");
            vctable.getColumnModel().getColumn(9).setHeaderValue("cgender");
            vctable.getColumnModel().getColumn(10).setHeaderValue("cdob");
            vctable.getColumnModel().getColumn(11).setHeaderValue("cvehino");
        }

        Searchcustomer.add(jScrollPane1);
        jScrollPane1.setBounds(0, 50, 1090, 230);

        jLabel99.setBackground(new java.awt.Color(255, 255, 255));
        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel99.setText("Customer Id");
        Searchcustomer.add(jLabel99);
        jLabel99.setBounds(770, 290, 136, 22);

        sbyt.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        sbyt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sbyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbytMouseClicked(evt);
            }
        });
        sbyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbytActionPerformed(evt);
            }
        });
        Searchcustomer.add(sbyt);
        sbyt.setBounds(220, 310, 209, 37);

        jLabel100.setBackground(new java.awt.Color(255, 255, 255));
        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel100.setText("Customer Name");
        Searchcustomer.add(jLabel100);
        jLabel100.setBounds(520, 290, 136, 22);

        vcfa.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcfa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcfaActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcfa);
        vcfa.setBounds(520, 380, 200, 30);

        jLabel101.setBackground(new java.awt.Color(255, 255, 255));
        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel101.setText("Mobile No.");
        Searchcustomer.add(jLabel101);
        jLabel101.setBounds(770, 350, 108, 22);

        vcda.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcdaActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcda);
        vcda.setBounds(270, 380, 199, 29);

        jLabel102.setBackground(new java.awt.Color(255, 255, 255));
        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel102.setText("Aadhar Number");
        Searchcustomer.add(jLabel102);
        jLabel102.setBounds(270, 420, 136, 22);

        vcaa.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcaa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcaaActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcaa);
        vcaa.setBounds(270, 450, 199, 30);

        jLabel103.setBackground(new java.awt.Color(255, 255, 255));
        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel103.setText("Date of Birth");
        Searchcustomer.add(jLabel103);
        jLabel103.setBounds(270, 350, 113, 22);

        vcmo.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcmo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcmoActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcmo);
        vcmo.setBounds(770, 380, 199, 30);

        jLabel104.setBackground(new java.awt.Color(255, 255, 255));
        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel104.setText("Gender");
        Searchcustomer.add(jLabel104);
        jLabel104.setBounds(352, 492, 136, 22);

        vcve.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcveActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcve);
        vcve.setBounds(520, 450, 199, 30);

        jLabel105.setBackground(new java.awt.Color(255, 255, 255));
        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel105.setText("Vehicle Number ");
        Searchcustomer.add(jLabel105);
        jLabel105.setBounds(520, 420, 136, 22);

        vcge.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcgeActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcge);
        vcge.setBounds(352, 520, 199, 30);

        jLabel106.setBackground(new java.awt.Color(255, 255, 255));
        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel106.setText("PAN Number");
        Searchcustomer.add(jLabel106);
        jLabel106.setBounds(10, 350, 136, 22);

        vcpa.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcpa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcpaActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcpa);
        vcpa.setBounds(10, 380, 199, 30);

        jLabel107.setBackground(new java.awt.Color(255, 255, 255));
        jLabel107.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel107.setText("Email ID");
        Searchcustomer.add(jLabel107);
        jLabel107.setBounds(770, 420, 136, 22);

        jLabel108.setBackground(new java.awt.Color(255, 255, 255));
        jLabel108.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel108.setText("City ");
        Searchcustomer.add(jLabel108);
        jLabel108.setBounds(10, 420, 136, 22);

        vcct.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcctActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcct);
        vcct.setBounds(10, 450, 199, 30);

        jLabel109.setBackground(new java.awt.Color(255, 255, 255));
        jLabel109.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel109.setText("Address");
        Searchcustomer.add(jLabel109);
        jLabel109.setBounds(10, 491, 136, 22);

        vcad.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcadActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcad);
        vcad.setBounds(10, 520, 324, 30);

        vcupdate.setBackground(new java.awt.Color(0, 204, 204));
        vcupdate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcupdate.setText("Update");
        vcupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcupdateActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcupdate);
        vcupdate.setBounds(600, 510, 121, 46);

        vcem.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vcem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vcem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcemActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcem);
        vcem.setBounds(770, 450, 199, 30);

        vcreset.setBackground(new java.awt.Color(0, 204, 204));
        vcreset.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcreset.setText("Reset");
        vcreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcresetActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcreset);
        vcreset.setBounds(880, 510, 121, 46);

        vcdelete.setBackground(new java.awt.Color(0, 204, 204));
        vcdelete.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcdelete.setText("Delete");
        vcdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcdeleteActionPerformed(evt);
            }
        });
        Searchcustomer.add(vcdelete);
        vcdelete.setBounds(740, 510, 121, 46);

        jLabel110.setBackground(new java.awt.Color(255, 255, 255));
        jLabel110.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel110.setText("Father Name");
        Searchcustomer.add(jLabel110);
        jLabel110.setBounds(520, 350, 136, 22);

        vccu.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vccu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vccu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vccuActionPerformed(evt);
            }
        });
        Searchcustomer.add(vccu);
        vccu.setBounds(520, 320, 200, 30);

        customermain.add(Searchcustomer, "card4");

        jPanel3.add(customermain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1090, 580));

        javax.swing.GroupLayout customer2Layout = new javax.swing.GroupLayout(customer2);
        customer2.setLayout(customer2Layout);
        customer2Layout.setHorizontalGroup(
            customer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(customer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customer2Layout.setVerticalGroup(
            customer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
            .addGroup(customer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(customer2Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Home_main.add(customer2, "card2");

        employee3.setEnabled(false);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(0, 204, 204));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/eye.png"))); // NOI18N
        jLabel13.setText("View Employee");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 190, 40));

        jLabel18.setBackground(new java.awt.Color(0, 204, 204));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/addc.png"))); // NOI18N
        jLabel18.setText("Add Employee");
        jLabel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.setOpaque(true);
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 40));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 60));

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setLayout(new java.awt.CardLayout());

        registrationemployee.setBackground(new java.awt.Color(255, 255, 255));

        vecreg1.setBackground(new java.awt.Color(255, 255, 255));
        vecreg1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setText("       Employee Id:");
        vecreg1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 30));

        efathername.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        efathername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        efathername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efathernameActionPerformed(evt);
            }
        });
        vecreg1.add(efathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 290, 30));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel27.setText("  Date of Joining:");
        vecreg1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 150, 30));

        eaddress.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        eaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaddressActionPerformed(evt);
            }
        });
        eaddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eaddressKeyPressed(evt);
            }
        });
        vecreg1.add(eaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 290, 30));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel31.setText("Father Name :");
        vecreg1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 30));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel32.setText("          Gender:");
        vecreg1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 130, 30));

        emobnumber.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        emobnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emobnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emobnumberActionPerformed(evt);
            }
        });
        emobnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emobnumberKeyPressed(evt);
            }
        });
        vecreg1.add(emobnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 290, 30));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel39.setText("Phone Number:");
        vecreg1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, 30));

        esalary.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        esalary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        esalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esalaryActionPerformed(evt);
            }
        });
        esalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                esalaryKeyPressed(evt);
            }
        });
        vecreg1.add(esalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 290, 30));

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel40.setText("                 Salary:");
        vecreg1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, 30));

        edateofjoin.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        edateofjoin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edateofjoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edateofjoinActionPerformed(evt);
            }
        });
        edateofjoin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edateofjoinKeyPressed(evt);
            }
        });
        vecreg1.add(edateofjoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 290, 30));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel41.setText("           Address:");
        vecreg1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 120, 30));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel42.setText("        Designation:");
        vecreg1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 140, 30));

        esave.setBackground(new java.awt.Color(0, 204, 204));
        esave.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        esave.setText("Save");
        esave.setBorder(null);
        esave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esaveActionPerformed(evt);
            }
        });
        vecreg1.add(esave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 100, 40));

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel43.setText("           Email :");
        vecreg1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 150, 30));

        eemail.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        eemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eemailActionPerformed(evt);
            }
        });
        eemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eemailKeyPressed(evt);
            }
        });
        vecreg1.add(eemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 240, 30));

        save3.setBackground(new java.awt.Color(0, 204, 204));
        save3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        save3.setText("Clear");
        save3.setBorder(null);
        save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3ActionPerformed(evt);
            }
        });
        vecreg1.add(save3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 100, 40));

        emplyid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        emplyid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emplyid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emplyidActionPerformed(evt);
            }
        });
        vecreg1.add(emplyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 120, 30));

        designation.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        designation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationActionPerformed(evt);
            }
        });
        designation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                designationKeyPressed(evt);
            }
        });
        vecreg1.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 290, 30));

        ename.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        ename.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enameActionPerformed(evt);
            }
        });
        ename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enameKeyPressed(evt);
            }
        });
        vecreg1.add(ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 290, 30));

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel55.setText("  Employee Name:");
        vecreg1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 170, 30));

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel69.setText("Aadhar Number :");
        vecreg1.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 140, 30));

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel70.setText("PAN number :");
        vecreg1.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 120, 30));

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel71.setText("City :");
        vecreg1.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 60, 30));

        eaddharno.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        eaddharno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eaddharno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eaddharnoActionPerformed(evt);
            }
        });
        eaddharno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eaddharnoKeyPressed(evt);
            }
        });
        vecreg1.add(eaddharno, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 240, 30));

        epannum.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        epannum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        epannum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epannumActionPerformed(evt);
            }
        });
        vecreg1.add(epannum, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 240, 30));

        ecity.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        ecity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ecity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecityActionPerformed(evt);
            }
        });
        ecity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ecityKeyPressed(evt);
            }
        });
        vecreg1.add(ecity, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 240, 30));

        cusname8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cusname8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cusname8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusname8ActionPerformed(evt);
            }
        });
        vecreg1.add(cusname8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 240, 30));

        em.setBackground(new java.awt.Color(255, 255, 255));
        em.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        em.setText("Male");
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        vecreg1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 70, -1));

        ef.setBackground(new java.awt.Color(255, 255, 255));
        ef.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ef.setText("Female");
        ef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efActionPerformed(evt);
            }
        });
        vecreg1.add(ef, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel72.setText("Date of Birth :");
        vecreg1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 120, 30));

        edob.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        edob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edobActionPerformed(evt);
            }
        });
        edob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edobKeyPressed(evt);
            }
        });
        vecreg1.add(edob, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 240, 30));

        gi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gi.setText("Generate Id");
        gi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giActionPerformed(evt);
            }
        });
        gi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                giKeyPressed(evt);
            }
        });
        vecreg1.add(gi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 130, 30));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Add Employee");
        jLabel44.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout registrationemployeeLayout = new javax.swing.GroupLayout(registrationemployee);
        registrationemployee.setLayout(registrationemployeeLayout);
        registrationemployeeLayout.setHorizontalGroup(
            registrationemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
            .addComponent(vecreg1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        registrationemployeeLayout.setVerticalGroup(
            registrationemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationemployeeLayout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vecreg1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.add(registrationemployee, "card2");

        viewemployee.setBackground(new java.awt.Color(255, 255, 255));
        viewemployee.setPreferredSize(new java.awt.Dimension(1090, 640));

        viewemply.setBackground(new java.awt.Color(255, 255, 255));
        viewemply.setPreferredSize(new java.awt.Dimension(1090, 640));
        viewemply.setLayout(null);

        jLabel111.setBackground(new java.awt.Color(255, 255, 255));
        jLabel111.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel111.setText("                                                        View Employee ");
        jLabel111.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel111.setMaximumSize(new java.awt.Dimension(661, 43));
        jLabel111.setMinimumSize(new java.awt.Dimension(661, 43));
        jLabel111.setPreferredSize(new java.awt.Dimension(661, 43));
        viewemply.add(jLabel111);
        jLabel111.setBounds(0, 0, 1098, 43);

        esby.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        esby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By", "Employee Id", "Employee Name", "Father Name", "Aadhar No.", "Designation", "Mobile No.", "City" }));
        esby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esbyActionPerformed(evt);
            }
        });
        viewemply.add(esby);
        esby.setBounds(240, 240, 201, 37);

        veci.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        veci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        veci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veciActionPerformed(evt);
            }
        });
        viewemply.add(veci);
        veci.setBounds(270, 310, 200, 30);

        searchicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/searchbs.png"))); // NOI18N
        searchicon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchicon1MouseClicked(evt);
            }
        });
        viewemply.add(searchicon1);
        searchicon1.setBounds(670, 240, 30, 41);

        vetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "emplyid", "ename", "efathername", "emobnumber", "eaddress", "ecity", "eemail", "eaddharno", "epannum", "egender", "edob", "edateofjoin", "esalary", "designation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vetable.setSelectionBackground(new java.awt.Color(0, 255, 255));
        vetable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        vetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vetableMouseClicked(evt);
            }
        });
        vetable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vetableKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(vetable);

        viewemply.add(jScrollPane3);
        jScrollPane3.setBounds(0, 50, 1090, 180);

        jLabel112.setBackground(new java.awt.Color(255, 255, 255));
        jLabel112.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel112.setText("Employee Id");
        viewemply.add(jLabel112);
        jLabel112.setBounds(270, 280, 136, 22);

        esbyt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        esbyt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        esbyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esbytMouseClicked(evt);
            }
        });
        esbyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esbytActionPerformed(evt);
            }
        });
        viewemply.add(esbyt);
        esbyt.setBounds(450, 240, 209, 37);

        jLabel113.setBackground(new java.awt.Color(255, 255, 255));
        jLabel113.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel113.setText("Employee Name");
        viewemply.add(jLabel113);
        jLabel113.setBounds(10, 280, 136, 22);

        vefa.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vefa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vefaActionPerformed(evt);
            }
        });
        viewemply.add(vefa);
        vefa.setBounds(520, 310, 200, 30);

        jLabel114.setBackground(new java.awt.Color(255, 255, 255));
        jLabel114.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel114.setText("PAN Number");
        viewemply.add(jLabel114);
        jLabel114.setBounds(520, 350, 108, 22);

        veda.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        veda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        veda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vedaActionPerformed(evt);
            }
        });
        viewemply.add(veda);
        veda.setBounds(270, 380, 199, 29);

        jLabel115.setBackground(new java.awt.Color(255, 255, 255));
        jLabel115.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel115.setText("Aadhar Number");
        viewemply.add(jLabel115);
        jLabel115.setBounds(270, 420, 136, 22);

        veaa.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        veaa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        veaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veaaActionPerformed(evt);
            }
        });
        viewemply.add(veaa);
        veaa.setBounds(270, 450, 199, 30);

        jLabel116.setBackground(new java.awt.Color(255, 255, 255));
        jLabel116.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel116.setText("Date of Birth");
        viewemply.add(jLabel116);
        jLabel116.setBounds(270, 350, 113, 22);

        vepa.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vepa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vepaActionPerformed(evt);
            }
        });
        viewemply.add(vepa);
        vepa.setBounds(520, 380, 199, 30);

        jLabel117.setBackground(new java.awt.Color(255, 255, 255));
        jLabel117.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel117.setText("Gender");
        viewemply.add(jLabel117);
        jLabel117.setBounds(352, 492, 136, 22);

        vejo.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vejo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vejoActionPerformed(evt);
            }
        });
        viewemply.add(vejo);
        vejo.setBounds(520, 450, 199, 30);

        jLabel118.setBackground(new java.awt.Color(255, 255, 255));
        jLabel118.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel118.setText("Date of Joining");
        viewemply.add(jLabel118);
        jLabel118.setBounds(520, 420, 136, 22);

        vege.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vege.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegeActionPerformed(evt);
            }
        });
        viewemply.add(vege);
        vege.setBounds(352, 520, 199, 30);

        jLabel119.setBackground(new java.awt.Color(255, 255, 255));
        jLabel119.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel119.setText("Salary");
        viewemply.add(jLabel119);
        jLabel119.setBounds(10, 350, 136, 22);

        vesa.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vesa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vesaActionPerformed(evt);
            }
        });
        viewemply.add(vesa);
        vesa.setBounds(10, 380, 199, 30);

        jLabel120.setBackground(new java.awt.Color(255, 255, 255));
        jLabel120.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel120.setText("Email ID");
        viewemply.add(jLabel120);
        jLabel120.setBounds(770, 420, 136, 22);

        jLabel121.setBackground(new java.awt.Color(255, 255, 255));
        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel121.setText("City ");
        viewemply.add(jLabel121);
        jLabel121.setBounds(10, 420, 136, 22);

        vect.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vectActionPerformed(evt);
            }
        });
        viewemply.add(vect);
        vect.setBounds(10, 450, 199, 30);

        jLabel122.setBackground(new java.awt.Color(255, 255, 255));
        jLabel122.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel122.setText("Address");
        viewemply.add(jLabel122);
        jLabel122.setBounds(10, 491, 136, 22);

        vead.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vead.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veadActionPerformed(evt);
            }
        });
        viewemply.add(vead);
        vead.setBounds(10, 520, 324, 30);

        vcupdate1.setBackground(new java.awt.Color(0, 204, 204));
        vcupdate1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcupdate1.setText("Update");
        vcupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcupdate1ActionPerformed(evt);
            }
        });
        viewemply.add(vcupdate1);
        vcupdate1.setBounds(600, 510, 121, 46);

        veem.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        veem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        veem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veemActionPerformed(evt);
            }
        });
        viewemply.add(veem);
        veem.setBounds(770, 450, 199, 30);

        vcreset1.setBackground(new java.awt.Color(0, 204, 204));
        vcreset1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcreset1.setText("Reset");
        vcreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcreset1ActionPerformed(evt);
            }
        });
        viewemply.add(vcreset1);
        vcreset1.setBounds(880, 510, 121, 46);

        vcdelete1.setBackground(new java.awt.Color(0, 204, 204));
        vcdelete1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcdelete1.setText("Delete");
        vcdelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
     
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vecuActionPerformed(evt);
            }
        });
        viewemply.add(vecu);
        vecu.setBounds(10, 310, 200, 30);

        jLabel124.setBackground(new java.awt.Color(255, 255, 255));
        jLabel124.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel124.setText("Designation");
        viewemply.add(jLabel124);
        jLabel124.setBounds(770, 280, 108, 22);

        vede.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vede.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vedeActionPerformed(evt);
            }
        });
        viewemply.add(vede);
        vede.setBounds(770, 310, 199, 30);

        jLabel125.setBackground(new java.awt.Color(255, 255, 255));
        jLabel125.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel125.setText("Mobile No.");
        viewemply.add(jLabel125);
        jLabel125.setBounds(770, 350, 108, 22);

        vemo.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vemo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vemoActionPerformed(evt);
            }
        });
        viewemply.add(vemo);
        vemo.setBounds(770, 380, 199, 30);

        javax.swing.GroupLayout viewemployeeLayout = new javax.swing.GroupLayout(viewemployee);
        viewemployee.setLayout(viewemployeeLayout);
        viewemployeeLayout.setHorizontalGroup(
            viewemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(viewemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewemployeeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(viewemply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        viewemployeeLayout.setVerticalGroup(
            viewemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(viewemployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewemployeeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(viewemply, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel9.add(viewemployee, "card3");

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1090, 580));

        javax.swing.GroupLayout employee3Layout = new javax.swing.GroupLayout(employee3);
        employee3.setLayout(employee3Layout);
        employee3Layout.setHorizontalGroup(
            employee3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(employee3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        employee3Layout.setVerticalGroup(
            employee3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
            .addGroup(employee3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(employee3Layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Home_main.add(employee3, "card2");

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewaddHeader2.setBackground(new java.awt.Color(0, 204, 204));
        ViewaddHeader2.setToolTipText("");
        ViewaddHeader2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewaddHeader2MouseClicked(evt);
            }
        });
        ViewaddHeader2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Addc2.setBackground(new java.awt.Color(0, 204, 204));
        Addc2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Addc2.setForeground(new java.awt.Color(255, 255, 255));
        Addc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Addc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/addc.png"))); // NOI18N
        Addc2.setText("Add Dealer");
        Addc2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Addc2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Addc2.setIconTextGap(15);
        Addc2.setOpaque(true);
        Addc2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Addc2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Addc2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Addc2MouseExited(evt);
            }
        });
        ViewaddHeader2.add(Addc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 40));

        Searchc2.setBackground(new java.awt.Color(0, 204, 204));
        Searchc2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Searchc2.setForeground(new java.awt.Color(255, 255, 255));
        Searchc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Searchc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/eye.png"))); // NOI18N
        Searchc2.setText("View Dealer");
        Searchc2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Searchc2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Searchc2.setIconTextGap(10);
        Searchc2.setOpaque(true);
        Searchc2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Searchc2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Searchc2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Searchc2MouseExited(evt);
            }
        });
        ViewaddHeader2.add(Searchc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 220, 40));

        jPanel5.add(ViewaddHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 60));

        dealermain1.setBackground(new java.awt.Color(153, 153, 153));
        dealermain1.setLayout(new java.awt.CardLayout());

        registration1.setBackground(new java.awt.Color(255, 255, 255));

        centry1.setBackground(new java.awt.Color(255, 255, 255));
        centry1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        damo.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        damo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        damo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                damoActionPerformed(evt);
            }
        });
        damo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                damoKeyPressed(evt);
            }
        });
        centry1.add(damo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 270, 30));

        daad.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        daad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        daad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daadActionPerformed(evt);
            }
        });
        daad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                daadKeyPressed(evt);
            }
        });
        centry1.add(daad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 270, 30));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel33.setText("Mobile Number :");
        centry1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 30));

        daci.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        daci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        daci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daciActionPerformed(evt);
            }
        });
        daci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                daciKeyPressed(evt);
            }
        });
        centry1.add(daci, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 270, 30));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel35.setText("Ladline Number:");
        centry1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 30));

        daem.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        daem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        daem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daemActionPerformed(evt);
            }
        });
        daem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                daemKeyPressed(evt);
            }
        });
        centry1.add(daem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 270, 30));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel36.setText("            Email :");
        centry1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, 30));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel37.setText("      Address:");
        centry1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 130, 30));

        save1.setBackground(new java.awt.Color(0, 204, 204));
        save1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        save1.setText("Save");
        save1.setBorder(null);
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        centry1.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 100, 40));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel45.setText("Dealer ID :");
        centry1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, 30));

        dade.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        dade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadeActionPerformed(evt);
            }
        });
        dade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadeKeyPressed(evt);
            }
        });
        centry1.add(dade, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 270, 30));

        reset2.setBackground(new java.awt.Color(0, 204, 204));
        reset2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reset2.setText("Reset");
        reset2.setBorder(null);
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset2ActionPerformed(evt);
            }
        });
        centry1.add(reset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 100, 40));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel46.setText("Dealer Name:");
        centry1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, 30));

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel59.setText("Company Name :");
        centry1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 30));

        dala.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        dala.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dalaActionPerformed(evt);
            }
        });
        dala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dalaKeyPressed(evt);
            }
        });
        centry1.add(dala, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 270, 30));

        daco.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        daco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        daco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dacoActionPerformed(evt);
            }
        });
        daco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dacoKeyPressed(evt);
            }
        });
        centry1.add(daco, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 270, 30));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel47.setText("City :");
        centry1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 60, 30));

        dadi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadiActionPerformed(evt);
            }
        });
        dadi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadiKeyPressed(evt);
            }
        });
        centry1.add(dadi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 80, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Generate Id");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        centry1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 120, 30));

        dmobc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dmobc.setSelected(true);
        dmobc.setText("Same as Mobile No.");
        dmobc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmobcActionPerformed(evt);
            }
        });
        centry1.add(dmobc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 150, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Add Dealer ");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout registration1Layout = new javax.swing.GroupLayout(registration1);
        registration1.setLayout(registration1Layout);
        registration1Layout.setHorizontalGroup(
            registration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(centry1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        registration1Layout.setVerticalGroup(
            registration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registration1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centry1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dealermain1.add(registration1, "card2");

        Searchdealer1.setBackground(new java.awt.Color(255, 255, 255));
        Searchdealer1.setPreferredSize(new java.awt.Dimension(1090, 640));
        Searchdealer1.setLayout(null);

        jLabel138.setBackground(new java.awt.Color(255, 255, 255));
        jLabel138.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel138.setText("                                                        View Dealer ");
        jLabel138.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel138.setMaximumSize(new java.awt.Dimension(661, 43));
        jLabel138.setMinimumSize(new java.awt.Dimension(661, 43));
        jLabel138.setPreferredSize(new java.awt.Dimension(661, 43));
        Searchdealer1.add(jLabel138);
        jLabel138.setBounds(0, 0, 1098, 43);

        dsby.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dsby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By", "Dealer Id", "Dealer Name", "Company Name", "City" }));
        dsby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsbyActionPerformed(evt);
            }
        });
        Searchdealer1.add(dsby);
        dsby.setBounds(280, 290, 201, 37);

        ddi.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        ddi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ddi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddiActionPerformed(evt);
            }
        });
        Searchdealer1.add(ddi);
        ddi.setBounds(330, 370, 200, 30);

        searchicon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/searchbs.png"))); // NOI18N
        searchicon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchicon4MouseClicked(evt);
            }
        });
        Searchdealer1.add(searchicon4);
        searchicon4.setBounds(710, 290, 30, 41);

        dtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "dname", "compnynam", "smobnum", "demail", "daddress", "delid", "dcity", "ladnum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dtable.setGridColor(new java.awt.Color(0, 0, 0));
        dtable.setSelectionBackground(new java.awt.Color(0, 255, 255));
        dtable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        dtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtableMouseClicked(evt);
            }
        });
        dtable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dtableKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(dtable);

        Searchdealer1.add(jScrollPane8);
        jScrollPane8.setBounds(0, 50, 1090, 230);

        jLabel139.setBackground(new java.awt.Color(255, 255, 255));
        jLabel139.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel139.setText("Dealer Id");
        Searchdealer1.add(jLabel139);
        jLabel139.setBounds(330, 340, 136, 22);

        dsbyt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dsbyt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dsbyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dsbytMouseClicked(evt);
            }
        });
        dsbyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsbytActionPerformed(evt);
            }
        });
        Searchdealer1.add(dsbyt);
        dsbyt.setBounds(490, 290, 209, 37);

        jLabel140.setBackground(new java.awt.Color(255, 255, 255));
        jLabel140.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel140.setText("Dealer Name");
        Searchdealer1.add(jLabel140);
        jLabel140.setBounds(70, 340, 136, 22);

        jLabel141.setBackground(new java.awt.Color(255, 255, 255));
        jLabel141.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel141.setText("Mobile No.");
        Searchdealer1.add(jLabel141);
        jLabel141.setBounds(580, 340, 108, 22);

        dla.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        dla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlaActionPerformed(evt);
            }
        });
        Searchdealer1.add(dla);
        dla.setBounds(580, 440, 199, 29);

        jLabel152.setBackground(new java.awt.Color(255, 255, 255));
        jLabel152.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel152.setText("Ladline Number");
        Searchdealer1.add(jLabel152);
        jLabel152.setBounds(580, 410, 130, 22);

        dmn.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        dmn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dmnActionPerformed(evt);
            }
        });
        Searchdealer1.add(dmn);
        dmn.setBounds(580, 370, 199, 30);

        jLabel155.setBackground(new java.awt.Color(255, 255, 255));
        jLabel155.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel155.setText("Company Name");
        Searchdealer1.add(jLabel155);
        jLabel155.setBounds(330, 410, 136, 22);

        dco.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        dco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcoActionPerformed(evt);
            }
        });
        Searchdealer1.add(dco);
        dco.setBounds(330, 440, 199, 30);

        jLabel156.setBackground(new java.awt.Color(255, 255, 255));
        jLabel156.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel156.setText("Email ID");
        Searchdealer1.add(jLabel156);
        jLabel156.setBounds(830, 410, 136, 22);

        jLabel157.setBackground(new java.awt.Color(255, 255, 255));
        jLabel157.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel157.setText("City ");
        Searchdealer1.add(jLabel157);
        jLabel157.setBounds(70, 410, 136, 22);

        dci.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        dci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dciActionPerformed(evt);
            }
        });
        Searchdealer1.add(dci);
        dci.setBounds(70, 440, 199, 30);

        jLabel158.setBackground(new java.awt.Color(255, 255, 255));
        jLabel158.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel158.setText("Address");
        Searchdealer1.add(jLabel158);
        jLabel158.setBounds(830, 340, 136, 22);

        dad.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        dad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadActionPerformed(evt);
            }
        });
        Searchdealer1.add(dad);
        dad.setBounds(830, 370, 200, 30);

        vcupdate6.setBackground(new java.awt.Color(0, 204, 204));
        vcupdate6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcupdate6.setText("Update");
        vcupdate6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcupdate6ActionPerformed(evt);
            }
        });
        Searchdealer1.add(vcupdate6);
        vcupdate6.setBounds(310, 500, 121, 46);

        dem.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        dem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demActionPerformed(evt);
            }
        });
        Searchdealer1.add(dem);
        dem.setBounds(830, 440, 199, 30);

        vcreset3.setBackground(new java.awt.Color(0, 204, 204));
        vcreset3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcreset3.setText("Reset");
        vcreset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcreset3ActionPerformed(evt);
            }
        });
        Searchdealer1.add(vcreset3);
        vcreset3.setBounds(600, 500, 121, 46);

        vcdelete3.setBackground(new java.awt.Color(0, 204, 204));
        vcdelete3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcdelete3.setText("Delete");
        vcdelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcdelete3ActionPerformed(evt);
            }
        });
        Searchdealer1.add(vcdelete3);
        vcdelete3.setBounds(460, 500, 121, 46);

        dde.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        dde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddeActionPerformed(evt);
            }
        });
        Searchdealer1.add(dde);
        dde.setBounds(70, 370, 200, 30);

        dealermain1.add(Searchdealer1, "card4");

        jPanel5.add(dealermain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1090, 580));

        javax.swing.GroupLayout Dealer8Layout = new javax.swing.GroupLayout(Dealer8);
        Dealer8.setLayout(Dealer8Layout);
        Dealer8Layout.setHorizontalGroup(
            Dealer8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(Dealer8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Dealer8Layout.setVerticalGroup(
            Dealer8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
            .addGroup(Dealer8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Dealer8Layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Home_main.add(Dealer8, "card9");

        Report4.setBackground(new java.awt.Color(255, 255, 255));

        billing1.setBackground(new java.awt.Color(255, 255, 255));
        billing1.setPreferredSize(new java.awt.Dimension(1090, 640));
        billing1.setLayout(null);

        jLabel175.setBackground(new java.awt.Color(255, 255, 255));
        jLabel175.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel175.setText("                                                        Reports");
        jLabel175.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel175.setMaximumSize(new java.awt.Dimension(661, 43));
        jLabel175.setMinimumSize(new java.awt.Dimension(661, 43));
        jLabel175.setPreferredSize(new java.awt.Dimension(661, 43));
        billing1.add(jLabel175);
        jLabel175.setBounds(0, 0, 1098, 43);

        rep.setColumns(20);
        rep.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rep.setRows(5);
        jScrollPane5.setViewportView(rep);

        billing1.add(jScrollPane5);
        jScrollPane5.setBounds(410, 50, 550, 560);

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton13.setText("Print");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        billing1.add(jButton13);
        jButton13.setBounds(970, 560, 100, 40);

        jLabel89.setBackground(new java.awt.Color(255, 255, 255));
        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel89.setText("Vehicle Number :");
        billing1.add(jLabel89);
        jLabel89.setBounds(40, 440, 150, 25);

        qsr.setBackground(new java.awt.Color(255, 255, 255));
        qsr.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qsr.setText("Quatation Slip");
        qsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qsrActionPerformed(evt);
            }
        });
        billing1.add(qsr);
        qsr.setBounds(20, 60, 160, 33);

        cnt.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        cnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cntKeyPressed(evt);
            }
        });
        billing1.add(cnt);
        cnt.setBounds(200, 130, 170, 30);

        jLabel91.setBackground(new java.awt.Color(255, 255, 255));
        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel91.setText("Customer Name :");
        billing1.add(jLabel91);
        jLabel91.setBounds(40, 130, 150, 25);

        jLabel92.setBackground(new java.awt.Color(255, 255, 255));
        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel92.setText("Father Name :");
        billing1.add(jLabel92);
        jLabel92.setBounds(40, 200, 140, 25);

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel93.setText("Purchase Date :");
        billing1.add(jLabel93);
        jLabel93.setBounds(40, 280, 150, 25);

        fnt.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        fnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fntKeyPressed(evt);
            }
        });
        billing1.add(fnt);
        fnt.setBounds(200, 200, 170, 30);

        pdt.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        pdt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pdtKeyPressed(evt);
            }
        });
        billing1.add(pdt);
        pdt.setBounds(200, 280, 140, 30);

        vnt.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        billing1.add(vnt);
        vnt.setBounds(200, 440, 140, 30);

        reset1.setBackground(new java.awt.Color(0, 204, 204));
        reset1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        reset1.setText("Generate Slip");
        reset1.setBorder(null);
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        billing1.add(reset1);
        reset1.setBounds(110, 520, 130, 40);

        jLabel94.setBackground(new java.awt.Color(255, 255, 255));
        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel94.setText("Mobile Number :");
        billing1.add(jLabel94);
        jLabel94.setBounds(40, 360, 150, 25);

        mnt.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        mnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mntKeyPressed(evt);
            }
        });
        billing1.add(mnt);
        mnt.setBounds(200, 360, 140, 30);

        javax.swing.GroupLayout Report4Layout = new javax.swing.GroupLayout(Report4);
        Report4.setLayout(Report4Layout);
        Report4Layout.setHorizontalGroup(
            Report4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(Report4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Report4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(billing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Report4Layout.setVerticalGroup(
            Report4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(Report4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Report4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(billing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Home_main.add(Report4, "card8");

        vehicle5.setEnabled(false);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(0, 204, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setBackground(new java.awt.Color(0, 204, 204));
        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/eye.png"))); // NOI18N
        jLabel56.setText("View Vehicle");
        jLabel56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel56.setOpaque(true);
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel56MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel56MouseExited(evt);
            }
        });
        jPanel13.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 190, 40));

        jLabel57.setBackground(new java.awt.Color(0, 204, 204));
        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/addcarwhite.png"))); // NOI18N
        jLabel57.setText("Add Vehicle");
        jLabel57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jLabel57.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel57.setOpaque(true);
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel57MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel57MouseExited(evt);
            }
        });
        jPanel13.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 40));

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 60));

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));
        jPanel14.setLayout(new java.awt.CardLayout());

        additionvehicle.setBackground(new java.awt.Color(255, 255, 255));

        addingvehicle.setBackground(new java.awt.Color(255, 255, 255));
        addingvehicle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel77.setText("Company :");
        addingvehicle.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 90, 30));

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel78.setText("Fuel Type :");
        addingvehicle.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 100, 30));

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel79.setText("Model :");
        addingvehicle.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 70, 30));

        save5.setBackground(new java.awt.Color(0, 204, 204));
        save5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        save5.setText("Reset");
        save5.setBorder(null);
        save5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save5ActionPerformed(evt);
            }
        });
        addingvehicle.add(save5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 100, 40));

        deli.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        deli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliActionPerformed(evt);
            }
        });
        addingvehicle.add(deli, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 200, 30));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel58.setText("Dealer Id :");
        addingvehicle.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 90, 30));

        fltp.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fltp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Diesel", "Petrol", "Gas" }));
        fltp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fltpActionPerformed(evt);
            }
        });
        addingvehicle.add(fltp, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 200, 30));

        cpy.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cpy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Maruti Suzuki", "Honda", "Tata Moters", "Huyandai", "Mahindra" }));
        cpy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpyActionPerformed(evt);
            }
        });
        addingvehicle.add(cpy, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 200, 30));

        mod.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });
        addingvehicle.add(mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 200, 30));

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel60.setText("Milage :");
        addingvehicle.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 70, 30));

        mil.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        mil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milActionPerformed(evt);
            }
        });
        mil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                milKeyPressed(evt);
            }
        });
        addingvehicle.add(mil, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 200, 30));

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel73.setText("Top Speed :");
        addingvehicle.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 90, 30));

        tps.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        tps.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpsActionPerformed(evt);
            }
        });
        tps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpsKeyPressed(evt);
            }
        });
        addingvehicle.add(tps, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 200, 30));

        jLabel88.setBackground(new java.awt.Color(255, 255, 255));
        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel88.setText("Chassis No. :");
        addingvehicle.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 30));

        chno.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        chno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chnoActionPerformed(evt);
            }
        });
        chno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chnoKeyPressed(evt);
            }
        });
        addingvehicle.add(chno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 200, 30));

        jLabel90.setBackground(new java.awt.Color(255, 255, 255));
        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel90.setText("Engine no. :");
        addingvehicle.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 30));

        egno.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        egno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        egno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egnoActionPerformed(evt);
            }
        });
        egno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                egnoKeyPressed(evt);
            }
        });
        addingvehicle.add(egno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 200, 30));

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel74.setText("Colour :");
        addingvehicle.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 80, 30));

        col.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        col.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        col.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colActionPerformed(evt);
            }
        });
        col.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                colKeyPressed(evt);
            }
        });
        addingvehicle.add(col, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 200, 30));

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chassis No.", "Engine No.", "Cost ", "Colour", "Milage", "Top Speed", "Company", "Model", "Fueltype", "Dealer Id", "Status"
            }
        ));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab);

        addingvehicle.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 210));

        save11.setBackground(new java.awt.Color(0, 204, 204));
        save11.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        save11.setText("Delete Row");
        save11.setBorder(null);
        save11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save11ActionPerformed(evt);
            }
        });
        addingvehicle.add(save11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 110, 40));

        save12.setBackground(new java.awt.Color(0, 204, 204));
        save12.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        save12.setText("Save");
        save12.setBorder(null);
        save12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save12ActionPerformed(evt);
            }
        });
        addingvehicle.add(save12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 100, 40));

        save13.setBackground(new java.awt.Color(0, 204, 204));
        save13.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        save13.setText("Add");
        save13.setBorder(null);
        save13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save13ActionPerformed(evt);
            }
        });
        addingvehicle.add(save13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 100, 40));

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel61.setText("Cost :");
        addingvehicle.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 70, 30));

        cst.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        cst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstActionPerformed(evt);
            }
        });
        cst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cstKeyPressed(evt);
            }
        });
        addingvehicle.add(cst, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 200, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Add Vehicle");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout additionvehicleLayout = new javax.swing.GroupLayout(additionvehicle);
        additionvehicle.setLayout(additionvehicleLayout);
        additionvehicleLayout.setHorizontalGroup(
            additionvehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addingvehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        additionvehicleLayout.setVerticalGroup(
            additionvehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(additionvehicleLayout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addingvehicle, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.add(additionvehicle, "card2");

        viewvehicle.setBackground(new java.awt.Color(255, 255, 255));
        viewvehicle.setPreferredSize(new java.awt.Dimension(1090, 640));
        viewvehicle.setLayout(null);

        vtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "chsno", "engno", "color", "cost", "dateofentry", "modnam", "cmpnynam", "milage", "topsp", "fueltyp", "delid", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vtable.setSelectionBackground(new java.awt.Color(0, 255, 255));
        vtable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        vtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vtableMouseClicked(evt);
            }
        });
        vtable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vtableKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(vtable);

        viewvehicle.add(jScrollPane6);
        jScrollPane6.setBounds(0, 40, 1090, 210);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("View Vehicles");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        viewvehicle.add(jLabel11);
        jLabel11.setBounds(0, 0, 1100, 40);

        vhsby.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vhsby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By", "Chassis No.", "Engine No.", "Company", "Model", "Color", "Date of Entry", "Fuel Type", "Dealer id" }));
        vhsby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhsbyActionPerformed(evt);
            }
        });
        viewvehicle.add(vhsby);
        vhsby.setBounds(260, 260, 201, 37);

        vhsbyt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vhsbyt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhsbyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vhsbytMouseClicked(evt);
            }
        });
        vhsbyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhsbytActionPerformed(evt);
            }
        });
        viewvehicle.add(vhsbyt);
        vhsbyt.setBounds(490, 260, 209, 37);

        searchicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/searchbs.png"))); // NOI18N
        searchicon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchicon2MouseClicked(evt);
            }
        });
        viewvehicle.add(searchicon2);
        searchicon2.setBounds(720, 260, 30, 41);

        jLabel126.setBackground(new java.awt.Color(255, 255, 255));
        jLabel126.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel126.setText("Chassis Number");
        viewvehicle.add(jLabel126);
        jLabel126.setBounds(20, 320, 136, 22);

        vhch.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhchActionPerformed(evt);
            }
        });
        viewvehicle.add(vhch);
        vhch.setBounds(20, 350, 200, 30);

        jLabel127.setBackground(new java.awt.Color(255, 255, 255));
        jLabel127.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel127.setText("Engine Number");
        viewvehicle.add(jLabel127);
        jLabel127.setBounds(280, 320, 136, 22);

        vhen.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhenActionPerformed(evt);
            }
        });
        viewvehicle.add(vhen);
        vhen.setBounds(280, 350, 200, 30);

        jLabel128.setBackground(new java.awt.Color(255, 255, 255));
        jLabel128.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel128.setText("Company");
        viewvehicle.add(jLabel128);
        jLabel128.setBounds(530, 320, 136, 22);

        vhco.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhcoActionPerformed(evt);
            }
        });
        viewvehicle.add(vhco);
        vhco.setBounds(530, 350, 200, 30);

        jLabel129.setBackground(new java.awt.Color(255, 255, 255));
        jLabel129.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel129.setText("Status");
        viewvehicle.add(jLabel129);
        jLabel129.setBounds(940, 260, 108, 30);

        vhst.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhstActionPerformed(evt);
            }
        });
        viewvehicle.add(vhst);
        vhst.setBounds(940, 290, 120, 30);

        jLabel130.setBackground(new java.awt.Color(255, 255, 255));
        jLabel130.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel130.setText("Dealer Id");
        viewvehicle.add(jLabel130);
        jLabel130.setBounds(780, 390, 108, 22);

        vhde.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhdeActionPerformed(evt);
            }
        });
        viewvehicle.add(vhde);
        vhde.setBounds(780, 420, 199, 30);

        jLabel131.setBackground(new java.awt.Color(255, 255, 255));
        jLabel131.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel131.setText("Top speed");
        viewvehicle.add(jLabel131);
        jLabel131.setBounds(530, 390, 108, 22);

        vhto.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        vhto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhtoActionPerformed(evt);
            }
        });
        viewvehicle.add(vhto);
        vhto.setBounds(530, 420, 199, 30);

        jLabel132.setBackground(new java.awt.Color(255, 255, 255));
        jLabel132.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel132.setText("Milage");
        viewvehicle.add(jLabel132);
        jLabel132.setBounds(280, 390, 113, 22);

        vhmi.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhmi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhmiActionPerformed(evt);
            }
        });
        viewvehicle.add(vhmi);
        vhmi.setBounds(280, 420, 199, 29);

        jLabel133.setBackground(new java.awt.Color(255, 255, 255));
        jLabel133.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel133.setText("Fuel Type");
        viewvehicle.add(jLabel133);
        jLabel133.setBounds(20, 390, 136, 22);

        vhfu.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhfu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhfu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhfuActionPerformed(evt);
            }
        });
        viewvehicle.add(vhfu);
        vhfu.setBounds(20, 420, 199, 30);

        jLabel134.setBackground(new java.awt.Color(255, 255, 255));
        jLabel134.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel134.setText("Date of Entry");
        viewvehicle.add(jLabel134);
        jLabel134.setBounds(20, 460, 136, 22);

        vhda.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhdaActionPerformed(evt);
            }
        });
        viewvehicle.add(vhda);
        vhda.setBounds(20, 490, 199, 30);

        jLabel135.setBackground(new java.awt.Color(255, 255, 255));
        jLabel135.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel135.setText("Colour");
        viewvehicle.add(jLabel135);
        jLabel135.setBounds(280, 460, 136, 22);

        vhcl.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhcl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhclActionPerformed(evt);
            }
        });
        viewvehicle.add(vhcl);
        vhcl.setBounds(280, 490, 199, 30);

        jLabel136.setBackground(new java.awt.Color(255, 255, 255));
        jLabel136.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel136.setText("Cost Price");
        viewvehicle.add(jLabel136);
        jLabel136.setBounds(530, 460, 136, 22);

        vhct.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhctActionPerformed(evt);
            }
        });
        viewvehicle.add(vhct);
        vhct.setBounds(530, 490, 199, 30);

        vcupdate2.setBackground(new java.awt.Color(0, 204, 204));
        vcupdate2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcupdate2.setText("Delete");
        vcupdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcupdate2ActionPerformed(evt);
            }
        });
        viewvehicle.add(vcupdate2);
        vcupdate2.setBounds(860, 480, 100, 46);

        vcupdate3.setBackground(new java.awt.Color(0, 204, 204));
        vcupdate3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcupdate3.setText("Reset");
        vcupdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcupdate3ActionPerformed(evt);
            }
        });
        viewvehicle.add(vcupdate3);
        vcupdate3.setBounds(980, 480, 100, 46);

        vcupdate4.setBackground(new java.awt.Color(0, 204, 204));
        vcupdate4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcupdate4.setText("Update");
        vcupdate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcupdate4ActionPerformed(evt);
            }
        });
        viewvehicle.add(vcupdate4);
        vcupdate4.setBounds(740, 480, 100, 46);

        jLabel137.setBackground(new java.awt.Color(255, 255, 255));
        jLabel137.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel137.setText("Model Name");
        viewvehicle.add(jLabel137);
        jLabel137.setBounds(780, 320, 108, 20);

        vhmo.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vhmo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vhmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vhmoActionPerformed(evt);
            }
        });
        viewvehicle.add(vhmo);
        vhmo.setBounds(780, 350, 199, 30);

        jPanel14.add(viewvehicle, "card3");

        jPanel6.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1090, 580));

        javax.swing.GroupLayout vehicle5Layout = new javax.swing.GroupLayout(vehicle5);
        vehicle5.setLayout(vehicle5Layout);
        vehicle5Layout.setHorizontalGroup(
            vehicle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(vehicle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vehicle5Layout.setVerticalGroup(
            vehicle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
            .addGroup(vehicle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vehicle5Layout.createSequentialGroup()
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Home_main.add(vehicle5, "card2");

        Sale6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewaddHeader1.setBackground(new java.awt.Color(0, 204, 204));
        ViewaddHeader1.setToolTipText("");
        ViewaddHeader1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Addc1.setBackground(new java.awt.Color(0, 204, 204));
        Addc1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Addc1.setForeground(new java.awt.Color(255, 255, 255));
        Addc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Addc1.setText("Add Sale");
        Addc1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Addc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Addc1.setIconTextGap(15);
        Addc1.setOpaque(true);
        Addc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Addc1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Addc1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Addc1MouseExited(evt);
            }
        });
        ViewaddHeader1.add(Addc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 40));

        Searchc1.setBackground(new java.awt.Color(0, 204, 204));
        Searchc1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Searchc1.setForeground(new java.awt.Color(255, 255, 255));
        Searchc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Searchc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/eye.png"))); // NOI18N
        Searchc1.setText("View Sale");
        Searchc1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Searchc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Searchc1.setIconTextGap(10);
        Searchc1.setOpaque(true);
        Searchc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Searchc1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Searchc1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Searchc1MouseExited(evt);
            }
        });
        ViewaddHeader1.add(Searchc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 220, 40));

        jPanel4.add(ViewaddHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 60));

        SaleMain.setBackground(new java.awt.Color(153, 153, 153));
        SaleMain.setLayout(new java.awt.CardLayout());

        AddSale.setBackground(new java.awt.Color(255, 255, 255));

        sentry1.setBackground(new java.awt.Color(255, 255, 255));
        sentry1.setLayout(null);

        sid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(sid);
        sid.setBounds(150, 20, 130, 30);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Generate id");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        sentry1.add(jButton9);
        jButton9.setBounds(290, 20, 110, 30);

        jLabel142.setBackground(new java.awt.Color(255, 255, 255));
        jLabel142.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel142.setText("Sale Id :");
        sentry1.add(jLabel142);
        jLabel142.setBounds(40, 20, 70, 30);

        jLabel178.setBackground(new java.awt.Color(255, 255, 255));
        jLabel178.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel178.setText("Chassis No. :");
        sentry1.add(jLabel178);
        jLabel178.setBounds(10, 70, 100, 30);

        scid.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        scid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scidMouseClicked(evt);
            }
        });
        scid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                scidKeyPressed(evt);
            }
        });
        sentry1.add(scid);
        scid.setBounds(120, 120, 160, 30);

        jLabel179.setBackground(new java.awt.Color(255, 255, 255));
        jLabel179.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel179.setText("Customer Id :");
        sentry1.add(jLabel179);
        jLabel179.setBounds(10, 120, 100, 30);

        jLabel66.setBackground(new java.awt.Color(255, 255, 255));
        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel66.setText("Salesman Id :");
        sentry1.add(jLabel66);
        jLabel66.setBounds(10, 170, 130, 30);

        jLabel143.setBackground(new java.awt.Color(255, 255, 255));
        jLabel143.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel143.setText("Delivery Date :");
        sentry1.add(jLabel143);
        jLabel143.setBounds(10, 260, 120, 30);

        sdd.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        sdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(sdd);
        sdd.setBounds(150, 260, 180, 30);

        jLabel144.setBackground(new java.awt.Color(255, 255, 255));
        jLabel144.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel144.setText("Deliver Address :");
        sentry1.add(jLabel144);
        jLabel144.setBounds(10, 310, 140, 30);

        sda.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        sda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(sda);
        sda.setBounds(150, 310, 230, 30);

        adc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        adc.setText("Same as customer address");
        adc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcActionPerformed(evt);
            }
        });
        sentry1.add(adc);
        adc.setBounds(160, 350, 190, 23);

        jButton10.setBackground(new java.awt.Color(0, 204, 204));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("Save");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        sentry1.add(jButton10);
        jButton10.setBounds(270, 420, 100, 40);

        jLabel180.setBackground(new java.awt.Color(255, 255, 255));
        jLabel180.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel180.setText("Dealer  id :");
        sentry1.add(jLabel180);
        jLabel180.setBounds(390, 310, 90, 30);

        sdi.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        sdi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(sdi);
        sdi.setBounds(510, 310, 160, 30);

        jLabel181.setBackground(new java.awt.Color(255, 255, 255));
        jLabel181.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel181.setText("Engine Number :");
        sentry1.add(jLabel181);
        jLabel181.setBounds(750, 170, 140, 30);

        sen.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        sen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(sen);
        sen.setBounds(890, 170, 180, 30);

        ssn.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        ssn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(ssn);
        ssn.setBounds(520, 170, 180, 30);

        jLabel182.setBackground(new java.awt.Color(255, 255, 255));
        jLabel182.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel182.setText("Salesman Name :");
        sentry1.add(jLabel182);
        jLabel182.setBounds(370, 170, 140, 30);

        scn.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        scn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(scn);
        scn.setBounds(520, 120, 180, 30);

        jLabel183.setBackground(new java.awt.Color(255, 255, 255));
        jLabel183.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel183.setText("Customer Name :");
        sentry1.add(jLabel183);
        jLabel183.setBounds(370, 120, 140, 30);

        svc.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        svc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(svc);
        svc.setBounds(520, 70, 180, 30);

        jLabel145.setBackground(new java.awt.Color(255, 255, 255));
        jLabel145.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel145.setText("Vehicle Company :");
        sentry1.add(jLabel145);
        jLabel145.setBounds(370, 70, 150, 30);

        jLabel184.setBackground(new java.awt.Color(255, 255, 255));
        jLabel184.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel184.setText("Payment Mode :");
        sentry1.add(jLabel184);
        jLabel184.setBounds(460, 20, 130, 30);

        paym.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paym.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cash", "Cheque" }));
        sentry1.add(paym);
        paym.setBounds(610, 20, 140, 30);

        jLabel185.setBackground(new java.awt.Color(255, 255, 255));
        jLabel185.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel185.setText("Vehicle Model :");
        sentry1.add(jLabel185);
        jLabel185.setBounds(740, 70, 150, 30);

        svm.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        svm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(svm);
        svm.setBounds(890, 70, 180, 30);

        scaa.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        scaa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(scaa);
        scaa.setBounds(890, 120, 180, 30);

        spd.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        spd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(spd);
        spd.setBounds(500, 260, 180, 30);

        svct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        svct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(svct);
        svct.setBounds(850, 250, 210, 30);

        sdat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sdat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sdat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdatMouseClicked(evt);
            }
        });
        sdat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sdatKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sdatKeyReleased(evt);
            }
        });
        sentry1.add(sdat);
        sdat.setBounds(850, 300, 210, 30);

        srat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        srat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sentry1.add(srat);
        srat.setBounds(850, 350, 210, 30);

        jLabel186.setBackground(new java.awt.Color(255, 255, 255));
        jLabel186.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel186.setText("Remaining Amount :");
        sentry1.add(jLabel186);
        jLabel186.setBounds(680, 350, 170, 30);

        jLabel187.setBackground(new java.awt.Color(255, 255, 255));
        jLabel187.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel187.setText("Deposite Amount :");
        sentry1.add(jLabel187);
        jLabel187.setBounds(690, 300, 150, 30);

        jLabel188.setBackground(new java.awt.Color(255, 255, 255));
        jLabel188.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel188.setText("Vehicle Cost :");
        sentry1.add(jLabel188);
        jLabel188.setBounds(730, 250, 110, 30);

        jLabel189.setBackground(new java.awt.Color(255, 255, 255));
        jLabel189.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel189.setText("Purchase Date :");
        sentry1.add(jLabel189);
        jLabel189.setBounds(360, 260, 130, 30);

        jLabel190.setBackground(new java.awt.Color(255, 255, 255));
        jLabel190.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel190.setText("Customer Aadhar No. :");
        sentry1.add(jLabel190);
        jLabel190.setBounds(710, 120, 180, 30);

        ssid.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        ssid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ssid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssidMouseClicked(evt);
            }
        });
        sentry1.add(ssid);
        ssid.setBounds(120, 170, 160, 30);

        sch.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        sch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schMouseClicked(evt);
            }
        });
        sch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                schKeyPressed(evt);
            }
        });
        sentry1.add(sch);
        sch.setBounds(120, 70, 160, 30);

        scidc.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        scidc.setText("Check");
        scidc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scidcActionPerformed(evt);
            }
        });
        sentry1.add(scidc);
        scidc.setBounds(290, 120, 59, 23);

        ssidc.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ssidc.setText("Check");
        ssidc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssidcActionPerformed(evt);
            }
        });
        sentry1.add(ssidc);
        ssidc.setBounds(290, 170, 57, 23);

        schc.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        schc.setText("Check");
        schc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schcActionPerformed(evt);
            }
        });
        sentry1.add(schc);
        schc.setBounds(290, 70, 57, 23);

        conf.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        conf.setText("Above information Confirmed");
        conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confActionPerformed(evt);
            }
        });
        sentry1.add(conf);
        conf.setBounds(10, 220, 1090, 23);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sentry1.add(jButton2);
        jButton2.setBounds(690, 420, 110, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Add Sale");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout AddSaleLayout = new javax.swing.GroupLayout(AddSale);
        AddSale.setLayout(AddSaleLayout);
        AddSaleLayout.setHorizontalGroup(
            AddSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sentry1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AddSaleLayout.setVerticalGroup(
            AddSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSaleLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sentry1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SaleMain.add(AddSale, "card2");

        ViewSale.setBackground(new java.awt.Color(255, 255, 255));
        ViewSale.setPreferredSize(new java.awt.Dimension(1090, 640));
        ViewSale.setLayout(null);

        jLabel165.setBackground(new java.awt.Color(255, 255, 255));
        jLabel165.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel165.setText("                                                        View Sale");
        jLabel165.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel165.setMaximumSize(new java.awt.Dimension(661, 43));
        jLabel165.setMinimumSize(new java.awt.Dimension(661, 43));
        jLabel165.setPreferredSize(new java.awt.Dimension(661, 43));
        ViewSale.add(jLabel165);
        jLabel165.setBounds(0, 0, 1098, 43);

        stable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "sid", "vehid", "cstid", "empid", "vehicost", "purchdate", "depamnt", "remamnt", "delvdate", "paymode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stableMouseClicked(evt);
            }
        });
        stable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stableKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(stable);

        ViewSale.add(jScrollPane7);
        jScrollPane7.setBounds(0, 50, 1090, 160);

        ssby.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ssby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By", "Sale id", "Vehicle No.", "Customer Id", "Employee Id" }));
        ssby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssbyActionPerformed(evt);
            }
        });
        ViewSale.add(ssby);
        ssby.setBounds(310, 220, 201, 37);

        ssbyt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ssbyt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ssbyt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssbytMouseClicked(evt);
            }
        });
        ssbyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssbytActionPerformed(evt);
            }
        });
        ViewSale.add(ssbyt);
        ssbyt.setBounds(520, 220, 209, 37);

        searchicon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/searchbs.png"))); // NOI18N
        searchicon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchicon3MouseClicked(evt);
            }
        });
        ViewSale.add(searchicon3);
        searchicon3.setBounds(740, 220, 30, 41);

        jLabel146.setBackground(new java.awt.Color(255, 255, 255));
        jLabel146.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel146.setText("Customer Id ");
        ViewSale.add(jLabel146);
        jLabel146.setBounds(260, 260, 136, 22);

        vsem.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vsem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsemActionPerformed(evt);
            }
        });
        ViewSale.add(vsem);
        vsem.setBounds(520, 290, 199, 30);

        vcupdate5.setBackground(new java.awt.Color(0, 204, 204));
        vcupdate5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcupdate5.setText("Update");
        vcupdate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcupdate5ActionPerformed(evt);
            }
        });
        ViewSale.add(vcupdate5);
        vcupdate5.setBounds(600, 500, 121, 46);

        vcdelete2.setBackground(new java.awt.Color(0, 204, 204));
        vcdelete2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcdelete2.setText("Delete");
        vcdelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcdelete2ActionPerformed(evt);
            }
        });
        ViewSale.add(vcdelete2);
        vcdelete2.setBounds(750, 500, 121, 46);

        vcreset2.setBackground(new java.awt.Color(0, 204, 204));
        vcreset2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vcreset2.setText("Reset");
        vcreset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vcreset2ActionPerformed(evt);
            }
        });
        ViewSale.add(vcreset2);
        vcreset2.setBounds(890, 500, 121, 46);

        vssa.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vssa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vssa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vssaActionPerformed(evt);
            }
        });
        ViewSale.add(vssa);
        vssa.setBounds(10, 290, 199, 30);

        jLabel147.setBackground(new java.awt.Color(255, 255, 255));
        jLabel147.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel147.setText("Sale Id");
        ViewSale.add(jLabel147);
        jLabel147.setBounds(10, 260, 136, 22);

        vscu.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vscu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vscu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vscuActionPerformed(evt);
            }
        });
        ViewSale.add(vscu);
        vscu.setBounds(260, 290, 199, 30);

        jLabel148.setBackground(new java.awt.Color(255, 255, 255));
        jLabel148.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel148.setText("Vehicle Id");
        ViewSale.add(jLabel148);
        jLabel148.setBounds(770, 260, 136, 22);

        jLabel149.setBackground(new java.awt.Color(255, 255, 255));
        jLabel149.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel149.setText("Employee Id");
        ViewSale.add(jLabel149);
        jLabel149.setBounds(520, 260, 136, 22);

        vsvi.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vsvi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsviActionPerformed(evt);
            }
        });
        ViewSale.add(vsvi);
        vsvi.setBounds(770, 290, 199, 30);

        vspu.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vspu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vspu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vspuActionPerformed(evt);
            }
        });
        ViewSale.add(vspu);
        vspu.setBounds(10, 370, 199, 30);

        jLabel150.setBackground(new java.awt.Color(255, 255, 255));
        jLabel150.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel150.setText("Purchase Date");
        ViewSale.add(jLabel150);
        jLabel150.setBounds(10, 340, 136, 22);

        vsct.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vsct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsctActionPerformed(evt);
            }
        });
        ViewSale.add(vsct);
        vsct.setBounds(260, 370, 199, 30);

        jLabel164.setBackground(new java.awt.Color(255, 255, 255));
        jLabel164.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel164.setText("Customer Name");
        ViewSale.add(jLabel164);
        jLabel164.setBounds(260, 340, 136, 22);

        vsen.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vsen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsenActionPerformed(evt);
            }
        });
        ViewSale.add(vsen);
        vsen.setBounds(520, 370, 199, 30);

        jLabel167.setBackground(new java.awt.Color(255, 255, 255));
        jLabel167.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel167.setText("Employee Name");
        ViewSale.add(jLabel167);
        jLabel167.setBounds(520, 340, 136, 22);

        vsvc.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vsvc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsvc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsvcActionPerformed(evt);
            }
        });
        ViewSale.add(vsvc);
        vsvc.setBounds(770, 370, 199, 30);

        jLabel168.setBackground(new java.awt.Color(255, 255, 255));
        jLabel168.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel168.setText("Vehicle Company");
        ViewSale.add(jLabel168);
        jLabel168.setBounds(770, 340, 136, 22);

        vsde.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vsde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsdeActionPerformed(evt);
            }
        });
        ViewSale.add(vsde);
        vsde.setBounds(10, 450, 199, 30);

        jLabel169.setBackground(new java.awt.Color(255, 255, 255));
        jLabel169.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel169.setText("Delivery Date");
        ViewSale.add(jLabel169);
        jLabel169.setBounds(10, 420, 136, 22);

        jLabel170.setBackground(new java.awt.Color(255, 255, 255));
        jLabel170.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel170.setText("Payment Mode");
        ViewSale.add(jLabel170);
        jLabel170.setBounds(260, 420, 136, 22);

        vspa.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vspa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vspa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vspaActionPerformed(evt);
            }
        });
        ViewSale.add(vspa);
        vspa.setBounds(260, 450, 199, 30);

        vsve.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vsve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsveActionPerformed(evt);
            }
        });
        ViewSale.add(vsve);
        vsve.setBounds(520, 450, 199, 30);

        jLabel171.setBackground(new java.awt.Color(255, 255, 255));
        jLabel171.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel171.setText("Vehicle Cost");
        ViewSale.add(jLabel171);
        jLabel171.setBounds(520, 420, 136, 22);

        jLabel172.setBackground(new java.awt.Color(255, 255, 255));
        jLabel172.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel172.setText("Vehicle Model");
        ViewSale.add(jLabel172);
        jLabel172.setBounds(770, 420, 136, 22);

        vsvm.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vsvm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsvm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsvmActionPerformed(evt);
            }
        });
        ViewSale.add(vsvm);
        vsvm.setBounds(770, 450, 199, 30);

        jLabel173.setBackground(new java.awt.Color(255, 255, 255));
        jLabel173.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel173.setText("Deposite Amount");
        ViewSale.add(jLabel173);
        jLabel173.setBounds(10, 490, 136, 22);

        vsdp.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vsdp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsdpActionPerformed(evt);
            }
        });
        ViewSale.add(vsdp);
        vsdp.setBounds(10, 520, 199, 30);

        jLabel174.setBackground(new java.awt.Color(255, 255, 255));
        jLabel174.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel174.setText("Remaining Amount");
        ViewSale.add(jLabel174);
        jLabel174.setBounds(260, 490, 170, 22);

        vsre.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        vsre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vsre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsreActionPerformed(evt);
            }
        });
        ViewSale.add(vsre);
        vsre.setBounds(260, 520, 199, 30);

        SaleMain.add(ViewSale, "card4");

        billing.setBackground(new java.awt.Color(255, 255, 255));
        billing.setPreferredSize(new java.awt.Dimension(1090, 640));
        billing.setLayout(null);

        jLabel166.setBackground(new java.awt.Color(255, 255, 255));
        jLabel166.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel166.setText("                                                        Reciept");
        jLabel166.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jLabel166.setMaximumSize(new java.awt.Dimension(661, 43));
        jLabel166.setMinimumSize(new java.awt.Dimension(661, 43));
        jLabel166.setPreferredSize(new java.awt.Dimension(661, 43));
        billing.add(jLabel166);
        jLabel166.setBounds(0, 0, 1098, 43);

        bil.setColumns(20);
        bil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bil.setRows(5);
        jScrollPane4.setViewportView(bil);

        billing.add(jScrollPane4);
        jScrollPane4.setBounds(280, 50, 550, 510);

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setText("Print");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        billing.add(jButton12);
        jButton12.setBounds(840, 510, 100, 40);

        SaleMain.add(billing, "card4");

        jPanel4.add(SaleMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1090, 580));

        javax.swing.GroupLayout Sale6Layout = new javax.swing.GroupLayout(Sale6);
        Sale6.setLayout(Sale6Layout);
        Sale6Layout.setHorizontalGroup(
            Sale6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(Sale6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Sale6Layout.setVerticalGroup(
            Sale6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
            .addGroup(Sale6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Sale6Layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Home_main.add(Sale6, "card7");

        stock7.setEnabled(false);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(0, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 60));

        jPanel16.setBackground(new java.awt.Color(153, 153, 153));
        jPanel16.setLayout(new java.awt.CardLayout());

        addstock.setBackground(new java.awt.Color(255, 255, 255));

        addingstock.setBackground(new java.awt.Color(255, 255, 255));
        addingstock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setBackground(new java.awt.Color(255, 255, 255));
        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel85.setText("Company :");
        addingstock.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 90, 30));

        save8.setBackground(new java.awt.Color(0, 204, 204));
        save8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        save8.setText("View");
        save8.setBorder(null);
        save8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save8ActionPerformed(evt);
            }
        });
        addingstock.add(save8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 100, 40));

        vs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        vs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsActionPerformed(evt);
            }
        });
        addingstock.add(vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 90, 30));

        vsc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vsc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Maruti Suzuki", "Honda", "Tata Moters", "Huyandai", "Mahindra" }));
        vsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vscActionPerformed(evt);
            }
        });
        addingstock.add(vsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 190, 30));

        vsm.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        vsm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Maruti Suzuki", "Honda", "Tata Moters", "Huyandai", "Mahindra" }));
        addingstock.add(vsm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 190, 30));

        jLabel86.setBackground(new java.awt.Color(255, 255, 255));
        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel86.setText("Available Quantity :");
        addingstock.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 170, 30));

        jLabel87.setBackground(new java.awt.Color(255, 255, 255));
        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel87.setText("Model :");
        addingstock.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 70, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("View Stock");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout addstockLayout = new javax.swing.GroupLayout(addstock);
        addstock.setLayout(addstockLayout);
        addstockLayout.setHorizontalGroup(
            addstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
            .addComponent(addingstock, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        addstockLayout.setVerticalGroup(
            addstockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addstockLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addingstock, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.add(addstock, "card2");

        jPanel10.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1090, 580));

        javax.swing.GroupLayout stock7Layout = new javax.swing.GroupLayout(stock7);
        stock7.setLayout(stock7Layout);
        stock7Layout.setHorizontalGroup(
            stock7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(stock7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        stock7Layout.setVerticalGroup(
            stock7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
            .addGroup(stock7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(stock7Layout.createSequentialGroup()
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Home_main.add(stock7, "card2");

        getContentPane().add(Home_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 1090, 640));

        sidebar.setBackground(new java.awt.Color(51, 51, 51));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setBackground(new java.awt.Color(51, 51, 51));
        dashboard.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/squared-menu.png"))); // NOI18N
        dashboard.setText(" DashBoard");
        dashboard.setOpaque(true);
        sidebar.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 180, 40));

        Reports.setBackground(new java.awt.Color(0, 102, 0));
        Reports.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reports.setForeground(new java.awt.Color(255, 255, 255));
        Reports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/newspaper.png"))); // NOI18N
        Reports.setText("    REPORTS");
        Reports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reports.setIconTextGap(3);
        Reports.setOpaque(true);
        Reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReportsMouseExited(evt);
            }
        });
        sidebar.add(Reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 260, 40));

        Stock.setBackground(new java.awt.Color(0, 102, 0));
        Stock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Stock.setForeground(new java.awt.Color(255, 255, 255));
        Stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/stock.png"))); // NOI18N
        Stock.setText("VIEW STOCK");
        Stock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Stock.setIconTextGap(15);
        Stock.setOpaque(true);
        Stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StockMouseExited(evt);
            }
        });
        sidebar.add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 260, 40));

        Customer.setBackground(new java.awt.Color(0, 102, 0));
        Customer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Customer.setForeground(new java.awt.Color(255, 255, 255));
        Customer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/customerss.png"))); // NOI18N
        Customer.setText("         CUSTOMER");
        Customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Customer.setIconTextGap(-30);
        Customer.setOpaque(true);
        Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CustomerMouseExited(evt);
            }
        });
        sidebar.add(Customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 260, 40));

        Home.setBackground(new java.awt.Color(0, 102, 0));
        Home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/home-interface.png"))); // NOI18N
        Home.setText("  HOME");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.setIconTextGap(3);
        Home.setOpaque(true);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        sidebar.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 260, 40));

        Vehicle.setBackground(new java.awt.Color(0, 102, 0));
        Vehicle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vehicle.setForeground(new java.awt.Color(255, 255, 255));
        Vehicle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Vehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/sports-car.png"))); // NOI18N
        Vehicle.setText("    VEHICLE");
        Vehicle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vehicle.setIconTextGap(3);
        Vehicle.setOpaque(true);
        Vehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VehicleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VehicleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VehicleMouseExited(evt);
            }

            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmployeeMouseExited(evt);
            }
        });
        sidebar.add(Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 40));

        Sale.setBackground(new java.awt.Color(0, 102, 0));
        Sale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Sale.setForeground(new java.awt.Color(255, 255, 255));
        Sale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/shopping-cart.png"))); // NOI18N
        Sale.setText("SALE");
        Sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sale.setIconTextGap(30);
        Sale.setOpaque(true);
        Sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaleMouseExited(evt);
            }
        });
        sidebar.add(Sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 260, 40));

        Dealer.setBackground(new java.awt.Color(0, 102, 0));
        Dealer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Dealer.setForeground(new java.awt.Color(255, 255, 255));
        Dealer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dealer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/dealer.png"))); // NOI18N
        Dealer.setText("DEALER");
        Dealer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dealer.setIconTextGap(20);
        Dealer.setOpaque(true);
        Dealer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DealerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DealerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DealerMouseExited(evt);
            }
        });
        sidebar.add(Dealer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 260, 40));

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void ReportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseEntered
        // TODO add your handling code here:
        Reports.setBackground(Color.GREEN);
    }//GEN-LAST:event_ReportsMouseEntered

    private void ReportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseExited
        // TODO add your handling code here:
        // jLabel4.setBackground(255,51,51);
        Reports.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_ReportsMouseExited

    private void StockMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockMouseEntered
        // TODO add your handling code here:
        Stock.setBackground(Color.GREEN);
    }//GEN-LAST:event_StockMouseEntered

    private void StockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockMouseExited
        // TODO add your handling code here:
        Stock.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_StockMouseExited

    private void CustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseEntered
        // TODO add your handling code here:
        Customer.setBackground(Color.GREEN);
    }//GEN-LAST:event_CustomerMouseEntered

    private void CustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseExited
        // TODO add your handling code here:
        Customer.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_CustomerMouseExited

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        // TODO add your handling code here:
        Home.setBackground(Color.GREEN);
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        // TODO add your handling code here:
        Home.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_HomeMouseExited

    private void VehicleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VehicleMouseEntered
        // TODO add your handling code here:
        Vehicle.setBackground(Color.GREEN);
    }//GEN-LAST:event_VehicleMouseEntered

    private void VehicleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VehicleMouseExited
        // TODO add your handling code here:
        Vehicle.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_VehicleMouseExited

    private void AddcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddcMouseClicked
        // TODO add your handling code here:
        customermain.removeAll();
        customermain.repaint();
        customermain.revalidate();

        customermain.add(registration);
        customermain.repaint();
        customermain.revalidate();
    }//GEN-LAST:event_AddcMouseClicked

    private void AddcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddcMouseEntered
        // TODO add your handling code here:
        logout.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_AddcMouseEntered

    private void AddcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddcMouseExited
        // TODO add your handling code here:
        logout.setBackground(new Color(0, 204, 204));
    }//GEN-LAST:event_AddcMouseExited

    private void CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseClicked
        // TODO add your handling code here:

        //hi harsh right here
        Home_main.removeAll();
        Home_main.repaint();
        Home_main.revalidate();

        Home_main.add(customer2);
        Home_main.repaint();
        Home_main.revalidate();
        DisplayTable();

    }//GEN-LAST:event_CustomerMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        Home_main.removeAll();
        Home_main.repaint();
        Home_main.revalidate();

        Home_main.add(Home1);
        Home_main.repaint();
        Home_main.revalidate();


    }//GEN-LAST:event_HomeMouseClicked

    private void caddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caddressActionPerformed

    private void ccityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccityActionPerformed

    private void cemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cemailActionPerformed

    private void caddharnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caddharnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caddharnoActionPerformed

    private void cpannumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpannumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpannumActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        dispose();
        LoginWindow pp = new LoginWindow();
        pp.show();
    }//GEN-LAST:event_logoutMouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        // TODO add your handling code here:
        Home_main.removeAll();
        Home_main.repaint();
        Home_main.revalidate();

        Home_main.add(employee3);
        Home_main.repaint();
        Home_main.revalidate();
        eDisplayTable();

    }//GEN-LAST:event_EmployeeMouseClicked

    private void EmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseEntered
        // TODO add your handling code here:
        Employee.setBackground(Color.GREEN);
    }//GEN-LAST:event_EmployeeMouseEntered

    private void EmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseExited
        // TODO add your handling code here:
        Employee.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_EmployeeMouseExited

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        if (cname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.centry, "Customer Name is empty.");

        } else if (cfathername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.centry, "Father Name is empty.");

        } else if (mobnumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.centry, "Mobile Number is empty.");

        } else if (caddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.centry, "Address is empty.");

        } else if (ccity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.centry, "City is empty.");

        } else if (caddharno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.centry, "Aadhar number is empty.");

        } else if (cdob.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.centry, "Date of Birth is empty.");

        } else if (cvehino.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.centry, "Vehicle Number is empty.");

        } else if (ccid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.centry, " Generate Customer ID.");

        } else {

            int n = Integer.parseInt(ccid.getText());
            String nam = cname.getText();
            String fnam = cfathername.getText();
            String cadd = caddress.getText();
            String ccty = ccity.getText();
            String cem = cemail.getText();
            String caddh = caddharno.getText();
            String cpann = cpannum.getText();
            String cdb = cdob.getText();
            String cmob = mobnumber.getText();
            String cvehin = cvehino.getText();

            try {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
                    String qry = "insert into customer(cname,cfathername,mobnumber,caddress,ccity,cemail,caddharno,cpannum,cgender,cdob,cvehino,cid)values(?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement st = con.prepareStatement(qry);
                    st.setString(1, nam);
                    st.setString(2, fnam);
                    st.setString(3, cmob);
                    st.setString(4, cadd);
                    st.setString(5, ccty);
                    st.setString(6, cem);
                    st.setString(7, caddh);
                    st.setString(8, cpann);
                    st.setString(9, gen);
                    st.setString(10, cdb);
                    st.setString(11, cvehin);
                    st.setInt(12, n);
                    st.executeUpdate();
                    JOptionPane.showMessageDialog(this.centry, "data added successfully");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Navbar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (SQLException ex) {
                //Logger.getLogger(DataToMysql.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this.centry, ex);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        cname.setText("");
        cdob.setText("");

        ccity.setText("");
        cemail.setText("");
        caddharno.setText("");
        cpannum.setText("");
        caddress.setText("");
        cvehino.setText("");
        cfathername.setText("");
        mobnumber.setText("");


    }//GEN-LAST:event_resetActionPerformed


    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        jPanel9.removeAll();
        jPanel9.repaint();
        jPanel9.revalidate();

        jPanel9.add(viewemployee);
        jPanel9.repaint();
        jPanel9.revalidate();
        eDisplayTable();


    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        jPanel9.removeAll();
        jPanel9.repaint();
        jPanel9.revalidate();

        jPanel9.add(registrationemployee);
        jPanel9.repaint();
        jPanel9.revalidate();


    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseExited

    private void efathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efathernameActionPerformed

    private void eaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eaddressActionPerformed

    private void emobnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emobnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emobnumberActionPerformed

    private void esalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esalaryActionPerformed

    private void edateofjoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edateofjoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edateofjoinActionPerformed

    private void esaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esaveActionPerformed
        // TODO add your handling code here:
        if (ename.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vecreg1, "Employee Name is empty.");

        } else if (efathername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vecreg1, "Father Name is empty.");

        } else if (emobnumber.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vecreg1, "Mobile Number is empty.");

        } else if (eaddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vecreg1, "Address is empty.");

        } else if (ecity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vecreg1, "City is empty.");

        } else if (eaddharno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vecreg1, "Aadhar number is empty.");

        } else if (edob.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vecreg1, "Date of Birth is empty.");

        } else if (esalary.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vecreg1, "Salary is empty.");

        } else if (edateofjoin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vecreg1, "Date of joining is empty.");

        } else if (emplyid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.vecreg1, " Generate employee ID");

        } else {

            String enam = ename.getText();
            String efnam = efathername.getText();
            String eadd = eaddress.getText();
            String ecty = ecity.getText();
            String eem = eemail.getText();
            String eaddh = eaddharno.getText();
            String epann = epannum.getText();
            String edb = edob.getText();
            String emob = emobnumber.getText();
            String edatejoin = edateofjoin.getText();
            String esal = esalary.getText();
            int empid = Integer.parseInt(emplyid.getText());

            String desg = designation.getText();

            try {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
                    String qry = "insert into employee(ename,efathername,emobnumber,eaddress,ecity,eemail,eaddharno,epannum,egender,edob,edateofjoin,esalary,emplyid,designation)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement st = con.prepareStatement(qry);
                    st.setString(1, enam);
                    st.setString(2, efnam);
                    st.setString(3, emob);
                    st.setString(4, eadd);
                    st.setString(5, ecty);
                    st.setString(6, eem);
                    st.setString(7, eaddh);
                    st.setString(8, epann);
                    st.setString(9, egen);
                    st.setString(10, edb);
                    st.setString(11, edatejoin);
                    st.setInt(12, Integer.parseInt(esal));
                    st.setInt(13, empid);
                    st.setString(14, desg);

                    st.executeUpdate();
                    JOptionPane.showMessageDialog(this.vecreg1, "data added successfully");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Navbar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (SQLException ex) {
                //Logger.getLogger(DataToMysql.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this.vecreg1, ex);
            }
        }
    }//GEN-LAST:event_esaveActionPerformed

    private void eemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eemailActionPerformed

    private void save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3ActionPerformed
        // TODO add your handling code here:
        ename.setText("");
        edob.setText("");

        ecity.setText("");
        eemail.setText("");
        eaddharno.setText("");
        epannum.setText("");
        eaddress.setText("");
        cvehino.setText("");
        efathername.setText("");
        emobnumber.setText("");
        designation.setText("");
        emplyid.setText("");
        esalary.setText("");
        edateofjoin.setText("");


    }//GEN-LAST:event_save3ActionPerformed

    private void VehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VehicleMouseClicked
        // TODO add your handling code here:
        Home_main.removeAll();
        Home_main.repaint();
        Home_main.revalidate();

        Home_main.add(vehicle5);
        Home_main.repaint();
        Home_main.revalidate();
        vDisplayTable();

    }//GEN-LAST:event_VehicleMouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        // TODO add your handling code here:

        jPanel14.removeAll();
        jPanel14.repaint();
        jPanel14.revalidate();

        jPanel14.add(viewvehicle);
        jPanel14.repaint();
        jPanel14.revalidate();
        vDisplayTable();


    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel56MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel56MouseEntered

    private void jLabel56MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel56MouseExited

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
        // TODO add your handling code here:

        jPanel14.removeAll();
        jPanel14.repaint();
        jPanel14.revalidate();

        jPanel14.add(additionvehicle);
        jPanel14.repaint();
        jPanel14.revalidate();


    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel57MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel57MouseEntered

    private void jLabel57MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel57MouseExited

    private void save5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save5ActionPerformed
        // TODO add your handling code here:
        mil.setText("");
        tps.setText("");
        chno.setText("");
        egno.setText("");
        col.setText("");
        deli.setText("");

        cst.setText("");

    }//GEN-LAST:event_save5ActionPerformed

    private void deliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deliActionPerformed

    private void save8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save8ActionPerformed
        // TODO add your handling code here:
        if (vsc.getSelectedIndex() == 1 && vsm.getSelectedIndex() == 1) {
            cmp = "Maruti Suzuki";
            mode = "Maruti Dzire";
        } else if (vsc.getSelectedIndex() == 1 && vsm.getSelectedIndex() == 2) {
            cmp = "Maruti Suzuki";
            mode = "Maruti Swift";
        } else if (vsc.getSelectedIndex() == 1 && vsm.getSelectedIndex() == 3) {
            cmp = "Maruti Suzuki";
            mode = "Maruti Wagonr";
        } else if (vsc.getSelectedIndex() == 1 && vsm.getSelectedIndex() == 4) {
            cmp = "Maruti Suzuki";
            mode = "Maruti Baleno";
        } else if (vsc.getSelectedIndex() == 1 && vsm.getSelectedIndex() == 5) {
            cmp = "Maruti Suzuki";
            mode = "Maruti Alto";
        } else if (vsc.getSelectedIndex() == 2 && vsm.getSelectedIndex() == 1) {
            cmp = "Honda";
            mode = "Honda Amaze";
        } else if (vsc.getSelectedIndex() == 2 && vsm.getSelectedIndex() == 2) {
            cmp = "Honda";
            mode = "Honda Civic";
        } else if (vsc.getSelectedIndex() == 2 && vsm.getSelectedIndex() == 3) {
            cmp = "Honda";
            mode = "Honda WRV";
        } else if (vsc.getSelectedIndex() == 2 && vsm.getSelectedIndex() == 4) {
            cmp = "Honda";
            mode = "Honda Jazz";
        } else if (vsc.getSelectedIndex() == 3 && vsm.getSelectedIndex() == 1) {
            cmp = "Tata Motors";
            mode = "Tata Nexon";
        } else if (vsc.getSelectedIndex() == 3 && vsm.getSelectedIndex() == 2) {
            cmp = "Tata Motors";
            mode = "Tata Harrier";
        } else if (vsc.getSelectedIndex() == 3 && vsm.getSelectedIndex() == 3) {
            cmp = "Tata Motors";
            mode = "Tata Tiago";
        } else if (vsc.getSelectedIndex() == 4 && vsm.getSelectedIndex() == 1) {
            cmp = "Hyundai";
            mode = "Hyundai i20";
        } else if (vsc.getSelectedIndex() == 4 && vsm.getSelectedIndex() == 2) {
            cmp = "Hyundai";
            mode = "Venue";
        } else if (vsc.getSelectedIndex() == 4 && vsm.getSelectedIndex() == 3) {
            cmp = "Hyundai";
            mode = "Creta";
        } else if (vsc.getSelectedIndex() == 5 && vsm.getSelectedIndex() == 1) {
            cmp = "Mahindra";
            mode = "Mahindra Scorpio";
        } else if (vsc.getSelectedIndex() == 5 && vsm.getSelectedIndex() == 2) {
            cmp = "Mahindra";
            mode = "Mahindra XUV300";
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select count(chsno) from vehicle where (cmpnynam = ? and modnam = ?)and status = 'null';";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, cmp);
            pstmt.setString(2, mode);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                vs.setText(rs.getString("count(chsno)"));

            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vs, e);
        }

    }//GEN-LAST:event_save8ActionPerformed

    private void vsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsActionPerformed

    private void StockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StockMouseClicked
        // TODO add your handling code here:

        Home_main.removeAll();
        Home_main.repaint();
        Home_main.revalidate();

        Home_main.add(stock7);
        Home_main.repaint();
        Home_main.revalidate();


    }//GEN-LAST:event_StockMouseClicked

    private void SaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaleMouseClicked
        // TODO add your handling code here:
        Home_main.removeAll();
        Home_main.repaint();
        Home_main.revalidate();

        Home_main.add(Sale6);
        Home_main.repaint();
        Home_main.revalidate();
        sDisplayTable();

    }//GEN-LAST:event_SaleMouseClicked

    private void SaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaleMouseEntered
        // TODO add your handling code here:
        Sale.setBackground(Color.GREEN);
    }//GEN-LAST:event_SaleMouseEntered

    private void SaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaleMouseExited
        // TODO add your handling code here:
        Sale.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_SaleMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        weln.setText(" " + wn);
        showDate();
    }//GEN-LAST:event_formWindowOpened

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMouseClicked

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
        f.setSelected(false);

        gen = "Male";
        mobnumber.setText("");
        mobnumber.requestFocus();

    }//GEN-LAST:event_mActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        // TODO add your handling code here:
        m.setSelected(false);
        gen = "Female";
        mobnumber.setText("");
        mobnumber.requestFocus();

    }//GEN-LAST:event_fActionPerformed

    private void mobnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobnumberActionPerformed

    private void cvehinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvehinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvehinoActionPerformed

    private void cfathernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfathernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cfathernameActionPerformed

    private void cdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cdobActionPerformed

    private void cnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnameKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            cfathername.setText("");
            cfathername.requestFocus();
        }

    }//GEN-LAST:event_cnameKeyPressed

    private void cfathernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cfathernameKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            cdob.setText("");
            cdob.requestFocus();
        }
    }//GEN-LAST:event_cfathernameKeyPressed

    private void mobnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobnumberKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            cemail.setText("");
            cemail.requestFocus();
        }
    }//GEN-LAST:event_mobnumberKeyPressed

    private void cemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cemailKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            caddharno.setText("");
            caddharno.requestFocus();
        }
    }//GEN-LAST:event_cemailKeyPressed

    private void caddharnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caddharnoKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            cpannum.setText("");
            cpannum.requestFocus();
        }
    }//GEN-LAST:event_caddharnoKeyPressed

    private void cpannumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpannumKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            caddress.setText("");
            caddress.requestFocus();
        }
    }//GEN-LAST:event_cpannumKeyPressed

    private void caddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caddressKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            ccity.setText("");
            ccity.requestFocus();
        }
    }//GEN-LAST:event_caddressKeyPressed

    private void ccityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccityKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            cvehino.setText("");
            cvehino.requestFocus();
        }
    }//GEN-LAST:event_ccityKeyPressed

    private void emplyidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emplyidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emplyidActionPerformed

    private void designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationActionPerformed

    private void enameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enameActionPerformed

    private void eaddharnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eaddharnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eaddharnoActionPerformed

    private void epannumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epannumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_epannumActionPerformed

    private void ecityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecityActionPerformed

    private void cusname8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusname8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusname8ActionPerformed

    private void edobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edobActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
        ef.setSelected(false);

        egen = "Male";
        emobnumber.setText("");
        emobnumber.requestFocus();

    }//GEN-LAST:event_emActionPerformed

    private void efActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efActionPerformed
        // TODO add your handling code here:
        em.setSelected(false);

        egen = "Female";
        emobnumber.setText("");
        emobnumber.requestFocus();
    }//GEN-LAST:event_efActionPerformed

    private void SearchcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchcMouseClicked
        // TODO add your handling code here:
        customermain.removeAll();
        customermain.repaint();
        customermain.revalidate();

        customermain.add(Searchcustomer);
        customermain.repaint();
        customermain.revalidate();
        DisplayTable();

    }//GEN-LAST:event_SearchcMouseClicked

    private void SearchcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchcMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchcMouseEntered

    private void SearchcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchcMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_SearchcMouseExited

    private void vcciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcciActionPerformed

    private void sbytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbytActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbytActionPerformed

    private void vcfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcfaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcfaActionPerformed

    private void vcdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcdaActionPerformed

    private void vcaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcaaActionPerformed

    private void vcmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcmoActionPerformed

    private void vcveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcveActionPerformed

    private void vcgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcgeActionPerformed

    private void vcpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcpaActionPerformed

    private void vcctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcctActionPerformed

    private void vcadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcadActionPerformed

    private void sbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbyActionPerformed
        // TODO add your handling code here:
        if (sby.getSelectedIndex() == 2) {
            sbyt.setText("Enter Customer Name");
        } else if (sby.getSelectedIndex() == 3) {
            sbyt.setText("Enter Father Name");
        } else if (sby.getSelectedIndex() == 4) {
            sbyt.setText("Enter Aadhar No.");
        } else if (sby.getSelectedIndex() == 5) {
            sbyt.setText("Enter Vehicle No.");
        } else if (sby.getSelectedIndex() == 6) {
            sbyt.setText("Enter Mobile No.");
        } else if (sby.getSelectedIndex() == 7) {
            sbyt.setText("Enter City");
        } else if (sby.getSelectedIndex() == 1) {
            sbyt.setText("Enter Customer ID");
        } else {
            sbyt.setEnabled(false);
            sbyt.setText("");

        }
        DisplayTable();
    }//GEN-LAST:event_sbyActionPerformed

    private void sbytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbytMouseClicked
        // TODO add your handling code here:
        if (sby.getSelectedIndex() == 0) {
            sbyt.setEnabled(false);
        } else {
            sbyt.setEnabled(true);
            sbyt.setText("");
            sbyt.requestFocus();
        }
    }//GEN-LAST:event_sbytMouseClicked

    private void vcemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vcemActionPerformed

    private void vccuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vccuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vccuActionPerformed

    private void ccidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccidActionPerformed

    private void ccidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccidKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccidKeyPressed

    private void vctableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vctableMouseClicked
        // TODO add your handling code here:
        int i = vctable.getSelectedRow();
        TableModel mod = vctable.getModel();
        vcci.setText(mod.getValueAt(i, 0).toString());
        vccu.setText(mod.getValueAt(i, 1).toString());
        vcfa.setText(mod.getValueAt(i, 2).toString());
        vcmo.setText(mod.getValueAt(i, 3).toString());
        vcad.setText(mod.getValueAt(i, 4).toString());
        vcct.setText(mod.getValueAt(i, 5).toString());
        vcem.setText(mod.getValueAt(i, 6).toString());
        vcaa.setText(mod.getValueAt(i, 7).toString());
        vcpa.setText(mod.getValueAt(i, 8).toString());
        vcge.setText(mod.getValueAt(i, 9).toString());
        vcda.setText(mod.getValueAt(i, 10).toString());
        vcve.setText(mod.getValueAt(i, 11).toString());

    }//GEN-LAST:event_vctableMouseClicked

    private void vcupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcupdateActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            String sql = "update customer set cname=?,cfathername=?,mobnumber=?,caddress=?,ccity=?,cemail=?,caddharno=?,cpannum=?,cgender=?,cdob=?,cvehino = ? where cid=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vccu.getText());
            pstmt.setString(2, vcfa.getText());
            pstmt.setString(3, vcmo.getText());
            pstmt.setString(4, vcad.getText());
            pstmt.setString(5, vcct.getText());
            pstmt.setString(6, vcem.getText());
            pstmt.setString(7, vcaa.getText());
            pstmt.setString(8, vcpa.getText());
            pstmt.setString(9, vcge.getText());
            pstmt.setString(10, vcda.getText());
            pstmt.setString(11, vcve.getText());

            pstmt.setInt(12, Integer.parseInt(vcci.getText()));

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(vccu, "Record Updated Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vccu, "No data is selected");
        }

        DisplayTable();

    }//GEN-LAST:event_vcupdateActionPerformed

    private void vcdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcdeleteActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            String sql = "delete from customer where cid = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(vcci.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(vccu, "Record Deleted Successfully");
            vccu.setText("");
            vcci.setText("");
            vcda.setText("");
            vcfa.setText("");
            vcmo.setText("");
            vcad.setText("");
            vcct.setText("");
            vcem.setText("");
            vcaa.setText("");
            vcpa.setText("");
            vcge.setText("");
            vcve.setText("");

            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vccu, "No data is Selected");
        }

        DisplayTable();


    }//GEN-LAST:event_vcdeleteActionPerformed

    private void vcresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcresetActionPerformed
        // TODO add your handling code here:
        sbyt.setText("");
        sbyt.setEnabled(false);
        vccu.setText("");
        vcci.setText("");
        vcpa.setText("");
        vcda.setText("");
        vcfa.setText("");
        vcmo.setText("");
        vcct.setText("");
        vcaa.setText("");
        vcve.setText("");
        vcem.setText("");
        vcad.setText("");
        vcge.setText("");

        DisplayTable();
    }//GEN-LAST:event_vcresetActionPerformed

    private void vctableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vctableKeyReleased
        // TODO add your handling code here:
        int i = vctable.getSelectedRow();
        TableModel mod = vctable.getModel();
        vcci.setText(mod.getValueAt(i, 0).toString());
        vccu.setText(mod.getValueAt(i, 1).toString());
        vcfa.setText(mod.getValueAt(i, 2).toString());
        vcmo.setText(mod.getValueAt(i, 3).toString());
        vcad.setText(mod.getValueAt(i, 4).toString());
        vcct.setText(mod.getValueAt(i, 5).toString());
        vcem.setText(mod.getValueAt(i, 6).toString());
        vcaa.setText(mod.getValueAt(i, 7).toString());
        vcpa.setText(mod.getValueAt(i, 8).toString());
        vcge.setText(mod.getValueAt(i, 9).toString());
        vcda.setText(mod.getValueAt(i, 10).toString());
        vcve.setText(mod.getValueAt(i, 11).toString());
    }//GEN-LAST:event_vctableKeyReleased

    private void searchiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchiconMouseClicked
        // TODO add your handling code here:
        if (sbyt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(vccu, "Enter Data to Search");
        } else if (sby.getSelectedIndex() > 0) {
            if (sby.getSelectedIndex() == 1) {
                int kp = Integer.parseInt(sbyt.getText());

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from customer where cid = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, kp);
                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {

                        vccu.setText(rs.getString("cname"));
                        vcci.setText(rs.getString("cid"));
                        vcfa.setText(rs.getString("cfathername"));
                        vcmo.setText(rs.getString("mobnumber"));
                        vcad.setText(rs.getString("caddress"));
                        vcct.setText(rs.getString("ccity"));
                        vcem.setText(rs.getString("cemail"));
                        vcaa.setText(rs.getString("caddharno"));
                        vcpa.setText(rs.getString("cpannum"));
                        vcge.setText(rs.getString("cgender"));
                        vcda.setText(rs.getString("cdob"));
                        vcve.setText(rs.getString("cvehino"));

                    } else {
                        JOptionPane.showMessageDialog(vccu, "Record not Found");
                    }

                    conn.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vccu, "No data is Selected");
                }
            } else if (sby.getSelectedIndex() == 2) {
                String za = sbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from customer where cname = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vctable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vctable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vccu, "No Record Available");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vccu, e);

                }

            } else if (sby.getSelectedIndex() == 3) {
                String za = sbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from customer where cfathername = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vctable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vctable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vccu, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vccu, e);

                }

            } else if (sby.getSelectedIndex() == 4) {
                String za = sbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from customer where caddharno = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vctable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vctable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vccu, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vccu, e);

                }

            } else if (sby.getSelectedIndex() == 5) {
                String za = sbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from customer where cvehino = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vctable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vctable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vccu, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vccu, e);

                }

            } else if (sby.getSelectedIndex() == 6) {
                String za = sbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from customer where mobnumber = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vctable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vctable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vccu, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vccu, e);

                }

            } else if (sby.getSelectedIndex() == 7) {
                String za = sbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from customer where ccity = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vctable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vctable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vccu, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vccu, e);

                }

            }
        }
    }//GEN-LAST:event_searchiconMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select cid from customer order by cid desc limit 1";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String gc = rs.getString("cid");
                int gcn = Integer.parseInt(gc);
                gcn++;

                ccid.setText(Integer.toString(gcn));
                ccid.setEditable(false);
            } else {
                ccid.setText("1");
            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(ccid, "No data is Selected");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void giActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select emplyid from employee order by emplyid desc limit 1";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String gc = rs.getString("emplyid");
                int gcn = Integer.parseInt(gc);
                gcn++;

                emplyid.setText(Integer.toString(gcn));
                emplyid.setEditable(false);
                ename.requestFocus();
            } else {
                emplyid.setText("1");
            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.vecreg1, "Unable To generate Id");
        }


    }//GEN-LAST:event_giActionPerformed

    private void esbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esbyActionPerformed
        // TODO add your handling code here:
        if (esby.getSelectedIndex() == 2) {
            esbyt.setText("Enter Employee Name");
        } else if (esby.getSelectedIndex() == 3) {
            esbyt.setText("Enter Father Name");
        } else if (esby.getSelectedIndex() == 4) {
            esbyt.setText("Enter Aadhar No.");
        } else if (esby.getSelectedIndex() == 5) {
            esbyt.setText("Enter Designation");
        } else if (esby.getSelectedIndex() == 6) {
            esbyt.setText("Enter Mobile No.");
        } else if (esby.getSelectedIndex() == 7) {
            esbyt.setText("Enter City");
        } else if (esby.getSelectedIndex() == 1) {
            esbyt.setText("Enter Employee ID");
        } else {
            esbyt.setEnabled(false);
            esbyt.setText("");

        }
        eDisplayTable();
    }//GEN-LAST:event_esbyActionPerformed

    private void veciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veciActionPerformed

    private void searchicon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchicon1MouseClicked
        // TODO add your handling code here:
        if (esbyt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(vefa, "Enter Data to Search");
        } else if (esby.getSelectedIndex() > 0) {
            if (esby.getSelectedIndex() == 1) {
                int kp = Integer.parseInt(esbyt.getText());

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from employee where emplyid = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, kp);
                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {
                        vecu.setText(rs.getString("ename"));
                        veci.setText(rs.getString("emplyid"));
                        vefa.setText(rs.getString("efathername"));
                        vemo.setText(rs.getString("emobnumber"));
                        vead.setText(rs.getString("eaddress"));
                        vect.setText(rs.getString("ecity"));
                        veem.setText(rs.getString("eemail"));
                        veaa.setText(rs.getString("eaddharno"));
                        vepa.setText(rs.getString("epannum"));
                        vege.setText(rs.getString("egender"));
                        veda.setText(rs.getString("edob"));
                        vejo.setText(rs.getString("edateofjoin"));
                        vesa.setText(rs.getString("esalary"));
                        vede.setText(rs.getString("designation"));

                    } else {
                        JOptionPane.showMessageDialog(vefa, "Record not Found");
                    }

                    conn.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vefa, "No data is Selected");
                }
            } else if (esby.getSelectedIndex() == 2) {
                String za = esbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from employee where ename = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vetable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vetable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vefa, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vefa, e);

                }

            } else if (esby.getSelectedIndex() == 3) {
                String za = esbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from employee where efathername = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vetable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vetable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vefa, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vefa, e);

                }

            } else if (esby.getSelectedIndex() == 4) {
                String za = esbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from employee where eaddharno = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vetable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vetable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vefa, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vefa, e);

                }

            } else if (esby.getSelectedIndex() == 5) {
                String za = esbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from employee where emobnumber = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vetable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vetable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vefa, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vefa, e);

                }

            } else if (esby.getSelectedIndex() == 7) {
                String za = esbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from employee where ecity = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vetable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vetable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vefa, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vefa, e);

                }

            }
        }
    }//GEN-LAST:event_searchicon1MouseClicked

    private void vetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vetableMouseClicked
        // TODO add your handling code here:
        int i = vetable.getSelectedRow();
        TableModel mod = vetable.getModel();
        vecu.setText(mod.getValueAt(i, 0).toString());
        vefa.setText(mod.getValueAt(i, 1).toString());
        vemo.setText(mod.getValueAt(i, 2).toString());
        vead.setText(mod.getValueAt(i, 3).toString());
        vect.setText(mod.getValueAt(i, 4).toString());
        veem.setText(mod.getValueAt(i, 5).toString());
        veaa.setText(mod.getValueAt(i, 6).toString());
        vepa.setText(mod.getValueAt(i, 7).toString());
        vege.setText(mod.getValueAt(i, 8).toString());
        veda.setText(mod.getValueAt(i, 9).toString());
        vejo.setText(mod.getValueAt(i, 10).toString());
        vesa.setText(mod.getValueAt(i, 11).toString());
        veci.setText(mod.getValueAt(i, 12).toString());
        vede.setText(mod.getValueAt(i, 13).toString());

    }//GEN-LAST:event_vetableMouseClicked

    private void vetableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vetableKeyReleased
        // TODO add your handling code here:
        int i = vetable.getSelectedRow();
        TableModel mod = vetable.getModel();
        vecu.setText(mod.getValueAt(i, 0).toString());
        vefa.setText(mod.getValueAt(i, 1).toString());
        vemo.setText(mod.getValueAt(i, 2).toString());
        vead.setText(mod.getValueAt(i, 3).toString());
        vect.setText(mod.getValueAt(i, 4).toString());
        veem.setText(mod.getValueAt(i, 5).toString());
        veaa.setText(mod.getValueAt(i, 6).toString());
        vepa.setText(mod.getValueAt(i, 7).toString());
        vege.setText(mod.getValueAt(i, 8).toString());
        veda.setText(mod.getValueAt(i, 9).toString());
        vejo.setText(mod.getValueAt(i, 10).toString());
        vesa.setText(mod.getValueAt(i, 11).toString());
        veci.setText(mod.getValueAt(i, 12).toString());
        vede.setText(mod.getValueAt(i, 13).toString());

    }//GEN-LAST:event_vetableKeyReleased

    private void esbytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esbytMouseClicked
        // TODO add your handling code here:
        if (esby.getSelectedIndex() == 0) {
            esbyt.setEnabled(false);
        } else {
            esbyt.setEnabled(true);
            esbyt.setText("");
            esbyt.requestFocus();
        }
    }//GEN-LAST:event_esbytMouseClicked

    private void esbytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esbytActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esbytActionPerformed

    private void vefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vefaActionPerformed

    private void vedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vedaActionPerformed

    private void veaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veaaActionPerformed

    private void vepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vepaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vepaActionPerformed

    private void vejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vejoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vejoActionPerformed

    private void vegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vegeActionPerformed

    private void vesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vesaActionPerformed

    private void vectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vectActionPerformed

    private void veadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veadActionPerformed

    private void vcupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcupdate1ActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            String sql = "update employee set ename=?,efathername=?,emobnumber=?,eaddress=?,ecity=?,eemail=?,eaddharno=?,epannum=?,egender=?,edob=?,edateofjoin = ?,esalary=?,designation=? where emplyid=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, vecu.getText());
            pstmt.setString(2, vefa.getText());
            pstmt.setString(3, vemo.getText());
            pstmt.setString(4, vead.getText());
            pstmt.setString(5, vect.getText());
            pstmt.setString(6, veem.getText());
            pstmt.setString(7, veaa.getText());
            pstmt.setString(8, vepa.getText());
            pstmt.setString(9, vege.getText());
            pstmt.setString(10, veda.getText());
            pstmt.setString(11, vejo.getText());
            pstmt.setInt(12, Integer.parseInt(vesa.getText()));
            pstmt.setString(13, vede.getText());

            pstmt.setInt(14, Integer.parseInt(veci.getText()));

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(vefa, "Record Updated Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vefa, "No data is selected");
        }

        eDisplayTable();
    }//GEN-LAST:event_vcupdate1ActionPerformed

    private void veemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veemActionPerformed

    private void vcreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcreset1ActionPerformed
        // TODO add your handling code here:
        esbyt.setText("");
        esbyt.setEnabled(false);
        vecu.setText("");
        veci.setText("");
        vepa.setText("");
        veda.setText("");
        vefa.setText("");
        vemo.setText("");
        vect.setText("");
        veaa.setText("");
        vesa.setText("");
        veem.setText("");
        vead.setText("");
        vege.setText("");
        vede.setText("");
        vesa.setText("");
        vejo.setText("");

        eDisplayTable();
    }//GEN-LAST:event_vcreset1ActionPerformed

    private void vcdelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcdelete1ActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            String sql = "delete from employee where emplyid = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(veci.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(vefa, "Record Deleted Successfully");
            esbyt.setText("");
            esbyt.setEnabled(false);
            vecu.setText("");
            veci.setText("");
            vepa.setText("");
            veda.setText("");
            vefa.setText("");
            vemo.setText("");
            vect.setText("");
            veaa.setText("");
            vesa.setText("");
            veem.setText("");
            vead.setText("");
            vege.setText("");
            vede.setText("");
            vesa.setText("");
            vejo.setText("");

            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vefa, "No data is Selected");
        }

        eDisplayTable();


    }//GEN-LAST:event_vcdelete1ActionPerformed

    private void vecuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vecuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vecuActionPerformed

    private void vedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vedeActionPerformed

    private void vemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vemoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vemoActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modActionPerformed

    private void fltpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fltpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fltpActionPerformed

    private void milActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_milActionPerformed

    private void tpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpsActionPerformed

    private void chnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chnoActionPerformed

    private void egnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_egnoActionPerformed

    private void colActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colActionPerformed

    private void save11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save11ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tab.getModel();
        try {
            int SelectedRowIndex = tab.getSelectedRow();
            model.removeRow(SelectedRowIndex);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(tab, "Please select a row");
        }
    }//GEN-LAST:event_save11ActionPerformed

    private void save12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save12ActionPerformed
        // TODO add your handling code here:
        /*
       if(cpy.getSelectedIndex()==1&&mod.getSelectedIndex()==1)
       {
           cmp="Maruti Suzuki";
           mode="Maruti Dzire";
       }else if(cpy.getSelectedIndex()==1&&mod.getSelectedIndex()==2)
       {
           cmp="Maruti Suzuki";
           mode="Maruti Swift";
       }else if(cpy.getSelectedIndex()==1&&mod.getSelectedIndex()==3)
       {
           cmp="Maruti Suzuki";
           mode="Maruti Wagonr";
       }else if(cpy.getSelectedIndex()==1&&mod.getSelectedIndex()==4)
       {
           cmp="Maruti Suzuki";
           mode="Maruti Baleno";
       }else if(cpy.getSelectedIndex()==1&&mod.getSelectedIndex()==5)
       {
           cmp="Maruti Suzuki";
           mode="Maruti Alto";
       }else if(cpy.getSelectedIndex()==2&&mod.getSelectedIndex()==1)
       {
           cmp="Honda";
           mode="Honda Amaze";
       }else if(cpy.getSelectedIndex()==2&&mod.getSelectedIndex()==2)
       {
           cmp="Honda";
           mode="Honda Civic";
       }else if(cpy.getSelectedIndex()==2&&mod.getSelectedIndex()==3)
       {
           cmp="Honda";
           mode="Honda WRV";
       }else if(cpy.getSelectedIndex()==2&&mod.getSelectedIndex()==4)
       {
           cmp="Honda";
           mode="Honda Jazz";
       }else if(cpy.getSelectedIndex()==3&&mod.getSelectedIndex()==1)
       {
           cmp="Tata Motors";
           mode="Tata Nexon";
       }else if(cpy.getSelectedIndex()==3&&mod.getSelectedIndex()==2)
       {
           cmp="Tata Motors";
           mode="Tata Harrier";
       }else if(cpy.getSelectedIndex()==3&&mod.getSelectedIndex()==3)
       {
           cmp="Tata Motors";
           mode="Tata Tiago";
       }else if(cpy.getSelectedIndex()==4&&mod.getSelectedIndex()==1)
       {
           cmp="Hyundai";
           mode="Hyundai i20";
       }else if(cpy.getSelectedIndex()==4&&mod.getSelectedIndex()==2)
       {
           cmp="Hyundai";
           mode="Venue";
       }else if(cpy.getSelectedIndex()==4&&mod.getSelectedIndex()==3)
       {
           cmp="Hyundai";
           mode="Creta";
       }else if(cpy.getSelectedIndex()==5&&mod.getSelectedIndex()==1)
       {
           cmp="Mahindra";
           mode="Mahindra Scorpio";
       }else if(cpy.getSelectedIndex()==5&&mod.getSelectedIndex()==2)
       {
           cmp="Mahindra";
           mode="Mahindra XUV300";
       }
       if(fltp.getSelectedIndex()==1)
       {
           fue = "Diesel";
       }else if(fltp.getSelectedIndex()==2)
       {
           fue = "Petrol";
       }else if(fltp.getSelectedIndex()==3)
       {
           fue = "Gas";
       }
       
         */

        if (cpy.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(tab, "Select Comapny");
        } else if (mod.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(tab, "Select Model");
        } else if (fltp.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(tab, "Select Fuel Type");
        } else if (mil.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Milage");
        } else if (tps.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Top Speed");
        } else if (chno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Chassis No.");
        } else if (egno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Engine No.");
        } else if (col.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Color");
        } else if (deli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Cost");
        } else if (tab.getRowCount() == 0) {
            JOptionPane.showMessageDialog(tab, "No entry in Table!");
        } else {
            java.util.Date d = new java.util.Date();
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

            try {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
                    TableModel m = tab.getModel();
                    for (int i = 0; i < tab.getRowCount(); i++) {
                        String qry = "insert into vehicle(chsno,engno,cost,color,milage,topsp,cmpnynam,modnam,fueltyp,delid,dateofentry,status)values(?,?,?,?,?,?,?,?,?,?,?,?)";
                        PreparedStatement st = con.prepareStatement(qry);
                        st.setInt(1, Integer.parseInt(m.getValueAt(i, 0).toString()));
                        st.setInt(2, Integer.parseInt(m.getValueAt(i, 1).toString()));
                        st.setInt(3, Integer.parseInt(m.getValueAt(i, 2).toString()));
                        st.setString(4, m.getValueAt(i, 3).toString());
                        st.setInt(5, Integer.parseInt(m.getValueAt(i, 4).toString()));
                        st.setInt(6, Integer.parseInt(m.getValueAt(i, 5).toString()));
                        st.setString(7, m.getValueAt(i, 6).toString());
                        st.setString(8, m.getValueAt(i, 7).toString());
                        st.setString(9, m.getValueAt(i, 8).toString());
                        st.setInt(10, Integer.parseInt(m.getValueAt(i, 9).toString()));
                        st.setString(11, s.format(d));
                        st.setString(12, "null");

                        st.executeUpdate();
                    }

                    JOptionPane.showMessageDialog(tab, "data added successfully");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Navbar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (SQLException ex) {
                //Logger.getLogger(DataToMysql.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(tab, ex);
            }
        }
    }//GEN-LAST:event_save12ActionPerformed

    private void save13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save13ActionPerformed
        // TODO add your handling code here:

        if (cpy.getSelectedIndex() == 1 && mod.getSelectedIndex() == 1) {
            cmp = "Maruti Suzuki";
            mode = "Maruti Dzire";
        } else if (cpy.getSelectedIndex() == 1 && mod.getSelectedIndex() == 2) {
            cmp = "Maruti Suzuki";
            mode = "Maruti Swift";
        } else if (cpy.getSelectedIndex() == 1 && mod.getSelectedIndex() == 3) {
            cmp = "Maruti Suzuki";
            mode = "Maruti Wagonr";
        } else if (cpy.getSelectedIndex() == 1 && mod.getSelectedIndex() == 4) {
            cmp = "Maruti Suzuki";
            mode = "Maruti Baleno";
        } else if (cpy.getSelectedIndex() == 1 && mod.getSelectedIndex() == 5) {
            cmp = "Maruti Suzuki";
            mode = "Maruti Alto";
        } else if (cpy.getSelectedIndex() == 2 && mod.getSelectedIndex() == 1) {
            cmp = "Honda";
            mode = "Honda Amaze";
        } else if (cpy.getSelectedIndex() == 2 && mod.getSelectedIndex() == 2) {
            cmp = "Honda";
            mode = "Honda Civic";
        } else if (cpy.getSelectedIndex() == 2 && mod.getSelectedIndex() == 3) {
            cmp = "Honda";
            mode = "Honda WRV";
        } else if (cpy.getSelectedIndex() == 2 && mod.getSelectedIndex() == 4) {
            cmp = "Honda";
            mode = "Honda Jazz";
        } else if (cpy.getSelectedIndex() == 3 && mod.getSelectedIndex() == 1) {
            cmp = "Tata Motors";
            mode = "Tata Nexon";
        } else if (cpy.getSelectedIndex() == 3 && mod.getSelectedIndex() == 2) {
            cmp = "Tata Motors";
            mode = "Tata Harrier";
        } else if (cpy.getSelectedIndex() == 3 && mod.getSelectedIndex() == 3) {
            cmp = "Tata Motors";
            mode = "Tata Tiago";
        } else if (cpy.getSelectedIndex() == 4 && mod.getSelectedIndex() == 1) {
            cmp = "Hyundai";
            mode = "Hyundai i20";
        } else if (cpy.getSelectedIndex() == 4 && mod.getSelectedIndex() == 2) {
            cmp = "Hyundai";
            mode = "Venue";
        } else if (cpy.getSelectedIndex() == 4 && mod.getSelectedIndex() == 3) {
            cmp = "Hyundai";
            mode = "Creta";
        } else if (cpy.getSelectedIndex() == 5 && mod.getSelectedIndex() == 1) {
            cmp = "Mahindra";
            mode = "Mahindra Scorpio";
        } else if (cpy.getSelectedIndex() == 5 && mod.getSelectedIndex() == 2) {
            cmp = "Mahindra";
            mode = "Mahindra XUV300";
        }
        if (fltp.getSelectedIndex() == 1) {
            fue = "Diesel";
        } else if (fltp.getSelectedIndex() == 2) {
            fue = "Petrol";
        } else if (fltp.getSelectedIndex() == 3) {
            fue = "Gas";
        }

        if (cpy.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(tab, "Select Comapny");
        } else if (mod.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(tab, "Select Model");
        } else if (fltp.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(tab, "Select Fuel Type");
        } else if (mil.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Milage");
        } else if (tps.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Top Speed");
        } else if (chno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Chassis No.");
        } else if (egno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Engine No.");
        } else if (col.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Color");
        } else if (deli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(tab, "Enter Cost");
        } else {
            DefaultTableModel model = (DefaultTableModel) tab.getModel();
            model.addRow(new Object[]{chno.getText(), egno.getText(), cst.getText(), col.getText(), mil.getText(), tps.getText(), cmp, mode, fue, deli.getText(), "null"});
        }

    }//GEN-LAST:event_save13ActionPerformed

    private void cpyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpyActionPerformed
        // TODO add your handling code here:
        if (cpy.getSelectedIndex() == 1) {
            mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Maruti Dzire", "Maruti Swift", "Maruti Wagonr", "Maruti Baleno", "Maruti Alto"}));
        } else if (cpy.getSelectedIndex() == 2) {
            mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Honda Amaze", "Honda Civic", "Honda WRV", "Honda Jazz"}));
        } else if (cpy.getSelectedIndex() == 3) {
            mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Tata Nexon", "Tata Harrier", "Tata Tiago"}));
        } else if (cpy.getSelectedIndex() == 4) {
            mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Hyundai i20", "Hyundai Venue", "Hyundai Creta"}));
        } else if (cpy.getSelectedIndex() == 5) {
            mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Mahindra Scorpio", "Mahindra XUV300"}));
        } else {
            mod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select"}));
        }

    }//GEN-LAST:event_cpyActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tabMouseClicked

    private void vhsbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhsbyActionPerformed
        // TODO add your handling code here:
        vDisplayTable();
        if (vhsby.getSelectedIndex() == 2) {
            vhsbyt.setText("Enter Engine No.");
        } else if (vhsby.getSelectedIndex() == 3) {
            vhsbyt.setText("Enter Company Name");
        } else if (vhsby.getSelectedIndex() == 4) {
            vhsbyt.setText("Enter Model Name");
        } else if (vhsby.getSelectedIndex() == 5) {
            vhsbyt.setText("Enter Color");
        } else if (vhsby.getSelectedIndex() == 6) {
            vhsbyt.setText("Enter Date of Entry");
        } else if (vhsby.getSelectedIndex() == 7) {
            vhsbyt.setText("Enter Fuel Type");
        } else if (vhsby.getSelectedIndex() == 1) {
            vhsbyt.setText("Enter Chassis No.");
        } else if (vhsby.getSelectedIndex() == 8) {
            vhsbyt.setText("Enter Dealer id");
        } else {
            vhsbyt.setEnabled(false);
            vhsbyt.setText("");

        }
        vDisplayTable();
    }//GEN-LAST:event_vhsbyActionPerformed

    private void vhsbytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vhsbytMouseClicked
        // TODO add your handling code here:
        if (vhsby.getSelectedIndex() == 0) {
            vhsbyt.setEnabled(false);
        } else {
            vhsbyt.setEnabled(true);
            vhsbyt.setText("");
            vhsbyt.requestFocus();
        }
    }//GEN-LAST:event_vhsbytMouseClicked

    private void vhsbytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhsbytActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhsbytActionPerformed

    private void searchicon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchicon2MouseClicked
        // TODO add your handling code here:
        if (vhsbyt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(vhsbyt, "Enter Data to Search");
        } else if (vhsby.getSelectedIndex() > 0) {
            if (vhsby.getSelectedIndex() == 1) {
                int kp = Integer.parseInt(vhsbyt.getText());

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from vehicle where chsno = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, kp);
                    ResultSet rs = pstmt.executeQuery();
                    vtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vhsbyt, "No Record Available");
                    }
                    /*
            if(rs.next())
            {
            JOptionPane.showMessageDialog(vhsbyt,"Record Found");
            }
            else
            JOptionPane.showMessageDialog(vhsbyt,"Record Not Found");
                     */
                    conn.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vhsbyt, "No data is Selected");
                }
            } else if (vhsby.getSelectedIndex() == 2) {
                int en = Integer.parseInt(vhsbyt.getText());
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from vehicle where engno = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, en);
                    ResultSet rs = pstmt.executeQuery();
                    vtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vhsbyt, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vhsbyt, e);

                }

            } else if (vhsby.getSelectedIndex() == 3) {
                String za = vhsbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from vehicle where cmpnynam = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vhsbyt, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vhsbyt, e);

                }

            } else if (vhsby.getSelectedIndex() == 4) {
                String za = vhsbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from vehicle where modnam = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vhsbyt, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vhsbyt, e);

                }

            } else if (vhsby.getSelectedIndex() == 5) {
                String za = vhsbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from vehicle where color = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vhsbyt, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vhsbyt, e);

                }

            } else if (vhsby.getSelectedIndex() == 6) {
                String za = vhsbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from vehicle where dateofentry = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vhsbyt, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vhsbyt, e);

                }

            } else if (vhsby.getSelectedIndex() == 7) {
                String za = vhsbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from vehicle where fueltyp = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    vtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vhsbyt, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vhsbyt, e);

                }

            } else if (vhsby.getSelectedIndex() == 8) {
                int de = Integer.parseInt(vhsbyt.getText());
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from vehicle where delid = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, de);
                    ResultSet rs = pstmt.executeQuery();
                    vtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (vtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(vhsbyt, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(vhsbyt, e);

                }
            }
        }
    }//GEN-LAST:event_searchicon2MouseClicked

    private void vhchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhchActionPerformed

    private void vhenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhenActionPerformed

    private void vhcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhcoActionPerformed

    private void vhstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhstActionPerformed

    private void vhdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhdeActionPerformed

    private void vhtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhtoActionPerformed

    private void vhmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhmiActionPerformed

    private void vhfuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhfuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhfuActionPerformed

    private void vhdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhdaActionPerformed

    private void vhclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhclActionPerformed

    private void vhctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhctActionPerformed

    private void vcupdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcupdate2ActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            String sql = "delete from vehicle where chsno = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(vhch.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(vhsbyt, "Record Deleted Successfully");
            vhsbyt.setText("");
            vhsbyt.setEnabled(false);
            vhch.setText("");
            vhco.setText("");
            vhen.setText("");
            vhst.setText("");
            vhfu.setText("");
            vhmi.setText("");
            vhto.setText("");
            vhde.setText("");
            vhda.setText("");
            vhcl.setText("");
            vhct.setText("");

            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vhsbyt, "No data is Selected");
        }

        vDisplayTable();


    }//GEN-LAST:event_vcupdate2ActionPerformed

    private void vcupdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcupdate3ActionPerformed
        // TODO add your handling code here:
        vhsbyt.setText("");
        vhsbyt.setEnabled(false);
        vhch.setText("");
        vhco.setText("");
        vhen.setText("");
        vhst.setText("");
        vhfu.setText("");
        vhmi.setText("");
        vhto.setText("");
        vhde.setText("");
        vhda.setText("");
        vhcl.setText("");
        vhct.setText("");

        vDisplayTable();
    }//GEN-LAST:event_vcupdate3ActionPerformed

    private void vcupdate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcupdate4ActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            String sql = "update vehicle set chsno=?,engno=?,cmpnynam=?,modnam=?,fueltyp=?,milage=?,topsp=?,delid=?,color=?,cost=? where chsno=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(vhch.getText()));
            pstmt.setInt(2, Integer.parseInt(vhen.getText()));
            pstmt.setString(3, vhco.getText());
            pstmt.setString(4, vhst.getText());
            pstmt.setString(5, vhfu.getText());
            pstmt.setInt(6, Integer.parseInt(vhmi.getText()));
            pstmt.setInt(7, Integer.parseInt(vhto.getText()));
            pstmt.setString(8, vhde.getText());
            pstmt.setString(9, vhcl.getText());
            pstmt.setInt(10, Integer.parseInt(vhct.getText()));
            pstmt.setInt(11, Integer.parseInt(vhch.getText()));

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(vhsbyt, "Record Updated Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vhsbyt, "No data is selected" + e);
        }

        vDisplayTable();

    }//GEN-LAST:event_vcupdate4ActionPerformed

    private void ReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportsMouseClicked
        // TODO add your handling code here:
        Home_main.removeAll();
        Home_main.repaint();
        Home_main.revalidate();

        Home_main.add(Report4);
        Home_main.repaint();
        Home_main.revalidate();
    }//GEN-LAST:event_ReportsMouseClicked

    private void cstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cstActionPerformed

    private void vtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vtableMouseClicked
        // TODO add your handling code here:
        int i = vtable.getSelectedRow();
        TableModel mod = vtable.getModel();
        vhch.setText(mod.getValueAt(i, 0).toString());
        vhen.setText(mod.getValueAt(i, 1).toString());
        vhcl.setText(mod.getValueAt(i, 2).toString());
        vhct.setText(mod.getValueAt(i, 3).toString());
        vhda.setText(mod.getValueAt(i, 4).toString());
        vhmo.setText(mod.getValueAt(i, 5).toString());
        vhco.setText(mod.getValueAt(i, 6).toString());
        vhmi.setText(mod.getValueAt(i, 7).toString());
        vhto.setText(mod.getValueAt(i, 8).toString());
        vhfu.setText(mod.getValueAt(i, 9).toString());
        vhde.setText(mod.getValueAt(i, 10).toString());
        vhst.setText(mod.getValueAt(i, 11).toString());

    }//GEN-LAST:event_vtableMouseClicked

    private void vtableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vtableKeyReleased
        // TODO add your handling code here:
        int i = vtable.getSelectedRow();
        TableModel mod = vtable.getModel();
        vhch.setText(mod.getValueAt(i, 0).toString());
        vhen.setText(mod.getValueAt(i, 1).toString());
        vhcl.setText(mod.getValueAt(i, 2).toString());
        vhct.setText(mod.getValueAt(i, 3).toString());
        vhda.setText(mod.getValueAt(i, 4).toString());
        vhst.setText(mod.getValueAt(i, 5).toString());
        vhco.setText(mod.getValueAt(i, 6).toString());
        vhmi.setText(mod.getValueAt(i, 7).toString());
        vhto.setText(mod.getValueAt(i, 8).toString());
        vhfu.setText(mod.getValueAt(i, 9).toString());
        vhde.setText(mod.getValueAt(i, 10).toString());

    }//GEN-LAST:event_vtableKeyReleased

    private void enameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enameKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            efathername.requestFocus();
        }
    }//GEN-LAST:event_enameKeyPressed

    private void giKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_giKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                String sql = "select emplyid from employee order by emplyid desc limit 1";
                PreparedStatement pstmt = conn.prepareStatement(sql);

                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    String gc = rs.getString("emplyid");
                    int gcn = Integer.parseInt(gc);
                    gcn++;

                    emplyid.setText(Integer.toString(gcn));
                    emplyid.setEnabled(false);
                } else {
                    emplyid.setText("1");
                }

                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this.vecreg1, "Unable to generate Id");
            }
            efathername.setText("");
            efathername.requestFocus();
        }
    }//GEN-LAST:event_giKeyPressed

    private void emobnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emobnumberKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            esalary.setText("");
            esalary.requestFocus();
        }
    }//GEN-LAST:event_emobnumberKeyPressed

    private void esalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esalaryKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            designation.setText("");
            designation.requestFocus();
        }
    }//GEN-LAST:event_esalaryKeyPressed

    private void designationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_designationKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            edateofjoin.setText("");
            edateofjoin.requestFocus();
        }
    }//GEN-LAST:event_designationKeyPressed

    private void edateofjoinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edateofjoinKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            eaddress.setText("");
            eaddress.requestFocus();
        }
    }//GEN-LAST:event_edateofjoinKeyPressed

    private void eaddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eaddressKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            ecity.setText("");
            ecity.requestFocus();
        }
    }//GEN-LAST:event_eaddressKeyPressed

    private void ecityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ecityKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            eemail.setText("");
            eemail.requestFocus();
        }
    }//GEN-LAST:event_ecityKeyPressed

    private void eemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eemailKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            eaddharno.setText("");
            eaddharno.requestFocus();
        }
    }//GEN-LAST:event_eemailKeyPressed

    private void eaddharnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eaddharnoKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            edob.setText("");
            edob.requestFocus();
        }
    }//GEN-LAST:event_eaddharnoKeyPressed

    private void edobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edobKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            epannum.setText("");
            epannum.requestFocus();
        }
    }//GEN-LAST:event_edobKeyPressed

    private void vhmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vhmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vhmoActionPerformed

    private void Addc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Addc1MouseClicked
        // TODO add your handling code here:
        SaleMain.removeAll();
        SaleMain.repaint();
        SaleMain.revalidate();

        SaleMain.add(AddSale);
        SaleMain.repaint();
        SaleMain.revalidate();
    }//GEN-LAST:event_Addc1MouseClicked

    private void Addc1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Addc1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Addc1MouseEntered

    private void Addc1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Addc1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Addc1MouseExited

    private void Searchc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Searchc1MouseClicked
        // TODO add your handling code here:
        SaleMain.removeAll();
        SaleMain.repaint();
        SaleMain.revalidate();

        SaleMain.add(ViewSale);
        SaleMain.repaint();
        SaleMain.revalidate();
        sDisplayTable();
    }//GEN-LAST:event_Searchc1MouseClicked

    private void Searchc1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Searchc1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Searchc1MouseEntered

    private void Searchc1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Searchc1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Searchc1MouseExited

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select sid from sale order by sid desc limit 1";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String gc = rs.getString("sid");
                int gcn = Integer.parseInt(gc);
                gcn++;

                sid.setText(Integer.toString(gcn));
                sid.setEditable(false);
                sch.requestFocus();
            } else {
                sid.setText("1");
                sid.setEditable(false);
            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(scn, "Unable To generate Id");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void schcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schcActionPerformed
        // TODO add your handling code here:

        if (sch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(scn, "Enter Chassis Number");
            schc.setSelected(false);
        } else {
            int kp = Integer.parseInt(sch.getText());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                String sql = "select chsno,cmpnynam,modnam,engno,cost,status from vehicle where chsno = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, kp);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {

                    // sch.setText(Integer.toString(rs.getInt("chsno")));
                    String sck = rs.getString("status");
                    String scks = "Sold";

                    if (sck.equals(scks)) {
                        JOptionPane.showMessageDialog(scn, "Vehicle already sold");
                        schc.setSelected(false);
                        sch.setText("");

                    } else {
                        svc.setText(rs.getString("cmpnynam"));
                        svm.setText(rs.getString("modnam"));
                        sen.setText(Integer.toString(rs.getInt("engno")));
                        svct.setText(Integer.toString(rs.getInt("cost")));
                    }
                } else {
                    JOptionPane.showMessageDialog(scn, "Record not Found");
                    sch.setText("");
                    schc.setSelected(false);

                }

                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(scn, "No data is Selected");
            }
        }
    }//GEN-LAST:event_schcActionPerformed

    private void schMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schMouseClicked
        // TODO add your handling code here:
        sch.setText("");
        schc.setSelected(false);
        svc.setText("");
        svm.setText("");
        sen.setText("");
        svct.setText("");


    }//GEN-LAST:event_schMouseClicked

    private void scidcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scidcActionPerformed
        // TODO add your handling code here:

        if (scid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(scn, "Enter Customer id");
            scidc.setSelected(false);
        } else {
            int kp = Integer.parseInt(scid.getText());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                String sql = "select cid,cname,caddharno from customer where cid = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, kp);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {

                    scid.setText(Integer.toString(rs.getInt("cid")));
                    scn.setText(rs.getString("cname"));
                    scaa.setText(rs.getString("caddharno"));

                } else {
                    JOptionPane.showMessageDialog(scn, "Record not Found");
                    scid.setText("");
                    scidc.setSelected(false);

                }

                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(scn, "No data is Selected");
            }
        }
    }//GEN-LAST:event_scidcActionPerformed

    private void scidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scidMouseClicked
        // TODO add your handling code here:
        scid.setText("");
        scidc.setSelected(false);
        scn.setText("");
        scaa.setText("");

    }//GEN-LAST:event_scidMouseClicked

    private void ssidcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssidcActionPerformed
        // TODO add your handling code here:

        if (ssid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(scn, "Enter Salesman id");
            ssidc.setSelected(false);
        } else {
            int kp = Integer.parseInt(ssid.getText());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                String sql = "select emplyid,ename from employee where emplyid = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, kp);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {

                    ssid.setText(Integer.toString(rs.getInt("emplyid")));
                    ssn.setText(rs.getString("ename"));

                } else {
                    JOptionPane.showMessageDialog(scn, "Record not Found");
                    ssid.setText("");
                    ssidc.setSelected(false);

                }

                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(scn, "No data is Selected");
            }
        }
    }//GEN-LAST:event_ssidcActionPerformed

    private void ssidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssidMouseClicked
        // TODO add your handling code here:
        ssid.setText("");
        ssidc.setSelected(false);
        ssn.setText("");

    }//GEN-LAST:event_ssidMouseClicked

    private void adcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcActionPerformed
        // TODO add your handling code here:

        if (scid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(scn, "Customer id is empty");
        } else {
            int kp = Integer.parseInt(scid.getText());

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                String sql = "select caddress from customer where cid = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, kp);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {

                    sda.setText(rs.getString("caddress"));

                } else {
                    JOptionPane.showMessageDialog(scn, "Record not Found");
                }

                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(scn, "No data is Selected");
            }
        }
    }//GEN-LAST:event_adcActionPerformed

    private void sdatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdatKeyReleased
        // TODO add your handling code here:

        srat.setText(Integer.toString(Integer.parseInt(svct.getText()) - Integer.parseInt(sdat.getText())));
    }//GEN-LAST:event_sdatKeyReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:

        if (bil.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this.billing, "Please add data");
        } else {
            this.setExtendedState(Navbar.ICONIFIED);
            try {
                bil.print();
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(this.billing, ex);
            }
        }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        bil.setText("");

        if (sdd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(ssn, "Deliver Date is Empty");

        } else if (sda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(ssn, "Deliver Address is Empty");
        } else if (sdi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(ssn, "Dealer Id is Empty");
        } else if (sdi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(ssn, "Enter Deposite Amount");
        } else if (!conf.isSelected()) {
            JOptionPane.showMessageDialog(ssn, "Check the Confirm Checkbox");
        } else {

            try {
                try {
                    if (paym.getSelectedIndex() == 1) {
                        c = "Cash";
                    } else if (paym.getSelectedIndex() == 2) {
                        c = "Cheque";
                    }
                    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
                    String qry = "insert into sale(sid,vehid,cstid,empid,vehicost,purchdate,depamnt,remamnt,delvdate,paymode)values(?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement st = con.prepareStatement(qry);
                    st.setInt(1, Integer.parseInt(sid.getText()));
                    st.setInt(2, Integer.parseInt(sch.getText()));
                    st.setInt(3, Integer.parseInt(scid.getText()));
                    st.setInt(4, Integer.parseInt(ssid.getText()));
                    st.setInt(5, Integer.parseInt(svct.getText()));
                    st.setString(6, spd.getText());
                    st.setInt(7, Integer.parseInt(sdat.getText()));
                    st.setInt(8, Integer.parseInt(srat.getText()));
                    st.setString(9, sdd.getText());
                    st.setString(10, c);

                    String sqlu = "update vehicle set status = 'Sold' where chsno = ?";
                    PreparedStatement pstmtu = con.prepareStatement(sqlu);
                    pstmtu.setInt(1, Integer.parseInt(sch.getText()));

                    st.executeUpdate();
                    pstmtu.executeUpdate();
                    JOptionPane.showMessageDialog(ssn, "data added successfully");
                    SaleMain.removeAll();
                    SaleMain.repaint();
                    SaleMain.revalidate();

                    SaleMain.add(billing);
                    SaleMain.repaint();
                    SaleMain.revalidate();

                    if (bil.getText().isEmpty()) {
                        int kpc = Integer.parseInt(sch.getText());
                        int kp = Integer.parseInt(scid.getText());
                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                            String sql = "select bilid from bill order by bilid desc limit 1";
                            PreparedStatement pstmt = conn.prepareStatement(sql);

                            ResultSet rs = pstmt.executeQuery();

                            if (rs.next()) {
                                String gc = rs.getString("bilid");
                                gcn = Integer.parseInt(gc);
                                gcn++;

                            } else {
                                gcn = 1;
                            }

                            conn.close();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(ssn, "Unable To generate Id");
                        }

                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                            String sql = "select cname,cfathername,caddress,mobnumber from customer where cid = ?";
                            PreparedStatement pstmt = conn.prepareStatement(sql);
                            pstmt.setInt(1, kp);
                            ResultSet rs = pstmt.executeQuery();

                            String sqlp = "select chsno,cmpnynam,modnam,engno,fueltyp from vehicle where chsno = ?";
                            PreparedStatement pstmtp = conn.prepareStatement(sqlp);
                            pstmtp.setInt(1, kpc);
                            ResultSet rsp = pstmtp.executeQuery();

                            String sqlpb = "Insert into bill(bilid,sid,cid,chsno,emplyid,bdate)values(?,?,?,?,?,?)";
                            PreparedStatement pstmtpb = conn.prepareStatement(sqlpb);
                            pstmtpb.setInt(1, gcn);
                            pstmtpb.setInt(2, Integer.parseInt(sid.getText()));
                            pstmtpb.setInt(3, Integer.parseInt(scid.getText()));
                            pstmtpb.setInt(4, Integer.parseInt(sch.getText()));
                            pstmtpb.setInt(5, Integer.parseInt(ssid.getText()));
                            pstmtpb.setString(6, spd.getText());

                            pstmtpb.executeUpdate();

                            if (rs.next() && rsp.next()) {

                                bil.setText(bil.getText() + "\nAUTOHUB MOTORS\t\t         CAR SHOWROOM\n243, A.B. Road DEWAS 455001(M.P.)\t         Ph : 222176,407072\nE-mail : khuranmotors@gmail.com\t         Date :- \n-------------------------------------------------------------------------------------------------------------");
                                bil.setText(bil.getText() + "\nCUSTOMER DETAILS :-\t\tRecipt No. : " + gcn);
                                bil.setText(bil.getText() + "\nCustomer Name : " + rs.getString("cname"));
                                bil.setText(bil.getText() + "\nFather Name : " + rs.getString("cfathername"));
                                bil.setText(bil.getText() + "\nAddress : " + rs.getString("caddress"));
                                bil.setText(bil.getText() + "\nMob No : " + rs.getString("mobnumber"));
                                bil.setText(bil.getText() + "\n------------------------------------------------------------------------------------------------------------");
                                bil.setText(bil.getText() + "\nVEHICLE DETAILS :-");
                                bil.setText(bil.getText() + "\nChassis No. : " + rsp.getInt("chsno"));
                                bil.setText(bil.getText() + "\n\nCompany : " + rsp.getString("cmpnynam"));
                                bil.setText(bil.getText() + "\n\nFuel Type : " + rsp.getString("fueltyp"));
                                bil.setText(bil.getText() + "\n\nModel No. : " + rsp.getString("modnam"));
                                bil.setText(bil.getText() + "\n\nEngine No. : " + rsp.getInt("engno"));
                                bil.setText(bil.getText() + "\n------------------------------------------------------------------------------------------------------------");
                                bil.setText(bil.getText() + "\nOTHER DETAILS :-");
                                bil.setText(bil.getText() + "\nM.R No.: ");
                                bil.setText(bil.getText() + "\nM.R Date : ");
                                bil.setText(bil.getText() + "\nTin No.: ");
                                bil.setText(bil.getText() + "\n------------------------------------------------------------------------------------------------------------");
                                bil.setText(bil.getText() + "\nPAYMENT DETAILS :-");
                                bil.setText(bil.getText() + "\nVehicle Cost Rs.: " + Integer.parseInt(svct.getText()));
                                bil.setText(bil.getText() + "\nDeposite Amount : " + Integer.parseInt(sdat.getText()));
                                bil.setText(bil.getText() + "\nRemaining Amount : " + Integer.parseInt(srat.getText()));
                                bil.setText(bil.getText() + "\nTOTAL Rs.: " + Integer.parseInt(sdat.getText()));
                                bil.setText(bil.getText() + "\n\t\t\t              For AutoHub Motors ");
                                bil.setText(bil.getText() + "\n\n\nCustomer's Signature\t\t             Authorised Signature");

                            } else {
                                JOptionPane.showMessageDialog(bil, "Record not Found");
                            }

                            conn.close();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(bil, "No data is Selected" + e);
                        }

                    }
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Navbar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (SQLException ex) {
                //Logger.getLogger(DataToMysql.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(ssn, ex);
            }
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confActionPerformed
        // TODO add your handling code here:
        if (sid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(ssn, "Generate Sale Id");
            conf.setSelected(false);
        } else if (paym.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(ssn, "Select Payment Mode");
            conf.setSelected(false);
        } else if (sch.getText().isEmpty() || scid.getText().isEmpty() || ssid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(ssn, "Fill Up Above Information Properly.");
            conf.setSelected(false);
        } else if (!schc.isSelected() || !scidc.isSelected() || !ssidc.isSelected()) {
            JOptionPane.showMessageDialog(ssn, "Check the above Chek Box.");
            conf.setSelected(false);
        } else {
            conf.setSelected(true);
            sdd.setEnabled(true);
            sda.setEnabled(true);
            spd.setEnabled(true);
            sdi.setEnabled(true);
            svct.setEnabled(true);
            sdat.setEnabled(true);
            srat.setEnabled(true);

        }
    }//GEN-LAST:event_confActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        sid.setText("");
        sch.setText("");
        scid.setText("");
        ssid.setText("");
        svc.setText("");
        scn.setText("");
        ssn.setText("");
        svm.setText("");
        scaa.setText("");
        sen.setText("");
        sdd.setText("");
        sda.setText("");
        sdi.setText("");
        svct.setText("");
        sdat.setText("");
        srat.setText("");
        schc.setSelected(false);
        scidc.setSelected(false);
        ssidc.setSelected(false);
        conf.setSelected(false);
        adc.setSelected(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void ssbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssbyActionPerformed
        // TODO add your handling code here:
        if (ssby.getSelectedIndex() == 2) {
            ssbyt.setText("Enter Vehicle Number");
        } else if (ssby.getSelectedIndex() == 3) {
            ssbyt.setText("Enter Customer Id");
        } else if (ssby.getSelectedIndex() == 4) {
            ssbyt.setText("Enter Salesman Id");
        } else if (ssby.getSelectedIndex() == 1) {
            ssbyt.setText("Enter Sale ID");
        } else {
            ssbyt.setEnabled(false);
            ssbyt.setText("");

        }
        sDisplayTable();
    }//GEN-LAST:event_ssbyActionPerformed

    private void ssbytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssbytMouseClicked
        // TODO add your handling code here:
        if (ssby.getSelectedIndex() == 0) {
            ssbyt.setEnabled(false);
        } else {
            ssbyt.setEnabled(true);
            ssbyt.setText("");
            ssbyt.requestFocus();
        }
    }//GEN-LAST:event_ssbytMouseClicked

    private void ssbytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssbytActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssbytActionPerformed

    private void searchicon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchicon3MouseClicked
        // TODO add your handling code here:

        int za = Integer.parseInt(ssbyt.getText());
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            if (ssby.getSelectedIndex() == 1) {
                String sql = "select * from sale where sid = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, za);
                ResultSet rs = pstmt.executeQuery();

                stable.setModel(DbUtils.resultSetToTableModel(rs));
                if (stable.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(ssbyt, "No Record Available");
                }
            } else if (ssby.getSelectedIndex() == 2) {
                String sql = "select * from sale where vehid = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, za);
                ResultSet rs = pstmt.executeQuery();

                stable.setModel(DbUtils.resultSetToTableModel(rs));
                if (stable.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(ssbyt, "No Record Available");
                }
            } else if (ssby.getSelectedIndex() == 3) {
                String sql = "select * from sale where cstid = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, za);
                ResultSet rs = pstmt.executeQuery();

                stable.setModel(DbUtils.resultSetToTableModel(rs));
                if (stable.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(ssbyt, "No Record Available");
                }
            } else if (ssby.getSelectedIndex() == 4) {
                String sql = "select * from sale where empid = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, za);
                ResultSet rs = pstmt.executeQuery();

                stable.setModel(DbUtils.resultSetToTableModel(rs));
                if (stable.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(ssbyt, "No Record Available");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(vccu, e);

        }


    }//GEN-LAST:event_searchicon3MouseClicked

    private void vsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsemActionPerformed

    private void vcupdate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcupdate5ActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            String sql = "update sale set depamnt = ? , remamnt = ? where sid=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(vsdp.getText()));
            pstmt.setInt(2, Integer.parseInt(vsre.getText()));
            pstmt.setInt(3, Integer.parseInt(vssa.getText()));

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(ssbyt, "Record Updated Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(ssbyt, "No data is selected");
        }

        sDisplayTable();

    }//GEN-LAST:event_vcupdate5ActionPerformed

    private void vcdelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcdelete2ActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            String sql = "delete from sale where sid = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(vssa.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(ssbyt, "Record Deleted Successfully");
            ssbyt.setText("");
            vssa.setText("");
            vscu.setText("");
            vsem.setText("");
            vsvi.setText("");
            vspu.setText("");
            vsct.setText("");
            vsen.setText("");
            vsvc.setText("");
            vsde.setText("");
            vspa.setText("");
            vsve.setText("");
            vsvm.setText("");
            vsdp.setText("");
            vsre.setText("");

            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(ssbyt, "No data is Selected");
        }

        sDisplayTable();


    }//GEN-LAST:event_vcdelete2ActionPerformed

    private void vcreset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcreset2ActionPerformed
        // TODO add your handling code here:
        ssbyt.setText("");
        vssa.setText("");
        vscu.setText("");
        vsem.setText("");
        vsvi.setText("");
        vspu.setText("");
        vsct.setText("");
        vsen.setText("");
        vsvc.setText("");
        vsde.setText("");
        vspa.setText("");
        vsve.setText("");
        vsvm.setText("");
        vsdp.setText("");
        vsre.setText("");

    }//GEN-LAST:event_vcreset2ActionPerformed

    private void vssaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vssaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vssaActionPerformed

    private void vscuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vscuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vscuActionPerformed

    private void vsviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsviActionPerformed

    private void vspuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vspuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vspuActionPerformed

    private void vsctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsctActionPerformed

    private void vsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsenActionPerformed

    private void vsvcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsvcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsvcActionPerformed

    private void vsdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsdeActionPerformed

    private void vspaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vspaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vspaActionPerformed

    private void vsveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsveActionPerformed

    private void vsvmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsvmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsvmActionPerformed

    private void vsdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsdpActionPerformed

    private void vsreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vsreActionPerformed

    private void stableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stableMouseClicked
        // TODO add your handling code here:
        int i = stable.getSelectedRow();
        TableModel mod = stable.getModel();
        vssa.setText(mod.getValueAt(i, 0).toString());
        vsvi.setText(mod.getValueAt(i, 1).toString());
        vscu.setText(mod.getValueAt(i, 2).toString());
        vsem.setText(mod.getValueAt(i, 3).toString());
        vsve.setText(mod.getValueAt(i, 4).toString());
        vspu.setText(mod.getValueAt(i, 5).toString());
        vsdp.setText(mod.getValueAt(i, 6).toString());
        vsre.setText(mod.getValueAt(i, 7).toString());
        vsde.setText(mod.getValueAt(i, 8).toString());
        vspa.setText(mod.getValueAt(i, 9).toString());

        int kp = Integer.parseInt(mod.getValueAt(i, 2).toString());
        int kpe = Integer.parseInt(mod.getValueAt(i, 3).toString());
        int kpv = Integer.parseInt(mod.getValueAt(i, 1).toString());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select cname from customer where cid = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, kp);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                vsct.setText(rs.getString("cname"));

            } else {
                JOptionPane.showMessageDialog(ssby, "Name not Found");
            }

            String sqle = "select ename from employee where emplyid = ?";
            PreparedStatement pstmte = conn.prepareStatement(sqle);
            pstmte.setInt(1, kpe);
            ResultSet rse = pstmte.executeQuery();

            if (rse.next()) {

                vsen.setText(rse.getString("ename"));

            } else {
                JOptionPane.showMessageDialog(ssby, "Name not Found");
            }

            String sqlv = "select cmpnynam,modnam from vehicle where chsno = ?";
            PreparedStatement pstmtv = conn.prepareStatement(sqlv);
            pstmtv.setInt(1, kpv);
            ResultSet rsv = pstmtv.executeQuery();

            if (rsv.next()) {

                vsvc.setText(rsv.getString("cmpnynam"));
                vsvm.setText(rsv.getString("modnam"));

            } else {
                JOptionPane.showMessageDialog(ssby, "Name not Found");
            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(ssby, "Name not Found" + e);
        }


    }//GEN-LAST:event_stableMouseClicked

    private void stableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stableKeyReleased
        // TODO add your handling code here:
        int i = stable.getSelectedRow();
        TableModel mod = stable.getModel();
        vssa.setText(mod.getValueAt(i, 0).toString());
        vsvi.setText(mod.getValueAt(i, 1).toString());
        vscu.setText(mod.getValueAt(i, 2).toString());
        vsem.setText(mod.getValueAt(i, 3).toString());
        vsve.setText(mod.getValueAt(i, 4).toString());
        vspu.setText(mod.getValueAt(i, 5).toString());
        vsdp.setText(mod.getValueAt(i, 6).toString());
        vsre.setText(mod.getValueAt(i, 7).toString());
        vsde.setText(mod.getValueAt(i, 8).toString());
        vspa.setText(mod.getValueAt(i, 9).toString());

        int kp = Integer.parseInt(mod.getValueAt(i, 2).toString());
        int kpe = Integer.parseInt(mod.getValueAt(i, 3).toString());
        int kpv = Integer.parseInt(mod.getValueAt(i, 1).toString());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select cname from customer where cid = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, kp);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {

                vsct.setText(rs.getString("cname"));

            } else {
                JOptionPane.showMessageDialog(ssby, "Name not Found");
            }

            String sqle = "select ename from employee where emplyid = ?";
            PreparedStatement pstmte = conn.prepareStatement(sqle);
            pstmte.setInt(1, kpe);
            ResultSet rse = pstmte.executeQuery();

            if (rse.next()) {

       
            } else {
                JOptionPane.showMessageDialog(ssby, "Name not Found");
            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(ssby, "Name not Found" + e);
        }


    }//GEN-LAST:event_stableKeyReleased

    private void schKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_schKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            scid.setText("");
            scid.requestFocus();
        }

    }//GEN-LAST:event_schKeyPressed

    private void scidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scidKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {
            ssid.setText("");
            ssid.requestFocus();
        }
    }//GEN-LAST:event_scidKeyPressed

    private void vscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vscActionPerformed
        // TODO add your handling code here:
        if (vsc.getSelectedIndex() == 1) {
            vsm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Maruti Dzire", "Maruti Swift", "Maruti Wagonr", "Maruti Baleno", "Maruti Alto"}));
        } else if (vsc.getSelectedIndex() == 2) {
            vsm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Honda Amaze", "Honda Civic", "Honda WRV", "Honda Jazz"}));
        } else if (vsc.getSelectedIndex() == 3) {
            vsm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Tata Nexon", "Tata Harrier", "Tata Tiago"}));
        } else if (vsc.getSelectedIndex() == 4) {
            vsm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Hyundai i20", "Hyundai Venue", "Hyundai Creta"}));
        } else if (vsc.getSelectedIndex() == 5) {
            vsm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select", "Mahindra Scorpio", "Mahindra XUV300"}));
        } else {
            vsm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select"}));
        }

    }//GEN-LAST:event_vscActionPerformed

    private void sdatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdatKeyPressed
        // TODO add your handling code here:
        if (Integer.parseInt(sdat.getText()) == 0) {
            sdat.setText("");

        } else if (sdat.getText().isEmpty()) {
            sdat.setText("0");
        }
    }//GEN-LAST:event_sdatKeyPressed

    private void sdatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdatMouseClicked
        // TODO add your handling code here:
        if (Integer.parseInt(sdat.getText()) == 0) {
            sdat.setText("");

        }
    }//GEN-LAST:event_sdatMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:

        if (rep.getText().isEmpty()) {
            JOptionPane.showMessageDialog(fnt, "Please add data");
        } else {
            this.setExtendedState(Navbar.ICONIFIED);
            try {
                rep.print();
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(fnt, ex);
            }
        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void qsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qsrActionPerformed
        // TODO add your handling code here:

        if (qsr.isSelected()) {
            cnt.setText("");
            fnt.setText("");
            pdt.setText("");
            vnt.setText("");
            rep.setText("");
            cnt.setEnabled(true);
            fnt.setEnabled(true);
            pdt.setEnabled(true);
            vnt.setEnabled(true);
            mnt.setEnabled(true);
        } else {
            cnt.setEnabled(false);
            fnt.setEnabled(false);
            pdt.setEnabled(false);
            vnt.setEnabled(false);
            mnt.setEnabled(false);
        }

    }//GEN-LAST:event_qsrActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        // TODO add your handling code here:
        int kp = Integer.parseInt(vnt.getText());

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select chsno,engno,color,cost,modnam,cmpnynam,milage,topsp,fueltyp from vehicle where chsno = ? and status='null'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, kp);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {

                rep.setText(rep.getText() + "\nAUTOHUB MOTORS\t\t         CAR SHOWROOM\n243, A.B. Road DEWAS 455001(M.P.)\t         Ph : 222176,407072\nE-mail : khuranmotors@gmail.com\t         Date :- \n-------------------------------------------------------------------------------------------------------------");
                rep.setText(rep.getText() + "\n\t\tQuatation Slip");

                rep.setText(rep.getText() + "\n------------------------------------------------------------------------------------------------------------");

                rep.setText(rep.getText() + "\nCUSTOMER DETAILS :-");
                rep.setText(rep.getText() + "\nCustomer Name : " + cnt.getText());
                rep.setText(rep.getText() + "\nFather Name : " + fnt.getText());
                rep.setText(rep.getText() + "\nMobile Number : " + mnt.getText());
                rep.setText(rep.getText() + "\nPurchase Date : " + pdt.getText());

                rep.setText(rep.getText() + "\nVEHICLE DETAILS :-");
                rep.setText(rep.getText() + "\n\nChassis No. : " + rs.getInt("chsno"));
                rep.setText(rep.getText() + "\n\nCompany : " + rs.getString("cmpnynam"));
                rep.setText(rep.getText() + "\n\nFuel Type : " + rs.getString("fueltyp"));
                rep.setText(rep.getText() + "\n\nModel No. : " + rs.getString("modnam"));
                rep.setText(rep.getText() + "\n\nEngine No. : " + rs.getInt("engno"));
                rep.setText(rep.getText() + "\n\nColour : " + rs.getString("color"));
                rep.setText(rep.getText() + "\n\nCost : " + rs.getString("cost"));
                rep.setText(rep.getText() + "\n\nMilage : " + rs.getString("milage") + " Km/h");
                rep.setText(rep.getText() + "\n\nTop Speed : " + rs.getInt("topsp"));

                rep.setText(rep.getText() + "\n\t\t\t              For AutoHub Motors ");
                rep.setText(rep.getText() + "\n\n\nCustomer's Signature\t\t             Authorised Signature");

            } else {
                JOptionPane.showMessageDialog(rep, "Record not Found");
            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rep, "No data is Selected");
        }

    }//GEN-LAST:event_reset1ActionPerformed

    private void DealerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DealerMouseClicked
        // TODO add your handling code here:
        Home_main.removeAll();
        Home_main.repaint();
        Home_main.revalidate();

        Home_main.add(Dealer8);
        Home_main.repaint();
        Home_main.revalidate();
    }//GEN-LAST:event_DealerMouseClicked

    private void DealerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DealerMouseEntered
        // TODO add your handling code here:
        Dealer.setBackground(Color.GREEN);
    }//GEN-LAST:event_DealerMouseEntered

    private void DealerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DealerMouseExited
        // TODO add your handling code here:
        Dealer.setBackground(new Color(0, 102, 0));
    }//GEN-LAST:event_DealerMouseExited

    private void Addc2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Addc2MouseClicked
        // TODO add your handling code here:
        dealermain1.removeAll();
        dealermain1.repaint();
        dealermain1.revalidate();

        dealermain1.add(registration1);
        dealermain1.repaint();
        dealermain1.revalidate();
    }//GEN-LAST:event_Addc2MouseClicked

    private void Addc2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Addc2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Addc2MouseEntered

    private void Addc2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Addc2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Addc2MouseExited

    private void Searchc2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Searchc2MouseClicked
        // TODO add your handling code here:
        dealermain1.removeAll();
        dealermain1.repaint();
        dealermain1.revalidate();

        dealermain1.add(Searchdealer1);
        dealermain1.repaint();
        dealermain1.revalidate();
        dDisplayTable();
    }//GEN-LAST:event_Searchc2MouseClicked

    private void Searchc2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Searchc2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Searchc2MouseEntered

    private void Searchc2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Searchc2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Searchc2MouseExited

    private void damoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_damoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_damoActionPerformed

    private void daadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daadActionPerformed

    private void daadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daadKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            daci.requestFocus();
        }
    }//GEN-LAST:event_daadKeyPressed

    private void daciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daciActionPerformed

    private void daciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daciKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_daciKeyPressed

    private void daemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daemActionPerformed

    private void daemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daemKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            daad.requestFocus();
        }
    }//GEN-LAST:event_daemKeyPressed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:

        if (dadi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(damo, "Dealer Id is empty.");

        } else if (dade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(damo, "Dealer Name is empty.");

        } else if (daco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(damo, "Company Name is empty.");

        } else if (damo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(damo, "Mobile Number is empty.");

        } else if (dala.getText().isEmpty()) {
            JOptionPane.showMessageDialog(damo, "Ladline is empty.");

        } else if (daem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(damo, "Email Id is empty.");

        } else if (daad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(damo, "Address is empty.");

        } else if (daci.getText().isEmpty()) {
            JOptionPane.showMessageDialog(damo, "City is empty.");

        } else {

            int n = Integer.parseInt(dadi.getText());
            String nam = dade.getText();
            String fnam = daco.getText();
            String cadd = damo.getText();
            String ccty = dala.getText();
            String cem = daem.getText();
            String caddh = daad.getText();
            String cpann = daci.getText();

            try {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
                    String qry = "insert into dealer(delid,dname,compnynam,smobnum,ladnum,demail,daddress,dcity)values(?,?,?,?,?,?,?,?)";
                    PreparedStatement st = con.prepareStatement(qry);
                    st.setInt(1, n);
                    st.setString(2, nam);
                    st.setString(3, fnam);
                    st.setString(4, cadd);
                    st.setString(5, ccty);
                    st.setString(6, cem);
                    st.setString(7, caddh);
                    st.setString(8, cpann);

                    st.executeUpdate();
                    JOptionPane.showMessageDialog(damo, "data added successfully");
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    Logger.getLogger(Navbar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (SQLException ex) {
                //Logger.getLogger(DataToMysql.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(damo, ex);
            }
        }
    }//GEN-LAST:event_save1ActionPerformed

    private void dadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dadeActionPerformed

    private void dadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadeKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            daco.requestFocus();
        }
    }//GEN-LAST:event_dadeKeyPressed

    private void reset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset2ActionPerformed
        // TODO add your handling code here:
        dadi.setText("");
        dade.setText("");
        daco.setText("");
        damo.setText("");
        dala.setText("");
        daem.setText("");
        daad.setText("");
        daci.setText("");

    }//GEN-LAST:event_reset2ActionPerformed

    private void dalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dalaActionPerformed

    private void dalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dalaKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            daem.requestFocus();
        }
    }//GEN-LAST:event_dalaKeyPressed

    private void dacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dacoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dacoActionPerformed

    private void dacoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dacoKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            damo.requestFocus();
        }
    }//GEN-LAST:event_dacoKeyPressed

    private void dadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dadiActionPerformed

    private void dadiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dadiKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

            String sql = "select delid from dealer order by delid desc limit 1";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String gc = rs.getString("delid");
                int gcn = Integer.parseInt(gc);
                gcn++;

                dadi.setText(Integer.toString(gcn));
                dadi.setEditable(false);
                dade.requestFocus();
            } else {
                dadi.setText("1");
            }

            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(damo, "Unable to generate id");
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void dsbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsbyActionPerformed
        // TODO add your handling code here:
        if (dsby.getSelectedIndex() == 1) {
            dsbyt.setText("Enter dealer Id");
        } else if (dsby.getSelectedIndex() == 2) {
            dsbyt.setText("Enter Dealer Name");
        } else if (dsby.getSelectedIndex() == 3) {
            dsbyt.setText("Enter Comany name");
        } else if (dsby.getSelectedIndex() == 4) {
            dsbyt.setText("Enter City");
        } else {
            dsbyt.setEnabled(false);
            dsbyt.setText("");

        }
        dDisplayTable();
    }//GEN-LAST:event_dsbyActionPerformed

    private void ddiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddiActionPerformed

    private void searchicon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchicon4MouseClicked
        // TODO add your handling code here:
        if (dsbyt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(dsbyt, "Enter Data to Search");
        } else if (dsby.getSelectedIndex() > 0) {
            if (dsby.getSelectedIndex() == 1) {
                int kp = Integer.parseInt(dsbyt.getText());

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from dealer where delid = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setInt(1, kp);
                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {

                        dde.setText(rs.getString("dname"));
                        ddi.setText(rs.getString("delid"));
                        dmn.setText(rs.getString("smobnum"));
                        dad.setText(rs.getString("daddress"));
                        dci.setText(rs.getString("dcity"));
                        dco.setText(rs.getString("compnynam"));
                        dla.setText(rs.getString("ladnum"));
                        dem.setText(rs.getString("demail"));

                    } else {
                        JOptionPane.showMessageDialog(dsbyt, "Record not Found");
                    }

                    conn.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(dsbyt, "No data is Selected");
                }
            } else if (dsby.getSelectedIndex() == 2) {
                String za = dsbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from dealer where dname = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    dtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (dtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(dsbyt, "No Record Available");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(dsbyt, e);

                }

            } else if (dsby.getSelectedIndex() == 3) {
                String za = dsbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from dealer where compnynam = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    dtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (dtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(dsbyt, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(dsbyt, e);

                }

            } else if (dsby.getSelectedIndex() == 4) {
                String za = dsbyt.getText();
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");

                    String sql = "select * from dealer where dcity = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, za);
                    ResultSet rs = pstmt.executeQuery();
                    dtable.setModel(DbUtils.resultSetToTableModel(rs));
                    if (dtable.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(dsbyt, "No Record Available");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(dsbyt, e);

                }

            }
        }
    }//GEN-LAST:event_searchicon4MouseClicked

    private void dtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtableMouseClicked
        // TODO add your handling code here:
        int i = dtable.getSelectedRow();
        TableModel mod = dtable.getModel();
        dde.setText(mod.getValueAt(i, 0).toString());
        dco.setText(mod.getValueAt(i, 1).toString());
        dmn.setText(mod.getValueAt(i, 2).toString());
        dem.setText(mod.getValueAt(i, 3).toString());
        dad.setText(mod.getValueAt(i, 4).toString());
        ddi.setText(mod.getValueAt(i, 5).toString());
        dci.setText(mod.getValueAt(i, 6).toString());
        dla.setText(mod.getValueAt(i, 7).toString());


    }//GEN-LAST:event_dtableMouseClicked

    private void dtableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtableKeyReleased
        // TODO add your handling code here:
        int i = dtable.getSelectedRow();
        TableModel mod = dtable.getModel();
        dde.setText(mod.getValueAt(i, 0).toString());
        dco.setText(mod.getValueAt(i, 1).toString());
        dmn.setText(mod.getValueAt(i, 2).toString());
        dem.setText(mod.getValueAt(i, 3).toString());
        dad.setText(mod.getValueAt(i, 4).toString());
        ddi.setText(mod.getValueAt(i, 5).toString());
        dci.setText(mod.getValueAt(i, 6).toString());
        dla.setText(mod.getValueAt(i, 7).toString());


    }//GEN-LAST:event_dtableKeyReleased

    private void dsbytMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dsbytMouseClicked
        // TODO add your handling code here:
        if (dsby.getSelectedIndex() == 0) {
            dsbyt.setEnabled(false);
        } else {
            dsbyt.setEnabled(true);
            dsbyt.setText("");
            dsbyt.requestFocus();
        }
    }//GEN-LAST:event_dsbytMouseClicked

    private void dsbytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsbytActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dsbytActionPerformed

    private void dlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dlaActionPerformed

    private void dmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dmnActionPerformed

    private void dcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dcoActionPerformed

    private void dciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dciActionPerformed

    private void dadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dadActionPerformed

    private void vcupdate6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcupdate6ActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            String sql = "update dealer set dname=?,compnynam=?,smobnum=?,daddress=?,dcity=?,demail=?,ladnum = ? where delid=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dde.getText());
            pstmt.setString(2, dco.getText());
            pstmt.setString(3, dmn.getText());
            pstmt.setString(4, dad.getText());
            pstmt.setString(5, dci.getText());
            pstmt.setString(6, dem.getText());
            pstmt.setString(7, dla.getText());
            pstmt.setInt(8, Integer.parseInt(ddi.getText()));

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(dsbyt, "Record Updated Successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(dsbyt, "No data is selected");
        }

        dDisplayTable();

    }//GEN-LAST:event_vcupdate6ActionPerformed

    private void demActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_demActionPerformed

    private void vcreset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcreset3ActionPerformed
        // TODO add your handling code here:
        dsbyt.setText("");
        dde.setText("");
        ddi.setText("");
        dmn.setText("");
        dad.setText("");
        dci.setText("");
        dco.setText("");
        dla.setText("");
        dem.setText("");

    }//GEN-LAST:event_vcreset3ActionPerformed

    private void vcdelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vcdelete3ActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vsms", "root", "root1799@");
            String sql = "delete from dealer where delid = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(ddi.getText()));
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(dsbyt, "Record Deleted Successfully");

            dsbyt.setText("");
            dde.setText("");
            ddi.setText("");
            dmn.setText("");
            dad.setText("");
            dci.setText("");
            dco.setText("");
            dla.setText("");
            dem.setText("");

            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(dsbyt, "No data is Selected");
        }

        dDisplayTable();

    }//GEN-LAST:event_vcdelete3ActionPerformed

    private void ddeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddeActionPerformed

    private void ViewaddHeader2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewaddHeader2MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_ViewaddHeader2MouseClicked

    private void dmobcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dmobcActionPerformed
        // TODO add your handling code here:
        if (dmobc.isSelected() && !damo.getText().isEmpty()) {
            dala.setText(damo.getText());
        } else {
            JOptionPane.showMessageDialog(damo, "Mobile No. is Empty");
            dmobc.setSelected(false);
        }
    }//GEN-LAST:event_dmobcActionPerformed

    private void damoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_damoKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            dala.requestFocus();
        }
    }//GEN-LAST:event_damoKeyPressed

    private void cntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cntKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            fnt.requestFocus();
        }
    }//GEN-LAST:event_cntKeyPressed

    private void fntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fntKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            pdt.requestFocus();
        }
    }//GEN-LAST:event_fntKeyPressed

    private void pdtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pdtKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            mnt.requestFocus();
        }
    }//GEN-LAST:event_pdtKeyPressed

    private void mntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mntKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            vnt.requestFocus();
        }
    }//GEN-LAST:event_mntKeyPressed

    private void chnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chnoKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            egno.requestFocus();
        }
    }//GEN-LAST:event_chnoKeyPressed

    private void egnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_egnoKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            col.requestFocus();
        }
    }//GEN-LAST:event_egnoKeyPressed

    private void colKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            mil.requestFocus();
        }
    }//GEN-LAST:event_colKeyPressed

    private void milKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_milKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            tps.requestFocus();
        }
    }//GEN-LAST:event_milKeyPressed

    private void tpsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpsKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            cst.requestFocus();
        }
    }//GEN-LAST:event_tpsKeyPressed

    private void cstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cstKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        if (key == 10) {

            deli.requestFocus();
        }
    }//GEN-LAST:event_cstKeyPressed

    private void cnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnameKeyReleased
        // TODO add your handling code here:

        String p = "^[a-zA-Z\\s]*$";
        Pattern pt = Pattern.compile(p);
        Matcher m = pt.matcher(cname.getText());
        if (!m.matches()) {
            inn1.setText("Invalid Name");
        } else if (cname.getText().isEmpty()) {
            inn1.setText("");
        } else {
            inn1.setText("");
        }
    }//GEN-LAST:event_cnameKeyReleased

    private void cfathernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cfathernameKeyReleased
        // TODO add your handling code here:
        String p = "^[a-zA-Z\\s]*$";
        Pattern pt = Pattern.compile(p);
        Matcher m = pt.matcher(cfathername.getText());
        if (!m.matches()) {
            inn2.setText("Invalid Name");
        } else if (cfathername.getText().isEmpty()) {
            inn2.setText("");
        } else {
            inn2.setText("");
        }

    }//GEN-LAST:event_cfathernameKeyReleased

    private void ccityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccityKeyReleased
        // TODO add your handling code here:
        String p = "^[a-zA-Z\\s]*$";
        Pattern pt = Pattern.compile(p);
        Matcher m = pt.matcher(ccity.getText());
        if (!m.matches()) {
            inn.setText("Invalid City Name");
        } else if (ccity.getText().isEmpty()) {
            inn.setText("");
        } else {
            inn.setText("");
        }

    }//GEN-LAST:event_ccityKeyReleased

    private void mobnumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobnumberKeyReleased
        // TODO add your handling code here:
        String p = "^[0-9]{0,12}$";
        Pattern pt = Pattern.compile(p);
        Matcher m = pt.matcher(mobnumber.getText());
        if (!m.matches()) {
            inn4.setText("Invalid Number");
        } else if (mobnumber.getText().isEmpty()) {
            inn4.setText("");
        } else {
            inn4.setText("");
        }
    }//GEN-LAST:event_mobnumberKeyReleased

    private void cemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cemailKeyReleased
        // TODO add your handling code here:
        String p = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pt = Pattern.compile(p);
        Matcher m = pt.matcher(cemail.getText());
        if (!m.matches()) {
            inn5.setText("Invalid Mail");
        } else if (cemail.getText().isEmpty()) {
            inn5.setText("");
        } else {
            inn5.setText("");
        }
    }//GEN-LAST:event_cemailKeyReleased

    private void cdobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdobKeyReleased
        // TODO add your handling code here:
        String p = "(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((19|20)\\d\\d)";

        Pattern pt = Pattern.compile(p);
        Matcher m = pt.matcher(cdob.getText());
        if (!m.matches()) {
            inn3.setText("Invalid Date         Formate:dd-MM-yyyy");
        } else if (cdob.getText().isEmpty()) {
            inn3.setText("");
        } else {
            inn3.setText("");
        }
    }//GEN-LAST:event_cdobKeyReleased

    private void caddharnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caddharnoKeyReleased
        // TODO add your handling code here:
        String p = "^[0-9]{0,14}$";
        Pattern pt = Pattern.compile(p);
        Matcher m = pt.matcher(caddharno.getText());
        if (!m.matches()) {
            inn6.setText("Invalid Number");
        } else if (caddharno.getText().isEmpty()) {
            inn6.setText("");
        } else {
            inn6.setText("");
        }
    }//GEN-LAST:event_caddharnoKeyReleased

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
            java.util.logging.Logger.getLogger(Navbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Navbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Navbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Navbar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Navbar().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddSale;
    private javax.swing.JLabel Addc;
    private javax.swing.JLabel Addc1;
    private javax.swing.JLabel Addc2;
    private javax.swing.JLabel Autohub1;
    private javax.swing.JLabel Autohub2;
    private javax.swing.JLabel Autoicon;
    private javax.swing.JLabel Customer;
    private javax.swing.JLabel Dealer;
    private javax.swing.JPanel Dealer8;
    private javax.swing.JLabel Employee;
    private javax.swing.JLabel Home;
    private javax.swing.JPanel Home1;
    private javax.swing.JPanel Home_main;
    private javax.swing.JPanel Report4;
    private javax.swing.JLabel Reports;
    private javax.swing.JLabel Sale;
    private javax.swing.JPanel Sale6;
    private javax.swing.JPanel SaleMain;
    private javax.swing.JLabel Searchc;
    private javax.swing.JLabel Searchc1;
    private javax.swing.JLabel Searchc2;
    private javax.swing.JPanel Searchcustomer;
    private javax.swing.JPanel Searchdealer1;
    private javax.swing.JLabel Stock;
    private javax.swing.JLabel Vehicle;
    private javax.swing.JPanel ViewSale;
    private javax.swing.JPanel ViewaddHeader;
    private javax.swing.JPanel ViewaddHeader1;
    private javax.swing.JPanel ViewaddHeader2;
    private javax.swing.JCheckBox adc;
    private javax.swing.JPanel addingstock;
    private javax.swing.JPanel addingvehicle;
    private javax.swing.JPanel additionvehicle;
    private javax.swing.JPanel addstock;
    private javax.swing.JTextArea bil;
    private javax.swing.JPanel billing;
    private javax.swing.JPanel billing1;
    private javax.swing.JTextField caddharno;
    private javax.swing.JTextField caddress;
    private javax.swing.JTextField ccid;
    private javax.swing.JTextField ccity;
    private javax.swing.JTextField cdob;
    private javax.swing.JTextField cemail;
    private javax.swing.JPanel centry;
    private javax.swing.JPanel centry1;
    private javax.swing.JTextField cfathername;
    private javax.swing.JTextField chno;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField cnt;
    private javax.swing.JTextField col;
    private javax.swing.JCheckBox conf;
    private javax.swing.JTextField cpannum;
    private javax.swing.JComboBox<String> cpy;
    private javax.swing.JTextField cst;
    private javax.swing.JTextField cusname8;
    private javax.swing.JPanel customer2;
    private javax.swing.JPanel customermain;
    private javax.swing.JTextField cvehino;
    private javax.swing.JTextField daad;
    private javax.swing.JTextField daci;
    private javax.swing.JTextField daco;
    private javax.swing.JTextField dad;
    private javax.swing.JTextField dade;
    private javax.swing.JTextField dadi;
    private javax.swing.JTextField daem;
    private javax.swing.JTextField dala;
    private javax.swing.JTextField damo;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dci;
    private javax.swing.JTextField dco;
    private javax.swing.JTextField dde;
    private javax.swing.JTextField ddi;
    private javax.swing.JPanel dealermain1;
    private javax.swing.JTextField deli;
    private javax.swing.JTextField dem;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField dla;
    private javax.swing.JTextField dmn;
    private javax.swing.JCheckBox dmobc;
    private javax.swing.JComboBox<String> dsby;
    private javax.swing.JTextField dsbyt;
    private javax.swing.JTable dtable;
    private javax.swing.JTextField eaddharno;
    private javax.swing.JTextField eaddress;
    private javax.swing.JTextField ecity;
    private javax.swing.JTextField edateofjoin;
    private javax.swing.JTextField edob;
    private javax.swing.JTextField eemail;
    private javax.swing.JRadioButton ef;
    private javax.swing.JTextField efathername;
    private javax.swing.JTextField egno;
    private javax.swing.JRadioButton em;
    private javax.swing.JTextField emobnumber;
    private javax.swing.JPanel employee3;
    private javax.swing.JTextField emplyid;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField epannum;
    private javax.swing.JTextField esalary;
    private javax.swing.JButton esave;
    private javax.swing.JComboBox<String> esby;
    private javax.swing.JTextField esbyt;
    private javax.swing.JRadioButton f;
    private javax.swing.JComboBox<String> fltp;
    private javax.swing.JTextField fnt;
    private javax.swing.JButton gi;
    private javax.swing.JPanel header;
    private javax.swing.JLabel hpic;
    private javax.swing.JLabel inn;
    private javax.swing.JLabel inn1;
    private javax.swing.JLabel inn2;
    private javax.swing.JLabel inn3;
    private javax.swing.JLabel inn4;
    private javax.swing.JLabel inn5;
    private javax.swing.JLabel inn6;
    private javax.swing.JLabel inn7;
    private javax.swing.JLabel inn8;
    private javax.swing.JLabel inn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel logout;
    private javax.swing.JRadioButton m;
    private javax.swing.JTextField mil;
    private javax.swing.JTextField mnt;
    private javax.swing.JTextField mobnumber;
    private javax.swing.JComboBox<String> mod;
    private javax.swing.JComboBox<String> paym;
    private javax.swing.JTextField pdt;
    private javax.swing.JRadioButton qsr;
    private javax.swing.JPanel registration;
    private javax.swing.JPanel registration1;
    private javax.swing.JPanel registrationemployee;
    private javax.swing.JTextArea rep;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JButton reset2;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save11;
    private javax.swing.JButton save12;
    private javax.swing.JButton save13;
    private javax.swing.JButton save3;
    private javax.swing.JButton save5;
    private javax.swing.JButton save8;
    private javax.swing.JComboBox<String> sby;
    private javax.swing.JTextField sbyt;
    private javax.swing.JTextField scaa;
    private javax.swing.JTextField sch;
    private javax.swing.JCheckBox schc;
    private javax.swing.JTextField scid;
    private javax.swing.JCheckBox scidc;
    private javax.swing.JTextField scn;
    private javax.swing.JTextField sda;
    private javax.swing.JTextField sdat;
    private javax.swing.JTextField sdd;
    private javax.swing.JTextField sdi;
    private javax.swing.JLabel searchicon;
    private javax.swing.JLabel searchicon1;
    private javax.swing.JLabel searchicon2;
    private javax.swing.JLabel searchicon3;
    private javax.swing.JLabel searchicon4;
    private javax.swing.JTextField sen;
    private javax.swing.JPanel sentry1;
    private javax.swing.JTextField sid;
    private javax.swing.JPanel sidebar;
    private javax.swing.JTextField spd;
    private javax.swing.JTextField srat;
    private javax.swing.JComboBox<String> ssby;
    private javax.swing.JTextField ssbyt;
    private javax.swing.JTextField ssid;
    private javax.swing.JCheckBox ssidc;
    private javax.swing.JTextField ssn;
    private javax.swing.JTable stable;
    private javax.swing.JPanel stock7;
    private javax.swing.JTextField svc;
    private javax.swing.JTextField svct;
    private javax.swing.JTextField svm;
    private javax.swing.JTable tab;
    private javax.swing.JTextField tps;
    private javax.swing.JTextField vcaa;
    private javax.swing.JTextField vcad;
    private javax.swing.JTextField vcci;
    private javax.swing.JTextField vcct;
    private javax.swing.JTextField vccu;
    private javax.swing.JTextField vcda;
    private javax.swing.JButton vcdelete;
    private javax.swing.JButton vcdelete1;
    private javax.swing.JButton vcdelete2;
    private javax.swing.JButton vcdelete3;
    private javax.swing.JTextField vcem;
    private javax.swing.JTextField vcfa;
    private javax.swing.JTextField vcge;
    private javax.swing.JTextField vcmo;
    private javax.swing.JTextField vcpa;
    private javax.swing.JButton vcreset;
    private javax.swing.JButton vcreset1;
    private javax.swing.JButton vcreset2;
    private javax.swing.JButton vcreset3;
    private javax.swing.JTable vctable;
    private javax.swing.JButton vcupdate;
    private javax.swing.JButton vcupdate1;
    private javax.swing.JButton vcupdate2;
    private javax.swing.JButton vcupdate3;
    private javax.swing.JButton vcupdate4;
    private javax.swing.JButton vcupdate5;
    private javax.swing.JButton vcupdate6;
    private javax.swing.JTextField vcve;
    private javax.swing.JTextField veaa;
    private javax.swing.JTextField vead;
    private javax.swing.JTextField veci;
    private javax.swing.JPanel vecreg1;
    private javax.swing.JTextField vect;
    private javax.swing.JTextField vecu;
    private javax.swing.JTextField veda;
    private javax.swing.JTextField vede;
    private javax.swing.JTextField veem;
    private javax.swing.JTextField vefa;
    private javax.swing.JTextField vege;
    private javax.swing.JPanel vehicle5;
    private javax.swing.JTextField vejo;
    private javax.swing.JTextField vemo;
    private javax.swing.JTextField vepa;
    private javax.swing.JTextField vesa;
    private javax.swing.JTable vetable;
    private javax.swing.JTextField vhch;
    private javax.swing.JTextField vhcl;
    private javax.swing.JTextField vhco;
    private javax.swing.JTextField vhct;
    private javax.swing.JTextField vhda;
    private javax.swing.JTextField vhde;
    private javax.swing.JTextField vhen;
    private javax.swing.JTextField vhfu;
    private javax.swing.JTextField vhmi;
    private javax.swing.JTextField vhmo;
    private javax.swing.JComboBox<String> vhsby;
    private javax.swing.JTextField vhsbyt;
    private javax.swing.JTextField vhst;
    private javax.swing.JTextField vhto;
    private javax.swing.JPanel viewemployee;
    private javax.swing.JPanel viewemply;
    private javax.swing.JPanel viewvehicle;
    private javax.swing.JTextField vnt;
    private javax.swing.JTextField vs;
    private javax.swing.JComboBox<String> vsc;
    private javax.swing.JTextField vsct;
    private javax.swing.JTextField vscu;
    private javax.swing.JTextField vsde;
    private javax.swing.JTextField vsdp;
    private javax.swing.JTextField vsem;
    private javax.swing.JTextField vsen;
    private javax.swing.JComboBox<String> vsm;
    private javax.swing.JTextField vspa;
    private javax.swing.JTextField vspu;
    private javax.swing.JTextField vsre;
    private javax.swing.JTextField vssa;
    private javax.swing.JTextField vsvc;
    private javax.swing.JTextField vsve;
    private javax.swing.JTextField vsvi;
    private javax.swing.JTextField vsvm;
    private javax.swing.JTable vtable;
    private javax.swing.JLabel weln;
    // End of variables declaration//GEN-END:variables
}

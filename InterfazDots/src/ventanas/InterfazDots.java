/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.awt.Graphics2D;
import java.awt.*;
import java.lang.reflect.Field;
/**
 *
 * @author yenson
 */
/**
 *Clase principal de la interfaz
 */
public class InterfazDots extends javax.swing.JFrame {

    /**
     * Creates new form InterfazDots
     */
    public InterfazDots() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void linea (int x1, int x2, int y1, int y2){
    
        Graphics2D l = (Graphics2D)jLineas.getGraphics();
        BasicStroke Sl = new BasicStroke(9.0f, BasicStroke.CAP_SQUARE, BasicStroke.CAP_SQUARE);
        l.setStroke(Sl);
        l.setPaint(Color.BLUE);
        l.drawLine(x1, x2, y1, y2);
        
    }
    /**
     * Metodo para crear las figuras rellenas
     * @param x array de puntos x de las lineas pertenecientes a la figura
     * @param y array de puntos y de las lineas pertenecientes a la figura
     * @param n entero cantidad de puntos que conforman la figura
     */
    public void relleno (int x[], int y[], int n){
        Graphics2D r = (Graphics2D)jLineas.getGraphics();
        BasicStroke Sr = new BasicStroke(9.0f, BasicStroke.CAP_SQUARE, BasicStroke.CAP_SQUARE);
        r.setStroke(Sr);
        r.setPaint(Color.RED);
        r.fillPolygon(x, y, n);
    }
    /**
     * Metodo para enviar al servidor la linea nueva formada
     * @param b1 primer punto de la linea
     * @param b2 segundo punto de la linea
     */
    public void eServer(javax.swing.JButton b1, javax.swing.JButton b2){
        String boton1 = b1.getName();
        String boton2 = b2.getName();
        System.out.println(b1.getName());
        int indice;
        if(boton1 != null && boton2 !=null){
        int n11 = Character.getNumericValue(boton1.charAt(1));
        int n12 = Character.getNumericValue(boton1.charAt(2));
        int n21 = Character.getNumericValue(boton2.charAt(1));
        int n22 = Character.getNumericValue(boton2.charAt(2));

        if (n11== n21){
            if(n12>n22){
                indice = 0;
            }else{
                indice = 4;
            }
        } else if (n11> n21){
            if(n12==n22){
                indice = 2;
            }else if(n12<n22){
                indice = 3;
            }else if(n12>n22){
                indice = 1;
            }
        } else if (n11< n21){
            if(n12==n22){
                indice = 6;
            }else if(n12<n22){
                indice = 5;
            }else if(n12>n22){
                indice = 7;
            }
        }
    }  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jExit = new javax.swing.JButton();
        jContinuar = new javax.swing.JButton();
        A11 = new javax.swing.JButton();
        A12 = new javax.swing.JButton();
        A13 = new javax.swing.JButton();
        A14 = new javax.swing.JButton();
        A15 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        B23 = new javax.swing.JButton();
        B24 = new javax.swing.JButton();
        B25 = new javax.swing.JButton();
        C31 = new javax.swing.JButton();
        C32 = new javax.swing.JButton();
        C33 = new javax.swing.JButton();
        C34 = new javax.swing.JButton();
        C35 = new javax.swing.JButton();
        D41 = new javax.swing.JButton();
        D42 = new javax.swing.JButton();
        D43 = new javax.swing.JButton();
        D44 = new javax.swing.JButton();
        D45 = new javax.swing.JButton();
        E51 = new javax.swing.JButton();
        E52 = new javax.swing.JButton();
        E53 = new javax.swing.JButton();
        E54 = new javax.swing.JButton();
        E55 = new javax.swing.JButton();
        F61 = new javax.swing.JButton();
        F62 = new javax.swing.JButton();
        F63 = new javax.swing.JButton();
        F64 = new javax.swing.JButton();
        F65 = new javax.swing.JButton();
        jLineas = new javax.swing.JPanel();
        jDOTS = new javax.swing.JLabel();
        jBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.darkGray);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jExit.setBackground(new java.awt.Color(254, 254, 254));
        jExit.setForeground(new java.awt.Color(80, 80, 80));
        jExit.setText("Salir");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        getContentPane().add(jExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 80, -1));

        jContinuar.setBackground(new java.awt.Color(254, 254, 254));
        jContinuar.setForeground(new java.awt.Color(85, 85, 85));
        jContinuar.setText("Continuar");
        jContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(jContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        A11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        A11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A11.setBorderPainted(false);
        A11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A11MouseClicked(evt);
            }
        });
        A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A11ActionPerformed(evt);
            }
        });
        getContentPane().add(A11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        A12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        A12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A12.setBorderPainted(false);
        A12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A12MouseClicked(evt);
            }
        });
        A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A12ActionPerformed(evt);
            }
        });
        getContentPane().add(A12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        A13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        A13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A13.setBorderPainted(false);
        A13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A13MouseClicked(evt);
            }
        });
        A13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A13ActionPerformed(evt);
            }
        });
        getContentPane().add(A13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        A14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        A14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A14.setBorderPainted(false);
        A14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A14MouseClicked(evt);
            }
        });
        A14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A14ActionPerformed(evt);
            }
        });
        getContentPane().add(A14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        A15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        A15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A15.setBorderPainted(false);
        A15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A15MouseClicked(evt);
            }
        });
        A15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A15ActionPerformed(evt);
            }
        });
        getContentPane().add(A15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        B21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        B21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B21.setBorderPainted(false);
        B21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B21MouseClicked(evt);
            }
        });
        B21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B21ActionPerformed(evt);
            }
        });
        getContentPane().add(B21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        B22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        B22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B22.setBorderPainted(false);
        B22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B22MouseClicked(evt);
            }
        });
        getContentPane().add(B22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        B23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        B23.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B23.setBorderPainted(false);
        B23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B23MouseClicked(evt);
            }
        });
        getContentPane().add(B23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        B24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        B24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B24.setBorderPainted(false);
        B24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B24MouseClicked(evt);
            }
        });
        getContentPane().add(B24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        B25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        B25.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        B25.setBorderPainted(false);
        B25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B25MouseClicked(evt);
            }
        });
        getContentPane().add(B25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        C31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        C31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C31.setBorderPainted(false);
        C31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C31MouseClicked(evt);
            }
        });
        C31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C31ActionPerformed(evt);
            }
        });
        getContentPane().add(C31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        C32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        C32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C32.setBorderPainted(false);
        C32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C32MouseClicked(evt);
            }
        });
        getContentPane().add(C32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        C33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        C33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C33.setBorderPainted(false);
        C33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C33MouseClicked(evt);
            }
        });
        getContentPane().add(C33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        C34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        C34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C34.setBorderPainted(false);
        C34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C34MouseClicked(evt);
            }
        });
        getContentPane().add(C34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        C35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        C35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        C35.setBorderPainted(false);
        C35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C35MouseClicked(evt);
            }
        });
        getContentPane().add(C35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        D41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        D41.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D41.setBorderPainted(false);
        D41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D41MouseClicked(evt);
            }
        });
        D41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D41ActionPerformed(evt);
            }
        });
        getContentPane().add(D41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        D42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        D42.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D42.setBorderPainted(false);
        D42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D42MouseClicked(evt);
            }
        });
        getContentPane().add(D42, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        D43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        D43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D43.setBorderPainted(false);
        D43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D43MouseClicked(evt);
            }
        });
        getContentPane().add(D43, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        D44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        D44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D44.setBorderPainted(false);
        D44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D44MouseClicked(evt);
            }
        });
        getContentPane().add(D44, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        D45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        D45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        D45.setBorderPainted(false);
        D45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D45MouseClicked(evt);
            }
        });
        getContentPane().add(D45, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        E51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        E51.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E51.setBorderPainted(false);
        E51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E51MouseClicked(evt);
            }
        });
        E51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E51ActionPerformed(evt);
            }
        });
        getContentPane().add(E51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        E52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        E52.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E52.setBorderPainted(false);
        E52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E52MouseClicked(evt);
            }
        });
        getContentPane().add(E52, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, -1, -1));

        E53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        E53.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E53.setBorderPainted(false);
        E53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E53MouseClicked(evt);
            }
        });
        getContentPane().add(E53, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, -1, -1));

        E54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        E54.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E54.setBorderPainted(false);
        E54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E54MouseClicked(evt);
            }
        });
        getContentPane().add(E54, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        E55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        E55.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        E55.setBorderPainted(false);
        E55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E55MouseClicked(evt);
            }
        });
        getContentPane().add(E55, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, -1));

        F61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        F61.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F61.setBorderPainted(false);
        F61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F61MouseClicked(evt);
            }
        });
        F61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F61ActionPerformed(evt);
            }
        });
        getContentPane().add(F61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        F62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        F62.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F62.setBorderPainted(false);
        F62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F62MouseClicked(evt);
            }
        });
        getContentPane().add(F62, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, -1, -1));

        F63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        F63.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F63.setBorderPainted(false);
        F63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F63MouseClicked(evt);
            }
        });
        getContentPane().add(F63, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, -1, -1));

        F64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        F64.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F64.setBorderPainted(false);
        F64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F64MouseClicked(evt);
            }
        });
        getContentPane().add(F64, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, -1, -1));

        F65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dot.png"))); // NOI18N
        F65.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        F65.setBorderPainted(false);
        F65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F65MouseClicked(evt);
            }
        });
        getContentPane().add(F65, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, -1, -1));

        jLineas.setOpaque(false);
        getContentPane().add(jLineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 510, 690));

        jDOTS.setBackground(new java.awt.Color(252, 249, 246));
        jDOTS.setFont(new java.awt.Font("aakar", 1, 50)); // NOI18N
        jDOTS.setForeground(new java.awt.Color(72, 72, 72));
        jDOTS.setText("DOTS");
        getContentPane().add(jDOTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jBG.setBackground(new java.awt.Color(76, 76, 76));
        jBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bg_1.jpg"))); // NOI18N
        getContentPane().add(jBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    private void A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A13ActionPerformed

    private void A14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A14ActionPerformed

    private void A15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A15ActionPerformed

    private void A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A12ActionPerformed

    }//GEN-LAST:event_A12ActionPerformed

    private void A12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A12MouseClicked
        A12.setName("A12");
        if (ordenclick == 0){
            pI = A12;
            ordenclick+=1;
        }else{
            eServer(pI,A12);
            ordenclick-=1;
        }
    }//GEN-LAST:event_A12MouseClicked

    private void A13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A13MouseClicked
        if (ordenclick == 0){
            pI = A13;
            ordenclick+=1;
        }else{
            eServer(pI,A13);
            ordenclick-=1;
        }
    }//GEN-LAST:event_A13MouseClicked

    private void A14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A14MouseClicked
        if (ordenclick == 0){
            pI = A14;
            ordenclick+=1;
        }else{
            eServer(pI,A14);
            ordenclick-=1;
        }
    }//GEN-LAST:event_A14MouseClicked

    private void A15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A15MouseClicked
        if (ordenclick == 0){
            pI = A15;
            ordenclick+=1;
        }else{
            eServer(pI,A15);
            ordenclick-=1;
        }
    }//GEN-LAST:event_A15MouseClicked

    private void B21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B21MouseClicked
        if (ordenclick == 0){
            pI = B21;
            ordenclick+=1;
        }else{
            eServer(pI,B21);
            ordenclick-=1;
        }
    }//GEN-LAST:event_B21MouseClicked

    private void B22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B22MouseClicked
        if (ordenclick == 0){
            pI = B22;
            ordenclick+=1;
        }else{
            eServer(pI,B22);
            ordenclick-=1;
        }
    }//GEN-LAST:event_B22MouseClicked

    private void B23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B23MouseClicked
        if (ordenclick == 0){
            pI = B23;
            ordenclick+=1;
        }else{
            eServer(pI,B23);
            ordenclick-=1;
        }
    }//GEN-LAST:event_B23MouseClicked

    private void B24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B24MouseClicked
        if (ordenclick == 0){
            pI = B24;
            ordenclick+=1;
        }else{
            eServer(pI,B24);
            ordenclick-=1;
        }
    }//GEN-LAST:event_B24MouseClicked

    private void B25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B25MouseClicked
        if (ordenclick == 0){
            pI = B25;
            ordenclick+=1;
        }else{
            eServer(pI,B25);
            ordenclick-=1;
        }
    }//GEN-LAST:event_B25MouseClicked

    private void B21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B21ActionPerformed

    private void C31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C31MouseClicked
        if (ordenclick == 0){
            pI = C31;
            ordenclick+=1;
        }else{
            eServer(pI,C31);
            ordenclick-=1;
        }
    }//GEN-LAST:event_C31MouseClicked

    private void C31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C31ActionPerformed

    private void C32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C32MouseClicked
        if (ordenclick == 0){
            pI = C32;
            ordenclick+=1;
        }else{
            eServer(pI,C32);
            ordenclick-=1;
        }
    }//GEN-LAST:event_C32MouseClicked

    private void C33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C33MouseClicked
        if (ordenclick == 0){
            pI = C33;
            ordenclick+=1;
        }else{
            eServer(pI,C33);
            ordenclick-=1;
        }
    }//GEN-LAST:event_C33MouseClicked

    private void C34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C34MouseClicked
        if (ordenclick == 0){
            pI = C34;
            ordenclick+=1;
        }else{
            eServer(pI,C34);
            ordenclick-=1;
        }
    }//GEN-LAST:event_C34MouseClicked

    private void C35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C35MouseClicked
        if (ordenclick == 0){
            pI = C35;
            ordenclick+=1;
        }else{
            eServer(pI,C35);
            ordenclick-=1;
        }
    }//GEN-LAST:event_C35MouseClicked

    private void D41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D41MouseClicked
        if (ordenclick == 0){
            pI = D41;
            ordenclick+=1;
        }else{
            eServer(pI,D41);
            ordenclick-=1;
        }
    }//GEN-LAST:event_D41MouseClicked

    private void D41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D41ActionPerformed

    private void D42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D42MouseClicked
        if (ordenclick == 0){
            pI = D42;
            ordenclick+=1;
        }else{
            eServer(pI,D42);
            ordenclick-=1;
        }
    }//GEN-LAST:event_D42MouseClicked

    private void D43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D43MouseClicked
        if (ordenclick == 0){
            pI = D43;
            ordenclick+=1;
        }else{
            eServer(pI,D43);
            ordenclick-=1;
        }
    }//GEN-LAST:event_D43MouseClicked

    private void D44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D44MouseClicked
        if (ordenclick == 0){
            pI = D44;
            ordenclick+=1;
        }else{
            eServer(pI,D44);
            ordenclick-=1;
        }
    }//GEN-LAST:event_D44MouseClicked

    private void D45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D45MouseClicked
        if (ordenclick == 0){
            pI = D45;
            ordenclick+=1;
        }else{
            eServer(pI,D45);
            ordenclick-=1;
        }
    }//GEN-LAST:event_D45MouseClicked

    private void E51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E51MouseClicked
        if (ordenclick == 0){
            pI = E51;
            ordenclick+=1;
        }else{
            eServer(pI,E51);
            ordenclick-=1;
        }
    }//GEN-LAST:event_E51MouseClicked

    private void E51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_E51ActionPerformed

    private void E52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E52MouseClicked
        if (ordenclick == 0){
            pI = E52;
            ordenclick+=1;
        }else{
            eServer(pI,E52);
            ordenclick-=1;
        }
    }//GEN-LAST:event_E52MouseClicked

    private void E53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E53MouseClicked
        if (ordenclick == 0){
            pI = E53;
            ordenclick+=1;
        }else{
            eServer(pI,E53);
            ordenclick-=1;
        }
    }//GEN-LAST:event_E53MouseClicked

    private void E54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E54MouseClicked
        if (ordenclick == 0){
            pI = E54;
            ordenclick+=1;
        }else{
            eServer(pI,E54);
            ordenclick-=1;
        }
    }//GEN-LAST:event_E54MouseClicked

    private void E55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E55MouseClicked
        if (ordenclick == 0){
            pI = E55;
            ordenclick+=1;
        }else{
            eServer(pI,E55);
            ordenclick-=1;
        }
    }//GEN-LAST:event_E55MouseClicked

    private void F61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F61MouseClicked
        if (ordenclick == 0){
            pI = F61;
            ordenclick+=1;
        }else{
            eServer(pI,F61);
            ordenclick-=1;
        }
    }//GEN-LAST:event_F61MouseClicked

    private void F61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F61ActionPerformed

    private void F62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F62MouseClicked
        if (ordenclick == 0){
            pI = F62;
            ordenclick+=1;
        }else{
            eServer(pI,F62);
            ordenclick-=1;
        }
    }//GEN-LAST:event_F62MouseClicked

    private void F63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F63MouseClicked
        if (ordenclick == 0){
            pI = F63;
            ordenclick+=1;
        }else{
            eServer(pI,F63);
            ordenclick-=1;
        }
    }//GEN-LAST:event_F63MouseClicked

    private void F64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F64MouseClicked
        if (ordenclick == 0){
            pI = F64;
            ordenclick+=1;
        }else{
            eServer(pI,F64);
            ordenclick-=1;
        }
    }//GEN-LAST:event_F64MouseClicked

    private void F65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F65MouseClicked
        if (ordenclick == 0){
            pI = F65;
            ordenclick+=1;
        }else{
            eServer(pI,F65);
            ordenclick-=1;
        }
    }//GEN-LAST:event_F65MouseClicked

    private void A11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A11MouseClicked
        A11.setName("A11");
        if (ordenclick == 0){
            pI = A11;
            ordenclick+=1;
        }else{
            ordenclick-=1;
            eServer(pI,A11);
        }
    }//GEN-LAST:event_A11MouseClicked

    private void A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A11ActionPerformed

    }//GEN-LAST:event_A11ActionPerformed

    private void jContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContinuarActionPerformed
    // Enviar los datos al servidor
        
    }//GEN-LAST:event_jContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazDots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazDots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazDots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazDots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InterfazDots Interfaz = new InterfazDots();
                Interfaz.setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton A11;
    protected javax.swing.JButton A12;
    protected javax.swing.JButton A13;
    protected javax.swing.JButton A14;
    protected javax.swing.JButton A15;
    protected javax.swing.JButton B21;
    protected javax.swing.JButton B22;
    protected javax.swing.JButton B23;
    protected javax.swing.JButton B24;
    protected javax.swing.JButton B25;
    protected javax.swing.JButton C31;
    protected javax.swing.JButton C32;
    protected javax.swing.JButton C33;
    protected javax.swing.JButton C34;
    protected javax.swing.JButton C35;
    protected javax.swing.JButton D41;
    protected javax.swing.JButton D42;
    protected javax.swing.JButton D43;
    protected javax.swing.JButton D44;
    protected javax.swing.JButton D45;
    protected javax.swing.JButton E51;
    protected javax.swing.JButton E52;
    protected javax.swing.JButton E53;
    protected javax.swing.JButton E54;
    protected javax.swing.JButton E55;
    protected javax.swing.JButton F61;
    protected javax.swing.JButton F62;
    protected javax.swing.JButton F63;
    protected javax.swing.JButton F64;
    protected javax.swing.JButton F65;
    private javax.swing.JLabel jBG;
    protected javax.swing.JButton jContinuar;
    private javax.swing.JLabel jDOTS;
    protected javax.swing.JButton jExit;
    private javax.swing.JPanel jLineas;
    // End of variables declaration//GEN-END:variables
    private int ordenclick;
    private javax.swing.JButton pI;
}

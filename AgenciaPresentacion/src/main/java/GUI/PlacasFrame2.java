/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import dtos.AutomovilDTO;
import dtos.PersonaDTO;
import excepciones.AutomovilExistenteException;
import excepciones.AutomovilInexistenteException;
import excepciones.NoPropietarioException;
import java.awt.Color;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.automovil.AutomovilBO;
import negocio.automovil.IAutomovil;
import negocio.placa.IPlaca;
import negocio.placa.PlacaBO;
import utils.Validadores;

/**
 * Clase Placas Frame 2
 *
 * @author Carlos Sanchez
 */
public class PlacasFrame2 extends javax.swing.JFrame {

    IConexionDAO conexion = new ConexionDAO();
    private PersonaDTO personaDTO;
    IAutomovil automovilBO = new AutomovilBO(conexion);
    IPlaca placaBO = new PlacaBO(conexion);
    Validadores val = new Validadores();

    /**
     * Creates new form LicenciasFrame
     *
     * @param personaDTO personaDTO
     */
    public PlacasFrame2(PersonaDTO personaDTO) {
        initComponents();
        this.personaDTO = personaDTO;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regresarMenuBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tuntantan = new javax.swing.JLabel();
        numSerieTxt = new javax.swing.JTextField();
        avanzarBtn = new utils.Btn();
        panelRound5 = new utils.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelRound6 = new utils.PanelRound();
        panelRound7 = new utils.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        panelRound8 = new utils.PanelRound();
        panelRound9 = new utils.PanelRound();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        usadoRB = new javax.swing.JRadioButton();
        nuevoRB = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        marcaTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        colorTxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        modeloTxt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        lineaTxt = new javax.swing.JTextField();
        errorRBTxt = new javax.swing.JLabel();
        camposErrorTxt = new javax.swing.JLabel();
        textoError = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(12, 35, 30));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GOBIERNO DE SONORA");

        regresarMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarMenuBtn.setText("Regresar al menu");
        regresarMenuBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresarMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMenuBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 628, Short.MAX_VALUE)
                .addComponent(regresarMenuBtn)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(regresarMenuBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 50));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 60, 60));
        jLabel3.setText("Automovil");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 60, 60));
        jLabel8.setText("Módulo de Placas");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 390, 10));

        tuntantan.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tuntantan.setText("Numero de serie:");
        jPanel1.add(tuntantan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        numSerieTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numSerieTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        numSerieTxt.setName(""); // NOI18N
        numSerieTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSerieTxtActionPerformed(evt);
            }
        });
        numSerieTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numSerieTxtKeyTyped(evt);
            }
        });
        jPanel1.add(numSerieTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 180, 30));

        avanzarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 3, 36)));
        avanzarBtn.setForeground(new java.awt.Color(65, 3, 36));
        avanzarBtn.setText("Registrar");
        avanzarBtn.setAlignmentY(0.0F);
        avanzarBtn.setColorClick(new java.awt.Color(204, 204, 204));
        avanzarBtn.setColorOver(new java.awt.Color(153, 153, 153));
        avanzarBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                avanzarBtnFocusLost(evt);
            }
        });
        avanzarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(avanzarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 120, 40));

        panelRound5.setBackground(new java.awt.Color(148, 13, 73));
        panelRound5.setRoundBottomRight(20);
        panelRound5.setRoundTopRight(20);
        panelRound5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRound5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRound5MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Paso 1");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Búsqueda");

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 70));

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setRoundBottomRight(20);
        panelRound6.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 20, 70));

        panelRound7.setBackground(new java.awt.Color(148, 13, 73));
        panelRound7.setRoundBottomRight(20);
        panelRound7.setRoundTopRight(20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Paso 2");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Automovil");

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 70));

        panelRound8.setBackground(new java.awt.Color(255, 255, 255));
        panelRound8.setRoundBottomRight(20);
        panelRound8.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        panelRound9.setBackground(new java.awt.Color(227, 215, 215));
        panelRound9.setRoundBottomRight(20);
        panelRound9.setRoundTopRight(20);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Paso 3");

        jLabel19.setText("Placas");

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(panelRound9);
        panelRound9.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelRound9Layout.setVerticalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        usadoRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(usadoRB);
        usadoRB.setText("Auto Usado");
        usadoRB.setBorder(null);
        usadoRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usadoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usadoRBActionPerformed(evt);
            }
        });
        jPanel1.add(usadoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        nuevoRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(nuevoRB);
        nuevoRB.setText("Auto Nuevo");
        nuevoRB.setBorder(null);
        nuevoRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoRBActionPerformed(evt);
            }
        });
        jPanel1.add(nuevoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Seleccionar tipo de automovil:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Marca:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        marcaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        marcaTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        marcaTxt.setName(""); // NOI18N
        marcaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaTxtActionPerformed(evt);
            }
        });
        jPanel1.add(marcaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 180, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Color:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        colorTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        colorTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        colorTxt.setName(""); // NOI18N
        colorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorTxtActionPerformed(evt);
            }
        });
        jPanel1.add(colorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 180, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setText("Modelo:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        modeloTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modeloTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modeloTxt.setName(""); // NOI18N
        modeloTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloTxtActionPerformed(evt);
            }
        });
        modeloTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modeloTxtKeyTyped(evt);
            }
        });
        jPanel1.add(modeloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 180, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setText("Linea:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        lineaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lineaTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lineaTxt.setName(""); // NOI18N
        lineaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineaTxtActionPerformed(evt);
            }
        });
        jPanel1.add(lineaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 180, 30));

        errorRBTxt.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(errorRBTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        camposErrorTxt.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(camposErrorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        textoError.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(textoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numSerieTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSerieTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numSerieTxtActionPerformed

    private void regresarMenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMenuBtnMouseClicked
        // TODO add your handling code here:
        IndexFrame ifr = new IndexFrame();
        ifr.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarMenuBtnMouseClicked

    private void marcaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaTxtActionPerformed

    private void colorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorTxtActionPerformed

    private void modeloTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloTxtActionPerformed

    private void usadoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usadoRBActionPerformed
        // TODO add your handling code here:

        errorRBTxt.setText("");
        if (usadoRB.isSelected()) {
            marcaTxt.setEnabled(false);
            lineaTxt.setEnabled(false);
            colorTxt.setEnabled(false);
            modeloTxt.setEnabled(false);
            marcaTxt.setForeground(Color.GRAY);
            colorTxt.setForeground(Color.GRAY);
            lineaTxt.setForeground(Color.GRAY);
            modeloTxt.setForeground(Color.GRAY);
            modeloTxt.setBackground(Color.LIGHT_GRAY);
            marcaTxt.setBackground(Color.LIGHT_GRAY);
            colorTxt.setBackground(Color.LIGHT_GRAY);
            lineaTxt.setBackground(Color.LIGHT_GRAY);
            tuntantan.setText("Numero de placas anteriores: ");
        }
    }//GEN-LAST:event_usadoRBActionPerformed

    private void nuevoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoRBActionPerformed
        // TODO add your handling code here:
        errorRBTxt.setText("");
        if (nuevoRB.isSelected()) {
            marcaTxt.setEnabled(true);
            lineaTxt.setEnabled(true);
            colorTxt.setEnabled(true);
            modeloTxt.setEnabled(true);
            marcaTxt.setForeground(Color.BLACK);
            colorTxt.setForeground(Color.BLACK);
            lineaTxt.setForeground(Color.BLACK);
            marcaTxt.setBackground(Color.WHITE);
            colorTxt.setBackground(Color.WHITE);
            lineaTxt.setBackground(Color.WHITE);
            modeloTxt.setForeground(Color.BLACK);
            modeloTxt.setBackground(Color.WHITE);
            tuntantan.setText("Numero de serie:");
        }
    }//GEN-LAST:event_nuevoRBActionPerformed

    private void lineaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lineaTxtActionPerformed

    private void avanzarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarBtnActionPerformed
        if ((!nuevoRB.isSelected() && !usadoRB.isSelected())) {
            errorRBTxt.setText("Debes seleccionar una para continuar");
        } else {
            if (nuevoRB.isSelected()) {
                if (numSerieTxt.getText().isBlank() || marcaTxt.getText().isBlank()
                        || lineaTxt.getText().isBlank() || colorTxt.getText().isBlank()
                        || modeloTxt.getText().isBlank()) {
                    camposErrorTxt.setText("Favor de llenar todos los campos");
                } else {
                    if (!val.esNumerica(modeloTxt.getText()) || !val.validarNumSerie(numSerieTxt.getText())) {
                        camposErrorTxt.setText("El modelo y numero de serie debe de ser un numero");
                        return;
                    }

                    int modeloInt = Integer.parseInt(modeloTxt.getText());

                    AutomovilDTO autoARegistrar = new AutomovilDTO(numSerieTxt.getText(),
                            marcaTxt.getText(),
                            lineaTxt.getText(),
                            colorTxt.getText(),
                            modeloInt);

                    try {
                        AutomovilDTO autoRegistrado = automovilBO.registrarAutomovilNuevo(autoARegistrar, personaDTO);

                        PlacasFrame3 pf3 = new PlacasFrame3(personaDTO, autoRegistrado, true);
                        pf3.setVisible(true);
                        dispose();
                    } catch (AutomovilExistenteException ex) {
                        // manejar el error
                        JOptionPane.showMessageDialog(null, "Numero de serie ya registrado", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                if (val.validarFormatoPlaca(numSerieTxt.getText())) {
                    try {
                        AutomovilDTO autoUsadoARecuperar = placaBO.obtenerAutoPorPlacas(numSerieTxt.getText(), personaDTO.getRfc());
                        PlacasFrame3 pf3 = new PlacasFrame3(personaDTO, autoUsadoARecuperar, false);
                        pf3.setVisible(true);
                        dispose();
                    } catch (AutomovilInexistenteException ex) {
                        JOptionPane.showMessageDialog(null, "Las placas no coinciden con un automovil registrado o no es propietatio. ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    textoError.setText("Formato de placa invalido");
                }

            }
        }

    }//GEN-LAST:event_avanzarBtnActionPerformed

    private void avanzarBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_avanzarBtnFocusLost
        // TODO add your handling code here:
        camposErrorTxt.setText("");
        textoError.setText("");
    }//GEN-LAST:event_avanzarBtnFocusLost

    private void panelRound5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound5MouseClicked
        // TODO add your handling code here:
        PlacasFrame1 pf1 = new PlacasFrame1();
        pf1.setVisible(true);
        dispose();
    }//GEN-LAST:event_panelRound5MouseClicked

    private void panelRound5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound5MouseEntered
        // TODO add your handling code here:
        Color colorHover = new Color(65, 3, 36);
        panelRound5.setBackground(colorHover);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_panelRound5MouseEntered

    private void panelRound5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound5MouseExited
        // TODO add your handling code here:\
        Color colorNormal = new Color(148, 13, 73);
        panelRound5.setBackground(colorNormal);
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_panelRound5MouseExited

    private void modeloTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modeloTxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_modeloTxtKeyTyped

    private void numSerieTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numSerieTxtKeyTyped

        char c = evt.getKeyChar();
        if (Character.isLetterOrDigit(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_numSerieTxtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.Btn avanzarBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel camposErrorTxt;
    private javax.swing.JTextField colorTxt;
    private javax.swing.JLabel errorRBTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lineaTxt;
    private javax.swing.JTextField marcaTxt;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JRadioButton nuevoRB;
    private javax.swing.JTextField numSerieTxt;
    private utils.PanelRound panelRound5;
    private utils.PanelRound panelRound6;
    private utils.PanelRound panelRound7;
    private utils.PanelRound panelRound8;
    private utils.PanelRound panelRound9;
    private javax.swing.JLabel regresarMenuBtn;
    private javax.swing.JLabel textoError;
    private javax.swing.JLabel tuntantan;
    private javax.swing.JRadioButton usadoRB;
    // End of variables declaration//GEN-END:variables
}

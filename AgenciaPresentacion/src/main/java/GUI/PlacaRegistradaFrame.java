/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import dtos.AutomovilDTO;
import dtos.PersonaDTO;
import dtos.PlacaDTO;
import java.awt.Color;
import java.awt.Cursor;
import java.text.SimpleDateFormat;
import negocio.automovil.AutomovilBO;
import negocio.automovil.IAutomovil;
import negocio.placa.IPlaca;
import negocio.placa.PlacaBO;

/**
 * Clase Frame de confirmacion de placa registrada
 * @author Carlos Sanchez
 */
public class PlacaRegistradaFrame extends javax.swing.JFrame {
    private PlacaDTO placaDTO;
    private PersonaDTO personaDTO;
    private AutomovilDTO automovilDTO;
    
    /**
     * Creates new form 
     */
    public PlacaRegistradaFrame(PersonaDTO personaDTO, AutomovilDTO automovilDTO, PlacaDTO placaDTO) {
        initComponents();
        this.personaDTO = personaDTO;
        this.automovilDTO = automovilDTO;
        this.placaDTO = placaDTO;
        placaTxt.setText(placaDTO.getClaveNumerica());
        rfcTxt.setText(personaDTO.getRfc());
        numSerieTxt.setText(automovilDTO.getNumeroSerie());
        claveTxt.setText(placaDTO.getClaveNumerica());
        costoTxt.setText(String.valueOf(placaDTO.getCosto()));
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         
        fechaTxt.setText(sdf.format(placaDTO.getFechaExpedicion().getTime()));
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
        jLabel10 = new javax.swing.JLabel();
        costoTxt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nombreefw5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rfcTxt = new javax.swing.JLabel();
        nombreefw6 = new javax.swing.JLabel();
        nombreefw7 = new javax.swing.JLabel();
        numSerieTxt = new javax.swing.JLabel();
        claveTxt = new javax.swing.JLabel();
        fechaTxt = new javax.swing.JLabel();
        panelRound1 = new utils.PanelRound();
        panelRound2 = new utils.PanelRound();
        panelRound3 = new utils.PanelRound();
        placaTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        avanzarBtn = new utils.Btn();
        nombreefw4 = new javax.swing.JLabel();
        nombreefw8 = new javax.swing.JLabel();
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
        jLabel3.setText("Detalles");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 60, 60));
        jLabel8.setText("Placa Registrada!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 450, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Placas");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        costoTxt.setForeground(new java.awt.Color(148, 13, 73));
        costoTxt.setText("ewnijew");
        jPanel1.add(costoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 60, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Automovil");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        nombreefw5.setText("Num Serie");
        jPanel1.add(nombreefw5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("Solicitante");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        rfcTxt.setForeground(new java.awt.Color(148, 13, 73));
        rfcTxt.setText("njewifnew");
        jPanel1.add(rfcTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 100, 20));

        nombreefw6.setText("Clave:");
        jPanel1.add(nombreefw6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        nombreefw7.setText("RFC:");
        jPanel1.add(nombreefw7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        numSerieTxt.setForeground(new java.awt.Color(148, 13, 73));
        numSerieTxt.setText("fwenoenofkw");
        jPanel1.add(numSerieTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 90, 20));

        claveTxt.setForeground(new java.awt.Color(148, 13, 73));
        claveTxt.setText("fenwfnioew");
        jPanel1.add(claveTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 60, 20));

        fechaTxt.setForeground(new java.awt.Color(148, 13, 73));
        fechaTxt.setText("nefwfneiife");
        jPanel1.add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 90, 20));

        panelRound1.setBackground(new java.awt.Color(204, 204, 255));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(0, 0, 0));
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 428, -1));

        panelRound3.setBackground(new java.awt.Color(255, 0, 51));
        panelRound3.setRoundBottomLeft(20);
        panelRound3.setRoundBottomRight(20);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelRound1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 420, 50));

        placaTxt.setFont(new java.awt.Font("MS PGothic", 1, 48)); // NOI18N
        placaTxt.setText("VGC-123");
        panelRound1.add(placaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 70));

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 0, 36)); // NOI18N
        jLabel2.setText("Sonora");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, 30));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 440, 230));

        avanzarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 3, 36)));
        avanzarBtn.setForeground(new java.awt.Color(65, 3, 36));
        avanzarBtn.setText("Salir");
        avanzarBtn.setAlignmentY(0.0F);
        avanzarBtn.setColorClick(new java.awt.Color(204, 204, 204));
        avanzarBtn.setColorOver(new java.awt.Color(153, 153, 153));
        avanzarBtn.setFocusable(false);
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
        jPanel1.add(avanzarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 120, 40));

        nombreefw4.setText("Fecha de expedicion:");
        jPanel1.add(nombreefw4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        nombreefw8.setText("Costo:");
        jPanel1.add(nombreefw8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, -1, -1));

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

    private void regresarMenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMenuBtnMouseClicked
        // TODO add your handling code here:
        IndexFrame ifr = new IndexFrame();
        ifr.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarMenuBtnMouseClicked

    private void avanzarBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_avanzarBtnFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_avanzarBtnFocusLost

    private void avanzarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarBtnActionPerformed
        // TODO add your handling code here:
        IndexFrame ifr = new IndexFrame();
        ifr.setVisible(true);
        dispose();
    }//GEN-LAST:event_avanzarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.Btn avanzarBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel claveTxt;
    private javax.swing.JLabel costoTxt;
    private javax.swing.JLabel fechaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreefw4;
    private javax.swing.JLabel nombreefw5;
    private javax.swing.JLabel nombreefw6;
    private javax.swing.JLabel nombreefw7;
    private javax.swing.JLabel nombreefw8;
    private javax.swing.JLabel numSerieTxt;
    private utils.PanelRound panelRound1;
    private utils.PanelRound panelRound2;
    private utils.PanelRound panelRound3;
    private javax.swing.JLabel placaTxt;
    private javax.swing.JLabel regresarMenuBtn;
    private javax.swing.JLabel rfcTxt;
    // End of variables declaration//GEN-END:variables
}

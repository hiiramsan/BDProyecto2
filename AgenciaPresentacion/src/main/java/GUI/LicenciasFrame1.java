/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import dtos.PersonaDTO;
import negocio.persona.IPersona;
import negocio.persona.PersonaBO;
import utils.Validadores;


/**
 * Clase Licencias Frame
 * @author Carlos Sanchez
 */
public class LicenciasFrame1 extends javax.swing.JFrame {
    Validadores val = new Validadores();
    IConexionDAO conexion = new ConexionDAO();
    IPersona personaBO = new PersonaBO(conexion);

    /**
     * Creates new form LicenciasFrame
     */
    public LicenciasFrame1() {
        initComponents();
        textoError.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regresarMenuBtn = new javax.swing.JLabel();
        panelRound1 = new utils.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelRound2 = new utils.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        rfcTxt = new javax.swing.JTextField();
        buscarBtn = new utils.Btn();
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

        panelRound1.setBackground(new java.awt.Color(148, 13, 73));
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopRight(20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Paso 1");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Búsqueda");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 70));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 60, 60));
        jLabel3.setText("Búsqueda de Persona");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        panelRound2.setBackground(new java.awt.Color(227, 215, 215));
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopRight(20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Paso 2");

        jLabel7.setText("Trámite");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 70));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 60, 60));
        jLabel8.setText("Módulo de Licencias");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 390, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Registro Federal de Contribuyentes (RFC):");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        rfcTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rfcTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rfcTxt.setName(""); // NOI18N
        rfcTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcTxtActionPerformed(evt);
            }
        });
        rfcTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rfcTxtKeyTyped(evt);
            }
        });
        jPanel1.add(rfcTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 390, 40));

        buscarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 3, 36)));
        buscarBtn.setForeground(new java.awt.Color(65, 3, 36));
        buscarBtn.setText("Buscar");
        buscarBtn.setColorClick(new java.awt.Color(204, 204, 204));
        buscarBtn.setColorOver(new java.awt.Color(255, 255, 255));
        buscarBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscarBtnFocusLost(evt);
            }
        });
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 100, 40));

        textoError.setForeground(new java.awt.Color(255, 51, 51));
        textoError.setText("Persona no encontrada");
        jPanel1.add(textoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 230, -1));

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

    private void rfcTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcTxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rfcTxtActionPerformed

    private void regresarMenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMenuBtnMouseClicked
        // TODO add your handling code here:
        IndexFrame ifr = new IndexFrame();
        ifr.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarMenuBtnMouseClicked

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        if (!val.estaVacio(rfcTxt.getText())) {
            if (val.validarRFC(rfcTxt.getText())) {
                Boolean personaExiste = personaBO.consultarPersona(rfcTxt.getText());

                if (personaExiste) {
                    PersonaDTO person = personaBO.obtenerPersona(rfcTxt.getText());
                    LicenciasFrame2 lf = new LicenciasFrame2(person);
                    lf.setVisible(true);
                    dispose();
                } else {
                    textoError.setText("Persona no encontrada");
                    textoError.setVisible(true);
                }
            } else {
                textoError.setText("Formato de RFC incorrecto");
                textoError.setVisible(true);
            }
        } else {
            textoError.setText("Escribe algo. Dont be shy");
            textoError.setVisible(true);
        }


    }//GEN-LAST:event_buscarBtnActionPerformed

    private void rfcTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfcTxtKeyTyped
        // TODO add your handling code here:

        // accept only numbers 
        char c = evt.getKeyChar();
        if (!Character.isLetterOrDigit(c)) {
            evt.consume();
        } else {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_rfcTxtKeyTyped

    private void buscarBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarBtnFocusLost
        // TODO add your handling code here:
        textoError.setVisible(false);
    }//GEN-LAST:event_buscarBtnFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.Btn buscarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private utils.PanelRound panelRound1;
    private utils.PanelRound panelRound2;
    private javax.swing.JLabel regresarMenuBtn;
    private javax.swing.JTextField rfcTxt;
    private javax.swing.JLabel textoError;
    // End of variables declaration//GEN-END:variables
}

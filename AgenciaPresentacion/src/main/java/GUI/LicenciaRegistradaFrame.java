/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dtos.LicenciaDTO;
import dtos.PersonaDTO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class LicenciaRegistradaFrame extends javax.swing.JFrame {
    private PersonaDTO personaDTO;
    private LicenciaDTO licenciaDTO;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Creates new form LicenciasFrame
     */
    public LicenciaRegistradaFrame(PersonaDTO personaDTO, LicenciaDTO licenciaDTO) {
        initComponents();
        this.personaDTO = personaDTO;
        this.licenciaDTO = licenciaDTO;
       
        rfcTxt.setText(personaDTO.getRfc());
        costoTxt.setText(String.valueOf(licenciaDTO.getCosto()));
        expedicionTxt.setText(sdf.format(licenciaDTO.getFechaExpedicion().getTime()));
        expiracionTxt.setText(sdf.format(licenciaDTO.getFechaVigencia().getTime()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        aceptarBtn = new utils.Btn();
        panelRound3 = new utils.PanelRound();
        errorTxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rfcTxt = new javax.swing.JLabel();
        expedicionTxt = new javax.swing.JLabel();
        expiracionTxt = new javax.swing.JLabel();
        costoTxt = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(12, 35, 30));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GOBIERNO DE SONORA");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Regresar al menu");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
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
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 50));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 60, 60));
        jLabel8.setText("Licencia Registrada!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        aceptarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 3, 36)));
        aceptarBtn.setForeground(new java.awt.Color(65, 3, 36));
        aceptarBtn.setText("Aceptar");
        aceptarBtn.setColorClick(new java.awt.Color(204, 204, 204));
        aceptarBtn.setColorOver(new java.awt.Color(255, 255, 255));
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 120, 30));

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomRight(20);
        panelRound3.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 20, 70));

        errorTxt.setBackground(new java.awt.Color(255, 255, 255));
        errorTxt.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(errorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("RFC solicitante:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de Expedicion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de expiración:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Costo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        rfcTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rfcTxt.setForeground(new java.awt.Color(148, 13, 73));
        rfcTxt.setText("lalalallala");
        jPanel1.add(rfcTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        expedicionTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        expedicionTxt.setForeground(new java.awt.Color(148, 13, 73));
        expedicionTxt.setText("lalalallala");
        jPanel1.add(expedicionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        expiracionTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        expiracionTxt.setForeground(new java.awt.Color(148, 13, 73));
        expiracionTxt.setText("lalalallala");
        jPanel1.add(expiracionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        costoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        costoTxt.setForeground(new java.awt.Color(148, 13, 73));
        costoTxt.setText("lalalallala");
        jPanel1.add(costoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

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

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        IndexFrame ifr = new IndexFrame();
        ifr.setVisible(true);
        dispose();
    }//GEN-LAST:event_aceptarBtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        IndexFrame ifr = new IndexFrame();
        ifr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.Btn aceptarBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel costoTxt;
    private javax.swing.JLabel errorTxt;
    private javax.swing.JLabel expedicionTxt;
    private javax.swing.JLabel expiracionTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private utils.PanelRound panelRound3;
    private javax.swing.JLabel rfcTxt;
    // End of variables declaration//GEN-END:variables
}

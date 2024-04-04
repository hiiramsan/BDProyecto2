/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import dtos.LicenciaDTO;
import dtos.PersonaDTO;
import excepciones.LicenciaActivaException;
import excepciones.MenorDeEdadException;
import java.awt.Color;
import java.awt.Cursor;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.licencia.ILicencias;
import negocio.licencia.LicenciaBO;
import negocio.persona.IPersona;
import negocio.persona.PersonaBO;

/** 
 * Clase Licencias Frame 2
 * @author Carlos Sanchez
 */
public class LicenciasFrame2 extends javax.swing.JFrame {

    private PersonaDTO personaDTO;
    float costo;
    int vigencia;
    IConexionDAO conexion = new ConexionDAO();
    IPersona personaBO = new PersonaBO(conexion);
    ILicencias licenciaBO = new LicenciaBO(conexion);

    /**
     * Creates new form LicenciasFrame
     */
    public LicenciasFrame2(PersonaDTO personaDTO) {
        initComponents();
        this.personaDTO = personaDTO;
        rfcdto.setText(personaDTO.getRfc());
        nombredto.setText(personaDTO.getNombre());
        apellidopdto.setText(personaDTO.getApellidoPaterno());
        apellidomdto.setText(personaDTO.getApellidoMaterno());
        telefonodto.setText(personaDTO.getTelefono());
        Calendar fechaNacimiento = personaDTO.getFechaNacimiento();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacimientoString = sdf.format(fechaNacimiento.getTime());
        fechanacdto.setText(fechaNacimientoString);
        if (personaDTO.isDiscapacidad()) {
            discapacidaddto.setText("Y");
        } else {
            discapacidaddto.setText("N");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRound1 = new utils.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        solicitarBtn = new utils.Btn();
        panelRound3 = new utils.PanelRound();
        panelRound2 = new utils.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        threeRB = new javax.swing.JRadioButton();
        oneRB = new javax.swing.JRadioButton();
        twoRB = new javax.swing.JRadioButton();
        costoTxt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nombreefw = new javax.swing.JLabel();
        nombreefw1 = new javax.swing.JLabel();
        nombreefw2 = new javax.swing.JLabel();
        nombreefw3 = new javax.swing.JLabel();
        nombreefw4 = new javax.swing.JLabel();
        nombreefw5 = new javax.swing.JLabel();
        nombreefw6 = new javax.swing.JLabel();
        discapacidaddto = new javax.swing.JLabel();
        rfcdto = new javax.swing.JLabel();
        nombredto = new javax.swing.JLabel();
        apellidopdto = new javax.swing.JLabel();
        apellidomdto = new javax.swing.JLabel();
        fechanacdto = new javax.swing.JLabel();
        telefonodto = new javax.swing.JLabel();
        errorTxt = new javax.swing.JLabel();
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

        panelRound1.setBackground(new java.awt.Color(148, 13, 73));
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelRound1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelRound1MouseExited(evt);
            }
        });

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
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 70));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 60, 60));
        jLabel3.setText("Trámite de Licencias");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 60, 60));
        jLabel8.setText("Módulo de Licencias");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 390, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Datos del solicitante");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        solicitarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 3, 36)));
        solicitarBtn.setForeground(new java.awt.Color(65, 3, 36));
        solicitarBtn.setText("Solicitar Licencia");
        solicitarBtn.setColorClick(new java.awt.Color(204, 204, 204));
        solicitarBtn.setColorOver(new java.awt.Color(255, 255, 255));
        solicitarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(solicitarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 120, 30));

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

        panelRound2.setBackground(new java.awt.Color(148, 13, 73));
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopRight(20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Paso 2");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Trámite");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, 70));

        threeRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(threeRB);
        threeRB.setText("3 años");
        threeRB.setBorder(null);
        threeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeRBActionPerformed(evt);
            }
        });
        jPanel1.add(threeRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        oneRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(oneRB);
        oneRB.setText("1 año");
        oneRB.setBorder(null);
        oneRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneRBActionPerformed(evt);
            }
        });
        jPanel1.add(oneRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        twoRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(twoRB);
        twoRB.setText("2 años");
        twoRB.setBorder(null);
        twoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoRBActionPerformed(evt);
            }
        });
        jPanel1.add(twoRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        jPanel1.add(costoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setText("Seleccionar vigencia:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        nombreefw.setText("Discapacidad (Y/N):");
        jPanel1.add(nombreefw, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, -1));

        nombreefw1.setText("RFC:");
        jPanel1.add(nombreefw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        nombreefw2.setText("Apellido Paterno:");
        jPanel1.add(nombreefw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        nombreefw3.setText("Apellido Materno:");
        jPanel1.add(nombreefw3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, -1, -1));

        nombreefw4.setText("Fecha de Nacimiento:");
        jPanel1.add(nombreefw4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        nombreefw5.setText("Telefono:");
        jPanel1.add(nombreefw5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, -1));

        nombreefw6.setText("Nombre:");
        jPanel1.add(nombreefw6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        discapacidaddto.setForeground(new java.awt.Color(148, 13, 73));
        discapacidaddto.setText("jLabel13");
        jPanel1.add(discapacidaddto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));

        rfcdto.setForeground(new java.awt.Color(148, 13, 73));
        rfcdto.setText("jLabel13");
        jPanel1.add(rfcdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, -1));

        nombredto.setForeground(new java.awt.Color(148, 13, 73));
        nombredto.setText("jLabel13");
        jPanel1.add(nombredto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        apellidopdto.setForeground(new java.awt.Color(148, 13, 73));
        apellidopdto.setText("jLabel13");
        jPanel1.add(apellidopdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, -1, -1));

        apellidomdto.setForeground(new java.awt.Color(148, 13, 73));
        apellidomdto.setText("jLabel13");
        jPanel1.add(apellidomdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, -1));

        fechanacdto.setForeground(new java.awt.Color(148, 13, 73));
        fechanacdto.setText("jLabel13");
        jPanel1.add(fechanacdto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, -1, -1));

        telefonodto.setForeground(new java.awt.Color(148, 13, 73));
        telefonodto.setText("jLabel13");
        jPanel1.add(telefonodto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, -1, -1));

        errorTxt.setBackground(new java.awt.Color(255, 255, 255));
        errorTxt.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(errorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

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

    private void solicitarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitarBtnActionPerformed
        // TODO add your handling code here:
        if ((!oneRB.isSelected() && !twoRB.isSelected() && !threeRB.isSelected())) {
            errorTxt.setText("Debes seleccionar una vigencia para continuar");
        } else {
            LicenciaDTO license;
            try {
                license = licenciaBO.registrarLicencia(personaDTO, vigencia, costo);
                LicenciaRegistradaFrame lrf = new LicenciaRegistradaFrame(personaDTO, license);
                lrf.setVisible(true);
                dispose();
            } catch (MenorDeEdadException ex) {
                JOptionPane.showMessageDialog(null, "La persona es menor de edad", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (LicenciaActivaException ex) {
                JOptionPane.showMessageDialog(null, "La persona ya tiene una licencia activa", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_solicitarBtnActionPerformed

    private void oneRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneRBActionPerformed
        // TODO add your handling code here:
        errorTxt.setText("");
        vigencia = 1;
        costo = licenciaBO.calcularCostoLicencia(1, personaDTO.isDiscapacidad());
        costoTxt.setText("Costo: $" + String.valueOf(costo));
    }//GEN-LAST:event_oneRBActionPerformed

    private void twoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoRBActionPerformed
        // TODO add your handling code here:
        errorTxt.setText("");
        vigencia = 2;
        costo = licenciaBO.calcularCostoLicencia(2, personaDTO.isDiscapacidad());
        costoTxt.setText("Costo: $" + String.valueOf(costo));
    }//GEN-LAST:event_twoRBActionPerformed

    private void threeRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeRBActionPerformed
        // TODO add your handling code here:
        errorTxt.setText("");
        vigencia = 3;
        costo = licenciaBO.calcularCostoLicencia(3, personaDTO.isDiscapacidad());
        costoTxt.setText("Costo: $" + String.valueOf(costo));
    }//GEN-LAST:event_threeRBActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        IndexFrame ifr = new IndexFrame();
        ifr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void panelRound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseClicked
        // TODO add your handling code here:
        LicenciasFrame1 lf1 = new LicenciasFrame1();
        lf1.setVisible(true);
        dispose();
    }//GEN-LAST:event_panelRound1MouseClicked

    private void panelRound1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseEntered
        // TODO add your handling code here:
        Color colorHover = new Color(65, 3, 36);
        panelRound1.setBackground(colorHover);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_panelRound1MouseEntered

    private void panelRound1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseExited
        // TODO add your handling code here:
        Color colorNormal = new Color(148, 13, 73);
        panelRound1.setBackground(colorNormal);
        setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_panelRound1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidomdto;
    private javax.swing.JLabel apellidopdto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel costoTxt;
    private javax.swing.JLabel discapacidaddto;
    private javax.swing.JLabel errorTxt;
    private javax.swing.JLabel fechanacdto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombredto;
    private javax.swing.JLabel nombreefw;
    private javax.swing.JLabel nombreefw1;
    private javax.swing.JLabel nombreefw2;
    private javax.swing.JLabel nombreefw3;
    private javax.swing.JLabel nombreefw4;
    private javax.swing.JLabel nombreefw5;
    private javax.swing.JLabel nombreefw6;
    private javax.swing.JRadioButton oneRB;
    private utils.PanelRound panelRound1;
    private utils.PanelRound panelRound2;
    private utils.PanelRound panelRound3;
    private javax.swing.JLabel rfcdto;
    private utils.Btn solicitarBtn;
    private javax.swing.JLabel telefonodto;
    private javax.swing.JRadioButton threeRB;
    private javax.swing.JRadioButton twoRB;
    // End of variables declaration//GEN-END:variables
}

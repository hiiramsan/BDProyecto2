/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import conexion.ConexionDAO;
import conexion.IConexionDAO;
import dtos.PersonaDTO;
import excepciones.PersonaExistenteException;
import java.awt.Color;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import negocio.persona.IPersona;
import negocio.persona.PersonaBO;

/**
 *
 * @author carlo
 */
public class IndexFrame extends javax.swing.JFrame {

    

    /**
     * Creates new form Index
     */
    public IndexFrame() {
        initComponents();
        licenciasDD.setVisible(false);
        placasDD.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tramitesNav = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        licenciasDD = new javax.swing.JLabel();
        placasDD = new javax.swing.JLabel();
        panelRound1 = new utils.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        licenciasBtn = new utils.Btn();
        jLabel12 = new javax.swing.JLabel();
        panelRound2 = new utils.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        placasBtn = new utils.Btn();
        panelRound3 = new utils.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        consultasBtn = new utils.Btn();
        panelRound4 = new utils.PanelRound();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        reportesBtn = new utils.Btn();
        insercionPersonasBtn = new utils.Btn();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(148, 13, 73));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-gob.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/foto (1).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONSULTAS");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        tramitesNav.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tramitesNav.setForeground(new java.awt.Color(255, 255, 255));
        tramitesNav.setText(" TRAMITES ▼");
        tramitesNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tramitesNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tramitesNavMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("REPORTES");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        licenciasDD.setForeground(new java.awt.Color(255, 255, 255));
        licenciasDD.setText("• LICENCIAS");
        licenciasDD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        licenciasDD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                licenciasDDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                licenciasDDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                licenciasDDMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                licenciasDDMouseReleased(evt);
            }
        });

        placasDD.setForeground(new java.awt.Color(255, 255, 255));
        placasDD.setText("• PLACAS");
        placasDD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        placasDD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placasDDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                placasDDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                placasDDMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(licenciasDD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tramitesNav, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(placasDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addGap(54, 54, 54))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tramitesNav)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(licenciasDD)
                                .addGap(12, 12, 12)
                                .addComponent(placasDD))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 290));

        panelRound1.setBackground(new java.awt.Color(204, 204, 255));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Módulo de Licencias");

        jLabel9.setText("Expedición de licencias");

        licenciasBtn.setBackground(new java.awt.Color(148, 13, 73));
        licenciasBtn.setBorder(null);
        licenciasBtn.setForeground(new java.awt.Color(255, 255, 255));
        licenciasBtn.setText("Iniciar Trámite\n");
        licenciasBtn.setBorderColor(new java.awt.Color(227, 215, 215));
        licenciasBtn.setBorderPainted(false);
        licenciasBtn.setColor(new java.awt.Color(148, 13, 73));
        licenciasBtn.setColorClick(new java.awt.Color(65, 3, 36));
        licenciasBtn.setColorOver(new java.awt.Color(65, 3, 36));
        licenciasBtn.setFocusable(false);
        licenciasBtn.setRadius(15);
        licenciasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenciasBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(licenciasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(licenciasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 260, 120));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(65, 3, 36));
        jLabel12.setText("Servicios");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        panelRound2.setBackground(new java.awt.Color(204, 204, 255));
        panelRound2.setRoundBottomLeft(15);
        panelRound2.setRoundBottomRight(15);
        panelRound2.setRoundTopLeft(15);
        panelRound2.setRoundTopRight(15);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Módulo de Placas");

        jLabel11.setText("Expedición de placas");

        placasBtn.setBackground(new java.awt.Color(148, 13, 73));
        placasBtn.setBorder(null);
        placasBtn.setForeground(new java.awt.Color(255, 255, 255));
        placasBtn.setText("Iniciar Trámite\n");
        placasBtn.setBorderColor(new java.awt.Color(227, 215, 215));
        placasBtn.setBorderPainted(false);
        placasBtn.setColor(new java.awt.Color(148, 13, 73));
        placasBtn.setColorClick(new java.awt.Color(65, 3, 36));
        placasBtn.setColorOver(new java.awt.Color(65, 3, 36));
        placasBtn.setFocusable(false);
        placasBtn.setRadius(15);
        placasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placasBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(placasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 270, -1));

        panelRound3.setBackground(new java.awt.Color(204, 204, 255));
        panelRound3.setRoundBottomLeft(15);
        panelRound3.setRoundBottomRight(15);
        panelRound3.setRoundTopLeft(15);
        panelRound3.setRoundTopRight(15);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Módulo de Consultas");

        jLabel14.setText("Historial de Licencias y Placas");

        consultasBtn.setBackground(new java.awt.Color(148, 13, 73));
        consultasBtn.setBorder(null);
        consultasBtn.setForeground(new java.awt.Color(255, 255, 255));
        consultasBtn.setText("Iniciar Consulta");
        consultasBtn.setBorderColor(new java.awt.Color(227, 215, 215));
        consultasBtn.setBorderPainted(false);
        consultasBtn.setColor(new java.awt.Color(148, 13, 73));
        consultasBtn.setColorClick(new java.awt.Color(65, 3, 36));
        consultasBtn.setColorOver(new java.awt.Color(65, 3, 36));
        consultasBtn.setFocusable(false);
        consultasBtn.setRadius(15);
        consultasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(consultasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 250, -1));

        panelRound4.setBackground(new java.awt.Color(204, 204, 255));
        panelRound4.setRoundBottomLeft(15);
        panelRound4.setRoundBottomRight(15);
        panelRound4.setRoundTopLeft(15);
        panelRound4.setRoundTopRight(15);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Módulo de Reportes");

        jLabel16.setText("Generar un reporte PDF de trámites ");

        reportesBtn.setBackground(new java.awt.Color(148, 13, 73));
        reportesBtn.setBorder(null);
        reportesBtn.setForeground(new java.awt.Color(255, 255, 255));
        reportesBtn.setText("Generar Reporte");
        reportesBtn.setBorderColor(new java.awt.Color(227, 215, 215));
        reportesBtn.setBorderPainted(false);
        reportesBtn.setColor(new java.awt.Color(148, 13, 73));
        reportesBtn.setColorClick(new java.awt.Color(65, 3, 36));
        reportesBtn.setColorOver(new java.awt.Color(65, 3, 36));
        reportesBtn.setFocusable(false);
        reportesBtn.setRadius(15);
        reportesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reportesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(reportesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 260, -1));

        insercionPersonasBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        insercionPersonasBtn.setText("Insertar 20 personas");
        insercionPersonasBtn.setColorClick(new java.awt.Color(255, 255, 255));
        insercionPersonasBtn.setColorOver(new java.awt.Color(255, 255, 255));
        insercionPersonasBtn.setFocusable(false);
        insercionPersonasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insercionPersonasBtnActionPerformed(evt);
            }
        });
        jPanel1.add(insercionPersonasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 600, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void licenciasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenciasBtnActionPerformed
        // TODO add your handling code here:
        LicenciasFrame1 lf1 = new LicenciasFrame1();
        lf1.setVisible(true);
        dispose();
    }//GEN-LAST:event_licenciasBtnActionPerformed

    private void placasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placasBtnActionPerformed
        // TODO add your handling code here:
        PlacasFrame1 pf = new PlacasFrame1();
        pf.setVisible(true);
        dispose();
    }//GEN-LAST:event_placasBtnActionPerformed

    private void consultasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasBtnActionPerformed
        // TODO add your handling code here:
        ConsultasFrame1 cf = new ConsultasFrame1();
        cf.setVisible(true);
        dispose();
    }//GEN-LAST:event_consultasBtnActionPerformed

    private void reportesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesBtnActionPerformed
        // TODO add your handling code here:
        ReportesFrame1 rf = new ReportesFrame1();
        rf.setVisible(true);
        dispose();
    }//GEN-LAST:event_reportesBtnActionPerformed

    private void insercionPersonasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insercionPersonasBtnActionPerformed
// logica con negocio y persistencia para insertarlas
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2004, Calendar.JANUARY, 22);

        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(1998, Calendar.MARCH, 15);

        Calendar fecha3 = Calendar.getInstance();
        fecha3.set(1990, Calendar.DECEMBER, 5);

        Calendar fecha4 = Calendar.getInstance();
        fecha4.set(1995, Calendar.SEPTEMBER, 18);

        Calendar fecha5 = Calendar.getInstance();
        fecha5.set(1987, Calendar.JULY, 30);

        Calendar fecha6 = Calendar.getInstance();
        fecha6.set(2000, Calendar.FEBRUARY, 10);

        Calendar fecha7 = Calendar.getInstance();
        fecha7.set(1983, Calendar.NOVEMBER, 25);

        Calendar fecha8 = Calendar.getInstance();
        fecha8.set(1992, Calendar.AUGUST, 3);

        Calendar fecha9 = Calendar.getInstance();
        fecha9.set(1979, Calendar.MAY, 12);

        Calendar fecha10 = Calendar.getInstance();
        fecha10.set(1988, Calendar.APRIL, 9);

        Calendar fecha11 = Calendar.getInstance();
        fecha11.set(1996, Calendar.JUNE, 28);

        Calendar fecha12 = Calendar.getInstance();
        fecha12.set(2002, Calendar.OCTOBER, 14);

        Calendar fecha13 = Calendar.getInstance();
        fecha13.set(1975, Calendar.FEBRUARY, 2);

        Calendar fecha14 = Calendar.getInstance();
        fecha14.set(1999, Calendar.MARCH, 20);

        Calendar fecha15 = Calendar.getInstance();
        fecha15.set(1991, Calendar.AUGUST, 8);

        Calendar fecha16 = Calendar.getInstance();
        fecha16.set(1982, Calendar.JANUARY, 17);

        Calendar fecha17 = Calendar.getInstance();
        fecha17.set(2012, Calendar.MAY, 6);

        Calendar fecha18 = Calendar.getInstance();
        fecha18.set(2009, Calendar.JULY, 23);

        Calendar fecha19 = Calendar.getInstance();
        fecha19.set(2007, Calendar.APRIL, 12);

        Calendar fecha20 = Calendar.getInstance();
        fecha20.set(2010, Calendar.OCTOBER, 31);

        // Crear 20 instancias 
        PersonaDTO persona1 = new PersonaDTO("1234567891234", "Carlos", "Sanchez", "Meneses", "6443018817", fecha1, false);
        PersonaDTO persona2 = new PersonaDTO("9876543219876", "Alejandro", "López", "Pérez", "6443022244", fecha2, false);
        PersonaDTO persona3 = new PersonaDTO("1234560987656", "Laura", "García", "Hernández", "6443000011", fecha3, true);
        PersonaDTO persona4 = new PersonaDTO("1111111111111", "María", "Martínez", "González", "6443055577", fecha4, false);
        PersonaDTO persona5 = new PersonaDTO("2222222222222", "Javier", "Rodríguez", "Díaz", "6443044400", fecha5, true);
        PersonaDTO persona6 = new PersonaDTO("3333333333333", "Ana", "Pérez", "Sánchez", "6443012345", fecha6, false);
        PersonaDTO persona7 = new PersonaDTO("4444444444444", "David", "Gómez", "López", "6443088888", fecha7, false);
        PersonaDTO persona8 = new PersonaDTO("5555555555555", "Sofía", "Hernández", "Ramírez", "6443077777", fecha8, true);
        PersonaDTO persona9 = new PersonaDTO("6666666666666", "Miguel", "Cruz", "Flores", "6443066666", fecha9, false);
        PersonaDTO persona10 = new PersonaDTO("7777777777777", "Paola", "Ruiz", "Vázquez", "6443000000", fecha10, false);
        PersonaDTO persona11 = new PersonaDTO("8888888888888", "Diego", "Gutiérrez", "Torres", "6443099999", fecha11, true);
        PersonaDTO persona12 = new PersonaDTO("9999999999999", "Isabel", "Díaz", "Ortiz", "6443023456", fecha12, false);
        PersonaDTO persona13 = new PersonaDTO("1212121212121", "Fernando", "Santiago", "Núñez", "6443032109", fecha13, false);
        PersonaDTO persona14 = new PersonaDTO("2323232323232", "Carmen", "Flores", "Luna", "6443087654", fecha14, true);
        PersonaDTO persona15 = new PersonaDTO("3434343434343", "José", "García", "Mendoza", "6443012345", fecha15, false);
        PersonaDTO persona16 = new PersonaDTO("4545454545454", "Elena", "Hernández", "Jiménez", "6443054321", fecha16, false);
        PersonaDTO persona17 = new PersonaDTO("5656565656565", "Manuel", "Pérez", "Díaz", "6443078943", fecha17, true);
        PersonaDTO persona18 = new PersonaDTO("6767676767676", "Luisa", "Martínez", "Sánchez", "6443043210", fecha18, false);
        PersonaDTO persona19 = new PersonaDTO("7878787878787", "Juan", "González", "Romero", "6443098765", fecha19, false);
        PersonaDTO persona20 = new PersonaDTO("8989898989898", "Patricia", "Sánchez", "Gómez", "6443007894", fecha20, false);

        IConexionDAO conexionDAO = new ConexionDAO();
        IPersona personaBO = new PersonaBO(conexionDAO);

        try {
            personaBO.registrarPersona(persona1);
            personaBO.registrarPersona(persona2);
            personaBO.registrarPersona(persona3);
            personaBO.registrarPersona(persona4);
            personaBO.registrarPersona(persona5);
            personaBO.registrarPersona(persona6);
            personaBO.registrarPersona(persona7);
            personaBO.registrarPersona(persona8);
            personaBO.registrarPersona(persona9);
            personaBO.registrarPersona(persona10);
            personaBO.registrarPersona(persona11);
            personaBO.registrarPersona(persona12);
            personaBO.registrarPersona(persona13);
            personaBO.registrarPersona(persona14);
            personaBO.registrarPersona(persona15);
            personaBO.registrarPersona(persona16);
            personaBO.registrarPersona(persona17);
            personaBO.registrarPersona(persona18);
            personaBO.registrarPersona(persona19);
            personaBO.registrarPersona(persona20);
            insercionPersonasBtn.setText("20 peronas insertadas");
        } catch (PersonaExistenteException e) {
            insercionPersonasBtn.setText("Ya se registraron");
        }

        // desactivar el boton
        insercionPersonasBtn.setEnabled(false);
    }//GEN-LAST:event_insercionPersonasBtnActionPerformed

    private void tramitesNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tramitesNavMouseClicked
        // TODO add your handling code here:
        if (licenciasDD.isVisible()) {
            licenciasDD.setVisible(false);
            placasDD.setVisible(false);
            tramitesNav.setText("TRAMITES ▼");
        } else {
            licenciasDD.setVisible(true);
            placasDD.setVisible(true);
            tramitesNav.setText("TRAMITES ▲");
        }
    }//GEN-LAST:event_tramitesNavMouseClicked

    private void licenciasDDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_licenciasDDMouseEntered
        // TODO add your handling code here:
        Color colorGris = Color.GREEN;
        licenciasDD.setForeground(colorGris);
    }//GEN-LAST:event_licenciasDDMouseEntered

    private void licenciasDDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_licenciasDDMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_licenciasDDMouseReleased

    private void licenciasDDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_licenciasDDMouseExited
        // TODO add your handling code here:
        Color blanco = Color.WHITE;
        licenciasDD.setForeground(blanco);
    }//GEN-LAST:event_licenciasDDMouseExited

    private void placasDDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placasDDMouseEntered
        // TODO add your handling code here:
        Color colorGris = Color.GREEN;
        placasDD.setForeground(colorGris);
    }//GEN-LAST:event_placasDDMouseEntered

    private void placasDDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placasDDMouseExited
        // TODO add your handling code here:
        Color blanco = Color.WHITE;
        placasDD.setForeground(blanco);
    }//GEN-LAST:event_placasDDMouseExited

    private void licenciasDDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_licenciasDDMouseClicked
        // TODO add your handling code here:
        LicenciasFrame1 lf1 = new LicenciasFrame1();
        lf1.setVisible(true);
        dispose();
    }//GEN-LAST:event_licenciasDDMouseClicked

    private void placasDDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placasDDMouseClicked
        // TODO add your handling code here:
        PlacasFrame1 pf1 = new PlacasFrame1();
        pf1.setVisible(true);
        dispose();
    }//GEN-LAST:event_placasDDMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        ConsultasFrame1 cf = new ConsultasFrame1();
        cf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        ReportesFrame1 rf = new ReportesFrame1();
        rf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    // Set cross-platform Java L&F (also called "Metal")
                    UIManager.setLookAndFeel(
                            UIManager.getCrossPlatformLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConsultasFrame1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ConsultasFrame1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ConsultasFrame1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(ConsultasFrame1.class.getName()).log(Level.SEVERE, null, ex);
                }
                new IndexFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.Btn consultasBtn;
    private utils.Btn insercionPersonasBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private utils.Btn licenciasBtn;
    private javax.swing.JLabel licenciasDD;
    private utils.PanelRound panelRound1;
    private utils.PanelRound panelRound2;
    private utils.PanelRound panelRound3;
    private utils.PanelRound panelRound4;
    private utils.Btn placasBtn;
    private javax.swing.JLabel placasDD;
    private utils.Btn reportesBtn;
    private javax.swing.JLabel tramitesNav;
    // End of variables declaration//GEN-END:variables
}

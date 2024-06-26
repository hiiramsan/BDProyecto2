/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import dtos.LicenciaDTO;
import dtos.PlacaDTO;
import dtos.TramiteDTO;
import entidadesJPA.Licencia;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import negocio.consultas.ConsultaBO;
import negocio.consultas.IConsulta;
import negocio.reporte.IReporte;
import negocio.reporte.ReporteBO;

/**
 * Clase Frame Reportes
 *
 * @author Carlos Sanchez
 */
public class ReportesFrame extends javax.swing.JFrame {

    IConexionDAO conexionDAO = new ConexionDAO();
    IReporte reporteBO = new ReporteBO(conexionDAO);

    List<TramiteDTO> tramites;
    List<PlacaDTO> placas;
    List<LicenciaDTO> licencias;

    /**
     * Creates new form LicenciasFrame
     */
    public ReportesFrame() {
        initComponents();

        // setear invisibles la parte de la segunda screen
        labelTramites.setVisible(false);
        scrollPane.setVisible(false);
        tablaResultados.setVisible(false);
        separadorTramites.setVisible(false);
        exportarBtn.setVisible(false);
    }

    /**
     * Cargar reportes de placas en tabla
     *
     * @param tabla
     * @param placas
     */
    public void cargarReportePlacasEnTabla(JTable tabla, List<PlacaDTO> placas) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("Costo");
        modeloTabla.addColumn("Tramite");
        modeloTabla.addColumn("Persona");

        for (PlacaDTO placa : placas) {

            Object[] fila = new Object[4];
            Calendar fechaExpedicionCalendar = placa.getFechaExpedicion();
            Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
            fila[0] = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";
            fila[1] = placa.getCosto();
            fila[2] = "Placa";
            fila[3] = placa.getNombrePersona();

            modeloTabla.addRow(fila);
        }

        tabla.setModel(modeloTabla);
    }

    /**
     * Cargar reporte de licencias en tabla
     *
     * @param tabla
     * @param licencias
     */
    public void cargarReporteLicenciasEnTabla(JTable tabla, List<LicenciaDTO> licencias) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("Costo");
        modeloTabla.addColumn("Tramite");
        modeloTabla.addColumn("Vigencia");
        modeloTabla.addColumn("Persona");

        for (LicenciaDTO licencia : licencias) {

            Object[] fila = new Object[5];
            Calendar fechaExpedicionCalendar = licencia.getFechaExpedicion();
            Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
            fila[0] = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";
            fila[1] = licencia.getCosto();
            fila[2] = "Licencia";
            Calendar fechaVigenciaCalendar = licencia.getFechaVigencia();
            Date fechaVigencia = (fechaVigenciaCalendar != null) ? fechaVigenciaCalendar.getTime() : null;
            fila[3] = (fechaVigencia != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaVigencia) : "NoDate";
            fila[4] = licencia.getNombrePersona();

            modeloTabla.addRow(fila);
        }

        tabla.setModel(modeloTabla);
    }

    /**
     * Cargar reportes de tramites en tabla
     *
     * @param tramites
     * @param tabla
     */
    public void cargarReporteTramitesEnTabla(List<TramiteDTO> tramites, JTable tabla) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Costo");
        modeloTabla.addColumn("Tipo Tramite");
        modeloTabla.addColumn("Fecha Expedición");
        modeloTabla.addColumn("Persona");

        for (TramiteDTO tramite : tramites) {
            Object[] fila = new Object[4];
            fila[0] = tramite.getCosto();
            fila[1] = tramite.getTipoTramite();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String fechaExpedicionFormateada = (tramite.getFechaExpedicion() != null) ? formatoFecha.format(tramite.getFechaExpedicion().getTime()) : "NoDate";
            fila[2] = fechaExpedicionFormateada;
            fila[3] = tramite.getNombrePersona();
            modeloTabla.addRow(fila);

        }

        tabla.setModel(modeloTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regresarMenuBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        exportarBtn = new utils.Btn();
        panelRound5 = new utils.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelRound6 = new utils.PanelRound();
        panelRound7 = new utils.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buscarPorTxt = new javax.swing.JLabel();
        operacionComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fechaFin = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        fechaIni = new com.toedter.calendar.JDateChooser();
        nombreTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        errorTxt = new javax.swing.JLabel();
        labelTramites = new javax.swing.JLabel();
        separadorTramites = new javax.swing.JSeparator();
        scrollPane = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        buscarBtn1 = new utils.Btn();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 670));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 670));
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
        jLabel3.setText("Buscar trámites");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 60, 60));
        jLabel8.setText("Módulo de Reportes");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 370, 10));

        exportarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 3, 36)));
        exportarBtn.setForeground(new java.awt.Color(65, 3, 36));
        exportarBtn.setText("Exportar PDF");
        exportarBtn.setColorClick(new java.awt.Color(204, 204, 204));
        exportarBtn.setColorOver(new java.awt.Color(153, 153, 153));
        exportarBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                exportarBtnFocusLost(evt);
            }
        });
        exportarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exportarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 580, 100, 40));

        panelRound5.setBackground(new java.awt.Color(148, 13, 73));
        panelRound5.setRoundBottomRight(20);
        panelRound5.setRoundTopRight(20);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 150, 70));

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setRoundBottomRight(20);
        panelRound6.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 20, 70));

        panelRound7.setBackground(new java.awt.Color(227, 215, 215));
        panelRound7.setRoundBottomRight(20);
        panelRound7.setRoundTopRight(20);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Paso 2");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Results");

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 150, 70));

        buscarPorTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(buscarPorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        operacionComboBox.setBackground(java.awt.SystemColor.control);
        operacionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Licencias", "Placas" }));
        operacionComboBox.setBorder(null);
        jPanel1.add(operacionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 190, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(148, 13, 73));
        jLabel11.setText("Nombre");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel2.setText("Fecha Fin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));
        jPanel1.add(fechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 100, -1));

        jLabel4.setText("Fecha Inicio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        fechaIni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechaIniFocusGained(evt);
            }
        });
        fechaIni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaIniMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fechaIniMouseExited(evt);
            }
        });
        fechaIni.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                fechaIniInputMethodTextChanged(evt);
            }
        });
        jPanel1.add(fechaIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 100, -1));

        nombreTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 230, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        errorTxt.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(errorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        labelTramites.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelTramites.setForeground(new java.awt.Color(64, 60, 60));
        labelTramites.setText("Tramites");
        jPanel1.add(labelTramites, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));
        jPanel1.add(separadorTramites, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 410, 10));

        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPane.setViewportView(tablaResultados);

        jPanel1.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 290, 420, 220));

        buscarBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 3, 36)));
        buscarBtn1.setForeground(new java.awt.Color(65, 3, 36));
        buscarBtn1.setText("Buscar");
        buscarBtn1.setColorClick(new java.awt.Color(204, 204, 204));
        buscarBtn1.setColorOver(new java.awt.Color(153, 153, 153));
        buscarBtn1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscarBtn1FocusLost(evt);
            }
        });
        buscarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(buscarBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 100, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(148, 13, 73));
        jLabel12.setText("Tipo Tramite");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(148, 13, 73));
        jLabel18.setText("Rango de fechas (Seleccione ambas)");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

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
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void exportarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarBtnActionPerformed

        if (operacionComboBox.getSelectedItem() == "Todos") {
            reporteBO.generarReporteTramites(tramites);
        } else if (operacionComboBox.getSelectedItem() == "Licencias") {
            reporteBO.generarReporteLicencias(licencias);
        } else {
            reporteBO.generarReportePlacas(placas);
        }
    }//GEN-LAST:event_exportarBtnActionPerformed

    private void exportarBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_exportarBtnFocusLost
        // TODO add your handling code here:
        errorTxt.setText("");
    }//GEN-LAST:event_exportarBtnFocusLost

    private void buscarBtn1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarBtn1FocusLost
        // TODO add your handling code here:
        errorTxt.setText("");
    }//GEN-LAST:event_buscarBtn1FocusLost

    private void buscarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtn1ActionPerformed

        if (operacionComboBox.getSelectedItem() == "Todos") {
            tramites = reporteBO.buscarTramites(fechaIni.getDate(), fechaFin.getDate(), nombreTxt.getText());
            cargarReporteTramitesEnTabla(tramites, tablaResultados);
        } else if (operacionComboBox.getSelectedItem() == "Licencias") {
            licencias = reporteBO.buscarLicencias(fechaIni.getDate(), fechaFin.getDate(), nombreTxt.getText());
            cargarReporteLicenciasEnTabla(tablaResultados, licencias);
        } else {
            placas = reporteBO.buscarPlacas(fechaIni.getDate(), fechaFin.getDate(), nombreTxt.getText());
            cargarReportePlacasEnTabla(tablaResultados, placas);
        }

        labelTramites.setVisible(true);
        scrollPane.setVisible(true);
        tablaResultados.setVisible(true);
        separadorTramites.setVisible(true);
        exportarBtn.setVisible(true);
        Color colorNormal = new Color(148, 13, 73);
        panelRound7.setBackground(colorNormal);
        Color blanco = Color.WHITE;
        jLabel16.setForeground(blanco);
        jLabel17.setForeground(blanco);


    }//GEN-LAST:event_buscarBtn1ActionPerformed

    private void fechaIniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaIniFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_fechaIniFocusGained

    private void fechaIniInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_fechaIniInputMethodTextChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_fechaIniInputMethodTextChanged

    private void fechaIniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaIniMouseExited
        // TODO add your handling code here
    }//GEN-LAST:event_fechaIniMouseExited

    private void fechaIniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaIniMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fechaIniMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.Btn buscarBtn1;
    private javax.swing.JLabel buscarPorTxt;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel errorTxt;
    private utils.Btn exportarBtn;
    private com.toedter.calendar.JDateChooser fechaFin;
    private com.toedter.calendar.JDateChooser fechaIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTramites;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JComboBox<String> operacionComboBox;
    private utils.PanelRound panelRound5;
    private utils.PanelRound panelRound6;
    private utils.PanelRound panelRound7;
    private javax.swing.JLabel regresarMenuBtn;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JSeparator separadorTramites;
    private javax.swing.JTable tablaResultados;
    // End of variables declaration//GEN-END:variables
}

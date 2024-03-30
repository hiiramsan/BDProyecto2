/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import entidadesJPA.Licencia;
import entidadesJPA.Persona;
import entidadesJPA.Placa;
import entidadesJPA.Tramite;
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

/**
 *
 * @author carlo
 */
public class ConsultasFrame2 extends javax.swing.JFrame {

    IConexionDAO conexionDAO = new ConexionDAO();
    IConsulta consultaBO = new ConsultaBO(conexionDAO);
    String rfcSelected;
    List<?> tramites;
    String tipoConsulta;

    /**
     * Creates new form
     */
    public ConsultasFrame2(String rfcSelected, String tipoConsulta) {
        initComponents();
        this.rfcSelected = rfcSelected;
        this.tipoConsulta = tipoConsulta;

        //cargarDatosTabla(tramites, tablaTramites, tipoConsulta);
        if (tipoConsulta == "Todos") {
            List<Tramite> tramites = consultaBO.obtenerTramites(rfcSelected);
            cargarDatosTablaTramites(tramites, tablaTramites);
        } else {
            List<?> tramites = consultaBO.consultarTramites(rfcSelected, tipoConsulta);
            cargarDatosTabla(tramites, tablaTramites, tipoConsulta);
        }
    }

    
    public void cargarDatosTabla(List<?> listaTramites, JTable tabla, String tipoConsulta) {
    DefaultTableModel modeloTabla = new DefaultTableModel();

    switch (tipoConsulta) {
        case "Placas":
            modeloTabla.addColumn("Tipo de Consulta");
            modeloTabla.addColumn("Costo");
            modeloTabla.addColumn("Estado");
            modeloTabla.addColumn("Expedición");
            modeloTabla.addColumn("Recepcion");
            modeloTabla.addColumn("Placa");
            break;
        case "Licencias":
            modeloTabla.addColumn("Tipo de Consulta");
            modeloTabla.addColumn("Costo");
            modeloTabla.addColumn("Estado");
            modeloTabla.addColumn("Expedición");
            modeloTabla.addColumn("Vigencia");
            break;
        default:
            throw new IllegalArgumentException("Consulta no válida: " + tipoConsulta);
    }

    for (Object tramite : listaTramites) {
        Object[] fila = new Object[modeloTabla.getColumnCount()];

        // Agregar el tipo de consulta a la fila
        fila[0] = tipoConsulta;

        if (tramite instanceof Licencia) {
            Licencia licencia = (Licencia) tramite;
            fila[1] = licencia.getCosto();
            fila[2] = licencia.getEstado();

            Calendar fechaExpedicionCalendar = licencia.getFechaExpedicion();
            Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
            fila[3] = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";

            Calendar fechaVigenciaCalendar = licencia.getVigencia();
            Date fechaVigencia = (fechaVigenciaCalendar != null) ? fechaVigenciaCalendar.getTime() : null;
            fila[4] = (fechaVigencia != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaVigencia) : "NoDate";
        } else if (tramite instanceof Placa) {
            Placa placa = (Placa) tramite;
            fila[1] = placa.getCosto();
            fila[2] = placa.getEstado();

            Calendar fechaExpedicionCalendar = placa.getFechaExpedicion();
            Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
            fila[3] = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";

            Calendar fechaRecepcionCalendar = placa.getFechaRecepcion();
            Date fechaRecepcion = (fechaRecepcionCalendar != null) ? fechaRecepcionCalendar.getTime() : null;
            fila[4] = (fechaRecepcion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaRecepcion) : "Sin recepcion aun";
            fila[5] = placa.getNumeroAlfanumerico();
        }

        modeloTabla.addRow(fila);
    }

    tabla.setModel(modeloTabla);
}


    public void cargarDatosTablaTramites(List<Tramite> tramites, JTable tabla) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Costo");
        modeloTabla.addColumn("Estado");
        modeloTabla.addColumn("Fecha Expedición");
        modeloTabla.addColumn("Persona");
        
        for (Tramite tramite : tramites) {
            Object[] fila = new Object[5];
            fila[0] = tramite.getId();
            fila[1] = tramite.getCosto();
            fila[2] = tramite.getEstado();
            fila[3] = tramite.getPersona().getNombre();

            Calendar fechaExpedicionCalendar = tramite.getFechaExpedicion();
            Date fechaExpedicion = (fechaExpedicionCalendar != null) ? fechaExpedicionCalendar.getTime() : null;
            fila[3] = (fechaExpedicion != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fechaExpedicion) : "NoDate";

            modeloTabla.addRow(fila);
        }

        tabla.setModel(modeloTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regresarMenuBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelRound5 = new utils.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelRound6 = new utils.PanelRound();
        panelRound7 = new utils.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buscarPorTxt = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTramites = new javax.swing.JTable();
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
        jLabel3.setText("Resultados ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 60, 60));
        jLabel8.setText("Módulo de Consultas");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 330, 10));

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

        panelRound7.setBackground(new java.awt.Color(148, 13, 73));
        panelRound7.setRoundBottomRight(20);
        panelRound7.setRoundTopRight(20);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Paso 2");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Tramites");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        tablaTramites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(tablaTramites);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 650, 220));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscarPorTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private utils.PanelRound panelRound5;
    private utils.PanelRound panelRound6;
    private utils.PanelRound panelRound7;
    private javax.swing.JLabel regresarMenuBtn;
    private javax.swing.JTable tablaTramites;
    // End of variables declaration//GEN-END:variables
}

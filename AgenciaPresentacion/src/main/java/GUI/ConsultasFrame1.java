/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import conexion.ConexionDAO;
import conexion.IConexionDAO;
import dtos.PersonaDTO;
import entidadesJPA.Persona;
import entidadesJPA.Tramite;
import java.text.SimpleDateFormat;
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
import utils.Validadores;

/**
 * Clase Consultas Frame
 * @author Carlos Sanchez
 */
public class ConsultasFrame1 extends javax.swing.JFrame {

    IConexionDAO conexionDAO = new ConexionDAO();
    IConsulta consultaBO = new ConsultaBO(conexionDAO);
    Validadores val = new Validadores();
    String consulta;

    /**
     * Creates new form
     */
    public ConsultasFrame1() {
        initComponents();
        inputTxt.setVisible(false);
        jfecha.setVisible(false);
        tituloTablas.setVisible(false);
        tablePersonas.setVisible(false);
        tablitaSP.setVisible(false);
    }

    public void cargarDatosTabla(List<PersonaDTO> personas, JTable tablaPersonas) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"RFC", "Nombre", "Birth", "Telefono"});

        if (personas.isEmpty()) {
            tituloTablas.setText("No se encontro ninguna persona");
        } else {
            tituloTablas.setText("Selecciona 1 de " + personas.size() + " personas encontradas para continuar");

            for (PersonaDTO persona : personas) {
                Date fecha = persona.getFechaNacimiento().getTime();
                String fechaString = (fecha != null) ? new SimpleDateFormat("yyyy-MM-dd").format(fecha) : "NoDate";
                model.addRow(new Object[]{persona.getRfc(), persona.getNombre(), fechaString, persona.getTelefono()});
            }
            tablaPersonas.setModel(model);

            tablitaSP.setVisible(true);
            tablePersonas.setVisible(true);

        }
        tituloTablas.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regresarMenuBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        inputTxt = new javax.swing.JTextField();
        buscarBtn = new utils.Btn();
        panelRound5 = new utils.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelRound6 = new utils.PanelRound();
        panelRound7 = new utils.PanelRound();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        fechaNacRB = new javax.swing.JRadioButton();
        rfcRB = new javax.swing.JRadioButton();
        nombreRB = new javax.swing.JRadioButton();
        buscarPorTxt = new javax.swing.JLabel();
        jfecha = new com.toedter.calendar.JDateChooser();
        consultaCB = new javax.swing.JComboBox<>();
        errorTxt = new javax.swing.JLabel();
        errorTxt2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tituloTablas = new javax.swing.JLabel();
        tablitaSP = new javax.swing.JScrollPane();
        tablePersonas = new javax.swing.JTable();
        visualizarBtn = new utils.Btn();
        textoError2 = new javax.swing.JLabel();
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
        jLabel3.setText("Tipo de Consulta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(64, 60, 60));
        jLabel8.setText("Módulo de Consultas");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 390, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Buscar persona por:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        inputTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputTxt.setName(""); // NOI18N
        inputTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTxtActionPerformed(evt);
            }
        });
        jPanel1.add(inputTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 380, 40));

        buscarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 3, 36)));
        buscarBtn.setForeground(new java.awt.Color(65, 3, 36));
        buscarBtn.setText("Buscar");
        buscarBtn.setColorClick(new java.awt.Color(204, 204, 204));
        buscarBtn.setColorOver(new java.awt.Color(153, 153, 153));
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
        jPanel1.add(buscarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 100, 40));

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

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Paso 2");

        jLabel17.setText("Results");

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
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

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 60, 60));
        jLabel4.setText("Búsqueda de Persona");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 390, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Seleccionar tipo de consulta:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        fechaNacRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(fechaNacRB);
        fechaNacRB.setText("Fecha de Nacimiento");
        fechaNacRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacRBActionPerformed(evt);
            }
        });
        jPanel1.add(fechaNacRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        rfcRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rfcRB);
        rfcRB.setText("RFC");
        rfcRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcRBActionPerformed(evt);
            }
        });
        jPanel1.add(rfcRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        nombreRB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(nombreRB);
        nombreRB.setText("Nombre");
        nombreRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRBActionPerformed(evt);
            }
        });
        jPanel1.add(nombreRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        buscarPorTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(buscarPorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jfecha.setDateFormatString("y-MM-dd");
        jPanel1.add(jfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 180, 30));

        consultaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Licencias", "Placas" }));
        jPanel1.add(consultaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 312, 120, 30));

        errorTxt.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(errorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        errorTxt2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(errorTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 60, 60));
        jLabel5.setText("Personas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 330, 10));

        tituloTablas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tituloTablas.setText("Personas encontradas (Seleccionar una):");
        jPanel1.add(tituloTablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        tablePersonas.setBackground(new java.awt.Color(255, 204, 102));
        tablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RFC", "Nombre", "Fecha Nac"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablitaSP.setViewportView(tablePersonas);

        jPanel1.add(tablitaSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 410, 190));

        visualizarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 3, 36)));
        visualizarBtn.setForeground(new java.awt.Color(65, 3, 36));
        visualizarBtn.setText("Visualizar");
        visualizarBtn.setColorClick(new java.awt.Color(204, 204, 204));
        visualizarBtn.setColorOver(new java.awt.Color(153, 153, 153));
        visualizarBtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                visualizarBtnFocusLost(evt);
            }
        });
        visualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarBtnActionPerformed(evt);
            }
        });
        jPanel1.add(visualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 100, 40));

        textoError2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(textoError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, -1, -1));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTxtActionPerformed

    private void regresarMenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMenuBtnMouseClicked
        // TODO add your handling code here:
        IndexFrame ifr = new IndexFrame();
        ifr.setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarMenuBtnMouseClicked

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
        Date fecha = jfecha.getDate();

        List<PersonaDTO> personasObtenidas;

        if ((!nombreRB.isSelected() && !rfcRB.isSelected() && !fechaNacRB.isSelected())) {
            errorTxt.setText("Debes seleccionar una para continuar");
        } else {
            if (inputTxt.getText().isBlank() && !fechaNacRB.isSelected()) {
                errorTxt2.setText("Campo vacio");
            } else {

                if (nombreRB.isSelected()) {
                    personasObtenidas = consultaBO.buscarPersonaPorNombreSimilar(inputTxt.getText());
                    cargarDatosTabla(personasObtenidas, tablePersonas);
                } else if (rfcRB.isSelected()) {
                    if (val.validarRFC(inputTxt.getText())) {
                        personasObtenidas = consultaBO.buscarPersonaPorRFC(inputTxt.getText());
                        cargarDatosTabla(personasObtenidas, tablePersonas);
                    } else {
                        errorTxt2.setText("Formato de RFC invalido");
                    }

                } else {
                    personasObtenidas = consultaBO.buscarPersonaPorFechaNacimiento(fecha);
                    cargarDatosTabla(personasObtenidas, tablePersonas);
                }
            }

        }

    }//GEN-LAST:event_buscarBtnActionPerformed

    private void rfcRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcRBActionPerformed
        // TODO add your handling code here:
        if (rfcRB.isSelected()) {
            buscarPorTxt.setText("RFC:");
            inputTxt.setVisible(true);
            jfecha.setVisible(false);
        }
    }//GEN-LAST:event_rfcRBActionPerformed

    private void nombreRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRBActionPerformed
        // TODO add your handling code here:
        if (nombreRB.isSelected()) {
            buscarPorTxt.setText("Nombre:");
            inputTxt.setVisible(true);
            jfecha.setVisible(false);
        }
    }//GEN-LAST:event_nombreRBActionPerformed

    private void fechaNacRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacRBActionPerformed
        // TODO add your handling code here:
        if (fechaNacRB.isSelected()) {
            buscarPorTxt.setText("Fecha de Nacimiento:");
            inputTxt.setVisible(false);
            jfecha.setVisible(true);
        }
    }//GEN-LAST:event_fechaNacRBActionPerformed

    private void buscarBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscarBtnFocusLost
        // TODO add your handling code here:
        errorTxt.setText("");
        errorTxt2.setText("");
    }//GEN-LAST:event_buscarBtnFocusLost

    private void visualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarBtnActionPerformed
        int filaSeleccionada = tablePersonas.getSelectedRow();
        consulta = consultaCB.getSelectedItem().toString();
        if (filaSeleccionada == -1) {
            textoError2.setText("Ninguna persona seleccionada");
            textoError2.setVisible(true);
        } else {
            String rfcSelected = tablePersonas.getValueAt(filaSeleccionada, 0).toString();
            System.out.println(rfcSelected);
            ConsultasFrame2 cf2 = new ConsultasFrame2(rfcSelected, consulta);
            cf2.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_visualizarBtnActionPerformed

    private void visualizarBtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_visualizarBtnFocusLost
        // TODO add your handling code here:
        textoError2.setVisible(false);
    }//GEN-LAST:event_visualizarBtnFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.Btn buscarBtn;
    private javax.swing.JLabel buscarPorTxt;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> consultaCB;
    private javax.swing.JLabel errorTxt;
    private javax.swing.JLabel errorTxt2;
    private javax.swing.JRadioButton fechaNacRB;
    private javax.swing.JTextField inputTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser jfecha;
    private javax.swing.JRadioButton nombreRB;
    private utils.PanelRound panelRound5;
    private utils.PanelRound panelRound6;
    private utils.PanelRound panelRound7;
    private javax.swing.JLabel regresarMenuBtn;
    private javax.swing.JRadioButton rfcRB;
    private javax.swing.JTable tablePersonas;
    private javax.swing.JScrollPane tablitaSP;
    private javax.swing.JLabel textoError2;
    private javax.swing.JLabel tituloTablas;
    private utils.Btn visualizarBtn;
    // End of variables declaration//GEN-END:variables
}

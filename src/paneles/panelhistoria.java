/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import clases.Conexion;
import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author VictorY
 */
public class panelhistoria extends javax.swing.JPanel {

    /**
     * Creates new form prueba
     */
    public panelhistoria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldci = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areapaciente = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        fieldci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldciKeyTyped(evt);
            }
        });

        searchbtn.setText("Buscar");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        areapaciente.setEditable(false);
        areapaciente.setColumns(20);
        areapaciente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        areapaciente.setRows(5);
        jScrollPane2.setViewportView(areapaciente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fieldci, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchbtn)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        String datos = "", consultatitulo = "Detalles de las consultas realizadas:", medititulo = "Detalles de los medicamentos asignados:";
        StringBuilder consultas = new StringBuilder();
        StringBuilder medicamentos = new StringBuilder();
        try {
            String cii = fieldci.getText().trim();
            if (cii.isBlank()) {
                JOptionPane.showMessageDialog(null, "Ingrese la cedula del paciente", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                Conexion cn = new Conexion();
                Connection conexion = cn.conectar();

                // Use a prepared statement to prevent SQL injection
                PreparedStatement ps = conexion.prepareStatement("SELECT * FROM pacientes WHERE CI = ?");
                PreparedStatement ps2 = conexion.prepareStatement("SELECT * FROM consultasmedicas WHERE CI = ?");
                PreparedStatement ps3 = conexion.prepareStatement("SELECT * FROM medicamentos WHERE CI = ?");

                ps.setString(1, cii);
                ps2.setString(1, cii);
                ps3.setString(1, cii);

                ResultSet rs = ps.executeQuery();
                ResultSet rs2 = ps2.executeQuery();
                ResultSet rs3 = ps3.executeQuery();

                if (rs.next()) {
                    datos = "Datos personales:\n\nCI: " + rs.getString("CI") + "\nNombre: " + rs.getString("nombre_paciente") + "\nApellido: " + rs.getString("apellido_paciente") + "\nFecha de nacimiento: " + rs.getDate("fecha_nacimiento") + "\nGénero: " + rs.getString("genero_paciente") + "\nDirección: " + rs.getString("direccion_paciente") + "\nTeléfono: " + rs.getString("tel_paciente") + "\nAlergias: " + rs.getString("alergias") + "\nPatologías: " + rs.getString("patologias");
                    rs.close();

                    while (rs2.next()) {

                        String consulta = "\n\nID Consulta: " + rs2.getString("id_consulta") + "\nCédula del Paciente: " + rs2.getString("CI") + "\nID del Médico: " + rs2.getString("id_medico") + "\nFecha de la consulta: " + rs2.getDate("fecha_consulta") + "\nDiágnostico: " + rs2.getString("diagnostico") + "\nReceta: " + rs2.getString("receta");
                        consultas.append(consulta);
                    }

                    if (consultas.length() == 0) {
                        consultas.append("\nEl paciente no tiene consultas");
                    }

                    while (rs3.next()) {
                        String medicamento = "\n\nID historial: " + rs3.getString("id_historial") + "\nCédula del Paciente: " + rs3.getString("CI") + "\nNombre medicamento: " + rs3.getString("medicamento") + "\nDosificación: " + rs3.getString("dosificacion") + "\nFecha inicio: " + rs3.getDate("fecha_inicio") + "\nFecha fin: " + rs3.getDate("fecha_fin");
                        medicamentos.append(medicamento);

                    }

                    if (medicamentos.length() == 0) {
                        medicamentos.append("\nNo tiene medicamentos asignados");
                    }

                    areapaciente.setText(datos + "\n\n________________________________________________________________________________________________________\n\n" + consultatitulo + consultas.toString() + "\n\n________________________________________________________________________________________________________\n\n" + medititulo + medicamentos);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe el paciente", "ERROR", JOptionPane.ERROR_MESSAGE);
                    areapaciente.setText("DATOS NO ENCONTRADOS");
                }

                // Cerrar las declaraciones preparadas
                ps.close();
                ps2.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger("panelhistoria").log(Level.SEVERE, "Error buscando paciente", ex);
        }

    }//GEN-LAST:event_searchbtnActionPerformed

    private void fieldciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldciKeyTyped
        // TODO add your handling code here:
        if (fieldci.getText().length() >= 8) {
            evt.consume(); // Ignorar el carácter si ya se han introducido 11 caracteres
        }
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_fieldciKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areapaciente;
    private javax.swing.JTextField fieldci;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables
}

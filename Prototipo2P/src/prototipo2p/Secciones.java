/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo2p;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebas Moreira
 */
public class Secciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Empleados
     */
    String BD = "jdbc:mysql://localhost/siu";
    String Usuario = "root";
    String Clave = "Cagada1234";


    public Secciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void Tabla() {
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);

            PreparedStatement ps = cn.prepareStatement("select * from secciones");
            PreparedStatement ps2 = cn.prepareStatement("select * from secciones");
            //pstt4.setString(1, txt_buscar.getText().trim());

            ResultSet rs = ps.executeQuery();

            ResultSet rss = ps2.executeQuery();

            if (rs.next()) {

                DefaultTableModel modelo = new DefaultTableModel();

                modelo.addColumn("codigo_seccion");
                modelo.addColumn("nombre_seccion");
                modelo.addColumn("estatus_seccion");

                tbl_seccion.setModel(modelo);

                String[] dato = new String[3];

                while (rss.next()) {
                    dato[0] = rss.getString(1);
                    dato[1] = rss.getString(2);
                    dato[2] = rss.getString(3);

                    modelo.addRow(dato);
                }
            }

        } catch (Exception e) {

        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_estatus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_seccion = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Sección");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Codigo Seccion:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 163, -1, -1));

        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 201, 111, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre Seccion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 203, -1, -1));

        txt_codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 163, 111, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Estatus Seccion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 243, -1, -1));

        txt_estatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estatusActionPerformed(evt);
            }
        });
        getContentPane().add(txt_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 239, 111, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingresa el código de Secciones: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 11, -1, -1));

        txt_buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 480, 30));

        jButton4.setBackground(new java.awt.Color(141, 141, 208));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busquedap.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 60, 50));

        jButton1.setBackground(new java.awt.Color(141, 141, 208));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarp.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 70, 40));

        jButton2.setBackground(new java.awt.Color(141, 141, 208));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 70, 40));

        jButton3.setBackground(new java.awt.Color(141, 141, 208));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 70, 40));

        tbl_seccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo Seccion", "Nombre Seccion", "Estatus Seccion"
            }
        ));
        tbl_seccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_seccionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_seccion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 150, 470, 110));

        jButton5.setText("Listar Datos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 278, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("                     Para modificar/ Eliminar:\n1. Debe buscar el codigo de Seccion\n2. Luego seleccionar la fila de la tabla \n3. Modificar los campos necesarios\n4. Darle click al boton Modificar (Icono del \n    Lápiz).");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 319, 350, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_estatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estatusActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//Codigo que permite consultar registros en la base de datos
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);

            PreparedStatement pstt4 = cn.prepareStatement("select * from secciones where codigo_seccion=?");
            pstt4.setString(1, txt_buscar.getText().trim());

            ResultSet rss4 = pstt4.executeQuery();

            // hacer la copia del query para que la tabla empiece desde 1
            PreparedStatement ps = cn.prepareStatement("select * from secciones where codigo_seccion=?");
            ps.setString(1, txt_buscar.getText().trim());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                DefaultTableModel modelo = new DefaultTableModel();

                modelo.addColumn("codigo_seccion");
                modelo.addColumn("nombre_seccion");
                modelo.addColumn("estatus_seccion");

                tbl_seccion.setModel(modelo);

                String[] dato = new String[3];

                while (rss4.next()) {
                    dato[0] = rss4.getString(1);
                    dato[1] = rss4.getString(2);
                    dato[2] = rss4.getString(3);

                    modelo.addRow(dato);

                }
            } else {
                JOptionPane.showMessageDialog(null, "Seccion no Registrada");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Codigo que permite insertar registros en al base de datos
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("insert into secciones values(?,?,?)");

            pst.setString(1, txt_codigo.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_estatus.getText().trim());

            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_estatus.setText("");

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en registro", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//Codigo que permite modificar registros en la base de datos
        try {
            String ID = txt_codigo.getText().trim();

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("update secciones set codigo_seccion= ?, nombre_seccion=?, estatus_seccion=? where codigo_seccion = " + ID);

            pst.setString(1, txt_codigo.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_estatus.getText().trim());

            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_estatus.setText("");

            JOptionPane.showMessageDialog(this, "¡MODIFICACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en modificación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//Codigo que permite borrar registros en la base de datos
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("delete from secciones where codigo_seccion = ?");

            pst.setString(1, txt_codigo.getText().trim());
            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_estatus.setText("");

            JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en eliminación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbl_seccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_seccionMouseClicked

        // TODO add your handling code here:
        //para seleccionar el dato y mostrarlo en los txt
        int seleccionar = tbl_seccion.rowAtPoint(evt.getPoint());
        txt_codigo.setText(String.valueOf(tbl_seccion.getValueAt(seleccionar, 0)));
        txt_nombre.setText(String.valueOf(tbl_seccion.getValueAt(seleccionar, 1)));
        txt_estatus.setText(String.valueOf(tbl_seccion.getValueAt(seleccionar, 2)));
    }//GEN-LAST:event_tbl_seccionMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Tabla();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tbl_seccion;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_estatus;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}

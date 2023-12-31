/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import Entidades.Curso;
import Entidades.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author joshi
 */
public class FrameEditarEstudiantes extends javax.swing.JFrame {
    private Estudiante estudiante;
    private Curso curso;
    public FrameEditarEstudiantes(Curso curso) {
        initComponents();
        this.curso=curso;
        this.estudiante= estudiante;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BtnCancelar1 = new javax.swing.JLabel();
        BtnGuardar1 = new javax.swing.JLabel();
        jPanelNombreC2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jPanelNombreC3 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel3.setText("Agregar Estudiante");

        BtnCancelar1.setBackground(new java.awt.Color(255, 255, 255));
        BtnCancelar1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        BtnCancelar1.setForeground(new java.awt.Color(170, 26, 26));
        BtnCancelar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCancelar.png"))); // NOI18N
        BtnCancelar1.setText("Cancelar");
        BtnCancelar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelar1MouseClicked(evt);
            }
        });

        BtnGuardar1.setBackground(new java.awt.Color(255, 255, 255));
        BtnGuardar1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        BtnGuardar1.setForeground(new java.awt.Color(23, 194, 154));
        BtnGuardar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnGuardar.png"))); // NOI18N
        BtnGuardar1.setText("Guardar");
        BtnGuardar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnGuardar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnGuardar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnGuardar1MouseExited(evt);
            }
        });

        jPanelNombreC2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNombreC2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtboxBuscar.png"))); // NOI18N
        jPanelNombreC2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Codigo:");

        txtnombre.setBorder(null);

        jPanelNombreC3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNombreC3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setBorder(null);
        jPanelNombreC3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtboxBuscar.png"))); // NOI18N
        jPanelNombreC3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNombreC2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnGuardar1)
                        .addGap(44, 44, 44)
                        .addComponent(BtnCancelar1)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(95, Short.MAX_VALUE)
                    .addComponent(jPanelNombreC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanelNombreC2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar1)
                    .addComponent(BtnCancelar1))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addComponent(jPanelNombreC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(130, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelar1MouseClicked
        this.dispose();
        FrameProfesores pantprofe = new FrameProfesores(curso);
        pantprofe.setVisible(true);
    }//GEN-LAST:event_BtnCancelar1MouseClicked

    private void BtnGuardar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardar1MouseClicked
        Estudiante estudia = new Estudiante();
        if(!txtnombre.getText().isEmpty()&&!txtCodigo.getText().isEmpty()){
            estudia.setNombre(txtnombre.getText());
            estudia.setCodigo(txtCodigo.getText());
            curso.agregarEstudiante(estudia);
            txtnombre.setText("");
            txtCodigo.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Complete el campo nombre",
                    "Agregar", JOptionPane.INFORMATION_MESSAGE); 
        }
    }//GEN-LAST:event_BtnGuardar1MouseClicked

    private void BtnGuardar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardar1MouseEntered

    private void BtnGuardar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardar1MouseExited

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnCancelar1;
    private javax.swing.JLabel BtnGuardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelNombreC2;
    private javax.swing.JPanel jPanelNombreC3;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}

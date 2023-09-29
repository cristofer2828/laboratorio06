/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;
import Entidades.Curso;
import Entidades.Estudiante;
import Entidades.Profesor;
import static Pantallas.FrameGestordeCursos.ListaCurso;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrameEstudiantes extends javax.swing.JFrame {
    private Curso curso;
    private Estudiante estudiante=null;
    public FrameEstudiantes(Curso curso) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.curso= curso;
        llenarList();
    }
    public void llenarList(){
        DefaultListModel modelo =new DefaultListModel();        
        ListaEstudiantes.setModel(modelo); 
        modelo.removeAllElements();
        for (int i = 0; i < curso.getEstudiantes().length; i++) {
            if(curso.getEstudiantes()[i]!=null){
                modelo.addElement(curso.getEstudiantes()[i].getNombre()
                        +"             "+
                        curso.getEstudiantes()[i].getCodigo());
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnEliminar = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        jPanelBuscar = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        JpanelLista = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lista = new javax.swing.JScrollPane();
        ListaEstudiantes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel1.setText("Estudiantes");

        BtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(170, 26, 26));
        BtnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEliminar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseExited(evt);
            }
        });

        BtnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(20, 74, 105));
        BtnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnBuscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseExited(evt);
            }
        });

        BtnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        BtnAgregar.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        BtnAgregar.setForeground(new java.awt.Color(26, 158, 22));
        BtnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAgregar.png"))); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseExited(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(255, 255, 255));
        BtnSalir.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(170, 26, 26));
        BtnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalir.png"))); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSalirMouseExited(evt);
            }
        });

        jPanelBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/txtboxBuscar.png"))); // NOI18N
        jPanelBuscar.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, -1));

        txtBuscar.setBorder(null);
        jPanelBuscar.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 260, 30));

        JpanelLista.setBackground(new java.awt.Color(255, 255, 255));
        JpanelLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ListEstudiantes.png"))); // NOI18N
        JpanelLista.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 200));

        lista.setBorder(null);

        ListaEstudiantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lista.setViewportView(ListaEstudiantes);

        JpanelLista.add(lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 10, 410, 180));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JpanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(BtnSalir)
                                .addGap(123, 123, 123)
                                .addComponent(BtnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEliminar))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jPanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnBuscar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnBuscar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(jPanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JpanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnAgregar)
                    .addComponent(BtnEliminar))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        boolean eliminado = false;
        Estudiante [] nuevalista = curso.getEstudiantes();
        if(estudiante!=null)
        {            
            for (int i = 0; i < 30; i++) {
                if(curso.getEstudiantes()[i]!=null&&
                        curso.getEstudiantes()[i].equals(estudiante))
                {
                    nuevalista[i]=null;
                    curso.setEstudiantes(nuevalista);
                    eliminado= true;
                    llenarList();
                    JOptionPane.showMessageDialog(null, "Estudiante Eliminado",
                    "Eliminar", JOptionPane.INFORMATION_MESSAGE); 
                }
            }
            if(eliminado==false){
                 JOptionPane.showMessageDialog(null, "El estudiante ingresado no"
                    + " esta registrado","Eliminar", JOptionPane.INFORMATION_MESSAGE); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Primero debes buscar mediante el nombre",
                    "Eliminar Estudiante", JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void BtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEliminarMouseEntered

    private void BtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEliminarMouseExited

    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked
        String nombreEstudi = txtBuscar.getText();
        boolean encontrado = false;
        if(!nombreEstudi.isEmpty())
        {
            for (int i = 0; i < 30; i++) {
                if(curso.getEstudiantes()[i]!=null &&
                    curso.getEstudiantes()[i].getNombre().equals(nombreEstudi))
                {
                    encontrado= true;
                    llenarList();     
                    estudiante = curso.getEstudiantes()[i];
                    JOptionPane.showMessageDialog(null, "Estudiante Encontrado \n"                        
                        + "Nombre: "+curso.getEstudiantes()[i].getNombre()+"\n"
                        + "Codigo: "+curso.getEstudiantes()[i].getCodigo()+"\n",
                    "Buscar", JOptionPane.INFORMATION_MESSAGE); 
                }
            }
            if(encontrado==false){
                 JOptionPane.showMessageDialog(null, "El estudiante ingresado no"
                         + " esta registrado","Buscar", JOptionPane.INFORMATION_MESSAGE); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese nombre del estudiante",
                    "Buscar Profesor", JOptionPane.INFORMATION_MESSAGE);   
        }
    }//GEN-LAST:event_BtnBuscarMouseClicked

    private void BtnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarMouseEntered

    private void BtnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarMouseExited

    private void BtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseClicked
        FrameEditarEstudiantes pantallaEditEstu = new FrameEditarEstudiantes(curso);
        pantallaEditEstu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnAgregarMouseClicked

    private void BtnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseEntered
        //agregar imagen
    }//GEN-LAST:event_BtnAgregarMouseEntered

    private void BtnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseExited
        //agregar imagen
    }//GEN-LAST:event_BtnAgregarMouseExited

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        FrameGestordeCursos pantalla = new FrameGestordeCursos(ListaCurso);
        pantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirMouseEntered

    private void BtnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSalirMouseExited

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnAgregar;
    private javax.swing.JLabel BtnBuscar;
    private javax.swing.JLabel BtnEliminar;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JPanel JpanelLista;
    private javax.swing.JList<String> ListaEstudiantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JScrollPane lista;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

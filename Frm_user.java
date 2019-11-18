package LogIn;
import Desarrollador.Usuario;
import Tarea.TareaN;
import javax.swing.DefaultListModel;

public class Frm_user extends javax.swing.JFrame {
    public Usuario usrActual;
    public int pos;
    
    public Frm_user() {
        initComponents();   
    }
    public void mostrarDatos(){
        mostrarPendientes();
        mostrarEnProceso();
        mostrarTerminadas();
        mostrarEntregadas();
    }
    public void mostrarPendientes(){
        DefaultListModel modeloLista1 = new DefaultListModel();
        listPendientes.setModel(modeloLista1);
        if(usrActual.tareasPendientes.size() > 1){
            for(TareaN tP : usrActual.tareasPendientes){
                modeloLista1.addElement( tP.getNombre() );
            }
        }
    }
    public void mostrarEnProceso(){
        DefaultListModel modeloLista2 = new DefaultListModel();
        listaEnProceso.setModel(modeloLista2);
        if(usrActual.tareasEnProceso.size() > 1){
            for(TareaN tP : usrActual.tareasEnProceso){
                modeloLista2.addElement( tP.getNombre() );
            }
        }
    }
    public void mostrarTerminadas(){
        DefaultListModel modeloLista3 = new DefaultListModel();
        listaTerminadas.setModel(modeloLista3);
        if(usrActual.tareasTerminadas.size() > 1){
            for(TareaN tP : usrActual.tareasTerminadas){
                modeloLista3.addElement( tP.getNombre() );
            }
        }
    }
    public void mostrarEntregadas(){
        DefaultListModel modeloLista4 = new DefaultListModel();
        listaEntregadas.setModel(modeloLista4);
        if(usrActual.tareasEntregadas.size() > 1){
            for(TareaN tP : usrActual.tareasEntregadas){
                modeloLista4.addElement( tP.getNombre() );
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPendientes = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lbUsuario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listPendientes = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaEnProceso = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaTerminadas = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaEntregadas = new javax.swing.JList<>();
        lbTareas = new javax.swing.JLabel();
        btPendientes = new javax.swing.JButton();
        btEnProceso = new javax.swing.JButton();
        btTerminadas = new javax.swing.JButton();
        lbPendientes = new javax.swing.JLabel();
        lbEnProceso = new javax.swing.JLabel();
        lbTerminadas = new javax.swing.JLabel();
        lbEntregadas = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jScrollPane1.setViewportView(listaPendientes);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Usuario:");

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listPendientes);

        jScrollPane3.setViewportView(listaEnProceso);

        jScrollPane4.setViewportView(listaTerminadas);

        jScrollPane5.setViewportView(listaEntregadas);

        lbTareas.setText("TAREAS:");

        btPendientes.setText("Modificar");
        btPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPendientesActionPerformed(evt);
            }
        });

        btEnProceso.setText("Modificar");
        btEnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnProcesoActionPerformed(evt);
            }
        });

        btTerminadas.setText("Modificar");
        btTerminadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTerminadasActionPerformed(evt);
            }
        });

        lbPendientes.setText("PENDIENTES");

        lbEnProceso.setText("EN PROCESO");

        lbTerminadas.setText("TERMINADAS");

        lbEntregadas.setText("ENTREGADAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbPendientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(lbEnProceso)
                        .addGap(53, 53, 53)
                        .addComponent(lbTerminadas)
                        .addGap(55, 55, 55)
                        .addComponent(lbEntregadas)
                        .addGap(96, 96, 96))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTareas)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btPendientes)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btEnProceso))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btTerminadas))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalir))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lbTareas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPendientes)
                    .addComponent(lbEnProceso)
                    .addComponent(lbTerminadas)
                    .addComponent(lbEntregadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPendientes)
                    .addComponent(btEnProceso)
                    .addComponent(btTerminadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Login ventana = new Login();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPendientesActionPerformed
        pos = listPendientes.getSelectedIndex();
        ModificarTarea modVentana = new ModificarTarea();
        modVentana.usrActual = usrActual;
        modVentana.tareaSelec = usrActual.tareasPendientes.get(pos);
        modVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btPendientesActionPerformed

    private void btEnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnProcesoActionPerformed
        pos = listaEnProceso.getSelectedIndex();
        ModificarTareaEnProgreso modVentana = new ModificarTareaEnProgreso();
        modVentana.usrActual = usrActual;
        modVentana.tareaSelec = usrActual.tareasEnProceso.get(pos);
        modVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btEnProcesoActionPerformed

    private void btTerminadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTerminadasActionPerformed
        pos = listaEnProceso.getSelectedIndex();
        ModificarTareaTerminada modVentana = new ModificarTareaTerminada();
        modVentana.usrActual = usrActual;
        modVentana.tareaSelec = usrActual.tareasEnProceso.get(pos);
        modVentana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btTerminadasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Frm_user ventanaUsr = new Frm_user();
                ventanaUsr.setVisible(true);
                ventanaUsr.mostrarDatos();
                ventanaUsr.lbUsuario.setText(ventanaUsr.usrActual.getUsername());
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnProceso;
    private javax.swing.JButton btPendientes;
    private javax.swing.JButton btTerminadas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbEnProceso;
    private javax.swing.JLabel lbEntregadas;
    private javax.swing.JLabel lbPendientes;
    private javax.swing.JLabel lbTareas;
    private javax.swing.JLabel lbTerminadas;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JList<String> listPendientes;
    private javax.swing.JList<String> listaEnProceso;
    private javax.swing.JList<String> listaEntregadas;
    private javax.swing.JList<String> listaPendientes;
    private javax.swing.JList<String> listaTerminadas;
    // End of variables declaration//GEN-END:variables

}

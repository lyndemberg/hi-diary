
package com.ifpb.HiDiary.Visao;
import java.util.ArrayList;
import java.util.List;
import com.ifpb.HiDiary.Modelo.Usuario;
import com.ifpb.HiDiary.Modelo.Compromisso;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
public class PaginaInicial extends javax.swing.JFrame {
    public static Usuario usuarioLogado;

    public PaginaInicial(Usuario u){
        usuarioLogado = u;
        initComponents();
        inicializarComboBox();
        inicializarTabela();
        
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonNovoCompromisso = new javax.swing.JButton();
        buttonEditarAgendas = new javax.swing.JButton();
        buttonGerenciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable30days = new javax.swing.JTable();
        cbAgenda30days = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        labelErro = new javax.swing.JLabel();
        buttonAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonNovoCompromisso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonNovoCompromisso.setText("<html>\n<center>Novo\n<br/>Compromisso</center>\n\n</html>\n"); // NOI18N
        buttonNovoCompromisso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonNovoCompromisso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoCompromissoActionPerformed(evt);
            }
        });

        buttonEditarAgendas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonEditarAgendas.setText("Editar Agendas");
        buttonEditarAgendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarAgendasActionPerformed(evt);
            }
        });

        buttonGerenciar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonGerenciar.setText("<html>\n<center>Gerenciar<br/> compromissos\n</center>\n</html>\n");
        buttonGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerenciarActionPerformed(evt);
            }
        });

        jTable30days.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Hora", "Descrição", "Local"
            }
        ));
        jScrollPane1.setViewportView(jTable30days);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));

        labelErro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelErro.setForeground(new java.awt.Color(255, 0, 0));

        buttonAtualizar.setText("Atualizar");
        buttonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEditarAgendas))
                        .addGap(424, 424, 424))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonNovoCompromisso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbAgenda30days, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(buttonAtualizar)
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(labelErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonEditarAgendas, buttonGerenciar, buttonNovoCompromisso});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(buttonNovoCompromisso)
                .addGap(63, 63, 63)
                .addComponent(buttonEditarAgendas)
                .addGap(66, 66, 66)
                .addComponent(buttonGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAgenda30days, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(labelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buttonEditarAgendas, buttonGerenciar, buttonNovoCompromisso});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNovoCompromissoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoCompromissoActionPerformed
        telaCadastraCompromisso compNovo = new telaCadastraCompromisso();
        compNovo.setVisible(true);
    }//GEN-LAST:event_buttonNovoCompromissoActionPerformed

    private void buttonEditarAgendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarAgendasActionPerformed
        telaEditarAgendas editarAgendas = new telaEditarAgendas();
        editarAgendas.setVisible(true);
    }//GEN-LAST:event_buttonEditarAgendasActionPerformed

    private void buttonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarActionPerformed
        inicializarTabela();
    }//GEN-LAST:event_buttonAtualizarActionPerformed

    private void buttonGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerenciarActionPerformed
        telaGerenciarCompromissos tela = new telaGerenciarCompromissos();
        tela.setVisible(true);
    }//GEN-LAST:event_buttonGerenciarActionPerformed

    
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
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial(usuarioLogado).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtualizar;
    private javax.swing.JButton buttonEditarAgendas;
    private javax.swing.JButton buttonGerenciar;
    private javax.swing.JButton buttonNovoCompromisso;
    static javax.swing.JComboBox<String> cbAgenda30days;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    static javax.swing.JTable jTable30days;
    private static javax.swing.JLabel labelErro;
    // End of variables declaration//GEN-END:variables

    public static void inicializarComboBox(){
        List<String> opcoesList = new ArrayList(usuarioLogado.getNomesAgendas());
        cbAgenda30days.addItem("Todas");
        for(int i=0; i<opcoesList.size(); i++){
            cbAgenda30days.addItem(opcoesList.get(i).toString());
        }
        
    }

    public static void inicializarTabela(){
        List<Compromisso> compromissos30days;
        
        if(cbAgenda30days.getSelectedItem().equals("Todas")){
            compromissos30days = usuarioLogado.compromissosTrintaDias();
        }else{
            compromissos30days = usuarioLogado.compromissosTrintaDias(cbAgenda30days.getSelectedItem().toString());
        }
        
        if(compromissos30days==null){
            labelErro.setText("Sem compromissos");
            
            String[] titulos = {"Data","Hora","Descrição","Local"};
            String[][] matriz = new String[0][4];
            DefaultTableModel modelo = new DefaultTableModel(matriz, titulos);
            jTable30days.setModel(modelo);
        }else{
            labelErro.setText(null);
            String[] titulos = {"Data","Hora","Descrição","Local"};
            String[][] matriz = new String[compromissos30days.size()][4];
                
            for(int i=0; i<compromissos30days.size(); i++){
                Compromisso comp = compromissos30days.get(i);

                DateTimeFormatter dtfData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                matriz[i][0] = dtfData.format(comp.getData());

                DateTimeFormatter dtfHora = DateTimeFormatter.ofPattern("HH:mm");
                matriz[i][1] = dtfHora.format(comp.getHora());

                matriz[i][2] = comp.getDescricao();
                matriz[i][3] = comp.getLocal();  
            }
            DefaultTableModel modelo = new DefaultTableModel(matriz, titulos);
            jTable30days.setModel(modelo);

        }
            
    }
}

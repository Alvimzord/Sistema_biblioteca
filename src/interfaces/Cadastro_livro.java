/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Cadastro_livro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_livro
     */
    public Cadastro_livro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        exemplar_livro = new javax.swing.JTextField();
        autor_livro = new javax.swing.JTextField();
        edicao_livro = new javax.swing.JTextField();
        ano_livro = new javax.swing.JTextField();
        id_livro = new javax.swing.JTextField();
        nome_livro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome_editora = new javax.swing.JTextField();
        caixa_genero = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro do Livro");
        setToolTipText("");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Livros"));

        jLabel4.setText("Exemplar: ");

        jLabel5.setText("Autor: ");

        jLabel6.setText("Edição: ");

        jLabel7.setText("Ano: ");

        jLabel9.setText("ID: ");

        autor_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autor_livroActionPerformed(evt);
            }
        });

        nome_livro.setToolTipText("Insira o nome do livro");
        nome_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_livroActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Livro*");

        jLabel2.setText("Editora*");

        nome_editora.setToolTipText("Insira o nome da editora");
        nome_editora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_editoraActionPerformed(evt);
            }
        });

        caixa_genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione um Gênero>", "Matematica", "Portugues", "Ingles", "Geografia", " " }));
        caixa_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixa_generoActionPerformed(evt);
            }
        });

        jLabel3.setText("Gênero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(13, 13, 13))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(id_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(edicao_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ano_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exemplar_livro, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                            .addComponent(nome_editora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome_livro, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(184, 184, 184))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(autor_livro)
                        .addGap(184, 184, 184))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(caixa_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome_livro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome_editora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(id_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(edicao_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ano_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(exemplar_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(autor_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(caixa_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(538, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixa_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixa_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixa_generoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 int a=0 ,b =0,c =01,d=0 ,e =0 ,f=0;
 
 String campo1 = nome_livro.getText();
 String campo2 = nome_editora.getText();
 String campo3 = id_livro.getText();
 String campo4 = edicao_livro.getText();
 String campo5 = ano_livro.getText();
 String campo6 = exemplar_livro.getText();
 
 
 if(campo1.equals("")){
     JOptionPane.showMessageDialog(this, "Favor digitar o nome do livro");
     nome_livro.setBackground(Color.red);
     nome_livro.setForeground(Color.white);
     nome_livro.requestFocus();
 }else{
     a=1;
      nome_livro.setBackground(Color.white);
     nome_livro.setForeground(Color.black);
 }
 if(caixa_genero.getSelectedItem().equals("<Selecione um Gênero>")){
      JOptionPane.showMessageDialog(this, "Escolha um gênero para o livro");
  }
 
  if(campo2.equals("")){
     JOptionPane.showMessageDialog(this, "Favor digitar o nome da editora");
     nome_editora.setBackground(Color.red);
     nome_editora.setForeground(Color.white);
     nome_editora.requestFocus();
 }else{
     b=1;
     nome_editora.setBackground(Color.white);
     nome_editora.setForeground(Color.black);
 }
  
    if(campo3.equals("")){
     JOptionPane.showMessageDialog(this, "Favor digitar o id do livro");
     id_livro.setBackground(Color.red);
     id_livro.setForeground(Color.white);
     id_livro.requestFocus();
 }else{
     c=1;
     id_livro.setBackground(Color.white);
     id_livro.setForeground(Color.black);
 }
    
     if(campo4.equals("")){
     JOptionPane.showMessageDialog(this, "Favor digitar a edição do livro");
     edicao_livro.setBackground(Color.red);
     edicao_livro.setForeground(Color.white);
     edicao_livro.requestFocus();
 }else{
     d=1;
     edicao_livro.setBackground(Color.white);
     edicao_livro.setForeground(Color.black);
 }
     if(campo5.equals("")){
     JOptionPane.showMessageDialog(this, "Favor digitar o ano do livro");
     ano_livro.setBackground(Color.red);
     ano_livro.setForeground(Color.white);
     ano_livro.requestFocus();
 }else{
     e=1;
     ano_livro.setBackground(Color.white);
     ano_livro.setForeground(Color.black);
 }
     
     
     if(campo6.equals("")){
     JOptionPane.showMessageDialog(this, "Favor digitar o exemplar do livro");
     exemplar_livro.setBackground(Color.red);
     exemplar_livro.setForeground(Color.white);
     exemplar_livro.requestFocus();
 }else{
     f=1;
     exemplar_livro.setBackground(Color.white);
     exemplar_livro.setForeground(Color.black);
 }
    
  if(a==1 & b==1 & c==1 & d==1 & e==1 & f==1& !caixa_genero.getSelectedItem().equals("<Selecione um Gênero>")){
      JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
            this.setVisible(false);
  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void autor_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autor_livroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autor_livroActionPerformed

    private void nome_editoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_editoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_editoraActionPerformed

    private void nome_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_livroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_livroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano_livro;
    private javax.swing.JTextField autor_livro;
    private javax.swing.JComboBox caixa_genero;
    private javax.swing.JTextField edicao_livro;
    private javax.swing.JTextField exemplar_livro;
    private javax.swing.JTextField id_livro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nome_editora;
    private javax.swing.JTextField nome_livro;
    // End of variables declaration//GEN-END:variables
}

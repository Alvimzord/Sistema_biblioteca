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
public class Cadastro_aluno extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_aluno
     */
    public Cadastro_aluno() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nome_aluno = new javax.swing.JTextField();
        campo_ano = new javax.swing.JTextField();
        sexo_aluno = new javax.swing.JTextField();
        cpf_aluno = new javax.swing.JTextField();
        endereço_aluno = new javax.swing.JTextField();
        fone_aluno = new javax.swing.JTextField();
        id_aluno = new javax.swing.JTextField();
        campo_dia = new javax.swing.JTextField();
        campo_mes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Clientes"));

        jLabel1.setText("Nome:");

        jLabel2.setText("Data de Nascimento: ");

        jLabel3.setText("Sexo: ");

        jLabel4.setText("Cpf: ");

        jLabel5.setText("Endereço: ");

        jLabel6.setText("Fone: ");

        jLabel7.setText("ID: ");

        jLabel9.setText("/");

        jLabel10.setText("/");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(519, 519, 519))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endereço_aluno)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fone_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nome_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sexo_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(campo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campo_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cpf_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 63, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(id_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campo_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sexo_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cpf_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(endereço_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fone_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(452, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a=0 ,b =0,c =01,d=0 ,e =0 ,f=0 , g=0;

        String campo1 = id_aluno.getText();
        String campo2 = nome_aluno.getText();
        //String campo3 = id_livro.getText();
        String campo4 = sexo_aluno.getText();
        String campo5 = cpf_aluno.getText();
        String campo6 = endereço_aluno.getText();
        String campo7 = fone_aluno.getText();

        if(campo1.equals("")){
            JOptionPane.showMessageDialog(this, "Favor digitar o nome do livro");
            id_aluno.setBackground(Color.red);
            id_aluno.setForeground(Color.white);
            id_aluno.requestFocus();
        }else{
            a=1;
            id_aluno.setBackground(Color.white);
            id_aluno.setForeground(Color.black);
        }

        if(campo2.equals("")){
            JOptionPane.showMessageDialog(this, "Favor digitar o nome da editora");
            nome_aluno.setBackground(Color.red);
            nome_aluno.setForeground(Color.white);
            nome_aluno.requestFocus();
        }else{
            b=1;
            nome_aluno.setBackground(Color.white);
            nome_aluno.setForeground(Color.black);
        }
/*
        if(campo3.equals("")){
            JOptionPane.showMessageDialog(this, "Favor digitar o id do livro");
            id_livro.setBackground(Color.red);
            id_livro.setForeground(Color.white);
            id_livro.requestFocus();
        }else{
            c=1;
            id_livro.setBackground(Color.white);
            id_livro.setForeground(Color.black);
        } */

        if(campo4.equals("")){
            JOptionPane.showMessageDialog(this, "Favor digitar a edição do livro");
            sexo_aluno.setBackground(Color.red);
            sexo_aluno.setForeground(Color.white);
            sexo_aluno.requestFocus();
        }else{
            d=1;
            sexo_aluno.setBackground(Color.white);
            sexo_aluno.setForeground(Color.black);
        }
        if(campo5.equals("")){
            JOptionPane.showMessageDialog(this, "Favor digitar o ano do livro");
            cpf_aluno.setBackground(Color.red);
            cpf_aluno.setForeground(Color.white);
            cpf_aluno.requestFocus();
        }else{
            e=1;
            cpf_aluno.setBackground(Color.white);
            cpf_aluno.setForeground(Color.black);
        }

        if(campo6.equals("")){
            JOptionPane.showMessageDialog(this, "Favor digitar o exemplar do livro");
            endereço_aluno.setBackground(Color.red);
            endereço_aluno.setForeground(Color.white);
            endereço_aluno.requestFocus();
        }else{
            f=1;
            endereço_aluno.setBackground(Color.white);
            endereço_aluno.setForeground(Color.black);
        }

         if(campo7.equals("")){
            JOptionPane.showMessageDialog(this, "Favor digitar o exemplar do livro");
            fone_aluno.setBackground(Color.red);
            fone_aluno.setForeground(Color.white);
            fone_aluno.requestFocus();
        }else{
            f=1;
            fone_aluno.setBackground(Color.white);
            fone_aluno.setForeground(Color.black);
        }
         if(campo_dia.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Favor digitara um dia válido");
            campo_dia.setBackground(Color.red);
            campo_dia.setForeground(Color.white);
            campo_dia.requestFocus();
         } else if(campo_mes.getText().equals("") ){
             JOptionPane.showMessageDialog(this, "Favor digitara um mes válido");
            campo_mes.setBackground(Color.red);
            campo_mes.setForeground(Color.white);
            campo_mes.requestFocus();
         } else if( campo_ano.getText().equals("") ){
             JOptionPane.showMessageDialog(this, "Favor digitara um ano válido");
            campo_ano.setBackground(Color.red);
            campo_ano.setForeground(Color.white);
            campo_ano.requestFocus();
         }
         
        if(a==1 & b==1 & d==1 & e==1 & f==1& g ==1 & !campo_dia.getText().equals("") & !campo_mes.getText().equals("")  & !campo_ano.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_ano;
    private javax.swing.JTextField campo_dia;
    private javax.swing.JTextField campo_mes;
    private javax.swing.JTextField cpf_aluno;
    private javax.swing.JTextField endereço_aluno;
    private javax.swing.JTextField fone_aluno;
    private javax.swing.JTextField id_aluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nome_aluno;
    private javax.swing.JTextField sexo_aluno;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola.view;

import escola.controller.AdministradorController;
import escola.entity.Usuario;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author diogo
 */
public class Administrador extends javax.swing.JFrame {
    
    AdministradorController ac;

    /**
     * Creates new form Administrador
     */
    public Administrador() {
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

        jLabel5 = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        cadastrarUsuarioButton = new javax.swing.JButton();
        listarButton = new javax.swing.JButton();
        cadastrarTurmaButton = new javax.swing.JButton();
        listarTurmasButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cadastrarUsuarioPanel = new javax.swing.JPanel();
        lb_nome = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        lb_senha = new javax.swing.JLabel();
        lb_cpf = new javax.swing.JLabel();
        cpfField = new javax.swing.JTextField();
        label_rg = new javax.swing.JLabel();
        rgField = new javax.swing.JTextField();
        lb_tipo = new javax.swing.JLabel();
        tipoComboBox = new javax.swing.JComboBox();
        label_nascimento = new javax.swing.JLabel();
        nascimentoField = new javax.swing.JTextField();
        lb_telefone = new javax.swing.JLabel();
        telefoneField = new javax.swing.JTextField();
        label_endereco = new javax.swing.JLabel();
        salvarButton = new javax.swing.JButton();
        senhaField = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        cadastrarTurmaPanel = new javax.swing.JPanel();
        salvarButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        listarUsuarioPanel = new javax.swing.JPanel();
        salvarButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrarUsuarioButton.setText("Cadastrar usuário");

        listarButton.setText("Listar usuários");
        listarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarButtonActionPerformed(evt);
            }
        });

        cadastrarTurmaButton.setText("Cadastrar Turma");

        listarTurmasButton.setText("Listar Turmas");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cadastrarUsuarioButton)
                .addGap(18, 18, 18)
                .addComponent(listarButton)
                .addGap(18, 18, 18)
                .addComponent(cadastrarTurmaButton)
                .addGap(18, 18, 18)
                .addComponent(listarTurmasButton)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarUsuarioButton)
                    .addComponent(listarButton)
                    .addComponent(cadastrarTurmaButton)
                    .addComponent(listarTurmasButton))
                .addGap(28, 28, 28))
        );

        cadastrarUsuarioPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cadastrarUsuarioPanel.setToolTipText("Administrador");
        cadastrarUsuarioPanel.setName("ssadas"); // NOI18N

        lb_nome.setText("Nome:");

        lb_senha.setText("Senha:");

        lb_cpf.setText("CPF:");

        label_rg.setText("RG:");

        lb_tipo.setText("Tipo:");

        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADMIN", "PROF", "ALUNO" }));
        tipoComboBox.setSelectedIndex(2);
        tipoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoComboBoxActionPerformed(evt);
            }
        });

        label_nascimento.setText("Nascimento:");

        lb_telefone.setText("Telefone:");

        label_endereco.setText("Endereço:");

        salvarButton.setText("Salvar ");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jCheckBox1.setText("jCheckBox1");

        javax.swing.GroupLayout cadastrarUsuarioPanelLayout = new javax.swing.GroupLayout(cadastrarUsuarioPanel);
        cadastrarUsuarioPanel.setLayout(cadastrarUsuarioPanelLayout);
        cadastrarUsuarioPanelLayout.setHorizontalGroup(
            cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrarUsuarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrarUsuarioPanelLayout.createSequentialGroup()
                        .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                                .addComponent(label_nascimento)
                                .addGap(18, 18, 18)
                                .addComponent(nascimentoField))
                            .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nome)
                                    .addComponent(lb_cpf)
                                    .addComponent(label_rg))
                                .addGap(18, 18, 18)
                                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(cpfField)
                                    .addComponent(rgField)))
                            .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                                .addComponent(lb_senha)
                                .addGap(18, 18, 18)
                                .addComponent(senhaField, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                        .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                                        .addComponent(label_endereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1))
                                    .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                                        .addComponent(lb_telefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefoneField))))
                            .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(lb_tipo)
                                .addGap(18, 18, 18)
                                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tipoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(36, 36, 36))
        );
        cadastrarUsuarioPanelLayout.setVerticalGroup(
            cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nome)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tipo)
                    .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_senha)
                    .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_cpf)
                            .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_rg)
                            .addComponent(rgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_nascimento)
                            .addComponent(nascimentoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(cadastrarUsuarioPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_telefone))
                        .addGap(18, 18, 18)
                        .addGroup(cadastrarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_endereco)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addComponent(salvarButton)
                .addGap(26, 26, 26))
        );

        cadastrarTurmaPanel.setVisible(false);
        cadastrarTurmaPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cadastrarTurmaPanel.setToolTipText("Administrador");
        cadastrarTurmaPanel.setName("ssadas"); // NOI18N

        salvarButton1.setText("Salvar ");
        salvarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nível:");

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(5);
        jSlider1.setMinimum(1);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(1);

        jLabel2.setText("Língua");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inglês", "Francês", "Espanhol", "Alemão" }));

        javax.swing.GroupLayout cadastrarTurmaPanelLayout = new javax.swing.GroupLayout(cadastrarTurmaPanel);
        cadastrarTurmaPanel.setLayout(cadastrarTurmaPanelLayout);
        cadastrarTurmaPanelLayout.setHorizontalGroup(
            cadastrarTurmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrarTurmaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrarTurmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cadastrarTurmaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cadastrarTurmaPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        cadastrarTurmaPanelLayout.setVerticalGroup(
            cadastrarTurmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarTurmaPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(cadastrarTurmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarButton1)
                .addGap(26, 26, 26))
        );

        cadastrarTurmaPanel.setVisible(false);
        listarUsuarioPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listarUsuarioPanel.setToolTipText("Administrador");
        listarUsuarioPanel.setName("ssadas"); // NOI18N

        salvarButton2.setText("Salvar ");
        salvarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nível:");

        jSlider2.setMajorTickSpacing(1);
        jSlider2.setMaximum(5);
        jSlider2.setMinimum(1);
        jSlider2.setMinorTickSpacing(1);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);
        jSlider2.setSnapToTicks(true);
        jSlider2.setValue(1);

        jLabel4.setText("Língua");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inglês", "Francês", "Espanhol", "Alemão" }));

        javax.swing.GroupLayout listarUsuarioPanelLayout = new javax.swing.GroupLayout(listarUsuarioPanel);
        listarUsuarioPanel.setLayout(listarUsuarioPanelLayout);
        listarUsuarioPanelLayout.setHorizontalGroup(
            listarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listarUsuarioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, listarUsuarioPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(listarUsuarioPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvarButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        listarUsuarioPanelLayout.setVerticalGroup(
            listarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listarUsuarioPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(listarUsuarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvarButton2)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cadastrarTurmaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listarUsuarioPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarUsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrarTurmaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listarUsuarioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarButtonActionPerformed
        this.cadastrarUsuarioPanel.setVisible(false);
        this.cadastrarTurmaPanel.setVisible(false);
    }//GEN-LAST:event_listarButtonActionPerformed

    private void salvarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarButton1ActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        // TODO add your handling code here:
        Integer opcao = JOptionPane.showConfirmDialog(null,
            "Deseja Salvar?",
            "Ok, para confirmar e cancelar para sair",
            JOptionPane.OK_OPTION);

        if (opcao == 0) {

            this.criarUsuario();
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void tipoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoComboBoxActionPerformed

    private void salvarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarButton2ActionPerformed
    
    private void criarUsuario() {
        
        final JFrame frame = new JFrame("Retorno criar usuario");
        
        Usuario usuario = new Usuario(
                nomeField.getText(),
                cpfField.getText(),
                rgField.getText(),
                senhaField.getText(),
                tipoComboBox.getSelectedItem().toString(),
                null, telefoneField.getText(),
                null);
        
        ac = new AdministradorController();
        
        if (ac.criarUsuario(usuario)) {
            JOptionPane.showMessageDialog(frame,
                    "Salvo corretamente",
                    "Novo usuario adicionado no sistema",
                    JOptionPane.PLAIN_MESSAGE);
            
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Não foi possível salvar",
                    "Procure o administrador do sistema",
                    JOptionPane.ERROR_MESSAGE);
            
        }
        
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarTurmaButton;
    private javax.swing.JPanel cadastrarTurmaPanel;
    private javax.swing.JButton cadastrarUsuarioButton;
    private javax.swing.JPanel cadastrarUsuarioPanel;
    private javax.swing.JTextField cpfField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_endereco;
    private javax.swing.JLabel label_nascimento;
    private javax.swing.JLabel label_rg;
    private javax.swing.JLabel lb_cpf;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JLabel lb_tipo;
    private javax.swing.JButton listarButton;
    private javax.swing.JButton listarTurmasButton;
    private javax.swing.JPanel listarUsuarioPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField nascimentoField;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField rgField;
    private javax.swing.JButton salvarButton;
    private javax.swing.JButton salvarButton1;
    private javax.swing.JButton salvarButton2;
    private javax.swing.JPasswordField senhaField;
    private javax.swing.JTextField telefoneField;
    private javax.swing.JComboBox tipoComboBox;
    // End of variables declaration//GEN-END:variables
}
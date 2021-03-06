package view;

// Interface gráfica

import dao.ProdutoDAO;
import javax.swing.JOptionPane;
import model.Produto;
import table.ProdutoTableModel;


/**
 *
 * @author arthursvpb
 */
public class ProdutoView extends javax.swing.JFrame {
    
    Produto pro = new Produto();
    ProdutoDAO prd = new ProdutoDAO();
    
    /**
     * Creates new form ProdutoView
     */
    public ProdutoView() {
        initComponents();
        
        // Centralizar a janela
        setLocationRelativeTo(null);
        
        // Puxar informações do banco de dados
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodos()));
        
        // Botão excluir será false por padrão e só será ativado qndo clicar numa linha
        btExcluir.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
        tfEstoque = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tfPesquisarNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btComprar = new javax.swing.JButton();
        btVender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Depósito");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Preço");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Estoque");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(204, 204, 204));

        tfEstoque.setText("0");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Pesquisar:");

        tfPesquisarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarNomeKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Produtos");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btComprar.setText("Comprar");
        btComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComprarActionPerformed(evt);
            }
        });

        btVender.setText("Vender");
        btVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisarNome)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(25, 25, 25)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(26, 26, 26)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                            .addComponent(tfNome)
                            .addComponent(tfCodigo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btComprar))
                    .addComponent(btVender))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(tfPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btLimpar)
                        .addComponent(btExcluir)
                        .addComponent(btSalvar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
        // FAZER TRATAMENTO PARA QUANDO FOR INPUTADO UM VALOR DIFERENTE DO ESPERADO MANDAR UM WARNING
        //        if(!(tfPreco.getText() instanceof String) == false){
        //            // Campos inválidos
        //            JOptionPane.showConfirmDialog(null, "Você tem certeza?", "EXCLUIR", JOptionPane.YES_NO_OPTION);
        //        }
        
        // Se os campos estiverem vazios
        if("".equals(tfNome.getText()) || "".equals(tfPreco.getText())){
            // Campos inválidos
            JOptionPane.showMessageDialog(null, "Campos em branco!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
        
        // Caso não estejam
        else{
            
            // Insere ou altera se não tiver código
            if(tfCodigo.getText().equals("")){
                
                // Insere novo
                pro.setNome(tfNome.getText());
                pro.setPreco(Double.parseDouble(tfPreco.getText()));
                pro.setQtd_estoque(Integer.parseInt(tfEstoque.getText()));
                prd.inserir(pro);
                
            }else{
                // Altera
                pro.setNome(tfNome.getText());
                pro.setPreco(Double.parseDouble(tfPreco.getText()));
                pro.setQtd_estoque(Integer.parseInt(tfEstoque.getText()));
                pro.setId(Integer.parseInt(tfCodigo.getText()));
                prd.alterar(pro);
                
            }
        }
        
        // Limpa os campos por padrão
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodos()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfPreco.setText("");
        tfEstoque.setText("");
        tfPesquisarNome.setText("");
        
        // Seta o botão como false assim que for salvo
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btSalvarActionPerformed
    
    // Função de clicar na linha para editar
    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        tfCodigo.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_ID).toString());
        tfNome.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_NOME).toString());
        tfPreco.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_PRECO).toString());
        tfEstoque.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProdutoTableModel.COL_QTD_ESTOQUE).toString());
        
        btExcluir.setEnabled(true);
    }//GEN-LAST:event_tbProdutoMouseClicked
    
    // Limpar campos   
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // Limpa os campos
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodos()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfPreco.setText("");
        tfEstoque.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Você tem certeza?", "EXCLUIR", JOptionPane.YES_NO_OPTION);
        
        // Exclui se pressionar SIM
        if(escolha == 0){
            
            int codigo = Integer.parseInt(tfCodigo.getText());
            prd.excluir(codigo);
            
            // Limpa os campos
            tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodos()));
            tfCodigo.setText("");
            tfNome.setText("");
            tfPreco.setText("");
            tfEstoque.setText("");
            
            // Seta o botão como false assim que a linha for excluída
            btExcluir.setEnabled(false);
            
        }
        // Não faz nada se pressionar NÃO
        else{
            
        }
        
        

    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfPesquisarNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarNomeKeyPressed
        String pesquisa = tfPesquisarNome.getText();
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarNome(pesquisa)));
    }//GEN-LAST:event_tfPesquisarNomeKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Voltar
        new MenuView().setVisible(true);
        
        // Fecha a tela atual
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComprarActionPerformed
        // TODO add your handling code here:
        // Se os campos estiverem vazios
        
        // Insere ou altera se não tiver código
        if(tfCodigo.getText().equals("")){
            
            // Insere novo
            pro.setNome(tfNome.getText());
            pro.setPreco(Double.parseDouble(tfPreco.getText()));
            pro.setQtd_estoque(Integer.parseInt(tfEstoque.getText()));
            prd.inserir(pro);
            
        }else{
            // Altera
            pro.setNome(tfNome.getText());
            pro.setPreco(Double.parseDouble(tfPreco.getText()));
            pro.setQtd_estoque(Integer.parseInt(tfEstoque.getText()));
            pro.setId(Integer.parseInt(tfCodigo.getText()));
            prd.alterar(pro);
            
        }
        
        // Limpa os campos por padrão
        tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodos()));
        tfCodigo.setText("");
        tfNome.setText("");
        tfPreco.setText("");
        tfEstoque.setText("");
        tfPesquisarNome.setText("");
        
    }//GEN-LAST:event_btComprarActionPerformed

    private void btVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVenderActionPerformed
        // TODO add your handling code here:
        int escolha = JOptionPane.showConfirmDialog(null, "Você tem certeza?", "EXCLUIR", JOptionPane.YES_NO_OPTION);
        
        // Exclui se pressionar SIM
        if(escolha == 0){
            
            int codigo = Integer.parseInt(tfCodigo.getText());
            prd.excluir(codigo);
            
            // Limpa os campos
            tbProduto.setModel(new ProdutoTableModel(new ProdutoDAO().listarTodos()));
            tfCodigo.setText("");
            tfNome.setText("");
            tfPreco.setText("");
            tfEstoque.setText("");
            
            // Seta o botão como false assim que a linha for excluída
            btExcluir.setEnabled(false);
            
        }
        // Não faz nada se pressionar NÃO
        else{
            
        }
        
        

    }//GEN-LAST:event_btVenderActionPerformed
    
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
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComprar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisarNome;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}

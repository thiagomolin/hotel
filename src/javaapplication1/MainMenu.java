/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


/**
 *
 * @author Thiago Vinícius
 */
public class MainMenu extends javax.swing.JFrame {
    
    public MainMenu() {
        initComponents();
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

        painelReservas = new javax.swing.JPanel();
        novaReserva = new javax.swing.JButton();
        cancelaReserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        painelQuartos = new javax.swing.JPanel();
        listaQuartos = new javax.swing.JButton();
        adicionarQuarto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        registrarQuartoLimpo = new javax.swing.JButton();
        painelClientes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        adicionarCliente = new javax.swing.JButton();
        removerCliente = new javax.swing.JButton();
        painelGerenciamento = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fecharConta = new javax.swing.JButton();
        gerenciarProdutos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setMinimumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(525, 330));

        painelReservas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        novaReserva.setActionCommand("Nova Reserva");
        novaReserva.setLabel("Nova Reserva");
        novaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaReservaActionPerformed(evt);
            }
        });

        cancelaReserva.setText("Cancelar Reserva");
        cancelaReserva.setActionCommand("Nova Reserva");
        cancelaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaReservaActionPerformed(evt);
            }
        });

        jLabel1.setText("Reservas");

        javax.swing.GroupLayout painelReservasLayout = new javax.swing.GroupLayout(painelReservas);
        painelReservas.setLayout(painelReservasLayout);
        painelReservasLayout.setHorizontalGroup(
            painelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelReservasLayout.createSequentialGroup()
                .addGroup(painelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelReservasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(novaReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelaReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelReservasLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelReservasLayout.setVerticalGroup(
            painelReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelReservasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(novaReserva)
                .addGap(18, 18, 18)
                .addComponent(cancelaReserva)
                .addContainerGap())
        );

        painelQuartos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        listaQuartos.setText("Lista de Quartos ");
        listaQuartos.setActionCommand("Nova Reserva");
        listaQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaQuartosActionPerformed(evt);
            }
        });

        adicionarQuarto.setText("Adicionar Quarto");
        adicionarQuarto.setActionCommand("Nova Reserva");
        adicionarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarQuartoActionPerformed(evt);
            }
        });

        jLabel2.setText("Quartos");

        registrarQuartoLimpo.setText("Registrar Quarto Limpo");
        registrarQuartoLimpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarQuartoLimpoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelQuartosLayout = new javax.swing.GroupLayout(painelQuartos);
        painelQuartos.setLayout(painelQuartosLayout);
        painelQuartosLayout.setHorizontalGroup(
            painelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuartosLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrarQuartoLimpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaQuartos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(adicionarQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelQuartosLayout.setVerticalGroup(
            painelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelQuartosLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adicionarQuarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarQuartoLimpo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaQuartos)
                .addContainerGap())
        );

        painelClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Clientes");

        adicionarCliente.setText("Adicionar Cliente");
        adicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarClienteActionPerformed(evt);
            }
        });

        removerCliente.setText("Remover Cliente");
        removerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelClientesLayout = new javax.swing.GroupLayout(painelClientes);
        painelClientes.setLayout(painelClientesLayout);
        painelClientesLayout.setHorizontalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adicionarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(removerCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelClientesLayout.setVerticalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(adicionarCliente)
                .addGap(18, 18, 18)
                .addComponent(removerCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelGerenciamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Gerenciamento");

        fecharConta.setText("Fechar conta");
        fecharConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharContaActionPerformed(evt);
            }
        });

        gerenciarProdutos.setText("Gerenciar produtos");

        javax.swing.GroupLayout painelGerenciamentoLayout = new javax.swing.GroupLayout(painelGerenciamento);
        painelGerenciamento.setLayout(painelGerenciamentoLayout);
        painelGerenciamentoLayout.setHorizontalGroup(
            painelGerenciamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerenciamentoLayout.createSequentialGroup()
                .addGroup(painelGerenciamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGerenciamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fecharConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelGerenciamentoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelGerenciamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gerenciarProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelGerenciamentoLayout.setVerticalGroup(
            painelGerenciamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGerenciamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(gerenciarProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(fecharConta)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(painelGerenciamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(painelQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelGerenciamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaReservaActionPerformed
        this.setEnabled(false);
        NovaReserva nr = new NovaReserva(this);
        nr.setVisible(true);
    }//GEN-LAST:event_novaReservaActionPerformed

    private void cancelaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaReservaActionPerformed
        this.setEnabled(false);
        CancelarReserva ac = new CancelarReserva(this);
        ac.setVisible(true);
    }//GEN-LAST:event_cancelaReservaActionPerformed

    private void listaQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaQuartosActionPerformed
        this.setEnabled(false);
        ListaQuartos ac = new ListaQuartos(this);
        ac.setVisible(true);
    }//GEN-LAST:event_listaQuartosActionPerformed

    private void adicionarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarQuartoActionPerformed
        this.setEnabled(false);
        AdicionarQuarto ac = new AdicionarQuarto(this);
        ac.setVisible(true);
    }//GEN-LAST:event_adicionarQuartoActionPerformed

    private void adicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarClienteActionPerformed
        this.setEnabled(false);
        AdicionarCliente ac = new AdicionarCliente(this);
        ac.setVisible(true);
    }//GEN-LAST:event_adicionarClienteActionPerformed

    private void removerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerClienteActionPerformed
        this.setEnabled(false);
        RemoverCliente ac = new RemoverCliente(this);
        ac.setVisible(true);
    }//GEN-LAST:event_removerClienteActionPerformed

    private void registrarQuartoLimpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarQuartoLimpoActionPerformed
        this.setEnabled(false);
        RegistrarQuartoLimpo ac = new RegistrarQuartoLimpo(this);
        ac.setVisible(true);
    }//GEN-LAST:event_registrarQuartoLimpoActionPerformed

    private void fecharContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharContaActionPerformed
        this.setEnabled(false);
        FecharConta ac = new FecharConta(this);
        ac.setVisible(true);
    }//GEN-LAST:event_fecharContaActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarCliente;
    private javax.swing.JButton adicionarQuarto;
    private javax.swing.JButton cancelaReserva;
    private javax.swing.JButton fecharConta;
    private javax.swing.JButton gerenciarProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton listaQuartos;
    private javax.swing.JButton novaReserva;
    private javax.swing.JPanel painelClientes;
    private javax.swing.JPanel painelGerenciamento;
    private javax.swing.JPanel painelQuartos;
    private javax.swing.JPanel painelReservas;
    private javax.swing.JButton registrarQuartoLimpo;
    private javax.swing.JButton removerCliente;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controledelaudos.view.componentes;

/**
 *
 * @author ritacosta
 */
public class BarraDeBtn extends javax.swing.JPanel {

    /**
     * Creates new form BarraDeBtn
     */
    public BarraDeBtn() {
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

        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controledelaudos/view/imagens/add.png"))); // NOI18N
        btnNovo.setToolTipText("Novo registro");
        btnNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controledelaudos/view/imagens/cancel.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar inclusão");

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controledelaudos/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar na base de dados");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controledelaudos/view/imagens/update.png"))); // NOI18N
        btnAtualizar.setToolTipText("Atualizar registro");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controledelaudos/view/imagens/excluir.png"))); // NOI18N
        btnExcluir.setToolTipText("Excluir registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAtualizar, btnExcluir, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
            .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnExcluir, btnNovo, btnSalvar});

    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnAtualizar() {
        return btnAtualizar;
    }

    public void setBtnAtualizar(javax.swing.JButton btnAtualizar) {
        this.btnAtualizar = btnAtualizar;
    }

    public javax.swing.JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(javax.swing.JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public javax.swing.JButton getBtnExcluir() {
        return btnExcluir;
    }

    public void setBtnExcluir(javax.swing.JButton btnExcluir) {
        this.btnExcluir = btnExcluir;
    }

    public javax.swing.JButton getBtnNovo() {
        return btnNovo;
    }

    public void setBtnNovo(javax.swing.JButton btnNovo) {
        this.btnNovo = btnNovo;
    }

    public javax.swing.JButton getBtnSalvar() {
        return btnSalvar;
    }

    public void setBtnSalvar(javax.swing.JButton btnSalvar) {
        this.btnSalvar = btnSalvar;
    }

    
    
    

}

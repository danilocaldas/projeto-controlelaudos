/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.view.form;

import com.controledelaudos.control.facade.ProcedimentoFACADE;
import com.controledelaudos.model.beans.TabProcedimento;
import com.controledelaudos.view.rn.ControleDeCaracteres;
import com.controledelaudos.view.tablemodels.ProcedimentoTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author CMR
 */
public class FormCadProcedimento extends javax.swing.JInternalFrame {

    private List<TabProcedimento> listaProcedimento;
    private Integer codProcedimento;
    private int linhaSelecionada;

    public FormCadProcedimento() {
        initComponents();
        eventosDosBoes();
        habilitarBotoes(true);
        habilitarCampos(false);
        addListaProcedimentoNaTabela();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProcedimentos = new javax.swing.JTable();
        barraDeBtn1 = new com.controledelaudos.view.componentes.BarraDeBtn();

        setClosable(true);
        setIconifiable(true);
        setTitle("Procedimentos");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Insira os dados do procedimento"));

        jLabel3.setText("CÓDIGO:");

        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyTyped(evt);
            }
        });

        txtID.setEnabled(false);

        jLabel2.setText("DESCRIÇÃO:");

        jLabel1.setText("ID:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricao)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de procedimentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setToolTipText("");

        tbProcedimentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbProcedimentos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(barraDeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraDeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyTyped
        ControleDeCaracteres.permitirSomenteTexto(evt);
    }//GEN-LAST:event_txtDescricaoKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        ControleDeCaracteres.permitirSomenteNumeros(evt);
    }//GEN-LAST:event_txtCodigoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.controledelaudos.view.componentes.BarraDeBtn barraDeBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProcedimentos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

    private void habilitarBotoes(boolean enabled) {
        barraDeBtn1.getBtnNovo().setEnabled(enabled);
        barraDeBtn1.getBtnSalvar().setEnabled(!enabled);
        barraDeBtn1.getBtnCancelar().setEnabled(!enabled);
        limparCampos();
    }

    private void habilitarCampos(boolean enabled) {
        txtDescricao.setEnabled(enabled);
        txtCodigo.setEnabled(enabled);
    }

    private void limparCampos() {
        txtID.setText("");
        txtDescricao.setText("");
        txtCodigo.setText("");
    }

    private void addListaProcedimentoNaTabela() {
        listaProcedimento = new ProcedimentoFACADE().listarTodosProcedimentos();
        if (listaProcedimento != null) {
            tbProcedimentos.setModel(new ProcedimentoTableModel(listaProcedimento));

        }
    }

    private boolean validarCamposNoFomulário() {
        String campoCodigo = txtDescricao.getText();
        String campoDescricao = txtCodigo.getText();
        if ("".equals(campoCodigo)) {
            JOptionPane.showMessageDialog(this, "Campo `DESCRIÇÃO` obrigatório.", "Erro", JOptionPane.ERROR_MESSAGE);
            txtDescricao.requestFocus();
            return false;
        } else if ("".equals(campoDescricao)) {
            JOptionPane.showMessageDialog(this, "Campo `CÓDIGO` obrigatório.", "Erro", JOptionPane.ERROR_MESSAGE);
            txtCodigo.requestFocus();
            return false;
        }
        return true;
    }

    private void salvarOuAlterarProcedimento() {
        if (!validarCamposNoFomulário()) {
            return;
        }

        String campoDescricao = txtDescricao.getText().toUpperCase();
        String campoCodigo = txtCodigo.getText();
        TabProcedimento procedimento = new TabProcedimento();
        procedimento.setDescricao(campoDescricao);
        procedimento.setCodigo(Integer.parseInt(String.valueOf(campoCodigo)));

        if (codProcedimento == null) {
            new ProcedimentoFACADE().salvaOuAtualizarProcedimento(procedimento);
            JOptionPane.showMessageDialog(this, "Procedimento salvo com sucesso.");
        } else {
            procedimento.setCodProcedimento(codProcedimento);
            new ProcedimentoFACADE().salvaOuAtualizarProcedimento(procedimento);
            JOptionPane.showMessageDialog(this, "Procedimento atualizado com sucesso.");
            codProcedimento = null;
            habilitarBotoes(true);
            habilitarCampos(false);
        }
        addListaProcedimentoNaTabela();
        limparCampos();
    }

    private boolean validarSeleçãoNaTabela(String msg) {
        linhaSelecionada = tbProcedimentos.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, msg);
            return false;
        }
        return true;
    }

    private void prepararParaAtualizar() {
        String msg = "Selecione um registro para atualiza-lo.";
        if (!validarSeleçãoNaTabela(msg)) {
            return;
        }
        habilitarCampos(true);
        habilitarBotoes(false);
        TabProcedimento procedimento = new ProcedimentoTableModel(listaProcedimento).get(linhaSelecionada);
        codProcedimento = procedimento.getCodProcedimento();
        txtID.setText(String.valueOf(procedimento.getCodProcedimento()));
        txtDescricao.setText(procedimento.getDescricao());
        txtCodigo.setText(String.valueOf(procedimento.getCodigo()));
    }

    private void excluir() {
        String msg = "Selecione um registro para remover.";
        if (!validarSeleçãoNaTabela(msg)) {
            return;
        }
        TabProcedimento procedimento = new ProcedimentoTableModel(listaProcedimento).get(linhaSelecionada);
        int confirm = JOptionPane.showConfirmDialog(this, "Confirmar a exclusão? A exclusão do procedimento " + procedimento.getDescricao() + " \n"
                + "pode apagar registros em outras partes do sistema.", "Excluir procedimento", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (confirm != 0) {
            return;
        }
        new ProcedimentoFACADE().remover(procedimento);
        this.addListaProcedimentoNaTabela();
    }

    private void eventosDosBoes() {
        //botão salvar
        barraDeBtn1.getBtnSalvar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarOuAlterarProcedimento();
            }
        });
        //botão novo
        barraDeBtn1.getBtnNovo().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                habilitarBotoes(false);
                habilitarCampos(true);

            }
        });
        //botão atualizar
        barraDeBtn1.getBtnAtualizar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                prepararParaAtualizar();
            }
        });

        //botão cancelar
        barraDeBtn1.getBtnCancelar().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                habilitarBotoes(true);
                habilitarCampos(false);
            }
        });

        //botão excluir
        barraDeBtn1.getBtnExcluir().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                excluir();
            }
        });

    }

}
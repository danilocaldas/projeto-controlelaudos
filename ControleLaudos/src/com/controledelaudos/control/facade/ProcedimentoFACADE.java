/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.control.facade;

import com.controledelaudos.model.beans.TabProcedimento;
import com.controledelaudos.model.dao.interfaces.ProcedimentoDAO;
import com.controledelaudos.model.dao.services.ProcedimentoServices;
import java.util.List;

/**
 *
 * @author CMR
 */
public class ProcedimentoFACADE {

    private final ProcedimentoDAO dao;

    public ProcedimentoFACADE() {
        dao = new ProcedimentoServices();
    }

    public void salvaOuAtualizarProcedimento(TabProcedimento procedimento) {
        this.dao.save(procedimento);
    }

    public void remover(TabProcedimento procedimento) {
        this.dao.delete(procedimento);
    }

    public List<TabProcedimento> listarTodosProcedimentos() {
        return this.dao.findAll();
    }

}

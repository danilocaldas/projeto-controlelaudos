/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.control.facade;

import com.controledelaudos.model.beans.TabLote;
import com.controledelaudos.model.dao.interfaces.LoteDAO;
import com.controledelaudos.model.dao.services.LoteServices;
import java.util.List;

/**
 *
 * @author CMR
 */
public class LoteFACADE {

    private final LoteDAO dao;

    public LoteFACADE() {
        dao = new LoteServices();
    }

    public void salvarOuAtualizarLote(TabLote lote) {
        this.dao.save(lote);
    }

    public void removerLote(TabLote lote) {
        this.dao.delete(lote);
    }

    public List<TabLote> listarLotes() {
        return this.dao.findAll();
    }

}

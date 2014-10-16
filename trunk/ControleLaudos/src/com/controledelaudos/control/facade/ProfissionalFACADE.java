/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.control.facade;

import com.controledelaudos.model.beans.TabProfissional;
import com.controledelaudos.model.dao.interfaces.ProfissionalDAO;
import com.controledelaudos.model.dao.services.ProfissionalServices;
import java.util.List;

/**
 *
 * @author CMR
 */
public class ProfissionalFACADE {

    private final ProfissionalDAO dao;

    public ProfissionalFACADE() {
        dao = new ProfissionalServices();
    }

    public void salvarProfissional(TabProfissional profissional) {
        this.dao.save(profissional);
    }

    public void removerProfissional(TabProfissional profissional) {
        this.dao.delete(profissional);
    }

    public List<TabProfissional> listarTodosProfissionais() {
        return this.dao.findAll();
    }

}

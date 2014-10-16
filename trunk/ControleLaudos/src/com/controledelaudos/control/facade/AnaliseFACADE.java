/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.control.facade;

import com.controledelaudos.model.beans.TabAnalise;
import com.controledelaudos.model.beans.TabPrestador;
import com.controledelaudos.model.beans.TabProfissional;
import com.controledelaudos.model.dao.interfaces.AnaliseDAO;
import com.controledelaudos.model.dao.services.AnaliseServices;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author CMR
 */
public class AnaliseFACADE {

    private final AnaliseDAO dao;

    public AnaliseFACADE() {
        dao = new AnaliseServices();
    }

    public void salvarOuAtualizarAnalise(TabAnalise analise) {
        this.dao.save(analise);
    }

    public void removerAnalise(TabAnalise analise) {
        this.dao.delete(analise);
    }

    public List<TabAnalise> listarTodasAnalises() {
        return this.dao.findAll();
    }
    
    public List<TabAnalise> listarPorPeriodo(Date inicio , Date fim) {
        return this.dao.findByPeriodo(inicio, fim);
    }
    
    public List<TabAnalise> listarPorPeriodoProfissional(TabProfissional profissional ,Date inicio , Date fim) {
        return this.dao.findByPeriodoProfissional(profissional, inicio, fim);
    }
    
    public List<TabAnalise> listarPorPeriodoPrestador(TabPrestador prestador , Date inicio, Date fim) {
        return this.dao.findByPeriodoPrestador(prestador, inicio, fim);
    }
}

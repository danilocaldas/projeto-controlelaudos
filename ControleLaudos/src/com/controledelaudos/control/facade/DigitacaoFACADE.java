/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.control.facade;

import com.controledelaudos.model.beans.TabDigitacao;
import com.controledelaudos.model.beans.TabPrestador;
import com.controledelaudos.model.beans.TabProfissional;
import com.controledelaudos.model.dao.interfaces.DigitacaoDAO;
import com.controledelaudos.model.dao.services.DigitacaoServices;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author CMR
 */
public class DigitacaoFACADE {

    private final DigitacaoDAO dao;

    public DigitacaoFACADE() {
        dao = new DigitacaoServices();
    }

    public void salvarOuAtualizarDigitacao(TabDigitacao digitacao) {
        this.dao.save(digitacao);
    }

    public void removerDigitacao(TabDigitacao digitacao) {
        this.dao.save(digitacao);
    }

    public List<TabDigitacao> listarDigitação() {
        return this.dao.findAll();
    }

    public List<TabDigitacao> listarDigitaçãoPorPeriodo(Date inicio, Date fim) {
        return this.dao.findByPeriodo(inicio, fim);
    }

    public List<TabDigitacao> listarDigitação(TabProfissional profissional, Date inicio, Date fim) {
        return this.dao.findByPeriodoPorDigitador(profissional, inicio, fim);
    }

    public List<TabDigitacao> listarDigitação(TabPrestador prestador, Date inicio, Date fim) {
        return this.dao.findByPeriodoPorPrestador(prestador, inicio, fim);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.dao.interfaces;

import com.controledelaudos.model.beans.TabDigitacao;
import com.controledelaudos.model.beans.TabPrestador;
import com.controledelaudos.model.beans.TabProfissional;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author CMR
 */
public interface DigitacaoDAO extends GenericDAO<TabDigitacao>{
    
    List<TabDigitacao> findByPeriodo(Date incio, Date fim);
    List<TabDigitacao> findByPeriodoPorDigitador(TabProfissional profissional, Date inicio, Date fim);
    List<TabDigitacao> findByPeriodoPorPrestador(TabPrestador prestador, Date inicio, Date fim);
    
}

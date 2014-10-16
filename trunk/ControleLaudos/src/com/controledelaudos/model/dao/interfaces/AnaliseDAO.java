/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.dao.interfaces;

import com.controledelaudos.model.beans.TabAnalise;
import com.controledelaudos.model.beans.TabPrestador;
import com.controledelaudos.model.beans.TabProfissional;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author CMR
 */
public interface AnaliseDAO extends GenericDAO<TabAnalise> {

    List<TabAnalise> findByPeriodo(Date incio, Date fim);

    List<TabAnalise> findByPeriodoProfissional(TabProfissional profissional, Date inicio, Date fim);

    List<TabAnalise> findByPeriodoPrestador(TabPrestador prestador, Date inicio, Date fim);

}

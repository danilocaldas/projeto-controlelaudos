/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.control.facade;

import com.controledelaudos.model.beans.TabPrestador;
import com.controledelaudos.model.dao.interfaces.PrestadorDAO;
import com.controledelaudos.model.dao.services.PrestadorServices;
import java.util.List;

/**
 *
 * @author CMR
 */
public class PrestadorFACADE {

    private final PrestadorDAO dao;

    public PrestadorFACADE() {
        dao = new PrestadorServices();
    }

    public void salvarOuAtualizarPrestador(TabPrestador prestador){
        dao.save(prestador);
    }
    
    public void removerPrestador(TabPrestador prestador){
        dao.delete(prestador);
    }
    
    public List<TabPrestador> listarTodosPrestadores(){
       return dao.findAll();
    }
    
}

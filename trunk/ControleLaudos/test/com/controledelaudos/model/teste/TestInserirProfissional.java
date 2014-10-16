/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.teste;

import com.controledelaudos.control.facade.ProfissionalFACADE;
import com.controledelaudos.model.beans.TabProfissional;
import java.util.List;

/**
 *
 * @author CMR
 */
public class TestInserirProfissional {
    
    public static void main(String[] args) {
        
        TabProfissional profissional = new TabProfissional();
        
        profissional.setCargo("DIGITADOR");
        profissional.setNome("BRUNO");
        profissional.setSobrenome("SANTOS");
        
        new ProfissionalFACADE().salvarProfissional(profissional);
        
        List<TabProfissional> lista = new ProfissionalFACADE().listarTodosProfissionais();
        for(TabProfissional pro : lista){
            System.out.println("Lista: "+pro);
        }
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.teste;

import com.controledelaudos.control.facade.ProcedimentoFACADE;
import com.controledelaudos.model.beans.TabProcedimento;
import java.util.List;

/**
 *
 * @author CMR
 */
public class TestInserirProcedimento {
    
    
    public static void main(String[] args) {
        
        TabProcedimento procedimento = new TabProcedimento();
        procedimento.setCodigo(432532);
        procedimento.setDescricao("RADIOTERAPIA");
        
        new ProcedimentoFACADE().salvaOuAtualizarProcedimento(procedimento);
        
        List<TabProcedimento> lista = new ProcedimentoFACADE().listarTodosProcedimentos();
        for(TabProcedimento pro: lista){
            System.out.println("Lista: "+pro);
        }
            
    }
}
    


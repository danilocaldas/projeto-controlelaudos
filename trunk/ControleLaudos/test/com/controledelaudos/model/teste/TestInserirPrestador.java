/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.teste;

import com.controledelaudos.control.facade.PrestadorFACADE;
import com.controledelaudos.model.beans.TabPrestador;
import com.controledelaudos.model.utils.EntityManagerUTIL;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author CMR
 */
public class TestInserirPrestador {
    public static void main(String[] args) {
        
//        EntityManager em = EntityManagerUTIL.getEntityManager();
//        TabPrestador prestador = new TabPrestador();
//        prestador.setNomeFantasia("HSA");
//        prestador.setCnes(435354);
//        prestador.setCodPrestador(1);
//        em.getTransaction().begin();
//        em.merge(prestador);
//        Query query = em.createNamedQuery("TabPrestador.findAll", TabPrestador.class);
//        System.out.println(""
//                + "Lista ------ "+query.getResultList().toString());
//        
//        em.getTransaction().commit();
        
//        new PrestadorFACADE().salvarOuAtualizarPrestador(prestador);
            
          List<TabPrestador> lista = new PrestadorFACADE().listarTodosPrestadores();
          for (TabPrestador prestador : lista) {
              System.out.println("Lista "+prestador);
        }
        
    }
    
}

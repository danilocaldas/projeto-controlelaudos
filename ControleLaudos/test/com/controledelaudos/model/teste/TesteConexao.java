/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.teste;

import com.controledelaudos.model.utils.EntityManagerUTIL;
import javax.persistence.EntityManager;


/**
 *
 * @author CMR
 */
public class TesteConexao {

   
    public static void main(String[] args) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        em.getTransaction().begin();
        em.getTransaction().commit();

    }

}

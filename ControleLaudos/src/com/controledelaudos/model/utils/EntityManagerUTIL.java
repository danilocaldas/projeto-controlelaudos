/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author CMR
 */
public class EntityManagerUTIL {

    static EntityManagerFactory emf = null;

    public static EntityManager getEntityManager() {
        if (emf == null) {
            try {
                emf = Persistence.createEntityManagerFactory("ControleLaudosPU");
            } catch (Exception e) {
                System.out.println("Erro ao criar o EntityManagerFactory. Erro " + e.getMessage());
            }

        }
        return emf.createEntityManager();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.dao.services;

import com.controledelaudos.model.beans.TabProcedimento;
import com.controledelaudos.model.dao.interfaces.ProcedimentoDAO;
import com.controledelaudos.model.utils.EntityManagerUTIL;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author CMR
 */
public class ProcedimentoServices implements ProcedimentoDAO {

    @Override
    public List<TabProcedimento> findAll() {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createNamedQuery("TabProcedimento.findAll", TabProcedimento.class);
        em.getTransaction().commit();
        return query.getResultList();
    }

    @Override
    public void save(TabProcedimento entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir o procedimento. Erro: " + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }

    }

    @Override
    public void delete(TabProcedimento entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            entity = em.find(TabProcedimento.class, entity.getCodProcedimento());
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar remover o procedimento. Erro: " + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }
    }

}

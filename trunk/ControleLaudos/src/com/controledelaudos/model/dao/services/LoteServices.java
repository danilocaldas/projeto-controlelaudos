/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.dao.services;

import com.controledelaudos.model.beans.TabLote;
import com.controledelaudos.model.dao.interfaces.LoteDAO;
import com.controledelaudos.model.utils.EntityManagerUTIL;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author CMR
 */
public class LoteServices implements LoteDAO {

    @Override
    public void save(TabLote entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir o lote. Erro: " + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }

    }

    @Override
    public void delete(TabLote entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            entity = em.find(TabLote.class, entity.getCodTramitacao());
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir o lote. Erro: " + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }
    }

    @Override
    public List<TabLote> findAll() {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createNamedQuery("TabLote.findAll", TabLote.class);
        em.getTransaction().commit();
        return query.getResultList();
    }

}

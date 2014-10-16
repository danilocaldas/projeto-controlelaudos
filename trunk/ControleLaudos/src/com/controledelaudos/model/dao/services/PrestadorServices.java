/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.dao.services;

import com.controledelaudos.model.beans.TabPrestador;
import com.controledelaudos.model.dao.interfaces.PrestadorDAO;
import com.controledelaudos.model.utils.EntityManagerUTIL;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author CMR
 */
public class PrestadorServices implements PrestadorDAO {

    @Override
    public List<TabPrestador> findAll() {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createNamedQuery("TabPrestador.findAll", TabPrestador.class);
        em.getTransaction().commit();
        return query.getResultList();
    }

    @Override
    public void save(TabPrestador entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir um prestador. Erro: " + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(TabPrestador entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            entity = em.find(TabPrestador.class, entity.getCodPrestador());
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar remover um prestador. Erro: " + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }
    }

}

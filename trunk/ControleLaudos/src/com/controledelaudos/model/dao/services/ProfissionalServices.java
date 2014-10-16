/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.dao.services;

import com.controledelaudos.model.beans.TabProfissional;
import com.controledelaudos.model.dao.interfaces.ProfissionalDAO;
import com.controledelaudos.model.utils.EntityManagerUTIL;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author CMR
 */
public class ProfissionalServices implements ProfissionalDAO {

    @Override
    public List<TabProfissional> findAll() {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createNamedQuery("TabProfissional.findAll", TabProfissional.class);
        em.getTransaction().commit();
        return query.getResultList();
    }

    @Override
    public void save(TabProfissional entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir o profissional. Erro: " + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(TabProfissional entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            entity = em.find(TabProfissional.class, entity.getCodProfissional());
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir o profissional. Erro: " + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }
    }
}

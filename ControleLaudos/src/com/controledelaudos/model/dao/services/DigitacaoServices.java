/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.dao.services;

import com.controledelaudos.model.beans.TabDigitacao;
import com.controledelaudos.model.beans.TabPrestador;
import com.controledelaudos.model.beans.TabProfissional;
import com.controledelaudos.model.dao.interfaces.DigitacaoDAO;
import com.controledelaudos.model.utils.EntityManagerUTIL;
import java.sql.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author CMR
 */
public class DigitacaoServices implements DigitacaoDAO {

    @Override
    public void save(TabDigitacao entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir a digitação. Erro :" + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }

    }

    @Override
    public void delete(TabDigitacao entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            entity = em.find(TabDigitacao.class, entity.getCodDigitacao());
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar remover a digitação. Erro :" + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();

        }
    }

    @Override
    public List<TabDigitacao> findAll() {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createNamedQuery("TabDigitacao.findAll", TabDigitacao.class);
        em.getTransaction().commit();
        return query.getResultList();

    }

    @Override
    public List<TabDigitacao> findByPeriodo(Date incio, Date fim) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createNamedQuery("TabDigitacao.findByPeriodo", TabDigitacao.class);
        query.setParameter("inicio", incio);
        query.setParameter("fim", fim);
        em.getTransaction().commit();
        return query.getResultList();
    }

    @Override
    public List<TabDigitacao> findByPeriodoPorDigitador(TabProfissional profissional, Date inicio, Date fim) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createNamedQuery("TabDigitacao.findByPeriodoDigitador", TabDigitacao.class);
        query.setParameter("profissional", profissional);
        query.setParameter("inicio", inicio);
        query.setParameter("fim", fim);
        em.getTransaction().commit();
        return query.getResultList();
    }

    @Override
    public List<TabDigitacao> findByPeriodoPorPrestador(TabPrestador prestador, Date inicio, Date fim) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createNamedQuery("TabDigitacao.findByPeriodoPrestador", TabDigitacao.class);
        query.setParameter("prestador", prestador);
        query.setParameter("inicio", inicio);
        query.setParameter("fim", fim);
        em.getTransaction().commit();
        return query.getResultList();
    }

}

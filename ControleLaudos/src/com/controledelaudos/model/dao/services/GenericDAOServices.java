/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.dao.services;

import com.controledelaudos.model.beans.TabPrestador;
import com.controledelaudos.model.dao.interfaces.GenericDAO;
import com.controledelaudos.model.utils.EntityManagerUTIL;
import javax.persistence.EntityManager;

/**
 *
 * @author CMR
 * @param <T>
 */
public abstract class GenericDAOServices<T> implements GenericDAO<T> {

    private final Class<T> classeEntidade;

    public GenericDAOServices(Class<T> classeEntidade) {
        this.classeEntidade = classeEntidade;
    }

    @Override
    public void save(T entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao inserir " + entity.getClass() + " na base de dados. Erro " + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }
    }

    @Override
    public void delete(T entity) {
        EntityManager em = EntityManagerUTIL.getEntityManager();
        try {
            em.getTransaction().begin();
            entity = em.find(classeEntidade, entity.getClass());
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro ao remover " + entity.getClass() + " na base de dados. Erro " + e.getMessage());
            if (!em.getTransaction().isActive()) {
                em.getTransaction().begin();
            }
            em.getTransaction().rollback();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.dao.interfaces;

import java.util.List;

/**
 *
 * @author CMR
 * @param <T> Objeto - Entidade
 */
public interface GenericDAO<T> {

    void save(T entity);

    void delete(T entity);

    List<T> findAll();

}
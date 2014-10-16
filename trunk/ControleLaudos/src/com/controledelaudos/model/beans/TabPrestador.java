/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author CMR
 */
@Entity
@Table(name = "tab_prestador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabPrestador.findAll", query = "SELECT t FROM TabPrestador t ORDER BY t.nomeFantasia"),
    @NamedQuery(name = "TabPrestador.findByCodPrestador", query = "SELECT t FROM TabPrestador t WHERE t.codPrestador = :codPrestador"),
    @NamedQuery(name = "TabPrestador.findByNomeFantasia", query = "SELECT t FROM TabPrestador t WHERE t.nomeFantasia = :nomeFantasia"),
    @NamedQuery(name = "TabPrestador.findByCnes", query = "SELECT t FROM TabPrestador t WHERE t.cnes = :cnes")})
public class TabPrestador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_prestador")
    private Integer codPrestador;
    @Basic(optional = false)
    @Column(name = "nome_fantasia")
    private String nomeFantasia;
    @Basic(optional = false)
    @Column(name = "cnes")
    private int cnes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPrestador")
    private List<TabLote> tabLoteList;

    public TabPrestador() {
    }

    public TabPrestador(Integer codPrestador) {
        this.codPrestador = codPrestador;
    }

    public TabPrestador(Integer codPrestador, String nomeFantasia, int cnes) {
        this.codPrestador = codPrestador;
        this.nomeFantasia = nomeFantasia;
        this.cnes = cnes;
    }

    public Integer getCodPrestador() {
        return codPrestador;
    }

    public void setCodPrestador(Integer codPrestador) {
        this.codPrestador = codPrestador;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getCnes() {
        return cnes;
    }

    public void setCnes(int cnes) {
        this.cnes = cnes;
    }

    @XmlTransient
    public List<TabLote> getTabLoteList() {
        return tabLoteList;
    }

    public void setTabLoteList(List<TabLote> tabLoteList) {
        this.tabLoteList = tabLoteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPrestador != null ? codPrestador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabPrestador)) {
            return false;
        }
        TabPrestador other = (TabPrestador) object;
        return !((this.codPrestador == null && other.codPrestador != null) || (this.codPrestador != null && !this.codPrestador.equals(other.codPrestador)));
    }

    @Override
    public String toString() {
        return "Codigo "+codPrestador+" Nome fantasia "+nomeFantasia+" Cnes "+cnes;
    }
    
}

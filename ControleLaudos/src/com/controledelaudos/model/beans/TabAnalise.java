/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author CMR
 */
@Entity
@Table(name = "tab_analise")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabAnalise.findAll", query = "SELECT t FROM TabAnalise t ORDER BY t.dataAnalise"),
    @NamedQuery(name = "TabAnalise.findByCodAnalise", query = "SELECT t FROM TabAnalise t WHERE t.codAnalise = :codAnalise"),
    @NamedQuery(name = "TabAnalise.findByQtdAnalisada", query = "SELECT t FROM TabAnalise t WHERE t.qtdAnalisada = :qtdAnalisada"),
    @NamedQuery(name = "TabAnalise.findByDataAnalise", query = "SELECT t FROM TabAnalise t WHERE t.dataAnalise = :dataAnalise"),
    @NamedQuery(name = "TabAnalise.findByPeriodo", query = "SELECT t FROM TabAnalise t WHERE t.dataAnalise BETWEEN :inicio AND :fim"),
    @NamedQuery(name = "TabAnalise.findByPeriodoProfissional", query = "SELECT t FROM TabAnalise t WHERE t.codProfissional = :profissional AND t.dataAnalise BETWEEN :inicio AND :fim"),
    @NamedQuery(name = "TabAnalise.findByPeriodoPrestador", query = "SELECT t FROM TabAnalise t WHERE t.tabLoteList.codPrestador = :prestador AND t.dataAnalise BETWEEN :inicio AND :fim")})
public class TabAnalise implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_analise")
    private Integer codAnalise;
    @Basic(optional = false)
    @Column(name = "qtd_analisada")
    private int qtdAnalisada;
    @Basic(optional = false)
    @Column(name = "data_analise")
    @Temporal(TemporalType.DATE)
    private Date dataAnalise;
    @OneToMany(mappedBy = "codAnalise")
    private List<TabLote> tabLoteList;
    @JoinColumn(name = "cod_profissional", referencedColumnName = "cod_profissional")
    @ManyToOne(optional = false)
    private TabProfissional codProfissional;

    public TabAnalise() {
    }

    public TabAnalise(Integer codAnalise) {
        this.codAnalise = codAnalise;
    }

    public TabAnalise(Integer codAnalise, int qtdAnalisada, Date dataAnalise) {
        this.codAnalise = codAnalise;
        this.qtdAnalisada = qtdAnalisada;
        this.dataAnalise = dataAnalise;
    }

    public Integer getCodAnalise() {
        return codAnalise;
    }

    public void setCodAnalise(Integer codAnalise) {
        this.codAnalise = codAnalise;
    }

    public int getQtdAnalisada() {
        return qtdAnalisada;
    }

    public void setQtdAnalisada(int qtdAnalisada) {
        this.qtdAnalisada = qtdAnalisada;
    }

    public Date getDataAnalise() {
        return dataAnalise;
    }

    public void setDataAnalise(Date dataAnalise) {
        this.dataAnalise = dataAnalise;
    }

    @XmlTransient
    public List<TabLote> getTabLoteList() {
        return tabLoteList;
    }

    public void setTabLoteList(List<TabLote> tabLoteList) {
        this.tabLoteList = tabLoteList;
    }

    public TabProfissional getCodProfissional() {
        return codProfissional;
    }

    public void setCodProfissional(TabProfissional codProfissional) {
        this.codProfissional = codProfissional;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAnalise != null ? codAnalise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabAnalise)) {
            return false;
        }
        TabAnalise other = (TabAnalise) object;
        if ((this.codAnalise == null && other.codAnalise != null) || (this.codAnalise != null && !this.codAnalise.equals(other.codAnalise))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.controledelaudos.model.beans.TabAnalise[ codAnalise=" + codAnalise + " ]";
    }
    
}

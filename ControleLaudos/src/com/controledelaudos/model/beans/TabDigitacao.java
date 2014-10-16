/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.beans;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author CMR
 */
@Entity
@Table(name = "tab_digitacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabDigitacao.findAll", query = "SELECT t FROM TabDigitacao t"),
    @NamedQuery(name = "TabDigitacao.findByCodDigitacao", query = "SELECT t FROM TabDigitacao t WHERE t.codDigitacao = :codDigitacao"),
    @NamedQuery(name = "TabDigitacao.findByQtdDigitada", query = "SELECT t FROM TabDigitacao t WHERE t.qtdDigitada = :qtdDigitada"),
    @NamedQuery(name = "TabDigitacao.findByPeriodo", query = "SELECT t FROM TabDigitacao t WHERE t.dataDigitacao BETWEEN :inicio AND :fim"),
    @NamedQuery(name = "TabDigitacao.findByPeriodoDigitador", query = "SELECT t FROM TabDigitacao t WHERE t.codProfissional = :profissional AND t.dataDigitacao BETWEEN :inicio AND :fim"),
    @NamedQuery(name = "TabDigitacao.findByPeriodoPrestador", query = "SELECT t FROM TabDigitacao t WHERE t.tabLoteList.codPrestador = :prestador AND t.dataDigitacao BETWEEN :inicio AND :fim")})
public class TabDigitacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_digitacao")
    private Integer codDigitacao;
    @Basic(optional = false)
    @Column(name = "qtd_digitada")
    private String qtdDigitada;
    @Basic(optional = false)
    @Column(name = "data_digitacao")
    private String dataDigitacao;
    @OneToMany(mappedBy = "codDigitacao")
    private List<TabLote> tabLoteList;
    @JoinColumn(name = "cod_profissional", referencedColumnName = "cod_profissional")
    @ManyToOne(optional = false)
    private TabProfissional codProfissional;

    public TabDigitacao() {
    }

    public TabDigitacao(Integer codDigitacao) {
        this.codDigitacao = codDigitacao;
    }

    public TabDigitacao(Integer codDigitacao, String qtdDigitada, String dataDigitacao) {
        this.codDigitacao = codDigitacao;
        this.qtdDigitada = qtdDigitada;
        this.dataDigitacao = dataDigitacao;
    }

    public Integer getCodDigitacao() {
        return codDigitacao;
    }

    public void setCodDigitacao(Integer codDigitacao) {
        this.codDigitacao = codDigitacao;
    }

    public String getQtdDigitada() {
        return qtdDigitada;
    }

    public void setQtdDigitada(String qtdDigitada) {
        this.qtdDigitada = qtdDigitada;
    }

    public String getDataDigitacao() {
        return dataDigitacao;
    }

    public void setDataDigitacao(String dataDigitacao) {
        this.dataDigitacao = dataDigitacao;
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
        hash += (codDigitacao != null ? codDigitacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabDigitacao)) {
            return false;
        }
        TabDigitacao other = (TabDigitacao) object;
        if ((this.codDigitacao == null && other.codDigitacao != null) || (this.codDigitacao != null && !this.codDigitacao.equals(other.codDigitacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.controledelaudos.model.beans.TabDigitacao[ codDigitacao=" + codDigitacao + " ]";
    }
    
}

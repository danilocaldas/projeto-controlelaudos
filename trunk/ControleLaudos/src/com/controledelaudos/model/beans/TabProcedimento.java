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
@Table(name = "tab_procedimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabProcedimento.findAll", query = "SELECT t FROM TabProcedimento t ORDER BY t.descricao"),
    @NamedQuery(name = "TabProcedimento.findByCodProcedimento", query = "SELECT t FROM TabProcedimento t WHERE t.codProcedimento = :codProcedimento"),
    @NamedQuery(name = "TabProcedimento.findByDescricao", query = "SELECT t FROM TabProcedimento t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "TabProcedimento.findByCodigo", query = "SELECT t FROM TabProcedimento t WHERE t.codigo = :codigo")})
public class TabProcedimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_procedimento")
    private Integer codProcedimento;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "codigo")
    private int codigo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codProcedimento")
    private List<TabLote> tabLoteList;

    public TabProcedimento() {
    }

    public TabProcedimento(Integer codProcedimento) {
        this.codProcedimento = codProcedimento;
    }

    public TabProcedimento(Integer codProcedimento, String descricao, int codigo) {
        this.codProcedimento = codProcedimento;
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public Integer getCodProcedimento() {
        return codProcedimento;
    }

    public void setCodProcedimento(Integer codProcedimento) {
        this.codProcedimento = codProcedimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        hash += (codProcedimento != null ? codProcedimento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabProcedimento)) {
            return false;
        }
        TabProcedimento other = (TabProcedimento) object;
        if ((this.codProcedimento == null && other.codProcedimento != null) || (this.codProcedimento != null && !this.codProcedimento.equals(other.codProcedimento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.controledelaudos.model.beans.TabProcedimento[ codProcedimento=" + codProcedimento + " ]";
    }
    
}

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
@Table(name = "tab_profissional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabProfissional.findAll", query = "SELECT t FROM TabProfissional t ORDER BY t.nome"),
    @NamedQuery(name = "TabProfissional.findByCodProfissional", query = "SELECT t FROM TabProfissional t WHERE t.codProfissional = :codProfissional"),
    @NamedQuery(name = "TabProfissional.findByNome", query = "SELECT t FROM TabProfissional t WHERE t.nome = :nome"),
    @NamedQuery(name = "TabProfissional.findBySobrenome", query = "SELECT t FROM TabProfissional t WHERE t.sobrenome = :sobrenome"),
    @NamedQuery(name = "TabProfissional.findByCargo", query = "SELECT t FROM TabProfissional t WHERE t.cargo = :cargo")})
public class TabProfissional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_profissional")
    private Integer codProfissional;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "sobrenome")
    private String sobrenome;
    @Basic(optional = false)
    @Column(name = "cargo")
    private String cargo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codProfissional")
    private List<TabDigitacao> tabDigitacaoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codProfissional")
    private List<TabAnalise> tabAnaliseList;

    public TabProfissional() {
    }

    public TabProfissional(Integer codProfissional) {
        this.codProfissional = codProfissional;
    }

    public TabProfissional(Integer codProfissional, String nome, String sobrenome, String cargo) {
        this.codProfissional = codProfissional;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
    }

    public Integer getCodProfissional() {
        return codProfissional;
    }

    public void setCodProfissional(Integer codProfissional) {
        this.codProfissional = codProfissional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @XmlTransient
    public List<TabDigitacao> getTabDigitacaoList() {
        return tabDigitacaoList;
    }

    public void setTabDigitacaoList(List<TabDigitacao> tabDigitacaoList) {
        this.tabDigitacaoList = tabDigitacaoList;
    }

    @XmlTransient
    public List<TabAnalise> getTabAnaliseList() {
        return tabAnaliseList;
    }

    public void setTabAnaliseList(List<TabAnalise> tabAnaliseList) {
        this.tabAnaliseList = tabAnaliseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProfissional != null ? codProfissional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabProfissional)) {
            return false;
        }
        TabProfissional other = (TabProfissional) object;
        if ((this.codProfissional == null && other.codProfissional != null) || (this.codProfissional != null && !this.codProfissional.equals(other.codProfissional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.controledelaudos.model.beans.TabProfissional[ codProfissional=" + codProfissional + " ]";
    }
    
}

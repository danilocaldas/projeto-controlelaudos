/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.model.beans;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author CMR
 */
@Entity
@Table(name = "tab_lote")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabLote.findAll", query = "SELECT t FROM TabLote t"),
    @NamedQuery(name = "TabLote.findByCodTramitacao", query = "SELECT t FROM TabLote t WHERE t.codTramitacao = :codTramitacao"),
    @NamedQuery(name = "TabLote.findByDataEntrada", query = "SELECT t FROM TabLote t WHERE t.dataEntrada = :dataEntrada"),
    @NamedQuery(name = "TabLote.findByDataSaida", query = "SELECT t FROM TabLote t WHERE t.dataSaida = :dataSaida"),
    @NamedQuery(name = "TabLote.findByQtdLote", query = "SELECT t FROM TabLote t WHERE t.qtdLote = :qtdLote"),
    @NamedQuery(name = "TabLote.findByStatus", query = "SELECT t FROM TabLote t WHERE t.status = :status"),
    @NamedQuery(name = "TabLote.findBySetor", query = "SELECT t FROM TabLote t WHERE t.setor = :setor")})
public class TabLote implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_tramitacao")
    private Integer codTramitacao;
    @Basic(optional = false)
    @Column(name = "data_entrada")
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    @Column(name = "data_saida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Basic(optional = false)
    @Column(name = "qtd_lote")
    private int qtdLote;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "setor")
    private String setor;
    @JoinColumn(name = "cod_procedimento", referencedColumnName = "cod_procedimento")
    @ManyToOne(optional = false)
    private TabProcedimento codProcedimento;
    @JoinColumn(name = "cod_prestador", referencedColumnName = "cod_prestador")
    @ManyToOne(optional = false)
    private TabPrestador codPrestador;
    @JoinColumn(name = "cod_digitacao", referencedColumnName = "cod_digitacao")
    @ManyToOne
    private TabDigitacao codDigitacao;
    @JoinColumn(name = "cod_analise", referencedColumnName = "cod_analise")
    @ManyToOne
    private TabAnalise codAnalise;

    public TabLote() {
    }

    public TabLote(Integer codTramitacao) {
        this.codTramitacao = codTramitacao;
    }

    public TabLote(Integer codTramitacao, Date dataEntrada, int qtdLote, String status, String setor) {
        this.codTramitacao = codTramitacao;
        this.dataEntrada = dataEntrada;
        this.qtdLote = qtdLote;
        this.status = status;
        this.setor = setor;
    }

    public Integer getCodTramitacao() {
        return codTramitacao;
    }

    public void setCodTramitacao(Integer codTramitacao) {
        this.codTramitacao = codTramitacao;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getQtdLote() {
        return qtdLote;
    }

    public void setQtdLote(int qtdLote) {
        this.qtdLote = qtdLote;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public TabProcedimento getCodProcedimento() {
        return codProcedimento;
    }

    public void setCodProcedimento(TabProcedimento codProcedimento) {
        this.codProcedimento = codProcedimento;
    }

    public TabPrestador getCodPrestador() {
        return codPrestador;
    }

    public void setCodPrestador(TabPrestador codPrestador) {
        this.codPrestador = codPrestador;
    }

    public TabDigitacao getCodDigitacao() {
        return codDigitacao;
    }

    public void setCodDigitacao(TabDigitacao codDigitacao) {
        this.codDigitacao = codDigitacao;
    }

    public TabAnalise getCodAnalise() {
        return codAnalise;
    }

    public void setCodAnalise(TabAnalise codAnalise) {
        this.codAnalise = codAnalise;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTramitacao != null ? codTramitacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabLote)) {
            return false;
        }
        TabLote other = (TabLote) object;
        if ((this.codTramitacao == null && other.codTramitacao != null) || (this.codTramitacao != null && !this.codTramitacao.equals(other.codTramitacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.controledelaudos.model.beans.TabLote[ codTramitacao=" + codTramitacao + " ]";
    }
    
}

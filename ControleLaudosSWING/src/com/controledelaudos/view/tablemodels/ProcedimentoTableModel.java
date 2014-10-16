/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.view.tablemodels;



import com.controledelaudos.model.beans.TabPrestador;
import com.controledelaudos.model.beans.TabProcedimento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Danilo
 */
public class ProcedimentoTableModel extends AbstractTableModel {
 
    private static final int COL_ID = 0;
    private static final int COL_COD = 1;
    private static final int COL_DESCRICAO = 2;
    private final List<TabProcedimento> linhas;
    private final String[] colunas = new String[]{"ID", "CÓDIGO", "DESCRIÇÃO"};

    public ProcedimentoTableModel() {
        linhas = new ArrayList<>();
    }

    public ProcedimentoTableModel(List<TabProcedimento> listaProcedimentos) {
        linhas = new ArrayList<>(listaProcedimentos);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case COL_ID:
                return Integer.class;
            case COL_COD:
                return Integer.class;
            case COL_DESCRICAO:
                return String.class;
            default:
                // Não deve ocorrer, pois só existem 3 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TabProcedimento procedimento = linhas.get(rowIndex);

        switch (columnIndex) {
            case COL_ID:
                return procedimento.getCodProcedimento();
            case COL_COD:
                return procedimento.getCodigo();
            case COL_DESCRICAO:
                return procedimento.getDescricao();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public TabProcedimento get(int row) {
        return linhas.get(row);
    }
}

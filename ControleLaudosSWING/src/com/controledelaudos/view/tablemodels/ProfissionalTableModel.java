/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.view.tablemodels;



import com.controledelaudos.model.beans.TabProfissional;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Danilo
 */
public class ProfissionalTableModel extends AbstractTableModel {
 
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_SOBRENOME = 2;
    private static final int COL_CARGO = 3;
    private final List<TabProfissional> linhas;
    private final String[] colunas = new String[]{"ID", "NOME", "SOBRENOME", "CARGO"};

    public ProfissionalTableModel() {
        linhas = new ArrayList<>();
    }

    public ProfissionalTableModel(List<TabProfissional> listaProfissionais) {
        linhas = new ArrayList<>(listaProfissionais);
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
            case COL_NOME:
                return String.class;
            case COL_SOBRENOME:
                return String.class;
            case COL_CARGO:
                return String.class;
            default:
                // Não deve ocorrer, pois só existem 3 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TabProfissional profissional = linhas.get(rowIndex);

        switch (columnIndex) {
            case COL_ID:
                return profissional.getCodProfissional();
            case COL_NOME:
                return profissional.getNome();
            case COL_SOBRENOME:
                return profissional.getSobrenome();
            case COL_CARGO:
                return profissional.getCargo();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public TabProfissional get(int row) {
        return linhas.get(row);
    }
}

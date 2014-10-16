/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controledelaudos.view.tablemodels;



import com.controledelaudos.model.beans.TabPrestador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Danilo
 */
public class PrestadorTableModel extends AbstractTableModel {
 
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_CNES = 2;
    private final List<TabPrestador> linhas;
    private final String[] colunas = new String[]{"ID", "NOME", "CNES"};

    public PrestadorTableModel() {
        linhas = new ArrayList<>();
    }

    public PrestadorTableModel(List<TabPrestador> listaPrestadores) {
        linhas = new ArrayList<>(listaPrestadores);
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
            case COL_CNES:
                return String.class;
            default:
                // Não deve ocorrer, pois só existem 3 colunas
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TabPrestador prestador = linhas.get(rowIndex);

        switch (columnIndex) {
            case COL_ID:
                return prestador.getCodPrestador();
            case COL_NOME:
                return prestador.getNomeFantasia();
            case COL_CNES:
                return prestador.getCnes();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public TabPrestador get(int row) {
        return linhas.get(row);
    }
}

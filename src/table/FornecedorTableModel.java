/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Fornecedor;

/**
 *
 * @author arthursvpb
 */
public class FornecedorTableModel extends AbstractTableModel{
    
    
    public static final int COL_ID = 0;
    public static final int COL_NOME = 1;
    
    public ArrayList<Fornecedor> lista;
    
    public FornecedorTableModel(ArrayList<Fornecedor>l){
        
        lista = new ArrayList<Fornecedor>(l);
        
    }
    
    
    @Override
    public int getRowCount() {
        
        return lista.size();
    }
    
    @Override
    public int getColumnCount() {
        
        // Número de colunas
        return 2;
    }
    
    @Override
    public Object getValueAt(int linhas, int colunas) {
        
        Fornecedor fornecedor = lista.get(linhas);
        
        if (colunas == COL_ID) return fornecedor.getId();
        if (colunas == COL_NOME) return fornecedor.getNome();
        
        return "";
        
    }
    
    // Dar nome para coluna
    
    @Override
    public String getColumnName(int colunas){
        
        if (colunas == COL_ID) return "Código";
        if (colunas == COL_NOME) return "Nome";
        
        return "";
        
    }
    
    
}

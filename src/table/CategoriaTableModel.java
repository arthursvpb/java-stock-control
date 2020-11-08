/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Categoria;

/**
 *
 * @author arthursvpb
 */
public class CategoriaTableModel extends AbstractTableModel{
    
    
    public static final int COL_ID = 0;
    public static final int COL_NOME = 1;
    
    public ArrayList<Categoria> lista;
    
    public CategoriaTableModel(ArrayList<Categoria>l){
        
        lista = new ArrayList<Categoria>(l);
        
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
        
        Categoria categoria = lista.get(linhas);
        
        if (colunas == COL_ID) return categoria.getId();
        if (colunas == COL_NOME) return categoria.getNome();
        
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

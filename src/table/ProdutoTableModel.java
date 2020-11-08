package table;

// Extender table model

import model.Produto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author arthursvpb
 */
public class ProdutoTableModel extends AbstractTableModel{
    
    public static final int COL_ID = 0;
    public static final int COL_NOME = 1;
    public static final int COL_PRECO = 2;
    public static final int COL_QTD_ESTOQUE = 3;
    
    public ArrayList<Produto> lista;
    
    public ProdutoTableModel(ArrayList<Produto>l){
        
        lista = new ArrayList<Produto>(l);
        
    }
    
    
    @Override
    public int getRowCount() {
        
        return lista.size();
    }
    
    @Override
    public int getColumnCount() {
        
        // Número de colunas
        return 4;
    }
    
    @Override
    public Object getValueAt(int linhas, int colunas) {
        
        Produto produto = lista.get(linhas);
        
        if (colunas == COL_ID) return produto.getId();
        if (colunas == COL_NOME) return produto.getNome();
        if (colunas == COL_PRECO) return produto.getPreco();
        if (colunas == COL_QTD_ESTOQUE) return produto.getQtd_estoque();
        
        return "";
        
    }
    
    // Dar nome para coluna
    
    @Override
    public String getColumnName(int colunas){
        
        if (colunas == COL_ID) return "Código";
        if (colunas == COL_NOME) return "Nome";
        if (colunas == COL_PRECO) return "Preço";
        if (colunas == COL_QTD_ESTOQUE) return "Estoque";
        
        return "";
        
    }
    
}

package table;

import model.Pessoa;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author arthursvpb
 */
public class PessoaTableModel extends AbstractTableModel{
    
    
    public static final int COL_ID = 0;
    public static final int COL_NOME = 1;
    public static final int COL_EMAIL = 2;
    public static final int COL_CELULAR = 3;
    public static final int COL_CPF = 4;
    
    public ArrayList<Pessoa> lista;
    
    public PessoaTableModel(ArrayList<Pessoa>l){
        
        lista = new ArrayList<Pessoa>(l);
        
    }
    
    
    @Override
    public int getRowCount() {
        
        return lista.size();
    }
    
    @Override
    public int getColumnCount() {
        
        // Número de colunas
        return 5;
    }
    
    @Override
    public Object getValueAt(int linhas, int colunas) {
        
        Pessoa pessoa = lista.get(linhas);
        
        if (colunas == COL_ID) return pessoa.getId();
        if (colunas == COL_NOME) return pessoa.getNome();
        if (colunas == COL_EMAIL) return pessoa.getEmail();
        if (colunas == COL_CELULAR) return pessoa.getCelular();
        if (colunas == COL_CPF) return pessoa.getCpf();
        
        return "";
        
    }
    
    // Dar nome para coluna
    
    @Override
    public String getColumnName(int colunas){
        
        if (colunas == COL_ID) return "Código";
        if (colunas == COL_NOME) return "Nome";
        if (colunas == COL_EMAIL) return "E-Mail";
        if (colunas == COL_CELULAR) return "Celular";
        if (colunas == COL_CPF) return "CPF";
        
        return "";
        
    }
    
    
    
}

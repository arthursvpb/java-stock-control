package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Pessoa;

/**
 *
 * @author arthursvpb
 */
public class PessoaDAO {
    
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
    
    public PessoaDAO(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Pessoa pessoa){
        String sql = "INSERT INTO pessoa(id, nome, email, celular, cpf) VALUES(?,?,?,?,?)";
        
        try {
            
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pessoa.getId());
            stmt.setString(2, pessoa.getNome());
            stmt.setString(3, pessoa.getEmail());
            stmt.setString(4, pessoa.getCelular());
            stmt.setString(5, pessoa.getCpf());
            
            stmt.execute();
            stmt.close();
            
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 02: "+e);
        }
    }
    
    public void alterar(Pessoa pessoa){
        String sql = "UPDATE pessoa SET nome = ?, email = ?, celular = ?, cpf = ? WHERE id = ?";
        
        try {
            stmt = conn.prepareStatement(sql);
            
            
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEmail());
            stmt.setString(3, pessoa.getCelular());
            stmt.setString(4, pessoa.getCpf());
            stmt.setInt(5, pessoa.getId());
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 03: "+e);
        }
    }
    
    
    public void excluir(int valor){
        String sql = "DELETE FROM pessoa WHERE id = "+ valor;
        
        try {
            
            st = conn.createStatement();
            st.execute(sql);
            st.close();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 04: "+e);
        }
    }
    
    public ArrayList<Pessoa> listarTodos(){
        String sql = "SELECT * FROM pessoa";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setCelular(rs.getString("celular"));
                pessoa.setCpf(rs.getString("cpf"));
                lista.add(pessoa);
                
            }
            
        } catch (SQLException e) {
            
            throw new RuntimeException("Erro 05: "+e);
            
        }
        
        
        return lista;
    }
    
    public ArrayList<Pessoa> listarNome(String valor){
        String sql = "SELECT * FROM pessoa WHERE nome LIKE '%"+valor+"%' ";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setCelular(rs.getString("celular"));
                pessoa.setCpf(rs.getString("cpf"));
                lista.add(pessoa);
                
            }
            
        } catch (SQLException e) {
            
            throw new RuntimeException("Erro 06: "+e);
            
        }
        
        
        return lista;
    }
    
}

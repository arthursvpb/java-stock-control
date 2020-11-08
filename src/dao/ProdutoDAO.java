package dao;

import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

// Receber os métodos CRUD

/**
 *
 * @author arthursvpb
 */
public class ProdutoDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Produto> lista = new ArrayList<Produto>();
    
    public ProdutoDAO(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Produto produto){
        String sql = "INSERT INTO produto(nome, preco, qtd_estoque) VALUES(?,?,?)";
        
        try {
            
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQtd_estoque());
            stmt.execute();
            stmt.close();
            
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 02: "+e);
        }
    }
    
    public void alterar(Produto produto){
        String sql = "UPDATE produto SET nome = ?, preco = ?, qtd_estoque = ? WHERE id = ?";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getQtd_estoque());
            stmt.setInt(4, produto.getId());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 03: "+e);
        }
    }
    
    
    public void excluir(int valor){
        String sql = "DELETE FROM produto WHERE id = "+ valor;
        
        try {
            
            st = conn.createStatement();
            st.execute(sql);
            st.close();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 04: "+e);
        }
    }
    
    public ArrayList<Produto> listarTodos(){
        String sql = "SELECT * FROM produto";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQtd_estoque(rs.getInt("qtd_estoque"));
                lista.add(produto);
                
            }
            
        } catch (SQLException e) {
            
            throw new RuntimeException("Erro 05: "+e);
            
        }
        
        
        return lista;
    }
    
    public ArrayList<Produto> listarNome(String valor){
        String sql = "SELECT * FROM produto WHERE nome LIKE '%"+valor+"%' ";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQtd_estoque(rs.getInt("qtd_estoque"));
                lista.add(produto);
                
            }
            
        } catch (SQLException e) {
            
            throw new RuntimeException("Erro 06: "+e);
            
        }
        
        
        return lista;
    }
}

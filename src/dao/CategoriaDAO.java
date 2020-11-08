/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Categoria;

/**
 *
 * @author arthursvpb
 */
public class CategoriaDAO {
    
        
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Categoria> lista = new ArrayList<Categoria>();
    
    public CategoriaDAO(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Categoria categoria){
        String sql = "INSERT INTO categoria(nome) VALUES(?)";
        
        try {
            
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());
            stmt.execute();
            stmt.close();
            
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 02: "+e);
        }
    }
    
    public void alterar(Categoria categoria){
        String sql = "UPDATE categoria SET nome = ? WHERE id = ?";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());
            stmt.setInt(2, categoria.getId());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 03: "+e);
        }
    }
    
    
    public void excluir(int valor){
        String sql = "DELETE FROM categoria WHERE id = "+ valor;
        
        try {
            
            st = conn.createStatement();
            st.execute(sql);
            st.close();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 04: "+e);
        }
    }
    
    public ArrayList<Categoria> listarTodos(){
        String sql = "SELECT * FROM categoria";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                lista.add(categoria);
                
            }
            
        } catch (SQLException e) {
            
            throw new RuntimeException("Erro 05: "+e);
            
        }
        
        
        return lista;
    }
    
    public ArrayList<Categoria> listarNome(String valor){
        String sql = "SELECT * FROM categoria WHERE nome LIKE '%"+valor+"%' ";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                lista.add(categoria);
                
            }
            
        } catch (SQLException e) {
            
            throw new RuntimeException("Erro 06: "+e);
            
        }
        
        
        return lista;
    }
    
}

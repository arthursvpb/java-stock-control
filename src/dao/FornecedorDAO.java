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
import model.Fornecedor;

/**
 *
 * @author arthursvpb
 */
public class FornecedorDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
    
    public FornecedorDAO(){
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Fornecedor fornecedor){
        String sql = "INSERT INTO fornecedor(nome) VALUES(?)";
        
        try {
            
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, fornecedor.getNome());
            stmt.execute();
            stmt.close();
            
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 02: "+e);
        }
    }
    
    public void alterar(Fornecedor fornecedor){
        String sql = "UPDATE fornecedor SET nome = ? WHERE id = ?";
        
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, fornecedor.getNome());
            stmt.setInt(2, fornecedor.getId());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 03: "+e);
        }
    }
    
    
    public void excluir(int valor){
        String sql = "DELETE FROM fornecedor WHERE id = "+ valor;
        
        try {
            
            st = conn.createStatement();
            st.execute(sql);
            st.close();
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 04: "+e);
        }
    }
    
    public ArrayList<Fornecedor> listarTodos(){
        String sql = "SELECT * FROM fornecedor";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                lista.add(fornecedor);
                
            }
            
        } catch (SQLException e) {
            
            throw new RuntimeException("Erro 05: "+e);
            
        }
        
        
        return lista;
    }
    
    public ArrayList<Fornecedor> listarNome(String valor){
        String sql = "SELECT * FROM fornecedor WHERE nome LIKE '%"+valor+"%' ";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(rs.getInt("id"));
                fornecedor.setNome(rs.getString("nome"));
                lista.add(fornecedor);
                
            }
            
        } catch (SQLException e) {
            
            throw new RuntimeException("Erro 06: "+e);
            
        }
        
        
        return lista;
    }
    
    
}

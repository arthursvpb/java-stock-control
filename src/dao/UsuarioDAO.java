package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Usuario;

/**
 *
 * @author arthursvpb
 */
public class UsuarioDAO {
    
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    
    boolean check = false;
    
    public UsuarioDAO(){
        conn = new ConnectionFactory().getConexao();
    }
    
    
    public boolean checkLogin(String login, String senha){
        String sql = "SELECT * FROM usuario WHERE login = ? and senha = ?";
        
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            // Se o login e a senha forem encontrados no banco de dados            
            if (rs.next()) {
                
                // Encontrou, login sucedido
                check = true;
                
            }
            
        } catch (SQLException e) {
            
            throw new RuntimeException("Erro: "+e);
            
        }
        
        
        return check;
    }
    
    
}

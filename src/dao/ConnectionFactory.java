package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

// Classe que faz conexão com o banco de dados

/**
 *
 * @author arthursvpb
 */
public class ConnectionFactory {
    
    public Connection getConexao(){
        
        try {
            
            return DriverManager.getConnection("jdbc:mysql://localhost/deposito", "root", "123");
            
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro 01 (tratado):" +e);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diastrabalhofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lucpe
 */
public class InteracaoBD {
   // Variaveis base de dados
    private final String Driver = "com.mysql.jdbc.Driver";
    private final String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";


public Connection conectarBaseDados() throws SQLException {

        Connection Conexao = null;

        try {

            Class.forName(Driver);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }

        Conexao = DriverManager.getConnection(dbURL);
        return Conexao;


    }
}

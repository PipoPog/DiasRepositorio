/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diastrabalhofinal;

import Models.Arbitro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lucpe
 */
public class InteracaoBD{
   // Variaveis base de dados
    private final String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String dbURL = "jdbc:sqlserver://LAPTOP-170EEDEO\\SQLEXPRESS;databaseName=SLEuropeia;integratedSecurity=true";

    
    //Querys
    private static String queryAdicionarJogo = "INSERT INTO Jogo"
            + "(cod_jornada, equip_casa, equip_fora, result_equipcasa, result_equipfora, local,classificacaocasa, classificacaofora) VALUES"
            + "(?,?,?,?,?,?,?,?)";
     private static String queryAdicionarArbitro = "INSERT INTO Arbitro"
            + "(cod_jogo, nome) VALUES"
            + "(?,?)";
     private static String queryAdicionarCartao = "INSERT INTO Cartoes"
            + "(cod_jogo, cod_jogador, corcartao, tempo) VALUES"
            + "(?,?,?,?)";
     private static String queryAdicionarClube = "INSERT INTO Clubes"
            + "(nome, pais, classificacao_anterior) VALUES"
            + "(?,?,?)";
     private static String queryAdicionarGolos = "INSERT INTO Golos"
            + "(cod_jogo, golos_anulados, tempo, jogador) VALUES"
            + "(?,?,?,?)";
     private static String queryAdicionarJogadores = "INSERT INTO Jogadores"
            + "(cod_clube, nome, datanascimento, posicao, nacionalidade, pe_dominante) VALUES"
            + "(?,?,?,?,?,?)";
     private static String queryAdicionarSubstituicao = "INSERT INTO Substituicoes"
            + "(cod_jogo, codjogador_ent, codjogador_sai, tempo) VALUES"
            + "(?,?,?,?)";

public Connection conectarBaseDados() throws SQLException {

        Connection Conexao = null;

        try {

            Class.forName(Driver);
            System.out.println("Conectado!");

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }

        Conexao = DriverManager.getConnection(dbURL);
        return Conexao;
    }
    public void adicionarArbitro(Arbitro arbitroadicionar) throws SQLException {

        Connection conexao = null;
        PreparedStatement pst = null;

        try {
            conexao = conectarBaseDados();
            pst = conexao.prepareStatement(queryAdicionarArbitro);
            pst.setInt(1, arbitroadicionar.getJogoResponsavel());
            pst.setString(2, arbitroadicionar.getNome());
            pst.executeUpdate();


            JOptionPane.showMessageDialog(null, "Arbitro Adicionado");
            // Exeções
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        } finally {

            if (pst != null) {
                pst.close();
            }

            if (conexao != null) {
                conexao.close();
            }

        }

    }

}

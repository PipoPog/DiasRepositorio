/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diastrabalhofinal;

import Models.Arbitro;
import Models.Classificacao;
import Models.Clubes;
import Models.Jogador;
import Models.Jogo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
     private static String queryAdicionarArbitro = "INSERT INTO Arbitros"
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
     
     private String queryEditarClassificacao = "UPDATE Classificacao SET cod_equipa= ?, classificacao = ?, "
            + "vitorias = ?, derrotas = ?, empates = ?, pontos = ? WHERE cod_equipa = ?";
     private String queryGetClassificacaoByID = "SELECT * FROM Classificacao WHERE cod_Equipa LIKE ?";
     private String queryTodosArbitro = "SELECT * FROM Arbitros";

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
   public void adicionarJogo(Jogo jogoadicionar) throws SQLException{

        Connection conexao = null;
        PreparedStatement pst = null;

        try {
            conexao = conectarBaseDados();
            pst = conexao.prepareStatement(queryAdicionarJogo);
            pst.setInt(1, jogoadicionar.getCod_jornada());
            pst.setInt(2, jogoadicionar.getEquip_casa());
            pst.setInt(3, jogoadicionar.getEquip_fora());
            pst.setInt(4, jogoadicionar.getResult_equipcasa());
            pst.setInt(5, jogoadicionar.getResult_equipfora());
            pst.setString(6, jogoadicionar.getLocal());
            pst.setInt(7, jogoadicionar.getClassificacaocasa());
            pst.setInt(8, jogoadicionar.getClassificacaofora());
            pst.executeUpdate();


            JOptionPane.showMessageDialog(null, "Jogo Adicionado");
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
public void adicionarClube(Clubes clubeadicionar) throws SQLException{

        Connection conexao = null;
        PreparedStatement pst = null;

        try {
            conexao = conectarBaseDados();
            pst = conexao.prepareStatement(queryAdicionarClube);
            pst.setInt(1, clubeadicionar.getCodigoClube());
            pst.setString(2, clubeadicionar.getNome());
            pst.setString(3, clubeadicionar.getPais());
            pst.executeUpdate();


            JOptionPane.showMessageDialog(null, "Clube Adicionado");
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

public void adicionarJogadores(Jogador jogadicionar) throws SQLException{

        Connection conexao = null;
        PreparedStatement pst = null;

        try {
            conexao = conectarBaseDados();
            pst = conexao.prepareStatement(queryAdicionarJogadores);
            pst.setInt(1, jogadicionar.getCodClube());
            pst.setString(2, jogadicionar.getNome());
            pst.setDate(3, jogadicionar.getDataNascimento());
            pst.setString(4, jogadicionar.getPosicao());
            pst.setString(5, jogadicionar.getNacionalidade());
            pst.setString(6, jogadicionar.getPeDom());
            pst.executeUpdate();


            JOptionPane.showMessageDialog(null, "Jogador Adicionado");
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
public void Classificacaoupdate(Classificacao classificacao) throws SQLException {
        Connection conexao = null;
        PreparedStatement pst = null;

        try {
            conexao = conectarBaseDados();
            pst = conexao.prepareStatement(queryEditarClassificacao);
            pst.setInt(1, classificacao.getCod_equipa());
            pst.setInt(2, classificacao.getClassificacao());
            pst.setInt(3, classificacao.getVitorias());
            pst.setInt(4, classificacao.getDerrotas());
            pst.setInt(5, classificacao.getEmpates());
            pst.setInt(6, classificacao.getPontos());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Classificação Editada");
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
    public Classificacao getById(String id) throws SQLException {
        Connection conexao = conectarBaseDados();

        PreparedStatement pst = null;
        Classificacao classificacao = null;
        try {

            pst = conexao.prepareStatement(queryGetClassificacaoByID);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                classificacao = new Classificacao(
                        rs.getInt("cod_equipa"),
                        rs.getInt("classificacao"),
                        rs.getInt("vitorias"),
                        rs.getInt("derrotas"),
                        rs.getInt("empates"),
                        rs.getInt("pontos"));

            }

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


        return classificacao;
    }
    public ArrayList<Arbitro> getArbitroPesquisa(String nome, String codjogo) throws SQLException {

        ArrayList<Arbitro> listaArbitro = new ArrayList<>();

        Connection conexao = null;
        PreparedStatement pst = null;

        String ComandoPesquisaArbitro = "SELECT * FROM Arbitros WHERE cod_jogo LIKE '" + codjogo + "%'";
        String ComandoPesquisaArbitro1 = "SELECT * FROM Arbitros WHERE cod_jogo LIKE '" + codjogo + "%' AND `nome` LIKE '" + nome + "%'";
        String ComandoPesquisaArbitro2 = "SELECT * FROM Arbitros WHERE nome LIKE '" + nome + "%'";

        try {
            conexao = conectarBaseDados();
            if (!codjogo.equals("") && nome.equals("")) {
                pst = conexao.prepareStatement(ComandoPesquisaArbitro);
            } else if (!codjogo.equals("") && !nome.equals("")) {
                pst = conexao.prepareStatement(ComandoPesquisaArbitro1);
            } else if (!nome.equals("") && codjogo.equals("")) {
                pst = conexao.prepareStatement(ComandoPesquisaArbitro2);
            } else if (nome.equals("") && codjogo.equals("")) {
                 return get(20);   
            }
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Arbitro ArbitroAdicionar = new Arbitro(
                        rs.getString("nome"),
                        rs.getInt("cod_jogo"));
                listaArbitro.add(ArbitroAdicionar);
            }
            
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
        return listaArbitro;
    }
    public ArrayList<Arbitro> get(int total) throws SQLException {
        Connection conexao = conectarBaseDados();
        PreparedStatement pst = null;

        ArrayList<Arbitro> listaArbitro = new ArrayList<Arbitro>();

        try {

            pst = conexao.prepareStatement(queryTodosArbitro);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Arbitro ArbitroAdicionar = new Arbitro(
                        rs.getString("nome"),
                        rs.getInt("cod_jogo"));
                listaArbitro.add(ArbitroAdicionar);
            }

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

        return listaArbitro;
    }
}

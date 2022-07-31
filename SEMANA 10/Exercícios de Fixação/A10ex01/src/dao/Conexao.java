package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*

    Aluno: Bruno Benicio de Andrade Lima
    Cidade: Castelo do Piauí - PI

 */
public class Conexao {

    protected Connection con;
    protected Statement st;
    protected String query;

    public Conexao() {
        try {
            final String URL = "jdbc:mysql://localhost/Loja";
            final String DRIVER = "com.mysql.jdbc.Driver";
            final String USUARIO = "root";
            final String SENHA = "";
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
            st = con.createStatement();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}

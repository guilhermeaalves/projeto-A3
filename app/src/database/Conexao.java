package database;
import java.sql.*;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/jogodobicho";
    private static final String user = "root";
    private static final String password = "0584";

    public static Connection conn;

    public static Connection getConexao() {
        try {

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso!");
            return conn;
        } catch (SQLException e) {
            System.err.println("Erro ao conectar!");
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        getConexao();
    }

}
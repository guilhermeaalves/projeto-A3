package Componentes;
import java.sql.*;
import database.Conexao;

public class ConsultaSaldo {

    public static double consultarSaldo(int idUser) {
        double saldo = 0.0;

        try {
            Connection conn = Conexao.getConexao();
            String sql = "SELECT saldo FROM user_saldo WHERE id_usuario = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idUser);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                saldo = rs.getDouble("saldo");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return saldo;
    }
}

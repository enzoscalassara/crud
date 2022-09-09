package mvc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import tabelas.Palete;

public class Model {
    public static void driver_load() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver ok");
    }

    public static Object conectar_bd() throws SQLException {
        String url = "jdbc:mysql://localhost/frigorifico";
        String user = "root";
        String pass = "";
        // Senha do ifpr = 0mY5sQl9
        Connection conexao = DriverManager.getConnection(url, user, pass);
        Statement comando = conexao.createStatement();
        System.out.println("Conexao ok");
        return conexao;
    }

    /*public static void teste_bd(Object conexao1) throws SQLException {
        Connection conexao = (Connection) conexao1;
        Statement comando = conexao.createStatement();
        System.out.println("SELECT ok");
        String sql = "SELECT * FROM fornecedores";
        ResultSet result = comando.executeQuery(sql);
        

        ResultSetMetaData rsmd = result.getMetaData();
        while (result.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.print(result.getString(i) + " - ");
        }

    }*/


    public static void insert_bd (Object conexao1, String tabela, String colunas, String valores) throws SQLException {
        String comandoSQL = ("INSERT INTO " + tabela + "(" + colunas + ") VALUES (" + valores + ")");

        Connection conexao = (Connection) conexao1;

        Statement comandoInsert = conexao.createStatement();
        comandoInsert.execute(comandoSQL);
    }

    public static void delete_bd(Object conexao1, String tabela, String id_column, String id_number) throws SQLException {
        String comandoSQL = "DELETE FROM " + tabela + " WHERE " + id_column + " = " + id_number;

        Connection conexao = (Connection) conexao1;

        Statement comandoDelete = conexao.createStatement();
        comandoDelete.execute(comandoSQL);
    }

    public static void update_bd(Object conexao1, String tabela, String columns_equal_values, String id_name,
                                 String id_value) throws SQLException {
        String comandoSQL = "UPDATE " + tabela + " SET " + columns_equal_values + " WHERE " + id_name + " = " + id_value;

        Connection conexao = (Connection) conexao1;

        Statement comandoUpdate = conexao.createStatement();
        comandoUpdate.execute(comandoSQL);
    }

    public static ResultSet select_bd(Object conexao1, String tabela, String columns) throws SQLException {
        String comandoSQL = "SELECT " + columns + " FROM " + tabela;

        Connection conexao = (Connection) conexao1;

        Statement comandoSelect = conexao.createStatement();

        ResultSet result = comandoSelect.executeQuery(comandoSQL);

        return result;
    }
}


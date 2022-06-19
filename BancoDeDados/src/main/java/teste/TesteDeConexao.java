package teste;

import java.sql.*;

public class TesteDeConexao {
    public static void main(String[] args) {
        try{
            // DEFINE O DRIVER
            Connection conexao = DriverManager.getConnection
                    ("jdbc:oracle:thin:@localhost:1521:XE\n","SYSTEM","israelyy1");
            System.out.println("Conectou");

            // UTILIZANDO PREPAREDSTATEMENT
//            PreparedStatement pstmt = conexao.prepareStatement
//                    ("INSERT INTO T_PRODUTO " +
//                                                                "(CD_PRODUTO, NM_PRODUTO, VL_PRODUTO, DT_VALIDADE) "
//                                                                + "VALUES (SEQ_PRODUTO.NEXTVAL, ?,?,? )");
//            pstmt.setString(1, "Pera");
//            pstmt.setFloat(2, 7);
//            Date data = new Date (new java.util.Date().getTime());
//            pstmt.setDate(3, data);
//            pstmt.execute();

           PreparedStatement pstmt = conexao.prepareStatement("UPDATE T_PRODUTO SET VL_PRODUTO = ? WHERE CD_PRODUTO = ?");
            pstmt.setFloat(1, 22.5f);
            pstmt.setInt(2, 21);
            pstmt.executeUpdate();

            pstmt = conexao.prepareStatement("DELETE FROM T_PRODUTO WHERE CD_PRODUTO = ?");
            pstmt.setInt(1, 21);
            pstmt.executeUpdate();

            pstmt = conexao.prepareStatement("SELECT * FROM T_PRODUTO WHERE CD_PRODUTO = ?");
            pstmt.setInt(1, 22);
            ResultSet resultado = pstmt.executeQuery();

            while (resultado.next()){
                // Recupera os valores de cada coluna e imprime no console
                System.out.println(resultado.getInt("cd_produto")+ " " +
                        resultado.getString("nm_produto") + " " +
                        resultado.getDouble("vl_produto")+ " " +
                        resultado.getDate("dt_validade"));
            }

            // -- UTILIZANDO O STATEMENT
//            Statement stmt = conexao.createStatement();

//             stmt.executeUpdate(
//                     "INSERT INTO T_PRODUTO (CD_PRODUTO, NM_PRODUTO, VL_PRODUTO, DT_VALIDADE)"
//                     + "VALUES (SEQ_PRODUTO.NEXTVAL, 'UVA', 12.80, to_date('18/08/2017'))");

//            String sqlDelete = "DELETE FROM T_PRODUTO WHERE CD_PRODUTO = 1";
//            stmt.executeUpdate(sqlDelete);
//             String sqlUpdate = "UPDATE T_PRODUTO SET VL_PRODUTO = 13 WHERE CD_PRODUTO = 3";
//             stmt.executeUpdate(sqlUpdate);

             // PERCORE TODOS OS REGISTROS ENCONTRADOS COM STATEMENT


//            ResultSet result = pstmt.executeQuery("Select * from T_PRODUTO");
//
//            while (result.next()){
//                // Recupera os valores de cada coluna e imprime no console
//                System.out.println(result.getInt("cd_produto")+ " " +
//                        result.getString("nm_produto") + " " +
//                        result.getDouble("vl_produto")+ " " +
//                        result.getDate("dt_validade"));
//            }
            conexao.close();
        }catch (SQLException e){
            System.out.println("Não foi possível conectar no ORACLE FIAP");
            e.printStackTrace();
        }
    }
}

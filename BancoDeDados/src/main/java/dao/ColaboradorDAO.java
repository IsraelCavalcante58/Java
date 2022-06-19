package dao;
import model.Colaborador;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ColaboradorDAO {

    Connection conexao;

    public void cadastrar(Colaborador col) {
        PreparedStatement pstmt = null;
        try {
            conexao = DbManager.obterConexao();
            pstmt = conexao.prepareStatement("INSERT INTO TAB_COLABORADOR(CODIGO_COLABORADOR, NOME, EMAIL, SALARIO, DATA_CONTRATACAO) VALUES (SQ_COLABORADOR.NEXTVAL, ?, ?,?,?)");
            pstmt.setString(1, col.getNome());
            pstmt.setString(2, col.getEmail());
            pstmt.setDouble(3, col.getSalario());
            Date data = new Date(col.getDataContratacao().getTimeInMillis());
            pstmt.setDate(4, data);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("A conexão com o banco de dados falhou");
            try {
                conexao.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                pstmt.close();
                conexao.close();
            } catch (SQLException e) {
                System.out.println("A conexão falhou ao ser finalizada!");
            }
        }
    }

    public List<Colaborador> listar() {
        List<Colaborador> lista = new ArrayList<Colaborador>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conexao = DbManager.obterConexao();
            pstmt = conexao.prepareStatement("SELECT * FROM TAB_COLABORADOR");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int codigo = rs.getInt("CODIGO_COLABORADOR");
                String nome = rs.getString("NOME");
                String email = rs.getString("EMAIL");
                double salario = rs.getDouble("SALARIO");

                Date data = rs.getDate("DATA_CONTRATACAO");
                Calendar dataContratacao = Calendar.getInstance();
                dataContratacao.setTimeInMillis(data.getTime());

                Colaborador colaborador = new Colaborador(codigo, nome, email, salario, dataContratacao);
                lista.add(colaborador);
            }
        } catch (SQLException e) {
            System.out.println("A conexão com o banco de dados falhou");
            try {
                conexao.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                pstmt.close();
                conexao.close();
            } catch (SQLException e) {
                System.out.println("A conexão falhou ao ser finalizada!");

            }
        }
        return lista;
    }

    public void deletar(int codigo) {
        PreparedStatement pstmt = null;
        try {
            conexao = DbManager.obterConexao();
            pstmt = conexao.prepareStatement("DELETE FROM TAB_COLABORADOR WHERE CODIGO_COLABORADOR = ?");
            pstmt.setInt(1, codigo);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("A conexão com o banco de dados falhou");
            try {
                conexao.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            try {
                pstmt.close();
                conexao.close();
            } catch (SQLException e) {
                System.out.println("A conexão falhou ao ser finalizada!");
            }
        }
    }

    public Colaborador buscarPorId(int id) {
        Colaborador colaborador = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conexao = DbManager.obterConexao();
            stmt = conexao.prepareStatement("SELECT * FROM TAB_COLABORADOR WHERE CODIGO_COLABORADOR = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                int codigo = rs.getInt("CODIGO_COLABORADOR");
                String nome = rs.getString("NOME");
                String email = rs.getString("EMAIL");
                double salario = rs.getDouble("SALARIO");
                java.sql.Date data = rs.getDate("DATA_CONTRATACAO");
                Calendar dataContratacao = Calendar.getInstance();
                dataContratacao.setTimeInMillis(data.getTime());
                colaborador = new Colaborador(codigo, nome, email, salario, dataContratacao);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                rs.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return colaborador;
    }

    public void atualizar(Colaborador colaborador) {
        PreparedStatement stmt = null;

        try {
            conexao = DbManager.obterConexao();
            String sql = "UPDATE TAB_COLABORADOR SET NOME = ?, EMAIL = ?, SALARIO = ?, DATA_CONTRATACAO = ? WHERE CODIGO_COLABORADOR = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, colaborador.getNome());
            stmt.setString(2, colaborador.getEmail());
            stmt.setDouble(3, colaborador.getSalario());
            java.sql.Date data = new java.sql.Date(colaborador.getDataContratacao().getTimeInMillis());
            stmt.setDate(4, data);
            stmt.setInt(5, colaborador.getCodigo());
            conexao.setAutoCommit(false);
            stmt.executeUpdate();
        } catch (SQLException e) {
            try {
                conexao.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



package teste;

import dao.ColaboradorDAO;

public class ColaboradorDeletar {
    public static void main(String[] args) {
        ColaboradorDAO dao = new ColaboradorDAO();
        dao.deletar(2);
    }
}

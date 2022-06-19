package teste;

import dao.ColaboradorDAO;
import model.Colaborador;

public class ColaboradorAtualizar {
    public static void main(String[] args) {

        ColaboradorDAO dao= new ColaboradorDAO();
        Colaborador colaborador = dao.buscarPorId(1);

        System.out.println(colaborador.getCodigo() + " " + colaborador.getNome() + " " + colaborador.getSalario() +" " + colaborador.getDataContratacao().getTime());
        colaborador.setSalario(1500);
        colaborador.setEmail("testeUpdate@gmail.com");
        dao.atualizar(colaborador);
    }
}

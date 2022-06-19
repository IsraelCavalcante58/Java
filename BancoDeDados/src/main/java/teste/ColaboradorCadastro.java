package teste;

import dao.ColaboradorDAO;
import model.Colaborador;

import java.util.Calendar;
public class ColaboradorCadastro {
    public static void main(String[] args) {
        ColaboradorDAO dao = new ColaboradorDAO();
        Colaborador colaborador = new Colaborador();
        colaborador.setNome("Allan");
        colaborador.setEmail("alasdsadalan@gmail.com");
        colaborador.setSalario(3000);
        colaborador.setDataContratacao(Calendar.getInstance());
        dao.cadastrar(colaborador);
        System.out.println("Cadastrado");
    }
}

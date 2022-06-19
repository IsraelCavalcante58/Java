import model.Produto;
import org.hibernate.collection.internal.PersistentArrayHolder;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class CursoEnterpriseApplication {
    public static void main(String[] args) {
        EntityManager em = null;

        try {
            em = Persistence.createEntityManagerFactory("enterprise")
                            .createEntityManager();

//              em.getTransaction().begin();
//              Produto produtoNovo = new Produto("Lápis", 0.30);
//              em.persist(produtoNovo);
//              em.getTransaction().commit();

            em.getTransaction().begin();
            Produto produtoEditado = em.find(Produto.class, 3l);
            produtoEditado.setNome("Feijão");
            produtoEditado.setDataValidade(new GregorianCalendar(2022, Calendar.MAY, 27).getTime());
            produtoEditado.setPreco(10.50);
            em.persist(produtoEditado);
            em.getTransaction().commit();


        } catch (Exception e) {
            if (em != null && em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
        if (em != null) {
            em.close();
        }
        System.exit(0);
            em.getTransaction().rollback();
        }
    }


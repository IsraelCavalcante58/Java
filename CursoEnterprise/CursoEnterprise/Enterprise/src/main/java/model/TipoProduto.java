package model;

import javax.persistence.*;

@Entity
public class TipoProduto {
    @SequenceGenerator(name="tipoEstabelecimento", sequenceName = "tp_estabelecimento",  allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipoEstabelecimento")
    @Id
    @Column(name="")
    private Long id;


}
